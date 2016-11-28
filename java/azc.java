/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  pg
 */
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class azc
implements aza,
blv,
Comparable,
Runnable {
    private axj A;
    private axx B;
    private volatile boolean C;
    public final azb a = new azb();
    public final azh b;
    final azg c = new azg();
    final azi d = new azi();
    public avy e;
    public axo f;
    public avz g;
    public bag h;
    public int i;
    public int j;
    public azn k;
    public axs l;
    public aze m;
    public int n;
    public azj o;
    axo p;
    public volatile ayz q;
    public volatile boolean r;
    private final List s = new ArrayList();
    private final blx t = new bly();
    private final pg u;
    private azk v;
    private long w;
    private Thread x;
    private axo y;
    private Object z;

    azc(azh azh2, pg pg2) {
        this.b = azh2;
        this.u = pg2;
    }

    private final bap a(axx axx2, Object object, axj axj2) {
        if (object == null) {
            axx2.a();
            return null;
        }
        try {
            long l = bli.a();
            bap bap2 = super.a(object, axj2, this.a.b(object.getClass()));
            if (Log.isLoggable((String)"DecodeJob", (int)2)) {
                String string = String.valueOf((Object)bap2);
                super.a(new StringBuilder(15 + String.valueOf((Object)string).length()).append("Decoded result ").append(string).toString(), l, null);
            }
            return bap2;
        }
        finally {
            axx2.a();
        }
    }

    private final bap a(Object object, axj axj2, bam bam2) {
        axz axz2 = this.e.b.c.a(object);
        try {
            bap bap2 = bam2.a(axz2, this.l, this.i, this.j, new azf((azc)this, axj2));
            return bap2;
        }
        finally {
            axz2.b();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(String string, long l, String string2) {
        String string3;
        double d2 = bli.a(l);
        String string4 = String.valueOf((Object)this.h);
        String string5 = string2 != null ? ((string3 = String.valueOf((Object)string2)).length() != 0 ? ", ".concat(string3) : new String(", ")) : "";
        String string6 = String.valueOf((Object)Thread.currentThread().getName());
        new StringBuilder(50 + String.valueOf((Object)string).length() + String.valueOf((Object)string4).length() + String.valueOf((Object)string5).length() + String.valueOf((Object)string6).length()).append(string).append(" in ").append(d2).append(", load key: ").append(string4).append(string5).append(", thread: ").append(string6);
    }

    private final void d() {
        if (this.d.a()) {
            this.a();
        }
    }

    private final ayz e() {
        switch (azd.b[this.v.ordinal()]) {
            default: {
                String string = String.valueOf((Object)((Object)this.v));
                throw new IllegalStateException(new StringBuilder(20 + String.valueOf((Object)string).length()).append("Unrecognized stage: ").append(string).toString());
            }
            case 1: {
                return new baq(this.a, this);
            }
            case 2: {
                return new ayw(this.a, this);
            }
            case 3: {
                return new bau(this.a, this);
            }
            case 4: 
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void f() {
        this.x = Thread.currentThread();
        this.w = bli.a();
        boolean bl2 = false;
        while (!this.r && this.q != null && !(bl2 = this.q.a())) {
            this.v = this.a(this.v);
            this.q = this.e();
            if (this.v != azk.d) continue;
            this.c();
            return;
        }
        if (this.v != azk.f && !this.r || bl2) return;
        {
            this.g();
            return;
        }
    }

    private final void g() {
        this.h();
        bak bak2 = new bak("Failed to load resource", (List)new ArrayList((Collection)this.s));
        this.m.a(bak2);
        if (this.d.b()) {
            this.a();
        }
    }

    private final void h() {
        this.t.a();
        if (this.C) {
            throw new IllegalStateException("Already notified");
        }
        this.C = true;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private final void i() {
        bap bap2;
        if (Log.isLoggable((String)"DecodeJob", (int)2)) {
            long l = this.w;
            String string = String.valueOf((Object)this.z);
            String string2 = String.valueOf((Object)this.p);
            String string3 = String.valueOf((Object)this.B);
            this.a("Retrieved data", l, new StringBuilder(30 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append("data: ").append(string).append(", cache key: ").append(string2).append(", fetcher: ").append(string3).toString());
        }
        try {
            bap bap3;
            bap2 = bap3 = this.a(this.B, this.z, this.A);
        }
        catch (bak var1_13) {
            var1_13.a(this.y, this.A, null);
            this.s.add((Object)var1_13);
            bap2 = null;
        }
        if (bap2 != null) {
            axj axj2 = this.A;
            boolean bl2 = this.c.a();
            ban ban2 = null;
            if (bl2) {
                bap2 = ban2 = ban.a(bap2);
            }
            this.h();
            this.m.a(bap2, axj2);
            this.v = azk.e;
            if (!this.c.a()) return;
            azg azg2 = this.c;
            azh azh2 = this.b;
            axs axs2 = this.l;
            {
                catch (Throwable throwable) {
                    throw throwable;
                }
            }
            try {
                azh2.a().a(azg2.a, new ayy(azg2.b, azg2.c, axs2));
            }
            catch (Throwable var11_14) {
                azg2.c.e();
                throw var11_14;
            }
            try {
                azg2.c.e();
                return;
            }
            finally {
                if (ban2 != null) {
                    ban2.e();
                }
                this.d();
            }
        }
        this.f();
    }

    public final azk a(azk azk2) {
        block6 : do {
            switch (azd.b[azk2.ordinal()]) {
                default: {
                    String string = String.valueOf((Object)((Object)azk2));
                    throw new IllegalArgumentException(new StringBuilder(20 + String.valueOf((Object)string).length()).append("Unrecognized stage: ").append(string).toString());
                }
                case 5: {
                    if (this.k.a()) {
                        return azk.b;
                    }
                    azk2 = azk.b;
                    continue block6;
                }
                case 1: {
                    if (this.k.b()) {
                        return azk.c;
                    }
                    azk2 = azk.c;
                    continue block6;
                }
                case 2: {
                    return azk.d;
                }
                case 3: 
                case 4: 
            }
            break;
        } while (true);
        return azk.f;
    }

    final void a() {
        this.d.c();
        azg azg2 = this.c;
        azg2.a = null;
        azg2.b = null;
        azg2.c = null;
        azb azb2 = this.a;
        azb2.c = null;
        azb2.d = null;
        azb2.n = null;
        azb2.g = null;
        azb2.k = null;
        azb2.i = null;
        azb2.o = null;
        azb2.j = null;
        azb2.p = null;
        azb2.a.clear();
        azb2.l = false;
        azb2.b.clear();
        azb2.m = false;
        this.C = false;
        this.e = null;
        this.f = null;
        this.l = null;
        this.g = null;
        this.h = null;
        this.m = null;
        this.v = null;
        this.q = null;
        this.x = null;
        this.p = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.w = 0;
        this.r = false;
        this.s.clear();
        this.u.a((Object)this);
    }

    @Override
    public final void a(axo axo2, Exception exception, axx axx2, axj axj2) {
        bak bak2 = new bak("Fetching data failed", exception);
        bak2.a(axo2, axj2, axx2.c());
        this.s.add((Object)bak2);
        if (Thread.currentThread() != this.x) {
            this.o = azj.b;
            this.m.a((azc)this);
            return;
        }
        super.f();
    }

    @Override
    public final void a(axo axo2, Object object, axx axx2, axj axj2, axo axo3) {
        this.p = axo2;
        this.z = object;
        this.B = axx2;
        this.A = axj2;
        this.y = axo3;
        if (Thread.currentThread() != this.x) {
            this.o = azj.c;
            this.m.a(this);
            return;
        }
        this.i();
    }

    @Override
    public final blx b_() {
        return this.t;
    }

    @Override
    public final void c() {
        this.o = azj.b;
        this.m.a(this);
    }

    public final /* synthetic */ int compareTo(Object object) {
        azc azc2 = (azc)object;
        int n = this.g.ordinal() - azc2.g.ordinal();
        if (n == 0) {
            n = this.n - azc2.n;
        }
        return n;
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
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

