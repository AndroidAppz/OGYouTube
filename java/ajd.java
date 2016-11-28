/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.support.v7.view.menu.ActionMenuItemView
 *  android.support.v7.widget.ActionMenuView
 *  android.util.DisplayMetrics
 *  android.util.SparseBooleanArray
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  pz
 *  sp
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

public final class ajd
extends ahr
implements pz {
    public ajh f;
    public Drawable g;
    public boolean h;
    int i;
    public boolean j;
    ajj k;
    aje l;
    ajg m;
    final ajk n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private final SparseBooleanArray s = new SparseBooleanArray();
    private View t;
    private ajf u;

    public ajd(Context context) {
        super(context, acx.c, acx.b);
        this.n = new ajk((ajd)this);
    }

    @Override
    public final ain a(ViewGroup viewGroup) {
        ain ain2 = super.a(viewGroup);
        ((ActionMenuView)ain2).a((ajd)this);
        return ain2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final View a(aia aia2, View view, ViewGroup viewGroup) {
        View view2 = aia2.getActionView();
        if (view2 == null || aia2.i()) {
            view2 = super.a(aia2, view, viewGroup);
        }
        int n = aia2.isActionViewExpanded() ? 8 : 0;
        view2.setVisibility(n);
        ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            view2.setLayoutParams((ViewGroup.LayoutParams)ActionMenuView.a((ViewGroup.LayoutParams)layoutParams));
        }
        return view2;
    }

    @Override
    public final void a(ahw ahw2, boolean bl2) {
        this.e();
        super.a(ahw2, bl2);
    }

    @Override
    public final void a(aia aia2, aio aio2) {
        aio2.a(aia2);
        ActionMenuView actionMenuView = (ActionMenuView)this.e;
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView)aio2;
        actionMenuItemView.b = actionMenuView;
        if (this.u == null) {
            this.u = new ajf((ajd)this);
        }
        actionMenuItemView.c = this.u;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(Context context, ahw ahw2) {
        boolean bl2 = true;
        super.a(context, ahw2);
        Resources resources = context.getResources();
        aha aha2 = aha.a(context);
        if (!this.p) {
            if (Build.VERSION.SDK_INT < 19 && sp.a((ViewConfiguration)ViewConfiguration.get((Context)aha2.a))) {
                bl2 = false;
            }
            this.o = bl2;
        }
        this.q = aha2.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.i = aha2.a.getResources().getInteger(acw.a);
        int n = this.q;
        if (this.o) {
            if (this.f == null) {
                this.f = new ajh((ajd)this, this.a);
                if (this.h) {
                    this.f.setImageDrawable(this.g);
                    this.g = null;
                    this.h = false;
                }
                int n2 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                this.f.measure(n2, n2);
            }
            n -= this.f.getMeasuredWidth();
        } else {
            this.f = null;
        }
        this.r = n;
        this.t = null;
    }

    public final void a(ActionMenuView actionMenuView) {
        this.e = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final void a(boolean bl2) {
        if (bl2) {
            super.a((air)null);
            return;
        }
        this.c.a(false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a() {
        var1_1 = this.c.h();
        var2_2 = var1_1.size();
        var3_3 = this.i;
        var4_4 = this.r;
        var5_5 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        var6_6 = (ViewGroup)this.e;
        var7_7 = 0;
        var8_8 = 0;
        var9_9 = false;
        for (var10_10 = 0; var10_10 < var2_2; ++var10_10) {
            var39_11 = (aia)var1_1.get(var10_10);
            if (var39_11.h()) {
                ++var7_7;
            } else if (var39_11.g()) {
                ++var8_8;
            } else {
                var9_9 = true;
            }
            var40_12 = this.j != false && var39_11.isActionViewExpanded() != false ? 0 : var3_3;
            var3_3 = var40_12;
        }
        if (this.o && (var9_9 || var7_7 + var8_8 > var3_3)) {
            --var3_3;
        }
        var11_13 = var3_3 - var7_7;
        var12_14 = this.s;
        var12_14.clear();
        var13_15 = 0;
        var14_16 = var4_4;
        var15_17 = var11_13;
        var16_18 = 0;
        while (var13_15 < var2_2) {
            var17_26 = (aia)var1_1.get(var13_15);
            if (!var17_26.h()) ** GOTO lbl42
            var36_22 = this.a(var17_26, this.t, var6_6);
            if (this.t == null) {
                this.t = var36_22;
            }
            var36_22.measure(var5_5, var5_5);
            var18_35 = var36_22.getMeasuredWidth();
            var37_21 = var14_16 - var18_35;
            if (var16_18 != 0) ** GOTO lbl91
            ** GOTO lbl92
lbl42: // 1 sources:
            if (!var17_26.g()) ** GOTO lbl59
            var21_27 = var17_26.getGroupId();
            var22_31 = var12_14.get(var21_27);
            var23_24 = (var15_17 > 0 || var22_31 != false) && var14_16 > 0;
            if (!var23_24) ** GOTO lbl64
            var31_40 = this.a(var17_26, this.t, var6_6);
            if (this.t == null) {
                this.t = var31_40;
            }
            var31_40.measure(var5_5, var5_5);
            var32_36 = var31_40.getMeasuredWidth();
            var33_19 = var14_16 - var32_36;
            var26_23 = var16_18 == 0 ? var32_36 : var16_18;
            var34_34 = var33_19 + var26_23 > 0;
            var35_39 = var34_34 & var23_24;
            var25_25 = var33_19;
            var24_38 = var35_39;
            ** GOTO lbl67
lbl59: // 1 sources:
            var17_26.c(false);
            var18_35 = var16_18;
            var19_32 = var14_16;
            var20_28 = var15_17;
            ** GOTO lbl97
lbl64: // 1 sources:
            var24_38 = var23_24;
            var25_25 = var14_16;
            var26_23 = var16_18;
lbl67: // 2 sources:
            if (var24_38 && var21_27 != 0) {
                var12_14.put(var21_27, true);
                var27_33 = var15_17;
            } else if (var22_31) {
                var12_14.put(var21_27, false);
                var28_20 = var15_17;
                for (var29_30 = 0; var29_30 < var13_15; ++var29_30) {
                    var30_29 = (aia)var1_1.get(var29_30);
                    if (var30_29.getGroupId() != var21_27) continue;
                    if (var30_29.f()) {
                        ++var28_20;
                    }
                    var30_29.c(false);
                }
                var27_33 = var28_20;
            } else {
                var27_33 = var15_17;
            }
            if (var24_38) {
                --var27_33;
            }
            var17_26.c(var24_38);
            var19_32 = var25_25;
            var20_28 = var27_33;
            var18_35 = var26_23;
            ** GOTO lbl97
lbl91: // 1 sources:
            var18_35 = var16_18;
lbl92: // 2 sources:
            if ((var38_37 = var17_26.getGroupId()) != 0) {
                var12_14.put(var38_37, true);
            }
            var17_26.c(true);
            var19_32 = var37_21;
            var20_28 = var15_17;
lbl97: // 3 sources:
            ++var13_15;
            var15_17 = var20_28;
            var14_16 = var19_32;
            var16_18 = var18_35;
        }
        return true;
    }

    @Override
    public final boolean a(aia aia2) {
        return aia2.f();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(air air2) {
        ajh ajh2;
        if (!air2.hasVisibleItems()) {
            return false;
        }
        air air3 = air2;
        while (air3.k != this.c) {
            air3 = (air)air3.k;
        }
        MenuItem menuItem = air3.getItem();
        ViewGroup viewGroup = (ViewGroup)this.e;
        if (viewGroup != null) {
            int n = viewGroup.getChildCount();
            for (int i = 0; i < n; ++i) {
                View view = viewGroup.getChildAt(i);
                if (!(view instanceof aio) || ((aio)view).a() != menuItem) continue;
                ajh2 = view;
                break;
            }
        } else {
            ajh2 = null;
        }
        if (ajh2 == null) {
            if (this.f == null) {
                return false;
            }
            ajh2 = this.f;
        }
        air2.getItem().getItemId();
        this.l = new aje((ajd)this, this.b, air2);
        this.l.e = ajh2;
        if (!this.l.b()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        super.a(air2);
        return true;
    }

    @Override
    public final boolean a(ViewGroup viewGroup, int n) {
        if (viewGroup.getChildAt(n) == this.f) {
            return false;
        }
        return super.a(viewGroup, n);
    }

    public final void b() {
        this.o = true;
        this.p = true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void b(boolean var1) {
        ((View)this.e).getParent();
        super.b(var1);
        ((View)this.e).requestLayout();
        if (this.c != null) {
            var12_2 = this.c;
            var12_2.i();
            var13_3 = var12_2.d;
            var14_4 = var13_3.size();
            for (var15_5 = 0; var15_5 < var14_4; ++var15_5) {
                var16_6 = ((aia)var13_3.get((int)var15_5)).d;
                if (var16_6 == null) continue;
                var16_6.b = this;
            }
        }
        var3_7 = this.c != null ? this.c.j() : null;
        var4_8 = this.o;
        var5_9 = false;
        if (!var4_8) ** GOTO lbl-1000
        var5_9 = false;
        if (var3_7 == null) ** GOTO lbl-1000
        var10_10 = var3_7.size();
        if (var10_10 != 1) ** GOTO lbl25
        var11_11 = ((aia)var3_7.get(0)).isActionViewExpanded() == false;
        var5_9 = var11_11;
        ** GOTO lbl28
lbl25: // 1 sources:
        var5_9 = false;
        if (var10_10 <= 0) ** GOTO lbl-1000
        var5_9 = true;
lbl28: // 2 sources:
        if (var5_9) {
            if (this.f == null) {
                this.f = new ajh((ajd)this, this.a);
            }
            if ((var6_12 = (ViewGroup)this.f.getParent()) != this.e) {
                if (var6_12 != null) {
                    var6_12.removeView((View)this.f);
                }
                var7_13 = (ActionMenuView)this.e;
                var8_14 = this.f;
                var9_15 = ActionMenuView.a();
                var9_15.a = true;
                var7_13.addView((View)var8_14, (ViewGroup.LayoutParams)var9_15);
            }
        } else if (this.f != null && this.f.getParent() == this.e) {
            ((ViewGroup)this.e).removeView((View)this.f);
        }
        ((ActionMenuView)this.e).b = this.o;
    }

    public final boolean c() {
        if (this.o && !this.g() && this.c != null && this.e != null && this.m == null && !this.c.j().isEmpty()) {
            this.m = new ajg(this, new ajj(this, this.b, this.c, (View)this.f));
            ((View)this.e).post((Runnable)this.m);
            super.a((air)null);
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.m != null && this.e != null) {
            ((View)this.e).removeCallbacks((Runnable)this.m);
            this.m = null;
            return true;
        }
        ajj ajj2 = this.k;
        if (ajj2 != null) {
            ajj2.c();
            return true;
        }
        return false;
    }

    public final boolean e() {
        return this.d() | this.f();
    }

    public final boolean f() {
        if (this.l != null) {
            this.l.c();
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.k != null && this.k.d()) {
            return true;
        }
        return false;
    }
}

