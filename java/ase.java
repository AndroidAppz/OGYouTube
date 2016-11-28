/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.ConditionVariable
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.Stack
 *  java.util.concurrent.LinkedBlockingQueue
 */
import android.os.ConditionVariable;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public final class ase
implements Runnable {
    public asj a;
    final boolean b;
    LinkedBlockingQueue c;
    public Stack d;
    public ConditionVariable e;
    private asv f;
    private Exception g;
    private boolean h;
    private Stack i;
    private Set j;
    private Map k;
    private long l;
    private long m;
    private final ash n;
    private /* synthetic */ asb o;

    public ase(asb asb2, boolean bl2) {
        this.o = asb2;
        this.a = new asj();
        this.f = null;
        this.c = new LinkedBlockingQueue();
        this.g = null;
        this.h = true;
        this.i = new Stack();
        this.d = new Stack();
        this.j = new HashSet();
        this.k = new HashMap();
        this.e = new ConditionVariable(true);
        this.n = new ash();
        this.b = bl2;
    }

    private final asd a() {
        try {
            asd asd2 = (asd)this.c.take();
            return asd2;
        }
        catch (InterruptedException var1_2) {
            Log.w((String)"GraphRunner", (String)"Event queue processing was interrupted.");
            return null;
        }
    }

    private final void b() {
        this.o.o.b();
        if (this.f != null) {
            this.f.e();
            this.f = null;
        }
    }

    private final void b(ari ari2) {
        if (this.a.a() == 1) {
            Iterator iterator = ari2.e.iterator();
            while (iterator.hasNext()) {
                super.b((ari)iterator.next());
            }
            arg[] arrarg = ari2.c;
            int n = arrarg.length;
            for (int i = 0; i < n; ++i) {
                arrarg[i].prepareOnly();
            }
        }
    }

    private final void c() {
        if (this.a.b(4) || this.a.b(2)) {
            this.o.c();
            if (!this.a.b(16)) {
                this.f();
            }
            this.d();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void c(ari ari2) {
        if (this.a.b(4)) {
            throw new IllegalStateException("Attempting to teardown graph while running!");
        }
        if (ari2.c != null) {
            Object object;
            Set set;
            arg[] arrarg = ari2.c;
            int n = arrarg.length;
            for (int i = 0; i < n; ++i) {
                arrarg[i].performTearDown();
            }
            Object object2 = object = ari2.f;
            synchronized (object2) {
                ari2.e.clear();
            }
            asr asr2 = ari2.a;
            Set set2 = set = asr2.b;
            synchronized (set2) {
                asr2.b.remove((Object)ari2);
            }
            ari2.c = null;
            ari2.b = null;
            ari2.g = null;
        }
        this.o.k.remove((Object)ari2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void d() {
        asg asg2;
        this.a.a(1);
        if (this.o.e()) {
            this.e();
        }
        this.j.clear();
        this.i.clear();
        asb asb2 = this.o;
        Exception exception = this.g;
        asg asg3 = asg2 = asb2.q;
        synchronized (asg3) {
            if (exception != null) {
                Log.e((String)"GraphRunner", (String)"Uncaught exception during graph execution! Stack Trace: ");
                exception.printStackTrace();
            }
        }
        this.e.open();
    }

    private final void e() {
        if (this.a.b(16) || this.a.b(1)) {
            Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                for (arg arg2 : ((ari)iterator.next()).b.values()) {
                    for (aso aso2 : arg2.getConnectedInputPorts()) {
                        if (aso2.f == null) continue;
                        aso2.f.a();
                    }
                    for (asu asu2 : arg2.getConnectedOutputPorts()) {
                        if (asu2.e == null) continue;
                        asu2.e.a();
                    }
                }
            }
        }
    }

    private final void f() {
        Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            arg[] arrarg = ((ari)iterator.next()).c;
            this.o.c();
            for (int i = 0; i < arrarg.length; ++i) {
                arrarg[i].softReset();
            }
        }
    }

    public final void a(int n, Object object) {
        this.c.offer((Object)new asd(n, object));
    }

    public final void a(ari ari2) {
        arg[] arrarg = ari2.c;
        this.i.push((Object)arrarg);
        this.j.add((Object)ari2);
        this.i.push((Object)this.o.l.a((arg[])this.i.pop()));
        this.a(asb.d);
    }

    public final void a(asd asd2) {
        this.c.offer((Object)asd2);
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:486)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:422)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:220)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:165)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:91)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:354)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:751)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:683)
        // org.benf.cfr.reader.Main.doJar(Main.java:128)
        // com.njlabs.showjava.processor.JavaExtractor$1.run(JavaExtractor.java:100)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }
}

