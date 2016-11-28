/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.ViewParent
 *  android.widget.PopupWindow
 *  java.lang.Object
 *  java.lang.Runnable
 *  re
 */
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.PopupWindow;

public abstract class ane
implements View.OnTouchListener {
    final View a;
    boolean b;
    boolean c;
    private final float d;
    private final int e;
    private final int f;
    private Runnable g;
    private Runnable h;
    private int i;
    private final int[] j = new int[2];

    public ane(View view) {
        this.a = view;
        this.d = ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop();
        this.e = ViewConfiguration.getTapTimeout();
        this.f = (this.e + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean a(MotionEvent motionEvent) {
        int n = 1;
        View view = this.a;
        ana ana2 = this.a();
        if (ana2 == null) return (boolean)0;
        if (!ana2.e.isShowing()) {
            return (boolean)0;
        }
        and and2 = ana2.f;
        if (and2 == null) return false;
        if (!and2.isShown()) {
            return false;
        }
        MotionEvent motionEvent2 = MotionEvent.obtainNoHistory((MotionEvent)motionEvent);
        int[] arrn = this.j;
        view.getLocationOnScreen(arrn);
        motionEvent2.offsetLocation((float)arrn[0], (float)arrn[n]);
        int[] arrn2 = this.j;
        and2.getLocationOnScreen(arrn2);
        motionEvent2.offsetLocation((float)(- arrn2[0]), (float)(- arrn2[n]));
        boolean bl2 = and2.a(motionEvent2, this.i);
        motionEvent2.recycle();
        int n2 = re.a((MotionEvent)motionEvent);
        int n3 = n2 != n && n2 != 3 ? n : 0;
        if (!bl2) return false;
        if (n3 != 0) return (boolean)n;
        return false;
    }

    public abstract ana a();

    public boolean b() {
        ana ana2 = this.a();
        if (ana2 != null && !ana2.e.isShowing()) {
            ana2.b();
        }
        return true;
    }

    protected boolean c() {
        ana ana2 = this.a();
        if (ana2 != null && ana2.e.isShowing()) {
            ana2.d();
        }
        return true;
    }

    final void d() {
        if (this.h != null) {
            this.a.removeCallbacks(this.h);
        }
        if (this.g != null) {
            this.a.removeCallbacks(this.g);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean onTouch(View var1, MotionEvent var2_2) {
        var3_3 = this.b;
        if (!var3_3) ** GOTO lbl5
        var7_4 = this.c ? super.a(var2_2) : super.a(var2_2) || !this.c();
        ** GOTO lbl40
lbl5: // 1 sources:
        var4_6 = this.a;
        if (!var4_6.isEnabled()) ** GOTO lbl32
        switch (re.a((MotionEvent)var2_2)) {
            case 0: {
                this.i = var2_2.getPointerId(0);
                this.c = false;
                if (this.g == null) {
                    this.g = new anf((ane)this);
                }
                var4_6.postDelayed(this.g, (long)this.e);
                if (this.h == null) {
                    this.h = new ang((ane)this);
                }
                var4_6.postDelayed(this.h, (long)this.f);
                break;
            }
            case 2: {
                var13_11 = var2_2.findPointerIndex(this.i);
                if (var13_11 < 0) break;
                var14_12 = var2_2.getX(var13_11);
                var15_13 = var2_2.getY(var13_11);
                var16_14 = this.d;
                var17_15 = var14_12 >= - var16_14 && var15_13 >= - var16_14 && var14_12 < var16_14 + (float)(var4_6.getRight() - var4_6.getLeft()) && var15_13 < var16_14 + (float)(var4_6.getBottom() - var4_6.getTop());
                if (var17_15) break;
                this.d();
                var4_6.getParent().requestDisallowInterceptTouchEvent(true);
                var5_7 = true;
                ** GOTO lbl33
            }
            case 1: 
            case 3: {
                this.d();
            }
        }
lbl32: // 6 sources:
        var5_7 = false;
lbl33: // 2 sources:
        var6_8 = var5_7 != false && this.b() != false;
        if (var6_8) {
            var9_9 = SystemClock.uptimeMillis();
            var11_10 = MotionEvent.obtain((long)var9_9, (long)var9_9, (int)3, (float)0.0f, (float)0.0f, (int)0);
            this.a.onTouchEvent(var11_10);
            var11_10.recycle();
        }
        var7_4 = var6_8;
lbl40: // 2 sources:
        this.b = var7_4;
        if (var7_4 != false) return true;
        var8_5 = false;
        if (var3_3 == false) return var8_5;
        return true;
    }
}

