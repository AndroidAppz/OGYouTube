/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  rw
 *  sj
 */
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

final class amw {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h = 0;
    int i;
    List j = null;
    boolean k;

    amw() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final View a(aom var1) {
        var2_2 = 1;
        var3_3 = 0;
        if (this.j != null) ** GOTO lbl118
        var4_7 = this.d;
        if (var4_7 < 0) throw new IndexOutOfBoundsException("Invalid item position " + var4_7 + "(" + var4_7 + "). Item count:" + var1.e.z.a());
        if (var4_7 >= var1.e.z.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + var4_7 + "(" + var4_7 + "). Item count:" + var1.e.z.a());
        }
        if (var1.e.z.g) {
            var41_8 = var1.c(var4_7);
            var42_9 = var41_8 != null ? var2_2 : 0;
            var6_10 = var42_9;
            var5_11 = var41_8;
        } else {
            var5_11 = null;
            var6_10 = 0;
        }
        if (var5_11 == null && (var5_11 = var1.a(var4_7, false)) != null) {
            if (var5_11.m()) {
                var40_12 = var1.e.z.g;
            } else {
                if (var5_11.b < 0) throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + var5_11);
                if (var5_11.b >= var1.e.h.a()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + var5_11);
                }
                var40_12 = var1.e.z.g == false && var1.e.h.a(var5_11.b) != var5_11.d ? 0 : var2_2;
            }
            if (var40_12 == 0) {
                var5_11.b(4);
                if (var5_11.e()) {
                    var1.e.removeDetachedView(var5_11.a, false);
                    var5_11.f();
                } else if (var5_11.g()) {
                    var5_11.h();
                }
                var1.a(var5_11);
                var5_11 = null;
                var7_13 = var6_10;
            } else {
                var7_13 = var2_2;
            }
        } else {
            var7_13 = var6_10;
        }
        if (var5_11 != null) ** GOTO lbl-1000
        var27_14 = var1.e.d.b(var4_7);
        if (var27_14 < 0) throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + var4_7 + "(offset:" + var27_14 + ")." + "state:" + var1.e.z.a());
        if (var27_14 >= var1.e.h.a()) {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + var4_7 + "(offset:" + var27_14 + ")." + "state:" + var1.e.z.a());
        }
        var28_15 = var1.e.h.a(var27_14);
        if (var5_11 == null) {
            var35_16 = (ArrayList)var1.c().a.get(var28_15);
            if (var35_16 != null && !var35_16.isEmpty()) {
                var37_17 = -1 + var35_16.size();
                var36_18 = (aow)var35_16.get(var37_17);
                var35_16.remove(var37_17);
            } else {
                var36_18 = null;
            }
            if (var36_18 != null) {
                var36_18.q();
                if (RecyclerView.a && var36_18.a instanceof ViewGroup) {
                    var1.a((ViewGroup)var36_18.a, false);
                }
            }
            var5_11 = var36_18;
        }
        if (var5_11 == null) {
            var30_19 = var1.e.h;
            var31_20 = var1.e;
            var33_21 = var30_19.a((ViewGroup)var31_20, var28_15);
            var33_21.d = var28_15;
            var8_22 = var33_21;
        } else lbl-1000: // 2 sources:
        {
            var8_22 = var5_11;
        }
        if (var7_13 != 0 && !var1.e.z.g && var8_22.a(8192)) {
            var8_22.a(0, 8192);
            if (var1.e.z.h) {
                aoc.d(var8_22);
                var8_22.p();
                var23_23 = new aoe();
                var24_24 = var8_22.a;
                var23_23.a = var24_24.getLeft();
                var23_23.b = var24_24.getTop();
                var24_24.getRight();
                var24_24.getBottom();
                var1.e.a(var8_22, var23_23);
            }
        }
        if (var1.e.z.g && var8_22.l()) {
            var8_22.e = var4_7;
            var15_25 = 0;
        } else if (!var8_22.l() || var8_22.k() || var8_22.j()) {
            var9_29 = var1.e.d.b(var4_7);
            var8_22.n = var1.e;
            var10_30 = var1.e.h;
            var8_22.b = var9_29;
            var8_22.a(var2_2, 519);
            var8_22.p();
            var10_30.a(var8_22, var9_29);
            var8_22.o();
            var14_31 = var8_22.a;
            if (var1.e.i()) {
                if (rw.d((View)var14_31) == 0) {
                    rw.c((View)var14_31, (int)var2_2);
                }
                if (!rw.a.b(var14_31)) {
                    rw.a((View)var14_31, (pl)var1.e.F.e);
                }
            }
            if (var1.e.z.g) {
                var8_22.e = var4_7;
            }
            var15_25 = var2_2;
        } else {
            var15_25 = 0;
        }
        if ((var16_26 = var8_22.a.getLayoutParams()) == null) {
            var17_27 = (aoi)var1.e.generateDefaultLayoutParams();
            var8_22.a.setLayoutParams((ViewGroup.LayoutParams)var17_27);
        } else if (!var1.e.checkLayoutParams(var16_26)) {
            var17_27 = (aoi)var1.e.generateLayoutParams(var16_26);
            var8_22.a.setLayoutParams((ViewGroup.LayoutParams)var17_27);
        } else {
            var17_27 = (aoi)var16_26;
        }
        var17_27.c = var8_22;
        if (var7_13 == 0 || var15_25 == 0) {
            var2_2 = 0;
        }
        var17_27.f = var2_2;
        var18_28 = var8_22.a;
        this.d += this.e;
        return var18_28;
lbl118: // 1 sources:
        var43_4 = this.j.size();
        while (var3_3 < var43_4) {
            var44_6 = ((aow)this.j.get((int)var3_3)).a;
            var45_5 = (aoi)var44_6.getLayoutParams();
            if (!var45_5.c.m() && this.d == var45_5.c.c()) {
                this.a(var44_6);
                return var44_6;
            }
            ++var3_3;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(View var1) {
        var2_2 = this.j.size();
        var3_3 = null;
        var4_4 = Integer.MAX_VALUE;
        var5_5 = 0;
        do {
            if (var5_5 >= var2_2) ** GOTO lbl13
            var6_9 = ((aow)this.j.get((int)var5_5)).a;
            var7_8 = (aoi)var6_9.getLayoutParams();
            if (var6_9 == var1 || var7_8.c.m() || (var8_6 = (var7_8.c.c() - this.d) * this.e) < 0 || var8_6 >= var4_4) ** GOTO lbl19
            if (var8_6 == 0) ** GOTO lbl14
            var9_7 = var6_9;
            ** GOTO lbl21
lbl13: // 1 sources:
            var6_9 = var3_3;
lbl14: // 2 sources:
            if (var6_9 == null) {
                this.d = -1;
                return;
            }
            this.d = ((aoi)var6_9.getLayoutParams()).c.c();
            return;
lbl19: // 1 sources:
            var8_6 = var4_4;
            var9_7 = var3_3;
lbl21: // 2 sources:
            ++var5_5;
            var3_3 = var9_7;
            var4_4 = var8_6;
        } while (true);
    }

    final boolean a(aou aou2) {
        if (this.d >= 0 && this.d < aou2.a()) {
            return true;
        }
        return false;
    }
}

