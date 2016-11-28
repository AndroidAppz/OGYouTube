/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.design.widget.CoordinatorLayout
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.animation.Interpolator
 *  java.lang.Math
 *  java.lang.Runnable
 *  re
 *  rs
 *  rw
 *  xt
 */
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;

public class ay
extends cx {
    private Runnable a;
    xt b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public ay() {
        this.d = -1;
        this.f = -1;
    }

    public ay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }

    private final void c() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }

    public int a() {
        return this.b();
    }

    public int a(CoordinatorLayout coordinatorLayout, View view, int n, int n2, int n3) {
        int n4 = this.b();
        int n5 = 0;
        if (n2 != 0) {
            n5 = 0;
            if (n4 >= n2) {
                n5 = 0;
                if (n4 <= n3) {
                    int n6 = bb.a(n, n2, n3);
                    n5 = 0;
                    if (n4 != n6) {
                        this.a(n6);
                        n5 = n4 - n6;
                    }
                }
            }
        }
        return n5;
    }

    public int a(View view) {
        return view.getHeight();
    }

    public void a(CoordinatorLayout coordinatorLayout, View view) {
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int n, float f2) {
        if (this.a != null) {
            view.removeCallbacks(this.a);
            this.a = null;
        }
        if (this.b == null) {
            this.b = xt.a((Context)view.getContext(), (Interpolator)null);
        }
        this.b.a(this.b(), 0, Math.round((float)f2), 0, 0, n, 0);
        if (this.b.g()) {
            this.a = new az((ay)this, coordinatorLayout, view);
            rw.a((View)view, (Runnable)this.a);
            return true;
        }
        this.a(coordinatorLayout, view);
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(CoordinatorLayout var1, View var2_3, MotionEvent var3_2) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get((Context)var1.getContext()).getScaledTouchSlop();
        }
        if (var3_2.getAction() == 2 && this.c) {
            return true;
        }
        switch (re.a((MotionEvent)var3_2)) {
            case 0: {
                this.c = false;
                var7_4 = (int)var3_2.getX();
                var8_5 = (int)var3_2.getY();
                if (this.c(var2_3) && var1.a(var2_3, var7_4, var8_5)) {
                    this.e = var8_5;
                    this.d = re.b((MotionEvent)var3_2, (int)0);
                    super.c();
                    ** break;
                }
                ** GOTO lbl21
            }
            case 2: {
                var4_6 = this.d;
                if (var4_6 != -1 && (var5_7 = re.a((MotionEvent)var3_2, (int)var4_6)) != -1 && Math.abs((int)((var6_8 = (int)re.d((MotionEvent)var3_2, (int)var5_7)) - this.e)) > this.f) {
                    this.c = true;
                    this.e = var6_8;
                }
            }
lbl21: // 6 sources:
            default: {
                ** GOTO lbl29
            }
            case 1: 
            case 3: 
        }
        this.c = false;
        this.d = -1;
        if (this.g != null) {
            this.g.recycle();
            this.g = null;
        }
lbl29: // 4 sources:
        if (this.g == null) return this.c;
        this.g.addMovement(var3_2);
        return this.c;
    }

    public final int a_(CoordinatorLayout coordinatorLayout, View view, int n) {
        return this.a(coordinatorLayout, view, n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final int b(CoordinatorLayout coordinatorLayout, View view, int n, int n2, int n3) {
        return this.a(coordinatorLayout, view, this.a() - n, n2, n3);
    }

    public int b(View view) {
        return - view.getHeight();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean b(CoordinatorLayout var1, View var2_3, MotionEvent var3_2) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get((Context)var1.getContext()).getScaledTouchSlop();
        }
        switch (re.a((MotionEvent)var3_2)) {
            case 0: {
                var11_5 = (int)var3_2.getX();
                var12_6 = (int)var3_2.getY();
                var13_7 = var1.a(var2_3, var11_5, var12_6);
                var4_4 = false;
                if (var13_7 == false) return var4_4;
                var14_8 = this.c(var2_3);
                var4_4 = false;
                if (var14_8 == false) return var4_4;
                this.e = var12_6;
                this.d = re.b((MotionEvent)var3_2, (int)0);
                super.c();
                ** break;
            }
            case 2: {
                var7_9 = re.a((MotionEvent)var3_2, (int)this.d);
                var4_4 = false;
                if (var7_9 == -1) return var4_4;
                var8_10 = (int)re.d((MotionEvent)var3_2, (int)var7_9);
                var9_11 = this.e - var8_10;
                if (!this.c && Math.abs((int)var9_11) > this.f) {
                    this.c = true;
                    var9_11 = var9_11 > 0 ? (var9_11 -= this.f) : (var9_11 += this.f);
                }
                if (this.c) {
                    this.e = var8_10;
                    this.b(var1, var2_3, var9_11, this.b(var2_3), 0);
                }
            }
lbl29: // 5 sources:
            default: {
                ** GOTO lbl43
            }
            case 1: {
                if (this.g == null) break;
                this.g.addMovement(var3_2);
                this.g.computeCurrentVelocity(1000);
                var5_12 = rs.b((VelocityTracker)this.g, (int)this.d);
                this.a(var1, var2_3, - this.a(var2_3), var5_12);
            }
            case 3: 
        }
        this.c = false;
        this.d = -1;
        if (this.g != null) {
            this.g.recycle();
            this.g = null;
        }
lbl43: // 4 sources:
        if (this.g == null) return true;
        this.g.addMovement(var3_2);
        return true;
    }

    public boolean c(View view) {
        return false;
    }
}

