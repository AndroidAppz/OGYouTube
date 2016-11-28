/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.Stack
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public final class ati
extends arg
implements ask {
    public ari mCurrentGraph;
    public atk mGraphProvider;
    public HashMap mInputFrames = new HashMap();
    public atl mState = new atl();

    public ati(asr asr2, String string) {
        super(asr2, string);
    }

    protected final void assignInput(atg atg2, ark ark2) {
        atg2.pushFrame(ark2);
    }

    protected final void assignInputs() {
        this.mCurrentGraph = this.mGraphProvider.getFilterGraph(this.mInputFrames);
        for (Map.Entry entry : this.mInputFrames.entrySet()) {
            ari ari2 = this.mCurrentGraph;
            String string = (String)entry.getKey();
            arg arg2 = (arg)ari2.b.get((Object)string);
            if (arg2 != null && arg2 instanceof atg) {
                this.assignInput((atg)arg2, (ark)entry.getValue());
                continue;
            }
            throw new IllegalArgumentException(new StringBuilder(28 + String.valueOf((Object)string).length()).append("Unknown source '").append(string).append("' specified!").toString());
        }
    }

    @Override
    protected final boolean canSchedule() {
        return this.schedulePolicy();
    }

    @Override
    protected final void onClose() {
        this.mState.state = 0;
    }

    @Override
    protected final void onOpen() {
        this.mState.state = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void onProcess() {
        if (this.mState.state == 0) {
            this.pullInputs();
            this.processGraph();
            return;
        } else {
            if (this.mState.state != 2) return;
            {
                this.pushOutputs();
                return;
            }
        }
    }

    @Override
    public final void onSubGraphRunEnded(asb asb2) {
        if (this.mState.state == 1) {
            this.mState.state = 2;
        }
    }

    protected final void processGraph() {
        this.mState.state = 1;
        asb asb2 = asb.a();
        ari ari2 = this.mCurrentGraph;
        if (Thread.currentThread() != asb2.n) {
            throw new RuntimeException("enterSubGraph must be called from the runner's thread!");
        }
        ase ase2 = asb2.m;
        if (ase2.a.b(4)) {
            ase2.a(ari2);
            ase2.d.push((Object)this);
        }
    }

    protected final void pullInputs() {
        this.mInputFrames.clear();
        for (aso aso2 : this.getConnectedInputPorts()) {
            this.mInputFrames.put((Object)aso2.b, (Object)aso2.a());
        }
        this.assignInputs();
    }

    protected final void pushOutput(ark ark2, asu asu2) {
        asu2.a(ark2);
    }

    protected final void pushOutputs() {
        for (asu asu2 : this.getConnectedOutputPorts()) {
            String string = asu2.b;
            arg arg2 = (arg)this.mCurrentGraph.b.get((Object)string);
            if (arg2 != null && arg2 instanceof ath) {
                ark ark2 = ((ath)arg2).pullFrame();
                if (ark2 == null) continue;
                this.pushOutput(ark2, asu2);
                ark2.d();
                continue;
            }
            throw new IllegalArgumentException(new StringBuilder(28 + String.valueOf((Object)string).length()).append("Unknown target '").append(string).append("' specified!").toString());
        }
        this.mState.state = 0;
    }

    protected final boolean schedulePolicy() {
        if (this.inSchedulableState() && (this.inputConditionsMet() || this.mState.state == 2) && this.outputConditionsMet()) {
            return true;
        }
        return false;
    }

    public final void setGraph(ari ari2) {
        if (!this.isRunning()) {
            this.mGraphProvider = new atj(ari2);
            return;
        }
        throw new IllegalStateException("Cannot set FilterGraphProvider while MetaFilter is running!");
    }

    public final void setGraphProvider(atk atk2) {
        if (!this.isRunning()) {
            this.mGraphProvider = atk2;
            return;
        }
        throw new IllegalStateException("Cannot set FilterGraphProvider while MetaFilter is running!");
    }
}

