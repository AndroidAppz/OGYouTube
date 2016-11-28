/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.support.v4.widget.NestedScrollView
 *  android.text.TextUtils
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Runnable
 *  rw
 *  sj
 *  xg
 *  yw
 *  yy
 *  yz
 *  za
 *  zb
 */
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class zg
extends aag
implements DialogInterface {
    public yw a;

    protected zg(Context context, int n) {
        super(context, n, 0);
    }

    zg(Context context, int n, byte by2) {
        super(context, zg.a(context, n));
        this.a = new yw(this.getContext(), (aag)this, this.getWindow());
    }

    static int a(Context context, int n) {
        if (n >= 16777216) {
            return n;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(acq.l, typedValue, true);
        return typedValue.resourceId;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void onCreate(Bundle var1) {
        super.onCreate(var1);
        var2_2 = this.a;
        var3_3 = var2_2.C == 0 ? var2_2.B : var2_2.B;
        var2_2.b.setContentView(var3_3);
        var4_4 = var2_2.c.findViewById(acv.C);
        var5_5 = var4_4.findViewById(acv.Y);
        var6_6 = var4_4.findViewById(acv.n);
        var7_7 = var4_4.findViewById(acv.l);
        var8_8 = (ViewGroup)var4_4.findViewById(acv.p);
        var9_9 = var2_2.g != null ? var2_2.g : null;
        var10_10 = var9_9 != null;
        if (var10_10 && yw.a((View)var9_9)) ** GOTO lbl-1000
        var2_2.c.setFlags(131072, 131072);
        if (var10_10) lbl-1000: // 2 sources:
        {
            ((FrameLayout)var2_2.c.findViewById(acv.o)).addView(var9_9, new ViewGroup.LayoutParams(-1, -1));
            if (var2_2.f != null) {
                ((LinearLayout.LayoutParams)var8_8.getLayoutParams()).weight = 0.0f;
            }
        } else {
            var8_8.setVisibility(8);
        }
        var11_11 = var8_8.findViewById(acv.Y);
        var12_12 = var8_8.findViewById(acv.n);
        var13_13 = var8_8.findViewById(acv.l);
        var14_14 = yw.a((View)var11_11, (View)var5_5);
        var15_15 = yw.a((View)var12_12, (View)var6_6);
        var16_16 = yw.a((View)var13_13, (View)var7_7);
        var2_2.s = (NestedScrollView)var2_2.c.findViewById(acv.F);
        var2_2.s.setFocusable(false);
        var2_2.s.setNestedScrollingEnabled(false);
        var2_2.x = (TextView)var15_15.findViewById(16908299);
        if (var2_2.x != null) {
            if (var2_2.e != null) {
                var2_2.x.setText(var2_2.e);
            } else {
                var2_2.x.setVisibility(8);
                var2_2.s.removeView((View)var2_2.x);
                if (var2_2.f != null) {
                    var35_32 = (ViewGroup)var2_2.s.getParent();
                    var36_33 = var35_32.indexOfChild((View)var2_2.s);
                    var35_32.removeViewAt(var36_33);
                    var35_32.addView((View)var2_2.f, var36_33, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    var15_15.setVisibility(8);
                }
            }
        }
        var17_17 = 0;
        var2_2.j = (Button)var16_16.findViewById(16908313);
        var2_2.j.setOnClickListener(var2_2.G);
        if (TextUtils.isEmpty((CharSequence)var2_2.k)) {
            var2_2.j.setVisibility(8);
        } else {
            var2_2.j.setText(var2_2.k);
            var2_2.j.setVisibility(0);
            var17_17 = 1;
        }
        var2_2.m = (Button)var16_16.findViewById(16908314);
        var2_2.m.setOnClickListener(var2_2.G);
        if (TextUtils.isEmpty((CharSequence)var2_2.n)) {
            var2_2.m.setVisibility(8);
        } else {
            var2_2.m.setText(var2_2.n);
            var2_2.m.setVisibility(0);
            var17_17 |= 2;
        }
        var2_2.p = (Button)var16_16.findViewById(16908315);
        var2_2.p.setOnClickListener(var2_2.G);
        if (TextUtils.isEmpty((CharSequence)var2_2.q)) {
            var2_2.p.setVisibility(8);
        } else {
            var2_2.p.setText(var2_2.q);
            var2_2.p.setVisibility(0);
            var17_17 |= 4;
        }
        var18_18 = var17_17 != 0;
        if (!var18_18) {
            var16_16.setVisibility(8);
        }
        if (var2_2.y != null) {
            var19_19 = new ViewGroup.LayoutParams(-1, -2);
            var14_14.addView(var2_2.y, 0, var19_19);
            var2_2.c.findViewById(acv.X).setVisibility(8);
        } else {
            var2_2.v = (ImageView)var2_2.c.findViewById(16908294);
            var34_34 = TextUtils.isEmpty((CharSequence)var2_2.d) == false;
            if (var34_34) {
                var2_2.w = (TextView)var2_2.c.findViewById(acv.k);
                var2_2.w.setText(var2_2.d);
                if (var2_2.u != null) {
                    var2_2.v.setImageDrawable(var2_2.u);
                } else {
                    var2_2.w.setPadding(var2_2.v.getPaddingLeft(), var2_2.v.getPaddingTop(), var2_2.v.getPaddingRight(), var2_2.v.getPaddingBottom());
                    var2_2.v.setVisibility(8);
                }
            } else {
                var2_2.c.findViewById(acv.X).setVisibility(8);
                var2_2.v.setVisibility(8);
                var14_14.setVisibility(8);
            }
        }
        var20_20 = var8_8 != null && var8_8.getVisibility() != 8;
        var21_21 = var14_14 != null && var14_14.getVisibility() != 8;
        var22_22 = var16_16 != null && var16_16.getVisibility() != 8;
        if (!var22_22 && var15_15 != null && (var33_23 = var15_15.findViewById(acv.U)) != null) {
            var33_23.setVisibility(0);
        }
        if (var21_21 && var2_2.s != null) {
            var2_2.s.setClipToPadding(true);
        }
        if (var20_20) ** GOTO lbl133
        var25_24 = var2_2.f != null ? var2_2.f : var2_2.s;
        if (var25_24 == null) ** GOTO lbl133
        var26_25 = var21_21 != false ? 1 : 0;
        var27_26 = var22_22 != false ? 2 : 0;
        var28_27 = var26_25 | var27_26;
        var29_28 = var2_2.c.findViewById(acv.E);
        var30_29 = var2_2.c.findViewById(acv.D);
        if (Build.VERSION.SDK_INT < 23) ** GOTO lbl112
        rw.a.a((View)var25_24, var28_27, 3);
        if (var29_28 != null) {
            var15_15.removeView(var29_28);
        }
        if (var30_29 != null) {
            var15_15.removeView(var30_29);
        }
        ** GOTO lbl133
lbl112: // 1 sources:
        if (var29_28 != null && (var28_27 & 1) == 0) {
            var15_15.removeView(var29_28);
            var29_28 = null;
        }
        if (var30_29 == null) ** GOTO lbl120
        if ((var28_27 & 2) == 0) {
            var15_15.removeView(var30_29);
            var30_29 = null;
        }
        if (var29_28 != null) ** GOTO lbl-1000
lbl120: // 2 sources:
        if (var30_29 != null) lbl-1000: // 2 sources:
        {
            if (var2_2.e != null) {
                var2_2.s.a = new yy(var29_28, var30_29);
                var2_2.s.post((Runnable)new yz(var2_2, var29_28, var30_29));
            } else if (var2_2.f != null) {
                var2_2.f.setOnScrollListener((AbsListView.OnScrollListener)new za(var29_28, var30_29));
                var2_2.f.post((Runnable)new zb(var2_2, var29_28, var30_29));
            } else {
                if (var29_28 != null) {
                    var15_15.removeView(var29_28);
                }
                if (var30_29 != null) {
                    var15_15.removeView(var30_29);
                }
            }
        }
lbl133: // 10 sources:
        if ((var23_30 = var2_2.f) == null) return;
        if (var2_2.z == null) return;
        var23_30.setAdapter(var2_2.z);
        var24_31 = var2_2.A;
        if (var24_31 < 0) return;
        var23_30.setItemChecked(var24_31, true);
        var23_30.setSelection(var24_31);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onKeyDown(int n, KeyEvent keyEvent) {
        yw yw2 = this.a;
        if (yw2.s == null || !yw2.s.a(keyEvent)) return super.onKeyDown(n, keyEvent);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onKeyUp(int n, KeyEvent keyEvent) {
        yw yw2 = this.a;
        if (yw2.s == null || !yw2.s.a(keyEvent)) return super.onKeyUp(n, keyEvent);
        return true;
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }
}

