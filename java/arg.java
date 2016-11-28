/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.atomic.AtomicBoolean
 */
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class arg {
    private ArrayList mAutoReleaseFrames = new ArrayList();
    private aso[] mConnectedInputPortArray = null;
    private HashMap mConnectedInputPorts = new HashMap();
    private asu[] mConnectedOutputPortArray = null;
    private HashMap mConnectedOutputPorts = new HashMap();
    private asr mContext;
    private long mCurrentTimestamp = -1;
    private ari mFilterGraph;
    private boolean mIsActive = true;
    private AtomicBoolean mIsSleeping = new AtomicBoolean(false);
    private long mLastScheduleTime = 0;
    private int mMinimumAvailableInputs = 1;
    private int mMinimumAvailableOutputs = 1;
    private String mName;
    private int mRequests = 0;
    private int mScheduleCount = 0;
    private arh mState = new arh();

    public arg(asr asr2, String string) {
        this.mName = string;
        this.mContext = asr2;
    }

    private final void autoPullInputs() {
        for (int i = 0; i < this.mConnectedInputPortArray.length; ++i) {
            aso aso2 = this.mConnectedInputPortArray[i];
            if (!aso2.b() || !aso2.h) continue;
            this.mConnectedInputPortArray[i].a();
        }
    }

    private final void autoReleaseFrames() {
        for (int i = 0; i < this.mAutoReleaseFrames.size(); ++i) {
            ((ark)this.mAutoReleaseFrames.get(i)).d();
        }
        this.mAutoReleaseFrames.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final aso newInputPort(String string) {
        aso aso2 = (aso)this.mConnectedInputPorts.get((Object)string);
        if (aso2 != null) return aso2;
        asw asw2 = this.getSignature();
        asx asx2 = asw2.a != null ? (asx)asw2.a.get((Object)string) : null;
        if (asx2 == null) {
            asx2 = new asx();
        }
        aso aso3 = new aso((arg)this, string, asx2);
        this.mConnectedInputPorts.put((Object)string, (Object)aso3);
        return aso3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final asu newOutputPort(String string) {
        asu asu2 = (asu)this.mConnectedOutputPorts.get((Object)string);
        if (asu2 != null) return asu2;
        asw asw2 = this.getSignature();
        asx asx2 = asw2.b != null ? (asx)asw2.b.get((Object)string) : null;
        if (asx2 == null) {
            asx2 = new asx();
        }
        asu asu3 = new asu((arg)this, string, asx2);
        this.mConnectedOutputPorts.put((Object)string, (Object)asu3);
        return asu3;
    }

    private final void processRequests() {
        if ((1 & this.mRequests) != 0) {
            this.performClose();
            this.mRequests = 0;
        }
    }

    private final void updatePortArrays() {
        this.mConnectedInputPortArray = (aso[])this.mConnectedInputPorts.values().toArray((Object[])new aso[0]);
        this.mConnectedOutputPortArray = (asu[])this.mConnectedOutputPorts.values().toArray((Object[])new asu[0]);
    }

    final void addAutoReleaseFrame(ark ark2) {
        this.mAutoReleaseFrames.add((Object)ark2);
    }

    public boolean canSchedule() {
        if (this.inSchedulableState() && this.inputConditionsMet() && this.outputConditionsMet()) {
            return true;
        }
        return false;
    }

    public final void connect(String string, arg arg2, String string2) {
        if (this.getConnectedOutputPort(string) != null) {
            String string3 = String.valueOf((Object)this);
            throw new RuntimeException(new StringBuilder(67 + String.valueOf((Object)string).length() + String.valueOf((Object)string3).length()).append("Attempting to connect already connected output port '").append(string).append("' of filter ").append(string3).append("'!").toString());
        }
        if (arg2.getConnectedInputPort(string2) != null) {
            String string4 = String.valueOf((Object)arg2);
            throw new RuntimeException(new StringBuilder(66 + String.valueOf((Object)string2).length() + String.valueOf((Object)string4).length()).append("Attempting to connect already connected input port '").append(string2).append("' of filter ").append(string4).append("'!").toString());
        }
        aso aso2 = arg2.newInputPort(string2);
        asu asu2 = super.newOutputPort(string);
        asu2.g = aso2;
        arg2.onInputPortAttached(aso2);
        this.onOutputPortAttached(asu2);
        super.updatePortArrays();
    }

    public final void enterSleepState() {
        this.mIsSleeping.set(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void execute() {
        arh arh2;
        arh arh3 = arh2 = this.mState;
        synchronized (arh3) {
            this.autoPullInputs();
            this.mLastScheduleTime = SystemClock.elapsedRealtime();
            if (this.mState.a == 1) {
                this.onPrepare();
                this.mState.a = 2;
            }
            if (this.mState.a == 2) {
                this.openPorts();
                this.onOpen();
                this.mState.a = 3;
            }
            if (this.mState.a == 3) {
                this.onProcess();
                if (this.mRequests != 0) {
                    this.processRequests();
                }
            }
        }
        this.autoReleaseFrames();
        this.mScheduleCount = 1 + this.mScheduleCount;
    }

    public final aso getConnectedInputPort(String string) {
        return (aso)this.mConnectedInputPorts.get((Object)string);
    }

    final Map getConnectedInputPortMap() {
        return this.mConnectedInputPorts;
    }

    public final aso[] getConnectedInputPorts() {
        return this.mConnectedInputPortArray;
    }

    public final asu getConnectedOutputPort(String string) {
        return (asu)this.mConnectedOutputPorts.get((Object)string);
    }

    final Map getConnectedOutputPortMap() {
        return this.mConnectedOutputPorts;
    }

    public final asu[] getConnectedOutputPorts() {
        return this.mConnectedOutputPortArray;
    }

    final long getCurrentTimestamp() {
        return this.mCurrentTimestamp;
    }

    public String getName() {
        return this.mName;
    }

    public asw getSignature() {
        return new asw();
    }

    public boolean inSchedulableState() {
        if (this.mIsActive && !this.mState.a()) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean inputConditionsMet() {
        if (this.mConnectedInputPortArray.length <= 0) return true;
        int n = 0;
        for (int i = 0; i < this.mConnectedInputPortArray.length; ++i) {
            aso aso2 = this.mConnectedInputPortArray[i];
            if (aso2.g && !aso2.b()) {
                return false;
            }
            boolean bl2 = true;
            if (!bl2) return false;
            {
                if (!this.mConnectedInputPortArray[i].b()) continue;
                ++n;
                continue;
            }
        }
        if (n >= this.mMinimumAvailableInputs) return true;
        return false;
    }

    final void insertIntoFilterGraph(ari ari2) {
        this.mFilterGraph = ari2;
        super.updatePortArrays();
    }

    public final boolean isOpenGLSupported() {
        return this.mFilterGraph.d.d();
    }

    public final boolean isRunning() {
        if (this.mFilterGraph != null && this.mFilterGraph.d != null && this.mFilterGraph.d.b()) {
            return true;
        }
        return false;
    }

    final boolean isSleeping() {
        return this.mIsSleeping.get();
    }

    public void onClose() {
    }

    public void onInputPortAttached(aso aso2) {
    }

    public void onInputPortOpen(aso aso2) {
    }

    public void onOpen() {
    }

    protected void onOutputPortAttached(asu asu2) {
    }

    protected void onOutputPortOpen(asu asu2) {
    }

    public void onPrepare() {
    }

    public abstract void onProcess();

    final void onPulledFrameWithTimestamp(long l) {
        if (l > this.mCurrentTimestamp || this.mCurrentTimestamp == -1) {
            this.mCurrentTimestamp = l;
        }
    }

    public void onTearDown() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void openOutputPort(asu asu2) {
        if (asu2.e != null) return;
        try {
            aru aru2 = new aru();
            aso aso2 = asu2.g;
            asu2.d = aru2;
            asu2.d.b = asu2.c.a;
            asu2.a.onOutputPortOpen(asu2);
            aso2.e = aru2;
            aso2.e.a = aso2.c.a;
            aso2.a.onInputPortOpen(aso2);
            arg arg2 = aso2.a;
            String string = this.mName;
            String string2 = String.valueOf((Object)asu2.b);
            String string3 = arg2.mName;
            String string4 = String.valueOf((Object)aso2.b);
            String string5 = new StringBuilder(8 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length() + String.valueOf((Object)string4).length()).append(string).append("[").append(string2).append("] -> ").append(string3).append("[").append(string4).append("]").toString();
            art art2 = new art(aru2.a(), string5);
            art2.getClass();
            art2.a = new arw(art2);
            asu2.e = art2;
            asu2.d = null;
            aso2.f = art2;
            aso2.e = null;
            return;
        }
        catch (RuntimeException var3_11) {
            String string = String.valueOf((Object)asu2);
            throw new RuntimeException(new StringBuilder(28 + String.valueOf((Object)string).length()).append("Could not open output port ").append(string).append("!").toString(), (Throwable)var3_11);
        }
    }

    final void openPorts() {
        Iterator iterator = this.mConnectedOutputPorts.values().iterator();
        while (iterator.hasNext()) {
            this.openOutputPort((asu)iterator.next());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean outputConditionsMet() {
        if (this.mConnectedOutputPortArray.length <= 0) return true;
        int n = 0;
        for (int i = 0; i < this.mConnectedOutputPortArray.length; ++i) {
            asu asu2 = this.mConnectedOutputPortArray[i];
            if (asu2.f && !asu2.a()) {
                return false;
            }
            boolean bl2 = true;
            if (!bl2) return false;
            {
                if (!this.mConnectedOutputPortArray[i].a()) continue;
                ++n;
                continue;
            }
        }
        if (n >= this.mMinimumAvailableOutputs) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void performClose() {
        arh arh2;
        arh arh3 = arh2 = this.mState;
        synchronized (arh3) {
            if (this.mState.a == 3) {
                this.onClose();
                this.mIsSleeping.set(false);
                this.mState.a = 4;
                this.mCurrentTimestamp = -1;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void performTearDown() {
        arh arh2;
        arh arh3 = arh2 = this.mState;
        synchronized (arh3) {
            if (this.mState.a == 3) {
                String string = String.valueOf((Object)this);
                throw new RuntimeException(new StringBuilder(58 + String.valueOf((Object)string).length()).append("Attempting to tear-down filter ").append(string).append(" which is in an open state!").toString());
            }
            if (this.mState.a != 5 && this.mState.a != 1) {
                this.onTearDown();
                this.mState.a = 5;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void prepareOnly() {
        arh arh2;
        arh arh3 = arh2 = this.mState;
        synchronized (arh3) {
            if (this.mState.a == 1) {
                this.onPrepare();
                this.mState.a = 2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void softReset() {
        arh arh2;
        arh arh3 = arh2 = this.mState;
        synchronized (arh3) {
            this.performClose();
            if (this.mState.a == 4) {
                this.mState.a = 2;
            }
            return;
        }
    }

    public String toString() {
        String string = this.mName;
        String string2 = String.valueOf((Object)this.getClass().getSimpleName());
        return new StringBuilder(3 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append(string).append(" (").append(string2).append(")").toString();
    }

    public final void wakeUp() {
        if (this.mIsSleeping.getAndSet(false) && this.isRunning()) {
            ase ase2 = this.mFilterGraph.d.m;
            asd asd2 = asb.h;
            if (ase2.c.isEmpty()) {
                ase2.a(asd2);
            }
        }
    }
}

