/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.os.Parcelable
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  rw
 *  uk
 *  vt
 */
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class ams
extends aoh {
    private amw a;
    int b;
    anq c;
    boolean d = false;
    amx e = null;
    private boolean p;
    private boolean q = false;
    private boolean r = true;
    private int s = -1;
    private int t = Integer.MIN_VALUE;
    private amu u;

    public ams() {
        this(1);
    }

    public ams(int n) {
        this.u = new amu((ams)this);
        this.b(n);
        this.a((String)null);
        this.j = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final View A() {
        int n;
        if (this.d) {
            n = -1 + this.t();
            do {
                return this.i(n);
                break;
            } while (true);
        }
        n = 0;
        return this.i(n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final View B() {
        int n;
        if (this.d) {
            n = 0;
            do {
                return this.i(n);
                break;
            } while (true);
        }
        n = -1 + this.t();
        return this.i(n);
    }

    private final int a(int n, aom aom2, aou aou2, boolean bl2) {
        int n2 = this.c.c() - n;
        if (n2 > 0) {
            int n3;
            int n4 = - super.c(- n2, aom2, aou2);
            int n5 = n + n4;
            if (bl2 && (n3 = this.c.c() - n5) > 0) {
                this.c.a(n3);
                n4 += n3;
            }
            return n4;
        }
        return 0;
    }

    private final int a(aom aom2, amw amw2, aou aou2, boolean bl2) {
        int n = amw2.c;
        if (amw2.g != Integer.MIN_VALUE) {
            if (amw2.c < 0) {
                amw2.g += amw2.c;
            }
            super.a(aom2, amw2);
        }
        int n2 = amw2.c + amw2.h;
        amv amv2 = new amv();
        while ((amw2.k || n2 > 0) && amw2.a(aou2)) {
            amv2.a = 0;
            amv2.b = false;
            amv2.c = false;
            amv2.d = false;
            this.a(aom2, aou2, amw2, amv2);
            if (amv2.b) break;
            amw2.b += amv2.a * amw2.f;
            if (!amv2.c || this.a.j != null || !aou2.g) {
                amw2.c -= amv2.a;
                n2 -= amv2.a;
            }
            if (amw2.g != Integer.MIN_VALUE) {
                amw2.g += amv2.a;
                if (amw2.c < 0) {
                    amw2.g += amw2.c;
                }
                super.a(aom2, amw2);
            }
            if (!bl2 || !amv2.d) continue;
        }
        return n - amw2.c;
    }

    /*
     * Exception decompiling
     */
    private final View a(int var1_1, int var2_4, boolean var3_3, boolean var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.util.ConcurrentModificationException
        // java.util.LinkedList$ReverseLinkIterator.next(LinkedList.java:217)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.extractLabelledBlocks(Block.java:212)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:485)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.transform(Op04StructuredStatement.java:639)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredWhile.transformStructuredChildren(StructuredWhile.java:50)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:487)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.transform(Op04StructuredStatement.java:639)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.transformStructuredChildren(Block.java:378)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:487)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.transform(Op04StructuredStatement.java:639)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.insertLabelledBlocks(Op04StructuredStatement.java:649)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:816)
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

    private final View a(boolean bl2) {
        if (this.d) {
            return super.a(-1 + this.t(), -1, bl2, true);
        }
        return super.a(0, this.t(), bl2, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(int n, int n2, boolean bl2, aou aou2) {
        int n3;
        int n4 = -1;
        int n5 = 1;
        this.a.k = super.z();
        this.a.h = this.a(aou2);
        this.a.f = n;
        if (n == n5) {
            amw amw2 = this.a;
            amw2.h += this.c.f();
            View view = super.B();
            amw amw3 = this.a;
            if (!this.d) {
                n4 = n5;
            }
            amw3.e = n4;
            this.a.d = ams.a(view) + this.a.e;
            this.a.b = this.c.b(view);
            n3 = this.c.b(view) - this.c.c();
        } else {
            View view = super.A();
            amw amw4 = this.a;
            amw4.h += this.c.b();
            amw amw5 = this.a;
            if (!this.d) {
                n5 = n4;
            }
            amw5.e = n5;
            this.a.d = ams.a(view) + this.a.e;
            this.a.b = this.c.a(view);
            n3 = - this.c.a(view) + this.c.b();
        }
        this.a.c = n2;
        if (bl2) {
            amw amw6 = this.a;
            amw6.c -= n3;
        }
        this.a.g = n3;
    }

    private final void a(amu amu2) {
        super.e(amu2.a, amu2.b);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(aom aom2, int n, int n2) {
        if (n == n2) return;
        if (n2 > n) {
            for (int i = n2 - 1; i >= n; --i) {
                this.a(i, aom2);
            }
            return;
        } else {
            while (n > n2) {
                this.a(n, aom2);
                --n;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final void a(aom var1, amw var2_2) {
        if (var2_2.a == false) return;
        if (var2_2.k) {
            return;
        }
        if (var2_2.f != -1) ** GOTO lbl11
        var9_3 = var2_2.g;
        var10_4 = this.t();
        if (var9_3 < 0) return;
        var11_5 = this.c.d() - var9_3;
        if (this.d) ** GOTO lbl16
        ** GOTO lbl25
lbl11: // 1 sources:
        var3_10 = var2_2.g;
        if (var3_10 < 0) return;
        var4_11 = this.t();
        if (this.d) ** GOTO lbl34
        ** GOTO lbl43
lbl16: // 1 sources:
        var14_6 = 0;
        while (var14_6 < var10_4) {
            var15_7 = this.i(var14_6);
            if (this.c.a(var15_7) < var11_5) {
                super.a(var1, 0, var14_6);
                return;
            }
            ++var14_6;
        }
        return;
lbl25: // 1 sources:
        var12_8 = var10_4 - 1;
        while (var12_8 >= 0) {
            var13_9 = this.i(var12_8);
            if (this.c.a(var13_9) < var11_5) {
                super.a(var1, var10_4 - 1, var12_8);
                return;
            }
            --var12_8;
        }
        return;
lbl34: // 1 sources:
        var7_12 = var4_11 - 1;
        while (var7_12 >= 0) {
            var8_13 = this.i(var7_12);
            if (this.c.b(var8_13) > var3_10) {
                super.a(var1, var4_11 - 1, var7_12);
                return;
            }
            --var7_12;
        }
        return;
lbl43: // 1 sources:
        var5_14 = 0;
        while (var5_14 < var4_11) {
            var6_15 = this.i(var5_14);
            if (this.c.b(var6_15) > var3_10) {
                super.a(var1, 0, var5_14);
                return;
            }
            ++var5_14;
        }
    }

    private final int b(int n, aom aom2, aou aou2, boolean bl2) {
        int n2 = n - this.c.b();
        if (n2 > 0) {
            int n3;
            int n4 = - super.c(n2, aom2, aou2);
            int n5 = n + n4;
            if (bl2 && (n3 = n5 - this.c.b()) > 0) {
                this.c.a(- n3);
                n4 -= n3;
            }
            return n4;
        }
        return 0;
    }

    private final View b(boolean bl2) {
        if (this.d) {
            return super.a(0, this.t(), bl2, true);
        }
        return super.a(-1 + this.t(), -1, bl2, true);
    }

    private final void b(amu amu2) {
        super.f(amu2.a, amu2.b);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final int c(int n, aom aom2, aou aou2) {
        if (this.t() == 0 || n == 0) {
            return 0;
        }
        this.a.a = true;
        this.m();
        int n2 = n > 0 ? 1 : -1;
        int n3 = Math.abs((int)n);
        super.a(n2, n3, true, aou2);
        int n4 = this.a.g + super.a(aom2, this.a, aou2, false);
        if (n4 < 0) {
            return 0;
        }
        if (n3 > n4) {
            n = n2 * n4;
        }
        this.c.a(- n);
        this.a.i = n;
        return n;
    }

    private final View d(aom aom2, aou aou2) {
        if (this.d) {
            return super.f(aom2, aou2);
        }
        return super.g(aom2, aou2);
    }

    private final View e(aom aom2, aou aou2) {
        if (this.d) {
            return super.g(aom2, aou2);
        }
        return super.f(aom2, aou2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void e(int n, int n2) {
        this.a.c = this.c.c() - n2;
        amw amw2 = this.a;
        int n3 = this.d ? -1 : 1;
        amw2.e = n3;
        this.a.d = n;
        this.a.f = 1;
        this.a.b = n2;
        this.a.g = Integer.MIN_VALUE;
    }

    private final View f(aom aom2, aou aou2) {
        return this.a(aom2, aou2, 0, this.t(), aou2.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void f(int n, int n2) {
        this.a.c = n2 - this.c.b();
        this.a.d = n;
        amw amw2 = this.a;
        int n3 = this.d ? 1 : -1;
        amw2.e = n3;
        this.a.f = -1;
        this.a.b = n2;
        this.a.g = Integer.MIN_VALUE;
    }

    private final View g(aom aom2, aou aou2) {
        return this.a(aom2, aou2, -1 + this.t(), -1, aou2.a());
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final int h(aou aou2) {
        boolean bl2 = true;
        int n = this.t();
        int n2 = 0;
        if (n == 0) {
            return n2;
        }
        this.m();
        anq anq2 = this.c;
        boolean bl3 = !this.r ? bl2 : false;
        View view = super.a(bl3);
        if (this.r) {
            bl2 = false;
        }
        View view2 = super.b(bl2);
        boolean bl4 = this.r;
        boolean bl5 = this.d;
        int n3 = this.t();
        n2 = 0;
        if (n3 == 0) return n2;
        int n4 = aou2.a();
        n2 = 0;
        if (n4 == 0) return n2;
        n2 = 0;
        if (view == null) return n2;
        n2 = 0;
        if (view2 == null) return n2;
        int n5 = Math.min((int)aoh.a(view), (int)aoh.a(view2));
        int n6 = Math.max((int)aoh.a(view), (int)aoh.a(view2));
        n2 = bl5 ? Math.max((int)0, (int)(-1 + (aou2.a() - n6))) : Math.max((int)0, (int)n5);
        if (!bl4) return n2;
        int n7 = Math.abs((int)(anq2.b(view2) - anq2.a(view)));
        int n8 = 1 + Math.abs((int)(aoh.a(view) - aoh.a(view2)));
        return Math.round((float)((float)n7 / (float)n8 * (float)n2 + (float)(anq2.b() - anq2.a(view))));
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final int i(aou aou2) {
        boolean bl2 = true;
        if (this.t() == 0) {
            return 0;
        }
        this.m();
        anq anq2 = this.c;
        boolean bl3 = !this.r ? bl2 : false;
        View view = super.a(bl3);
        if (this.r) {
            bl2 = false;
        }
        View view2 = super.b(bl2);
        boolean bl4 = this.r;
        if (this.t() == 0) return 0;
        if (aou2.a() == 0) return 0;
        if (view == null) return 0;
        if (view2 == null) return 0;
        if (!bl4) {
            return 1 + Math.abs((int)(aoh.a(view) - aoh.a(view2)));
        }
        int n = anq2.b(view2) - anq2.a(view);
        return Math.min((int)anq2.e(), (int)n);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final int j(aou aou2) {
        boolean bl2 = true;
        if (this.t() == 0) {
            return 0;
        }
        this.m();
        anq anq2 = this.c;
        boolean bl3 = !this.r ? bl2 : false;
        View view = super.a(bl3);
        if (this.r) {
            bl2 = false;
        }
        View view2 = super.b(bl2);
        boolean bl4 = this.r;
        if (this.t() == 0) return 0;
        if (aou2.a() == 0) return 0;
        if (view == null) return 0;
        if (view2 == null) return 0;
        if (!bl4) {
            return aou2.a();
        }
        int n = anq2.b(view2) - anq2.a(view);
        int n2 = 1 + Math.abs((int)(aoh.a(view) - aoh.a(view2)));
        return (int)((float)n / (float)n2 * (float)aou2.a());
    }

    private final void y() {
        int n = 1;
        if (this.b == n || !this.l()) {
            n = 0;
        }
        this.d = n;
    }

    private final boolean z() {
        if (this.c.g() == 0 && this.c.d() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int a(int n, aom aom2, aou aou2) {
        if (this.b == 1) {
            return 0;
        }
        return super.c(n, aom2, aou2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(aou aou2) {
        if (aou2.a == -1) return 0;
        boolean bl2 = true;
        int n = 0;
        if (!bl2) return n;
        return this.c.e();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public View a(View view, int n, aom aom2, aou aou2) {
        super.y();
        if (this.t() == 0) {
            return null;
        }
        int n2 = this.f(n);
        if (n2 == Integer.MIN_VALUE) return null;
        this.m();
        View view2 = n2 == -1 ? super.e(aom2, aou2) : super.d(aom2, aou2);
        if (view2 == null) return null;
        this.m();
        super.a(n2, (int)(0.33333334f * (float)this.c.e()), false, aou2);
        this.a.g = Integer.MIN_VALUE;
        this.a.a = false;
        super.a(aom2, this.a, aou2, true);
        View view3 = n2 == -1 ? super.A() : super.B();
        if (view3 == view2) return null;
        if (!view3.isFocusable()) return null;
        return view3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    View a(aom var1_4, aou var2_5, int var3_2, int var4_3, int var5_1) {
        var6_6 = null;
        this.m();
        var7_7 = this.c.b();
        var8_8 = this.c.c();
        var9_9 = var4_3 > var3_2 ? 1 : -1;
        var10_10 = null;
        do {
            if (var3_2 == var4_3) {
                if (var6_6 == null) return var10_10;
                return var6_6;
            }
            var11_11 = this.i(var3_2);
            var12_13 = ams.a(var11_11);
            if (var12_13 < 0 || var12_13 >= var5_1) ** GOTO lbl-1000
            if (!((aoi)var11_11.getLayoutParams()).c.m()) ** GOTO lbl18
            if (var10_10 != null) ** GOTO lbl-1000
            var13_12 = var6_6;
            ** GOTO lbl26
lbl18: // 1 sources:
            if (this.c.a(var11_11) < var8_8) {
                if (this.c.b(var11_11) >= var7_7) return var11_11;
            }
            if (var6_6 == null) {
                var13_12 = var11_11;
                var11_11 = var10_10;
            } else lbl-1000: // 3 sources:
            {
                var13_12 = var6_6;
                var11_11 = var10_10;
            }
lbl26: // 3 sources:
            var3_2 += var9_9;
            var6_6 = var13_12;
            var10_10 = var11_11;
        } while (true);
    }

    @Override
    public final void a(Parcelable parcelable) {
        if (parcelable instanceof amx) {
            this.e = (amx)parcelable;
            this.s();
        }
    }

    @Override
    public void a(RecyclerView recyclerView, int n) {
        amt amt2 = new amt((ams)this, recyclerView.getContext());
        amt2.a = n;
        this.a(amt2);
    }

    @Override
    public void a(RecyclerView recyclerView, aom aom2) {
        super.a(recyclerView, aom2);
    }

    @Override
    public final void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (this.t() > 0) {
            vt vt2 = uk.a((AccessibilityEvent)accessibilityEvent);
            vt2.b(this.o());
            vt2.c(this.q());
        }
    }

    void a(aom aom2, aou aou2, amu amu2, int n) {
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(aom aom2, aou aou2, amw amw2, amv amv2) {
        int n;
        int n2;
        int n3;
        int n4;
        View view = amw2.a(aom2);
        if (view == null) {
            amv2.b = true;
            return;
        }
        aoi aoi2 = (aoi)view.getLayoutParams();
        if (amw2.j == null) {
            boolean bl2 = this.d;
            boolean bl3 = amw2.f == -1;
            if (bl2 == bl3) {
                super.a(view, -1, false);
            } else {
                super.a(view, 0, false);
            }
        } else {
            boolean bl4 = this.d;
            boolean bl5 = amw2.f == -1;
            if (bl4 == bl5) {
                super.a(view, -1, true);
            } else {
                super.a(view, 0, true);
            }
        }
        this.b(view);
        amv2.a = this.c.c(view);
        if (this.b == 1) {
            int n5;
            int n6;
            if (this.l()) {
                n6 = this.n - this.w();
                n5 = n6 - this.c.d(view);
            } else {
                n5 = this.u();
                n6 = n5 + this.c.d(view);
            }
            if (amw2.f == -1) {
                int n7 = amw2.b;
                n = amw2.b - amv2.a;
                n4 = n5;
                n3 = n6;
                n2 = n7;
            } else {
                int n8 = amw2.b;
                int n9 = amw2.b + amv2.a;
                n = n8;
                n4 = n5;
                n3 = n6;
                n2 = n9;
            }
        } else {
            n = this.v();
            n2 = n + this.c.d(view);
            if (amw2.f == -1) {
                n3 = amw2.b;
                n4 = amw2.b - amv2.a;
            } else {
                n4 = amw2.b;
                n3 = amw2.b + amv2.a;
            }
        }
        ams.a(view, n4 + aoi2.leftMargin, n + aoi2.topMargin, n3 - aoi2.rightMargin, n2 - aoi2.bottomMargin);
        if (aoi2.c.m() || aoi2.c.s()) {
            amv2.c = true;
        }
        amv2.d = view.isFocusable();
    }

    @Override
    public final void a(String string) {
        if (this.e == null) {
            super.a(string);
        }
    }

    @Override
    public int b(int n, aom aom2, aou aou2) {
        if (this.b == 0) {
            return 0;
        }
        return super.c(n, aom2, aou2);
    }

    @Override
    public final int b(aou aou2) {
        return super.h(aou2);
    }

    public final void b(int n) {
        if (n != 0 && n != 1) {
            throw new IllegalArgumentException("invalid orientation:" + n);
        }
        this.a((String)null);
        if (n == this.b) {
            return;
        }
        this.b = n;
        this.c = null;
        this.s();
    }

    @Override
    public final int c(aou aou2) {
        return super.h(aou2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final View c(int n) {
        int n2 = this.t();
        if (n2 == 0) {
            return null;
        }
        int n3 = n - ams.a(this.i(0));
        if (n3 < 0) return super.c(n);
        if (n3 >= n2) return super.c(n);
        View view = this.i(n3);
        if (ams.a(view) == n) return view;
        return super.c(n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void c(aom var1, aou var2_2) {
        if ((this.e != null || this.s != -1) && var2_2.a() == 0) {
            this.b(var1);
            return;
        }
        if (this.e != null && this.e.a()) {
            this.s = this.e.a;
        }
        this.m();
        this.a.a = false;
        super.y();
        var3_3 = this.u;
        var3_3.a = -1;
        var3_3.b = Integer.MIN_VALUE;
        var3_3.c = false;
        this.u.c = this.d;
        var4_4 = this.u;
        if (!var2_2.g && this.s != -1) ** GOTO lbl18
        var5_5 = false;
        ** GOTO lbl57
lbl18: // 1 sources:
        if (this.s >= 0 && this.s < var2_2.a()) ** GOTO lbl23
        this.s = -1;
        this.t = Integer.MIN_VALUE;
        var5_5 = false;
        ** GOTO lbl57
lbl23: // 1 sources:
        var4_4.a = this.s;
        if (this.e == null || !this.e.a()) ** GOTO lbl29
        var4_4.c = this.e.c;
        var4_4.b = var4_4.c != false ? this.c.c() - this.e.b : this.c.b() + this.e.b;
        var5_5 = true;
        ** GOTO lbl57
lbl29: // 1 sources:
        if (this.t != Integer.MIN_VALUE) ** GOTO lbl54
        var82_8 = this.c(this.s);
        if (var82_8 == null) ** GOTO lbl46
        if (this.c.c(var82_8) <= this.c.e()) ** GOTO lbl35
        var4_4.a();
        ** GOTO lbl56
lbl35: // 1 sources:
        if (this.c.a(var82_8) - this.c.b() >= 0) ** GOTO lbl39
        var4_4.b = this.c.b();
        var4_4.c = false;
        ** GOTO lbl56
lbl39: // 1 sources:
        if (this.c.c() - this.c.b(var82_8) >= 0) ** GOTO lbl43
        var4_4.b = this.c.c();
        var4_4.c = true;
        ** GOTO lbl56
lbl43: // 1 sources:
        var86_7 = var4_4.c != false ? this.c.b(var82_8) + this.c.a() : this.c.a(var82_8);
        var4_4.b = var86_7;
        ** GOTO lbl52
lbl46: // 1 sources:
        if (this.t() > 0) {
            var83_10 = ams.a(this.i(0));
            var84_6 = this.s < var83_10;
            var85_9 = var84_6 == this.d;
            var4_4.c = var85_9;
        }
        var4_4.a();
lbl52: // 2 sources:
        var5_5 = true;
        ** GOTO lbl57
lbl54: // 1 sources:
        var4_4.c = this.d;
        var4_4.b = this.d != false ? this.c.c() - this.t : this.c.b() + this.t;
lbl56: // 4 sources:
        var5_5 = true;
lbl57: // 5 sources:
        if (var5_5) ** GOTO lbl100
        if (this.t() == 0) ** GOTO lbl-1000
        var65_11 = this.g == null ? null : ((var64_12 = this.g.getFocusedChild()) == null || this.f.d(var64_12) != false ? null : var64_12);
        if (var65_11 == null) ** GOTO lbl-1000
        var69_13 = (aoi)var65_11.getLayoutParams();
        var70_14 = var69_13.c.m() == false && var69_13.c.c() >= 0 && var69_13.c.c() < var2_2.a();
        if (var70_14) {
            var71_15 = var4_4.d.c.a();
            if (var71_15 >= 0) {
                var4_4.a(var65_11);
            } else {
                var4_4.a = ams.a(var65_11);
                if (var4_4.c) {
                    var77_20 = var4_4.d.c.c() - var71_15 - var4_4.d.c.b(var65_11);
                    var4_4.b = var4_4.d.c.c() - var77_20;
                    if (var77_20 > 0 && (var81_24 = (var79_16 = var4_4.b - (var78_21 = var4_4.d.c.c(var65_11))) - ((var80_17 = var4_4.d.c.b()) + Math.min((int)(var4_4.d.c.a(var65_11) - var80_17), (int)0))) < 0) {
                        var4_4.b += Math.min((int)var77_20, (int)(- var81_24));
                    }
                } else {
                    var72_18 = var4_4.d.c.a(var65_11);
                    var73_23 = var72_18 - var4_4.d.c.b();
                    var4_4.b = var72_18;
                    if (var73_23 > 0) {
                        var74_25 = var72_18 + var4_4.d.c.c(var65_11);
                        var75_19 = var4_4.d.c.c() - var71_15 - var4_4.d.c.b(var65_11);
                        var76_22 = var4_4.d.c.c() - Math.min((int)0, (int)var75_19) - var74_25;
                        if (var76_22 < 0) {
                            var4_4.b -= Math.min((int)var73_23, (int)(- var76_22));
                        }
                    }
                }
            }
            var63_26 = true;
        } else lbl-1000: // 2 sources:
        {
            var66_29 = var4_4.c != false ? super.d(var1, var2_2) : super.e(var1, var2_2);
            if (var66_29 != null) {
                var4_4.a(var66_29);
                if (!var2_2.g && this.g()) {
                    var67_28 = this.c.a(var66_29) >= this.c.c() || this.c.b(var66_29) < this.c.b();
                    if (var67_28) {
                        var68_27 = var4_4.c != false ? this.c.c() : this.c.b();
                        var4_4.b = var68_27;
                    }
                }
                var63_26 = true;
            } else lbl-1000: // 2 sources:
            {
                var63_26 = false;
            }
        }
        if (!var63_26) {
            var4_4.a();
            var4_4.a = 0;
        }
lbl100: // 4 sources:
        var6_30 = this.a(var2_2);
        if (this.a.i >= 0) {
            var7_31 = 0;
        } else {
            var7_31 = var6_30;
            var6_30 = 0;
        }
        var8_32 = var7_31 + this.c.b();
        var9_33 = var6_30 + this.c.f();
        if (var2_2.g && this.s != -1 && this.t != Integer.MIN_VALUE && (var60_34 = this.c(this.s)) != null) {
            if (this.d) {
                var62_35 = this.c.c() - this.c.b(var60_34) - this.t;
            } else {
                var61_36 = this.c.a(var60_34) - this.c.b();
                var62_35 = this.t - var61_36;
            }
            if (var62_35 > 0) {
                var8_32 += var62_35;
            } else {
                var9_33 -= var62_35;
            }
        }
        var10_37 = this.u.c ? (this.d ? 1 : -1) : (this.d != false ? -1 : 1);
        this.a(var1, var2_2, this.u, var10_37);
        for (var11_38 = -1 + this.t(); var11_38 >= 0; --var11_38) {
            var57_40 = this.i(var11_38);
            var58_39 = RecyclerView.a((View)var57_40);
            if (var58_39.b()) continue;
            if (var58_39.j() && !var58_39.m()) {
                this.g(var11_38);
                var1.a(var58_39);
                continue;
            }
            this.h(var11_38);
            var1.b(var57_40);
            this.g.f.c(var58_39);
        }
        this.a.k = super.z();
        if (this.u.c) {
            super.b(this.u);
            this.a.h = var8_32;
            super.a(var1, this.a, var2_2, false);
            var49_41 = this.a.b;
            var50_42 = this.a.d;
            if (this.a.c > 0) {
                var9_33 += this.a.c;
            }
            super.a(this.u);
            this.a.h = var9_33;
            var51_43 = this.a;
            var51_43.d += this.a.e;
            super.a(var1, this.a, var2_2, false);
            var53_44 = this.a.b;
            if (this.a.c > 0) {
                var55_45 = this.a.c;
                super.f(var50_42, var49_41);
                this.a.h = var55_45;
                super.a(var1, this.a, var2_2, false);
                var54_46 = this.a.b;
            } else {
                var54_46 = var49_41;
            }
            var17_47 = var54_46;
            var13_48 = var53_44;
        } else {
            super.a(this.u);
            this.a.h = var9_33;
            super.a(var1, this.a, var2_2, false);
            var13_48 = this.a.b;
            var14_50 = this.a.d;
            if (this.a.c > 0) {
                var8_32 += this.a.c;
            }
            super.b(this.u);
            this.a.h = var8_32;
            var15_49 = this.a;
            var15_49.d += this.a.e;
            super.a(var1, this.a, var2_2, false);
            var17_47 = this.a.b;
            if (this.a.c > 0) {
                var18_51 = this.a.c;
                super.e(var14_50, var13_48);
                this.a.h = var18_51;
                super.a(var1, this.a, var2_2, false);
                var13_48 = this.a.b;
            }
        }
        if (this.t() > 0) {
            if (this.d) {
                var42_52 = super.a(var13_48, var1, var2_2, true);
                var43_53 = var17_47 + var42_52;
                var44_54 = var13_48 + var42_52;
                var45_55 = super.b(var43_53, var1, var2_2, false);
                var46_56 = var43_53 + var45_55;
                var47_57 = var44_54 + var45_55;
                var20_58 = var46_56;
                var21_59 = var47_57;
            } else {
                var36_61 = super.b(var17_47, var1, var2_2, true);
                var37_60 = var17_47 + var36_61;
                var38_62 = var13_48 + var36_61;
                var39_65 = super.a(var38_62, var1, var2_2, false);
                var40_63 = var37_60 + var39_65;
                var41_64 = var38_62 + var39_65;
                var20_58 = var40_63;
                var21_59 = var41_64;
            }
        } else {
            var20_58 = var17_47;
            var21_59 = var13_48;
        }
        if (!var2_2.i || this.t() == 0 || var2_2.g || !this.g()) lbl-1000: // 2 sources:
        {
            do {
                if (!var2_2.g) {
                    this.s = -1;
                    this.t = Integer.MIN_VALUE;
                    var22_66 = this.c;
                    var22_66.b = var22_66.e();
                }
                this.p = false;
                this.e = null;
                return;
                break;
            } while (true);
        }
        var23_67 = 0;
        var24_68 = 0;
        var25_69 = var1.d;
        var26_70 = var25_69.size();
        var27_71 = ams.a(this.i(0));
        var28_72 = 0;
        do {
            if (var28_72 >= var26_70) ** GOTO lbl228
            var31_74 = (aow)var25_69.get(var28_72);
            if (var31_74.m()) ** GOTO lbl243
            var34_76 = var31_74.c() < var27_71;
            var35_77 = var34_76 != this.d ? -1 : 1;
            if (var35_77 == -1) {
                var33_75 = var23_67 + this.c.c(var31_74.a);
                var32_73 = var24_68;
            } else {
                var32_73 = var24_68 + this.c.c(var31_74.a);
                var33_75 = var23_67;
            }
            ** GOTO lbl245
lbl228: // 1 sources:
            this.a.j = var25_69;
            if (var23_67 > 0) {
                super.f(ams.a(super.A()), var20_58);
                this.a.h = var23_67;
                this.a.c = 0;
                this.a.a((View)null);
                super.a(var1, this.a, var2_2, false);
            }
            if (var24_68 > 0) {
                super.e(ams.a(super.B()), var21_59);
                this.a.h = var24_68;
                this.a.c = 0;
                this.a.a((View)null);
                super.a(var1, this.a, var2_2, false);
            }
            this.a.j = null;
            ** continue;
lbl243: // 1 sources:
            var32_73 = var24_68;
            var33_75 = var23_67;
lbl245: // 3 sources:
            ++var28_72;
            var23_67 = var33_75;
            var24_68 = var32_73;
        } while (true);
    }

    @Override
    public final int d(aou aou2) {
        return super.i(aou2);
    }

    public final PointF d(int n) {
        int n2 = 1;
        if (this.t() == 0) {
            return null;
        }
        int n3 = ams.a(this.i(0));
        int n4 = 0;
        if (n < n3) {
            n4 = n2;
        }
        if (n4 != this.d) {
            n2 = -1;
        }
        if (this.b == 0) {
            return new PointF((float)n2, 0.0f);
        }
        return new PointF(0.0f, (float)n2);
    }

    @Override
    public final int e(aou aou2) {
        return super.i(aou2);
    }

    @Override
    public final void e(int n) {
        this.s = n;
        this.t = Integer.MIN_VALUE;
        if (this.e != null) {
            this.e.a = -1;
        }
        this.s();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final int f(int n) {
        int n2 = -1;
        switch (n) {
            default: {
                n2 = Integer.MIN_VALUE;
            }
            case 1: {
                return n2;
            }
            case 2: {
                return 1;
            }
            case 33: {
                if (this.b == 1) return n2;
                return Integer.MIN_VALUE;
            }
            case 130: {
                if (this.b != 1) return Integer.MIN_VALUE;
                return 1;
            }
            case 17: {
                if (this.b == 0) return n2;
                return Integer.MIN_VALUE;
            }
            case 66: 
        }
        if (this.b != 0) return Integer.MIN_VALUE;
        return 1;
    }

    @Override
    public final int f(aou aou2) {
        return super.j(aou2);
    }

    @Override
    public aoi f() {
        return new aoi(-2, -2);
    }

    @Override
    public final int g(aou aou2) {
        return super.j(aou2);
    }

    @Override
    public boolean g() {
        if (this.e == null) {
            return true;
        }
        return false;
    }

    @Override
    public final Parcelable h() {
        if (this.e != null) {
            return new amx(this.e);
        }
        amx amx2 = new amx();
        if (this.t() > 0) {
            boolean bl2;
            this.m();
            amx2.c = bl2 = false ^ this.d;
            if (bl2) {
                View view = this.B();
                amx2.b = this.c.c() - this.c.b(view);
                amx2.a = ams.a(view);
                return amx2;
            }
            View view = this.A();
            amx2.a = ams.a(view);
            amx2.b = this.c.a(view) - this.c.b();
            return amx2;
        }
        amx2.a = -1;
        return amx2;
    }

    @Override
    public boolean i() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean j() {
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    public int k() {
        return this.b;
    }

    protected final boolean l() {
        if (rw.f((View)this.g) == 1) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void m() {
        if (this.a == null) {
            this.a = new amw();
        }
        if (this.c == null) {
            void var1_2;
            switch (this.b) {
                default: {
                    throw new IllegalArgumentException("invalid orientation");
                }
                case 0: {
                    anr anr2 = new anr(this);
                    break;
                }
                case 1: {
                    ans ans2 = new ans(this);
                }
            }
            this.c = var1_2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final boolean n() {
        if (this.m == 1073741824 || this.l == 1073741824) return false;
        int n = this.t();
        int n2 = 0;
        while (n2 < n) {
            ViewGroup.LayoutParams layoutParams = this.i(n2).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public final int o() {
        View view = this.a(0, this.t(), false, true);
        if (view == null) {
            return -1;
        }
        return ams.a(view);
    }

    public int p() {
        View view = this.a(0, this.t(), true, false);
        if (view == null) {
            return -1;
        }
        return ams.a(view);
    }

    public final int q() {
        View view = this.a(-1 + this.t(), -1, false, true);
        if (view == null) {
            return -1;
        }
        return ams.a(view);
    }

    public final int r() {
        View view = this.a(-1 + this.t(), -1, true, false);
        if (view == null) {
            return -1;
        }
        return ams.a(view);
    }
}

