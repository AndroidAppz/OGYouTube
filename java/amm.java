/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.support.v7.widget.RecyclerView
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  rw
 *  ut
 *  vf
 */
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class amm
extends ams {
    public int a = -1;
    private boolean p = false;
    private int[] q;
    private View[] r;
    private SparseIntArray s = new SparseIntArray();
    private SparseIntArray t = new SparseIntArray();
    private amp u = new amn();
    private Rect v = new Rect();

    public amm(Context context, int n) {
        this.a(3);
    }

    private final int a(aom aom2, aou aou2, int n) {
        if (!aou2.g) {
            return amp.b(n, this.a);
        }
        int n2 = aom2.a(n);
        if (n2 == -1) {
            Log.w((String)"GridLayoutManager", (String)("Cannot find span size for pre layout position. " + n));
            return 0;
        }
        return amp.b(n2, this.a);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(View view, int n, int n2, boolean bl2, boolean bl3) {
        boolean bl4;
        Rect rect = this.v;
        if (this.g == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(this.g.d(view));
        }
        aoi aoi2 = (aoi)view.getLayoutParams();
        if (bl2 || this.b == 1) {
            n = amm.c(n, aoi2.leftMargin + this.v.left, aoi2.rightMargin + this.v.right);
        }
        if (bl2 || this.b == 0) {
            n2 = amm.c(n2, aoi2.topMargin + this.v.top, aoi2.bottomMargin + this.v.bottom);
        }
        if (bl3) {
            if (this.k && aoh.b(view.getMeasuredWidth(), n, aoi2.width) && aoh.b(view.getMeasuredHeight(), n2, aoi2.height)) {
                return;
            }
            bl4 = true;
        } else {
            bl4 = this.a(view, n, n2, aoi2);
        }
        if (bl4) {
            view.measure(n, n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(aom aom2, aou aou2, int n, boolean bl2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (bl2) {
            n5 = 1;
            n3 = 0;
        } else {
            n3 = n - 1;
            n5 = -1;
            n = -1;
        }
        if (this.b == 1 && this.l()) {
            n2 = -1 + this.a;
            n4 = -1;
        } else {
            n4 = 1;
            n2 = 0;
        }
        int n6 = n2;
        int n7 = n3;
        while (n7 != n) {
            View view = this.r[n7];
            amo amo2 = (amo)view.getLayoutParams();
            amo2.b = super.c(aom2, aou2, amm.a(view));
            amo2.a = n4 == -1 && amo2.b > 1 ? n6 - (-1 + amo2.b) : n6;
            n6 += n4 * amo2.b;
            n7 += n5;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int b(aom aom2, aou aou2, int n) {
        if (!aou2.g) {
            return this.u.a(n, this.a);
        }
        int n2 = this.t.get(n, -1);
        if (n2 != -1) return n2;
        int n3 = aom2.a(n);
        if (n3 != -1) return this.u.a(n3, this.a);
        Log.w((String)"GridLayoutManager", (String)("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + n));
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int c(int n, int n2, int n3) {
        int n4;
        if (n2 == 0 && n3 == 0 || (n4 = View.MeasureSpec.getMode((int)n)) != Integer.MIN_VALUE && n4 != 1073741824) {
            return n;
        }
        return View.MeasureSpec.makeMeasureSpec((int)Math.max((int)0, (int)(View.MeasureSpec.getSize((int)n) - n2 - n3)), (int)n4);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final int c(aom aom2, aou aou2, int n) {
        if (!aou2.g) {
            return 1;
        }
        int n2 = this.s.get(n, -1);
        if (n2 != -1) {
            return n2;
        }
        if (aom2.a(n) != -1) return 1;
        Log.w((String)"GridLayoutManager", (String)("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + n));
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void j(int n) {
        int n2 = 0;
        int[] arrn = this.q;
        int n3 = this.a;
        if (arrn == null || arrn.length != n3 + 1 || arrn[-1 + arrn.length] != n) {
            arrn = new int[n3 + 1];
        }
        arrn[0] = 0;
        int n4 = n / n3;
        int n5 = n % n3;
        int n6 = 1;
        int n7 = 0;
        do {
            int n8;
            if (n6 > n3) {
                this.q = arrn;
                return;
            }
            if ((n2 += n5) > 0 && n3 - n2 < n5) {
                n8 = n4 + 1;
                n2 -= n3;
            } else {
                n8 = n4;
            }
            arrn[n6] = n7 += n8;
            ++n6;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void y() {
        int n = this.k() == 1 ? this.n - this.w() - this.u() : this.o - this.x() - this.v();
        this.j(n);
    }

    private final void z() {
        if (this.r == null || this.r.length != this.a) {
            this.r = new View[this.a];
        }
    }

    @Override
    public final int a(int n, aom aom2, aou aou2) {
        super.y();
        super.z();
        return super.a(n, aom2, aou2);
    }

    @Override
    public final int a(aom aom2, aou aou2) {
        if (this.b == 0) {
            return this.a;
        }
        if (aou2.a() <= 0) {
            return 0;
        }
        return 1 + super.a(aom2, aou2, -1 + aou2.a());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final View a(View var1_1, int var2_4, aom var3_3, aou var4) {
        if (this.g == null) {
            return null;
        }
        var5_7 = this.g;
        var6_11 = var1_1.getParent();
        var7_10 = var1_1;
        while (var6_11 != null && var6_11 != var5_7 && var6_11 instanceof View) {
            var35_8 = (View)var6_11;
            var36_9 = var35_8.getParent();
            var7_10 = var35_8;
            var6_11 = var36_9;
        }
        if (var6_11 != var5_7) return null;
        var8_6 = var7_10;
        if (var8_6 == null) {
            return null;
        }
        if (this.f.d(var8_6)) {
            return null;
        }
        var9_5 = var8_6;
        if (var9_5 == null) {
            return null;
        }
        var10_13 = (amo)var9_5.getLayoutParams();
        var11_14 = var10_13.a;
        var12_15 = var10_13.a + var10_13.b;
        if (super.a(var1_1, var2_4, var3_3, var4) == null) {
            return null;
        }
        var13_16 = this.f(var2_4) == 1;
        var14_17 = var13_16 != this.d;
        if (var14_17) {
            var18_18 = -1 + this.t();
            var16_19 = -1;
            var17_20 = -1;
        } else {
            var15_21 = this.t();
            var16_19 = 1;
            var17_20 = var15_21;
            var18_18 = 0;
        }
        var19_22 = this.b == 1 && this.l() != false;
        var20_23 = null;
        var21_24 = -1;
        var22_25 = 0;
        var23_26 = var18_18;
        while (var23_26 != var17_20) {
            var24_12 = this.i(var23_26);
            if (var24_12 == var9_5) return var20_23;
            if (!var24_12.isFocusable()) ** GOTO lbl-1000
            var28_28 = (amo)var24_12.getLayoutParams();
            var29_31 = var28_28.a;
            var30_32 = var28_28.a + var28_28.b;
            if (var29_31 == var11_14) {
                if (var30_32 == var12_15) return var24_12;
            }
            if (var20_23 != null) ** GOTO lbl54
            var33_27 = true;
            ** GOTO lbl65
lbl54: // 1 sources:
            var31_36 = Math.max((int)var29_31, (int)var11_14);
            var32_35 = Math.min((int)var30_32, (int)var12_15) - var31_36;
            if (var32_35 <= var22_25) ** GOTO lbl59
            var33_27 = true;
            ** GOTO lbl65
lbl59: // 1 sources:
            var33_27 = false;
            if (var32_35 != var22_25) ** GOTO lbl-1000
            var34_34 = var29_31 > var21_24;
            var33_27 = false;
            if (var19_22 != var34_34) ** GOTO lbl-1000
            var33_27 = true;
lbl65: // 3 sources:
            if (var33_27) {
                var26_29 = var28_28.a;
                var25_30 = Math.min((int)var30_32, (int)var12_15) - Math.max((int)var29_31, (int)var11_14);
                var27_33 = var24_12;
            } else lbl-1000: // 4 sources:
            {
                var25_30 = var22_25;
                var26_29 = var21_24;
                var27_33 = var20_23;
            }
            var23_26 += var16_19;
            var20_23 = var27_33;
            var21_24 = var26_29;
            var22_25 = var25_30;
        }
        return var20_23;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    final View a(aom var1_4, aou var2_5, int var3_2, int var4_3, int var5_1) {
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
            var12_13 = amm.a(var11_11);
            if (var12_13 < 0 || var12_13 >= var5_1 || this.b(var1_4, var2_5, var12_13) != 0) ** GOTO lbl-1000
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
    public final aoi a(Context context, AttributeSet attributeSet) {
        return new amo(context, attributeSet);
    }

    @Override
    public final aoi a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new amo((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new amo(layoutParams);
    }

    public final void a(int n) {
        if (n == this.a) {
            return;
        }
        this.p = true;
        if (n <= 0) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + n);
        }
        this.a = n;
        this.u.a.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(Rect rect, int n, int n2) {
        int n3;
        int n4;
        if (this.q == null) {
            super.a(rect, n, n2);
        }
        int n5 = this.u() + this.w();
        int n6 = this.v() + this.x();
        if (this.b == 1) {
            n3 = amm.a(n2, n6 + rect.height(), rw.o((View)this.g));
            n4 = amm.a(n, n5 + this.q[-1 + this.q.length], rw.n((View)this.g));
        } else {
            n4 = amm.a(n, n5 + rect.width(), rw.n((View)this.g));
            n3 = amm.a(n2, n6 + this.q[-1 + this.q.length], rw.o((View)this.g));
        }
        this.d(n4, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    final void a(aom aom2, aou aou2, amu amu2, int n) {
        int n2 = 1;
        super.a(aom2, aou2, amu2, n);
        super.y();
        if (aou2.a() > 0 && !aou2.g) {
            if (n != n2) {
                n2 = 0;
            }
            int n3 = super.b(aom2, aou2, amu2.a);
            if (n2 != 0) {
                while (n3 > 0 && amu2.a > 0) {
                    amu2.a = -1 + amu2.a;
                    n3 = super.b(aom2, aou2, amu2.a);
                }
            } else {
                int n4;
                int n5;
                int n6 = -1 + aou2.a();
                int n7 = n3;
                for (n4 = amu2.a; n4 < n6 && (n5 = super.b(aom2, aou2, n4 + 1)) > n7; ++n4) {
                    n7 = n5;
                }
                amu2.a = n4;
            }
        }
        super.z();
    }

    /*
     * Exception decompiling
     */
    @Override
    final void a(aom var1_1, aou var2_4, amw var3_3, amv var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.util.ConcurrentModificationException
        // java.util.LinkedList$ReverseLinkIterator.next(LinkedList.java:217)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.extractLabelledBlocks(Block.java:212)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:485)
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(aom aom2, aou aou2, View view, ut ut2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof amo)) {
            super.a(view, ut2);
            return;
        }
        amo amo2 = (amo)layoutParams;
        int n = super.a(aom2, aou2, amo2.c.c());
        if (this.b == 0) {
            int n2 = amo2.a;
            int n3 = amo2.b;
            boolean bl2 = this.a > 1 && amo2.b == this.a;
            ut2.a((Object)vf.a((int)n2, (int)n3, (int)n, (int)1, (boolean)bl2));
            return;
        }
        int n4 = amo2.a;
        int n5 = amo2.b;
        int n6 = this.a;
        boolean bl3 = false;
        if (n6 > 1) {
            int n7 = amo2.b;
            int n8 = this.a;
            bl3 = false;
            if (n7 == n8) {
                bl3 = true;
            }
        }
        ut2.a((Object)vf.a((int)n, (int)1, (int)n4, (int)n5, (boolean)bl3));
    }

    @Override
    public final boolean a(aoi aoi2) {
        return aoi2 instanceof amo;
    }

    @Override
    public final int b(int n, aom aom2, aou aou2) {
        super.y();
        super.z();
        return super.b(n, aom2, aou2);
    }

    @Override
    public final int b(aom aom2, aou aou2) {
        if (this.b == 1) {
            return this.a;
        }
        if (aou2.a() <= 0) {
            return 0;
        }
        return 1 + super.a(aom2, aou2, -1 + aou2.a());
    }

    @Override
    public final void b() {
        this.u.a.clear();
    }

    @Override
    public final void c() {
        this.u.a.clear();
    }

    @Override
    public final void c(aom aom2, aou aou2) {
        if (aou2.g) {
            int n = this.t();
            for (int i = 0; i < n; ++i) {
                amo amo2 = (amo)this.i(i).getLayoutParams();
                int n2 = amo2.c.c();
                this.s.put(n2, amo2.b);
                this.t.put(n2, amo2.a);
            }
        }
        super.c(aom2, aou2);
        this.s.clear();
        this.t.clear();
        if (!aou2.g) {
            this.p = false;
        }
    }

    @Override
    public final void d() {
        this.u.a.clear();
    }

    @Override
    public final void e() {
        this.u.a.clear();
    }

    @Override
    public final aoi f() {
        if (this.b == 0) {
            return new amo(-2, -1);
        }
        return new amo(-1, -2);
    }

    @Override
    public final boolean g() {
        if (this.e == null && !this.p) {
            return true;
        }
        return false;
    }

    @Override
    public final void x_() {
        this.u.a.clear();
    }
}

