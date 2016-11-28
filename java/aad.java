/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.support.v7.widget.ContentFrameLayout
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  zs
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

final class aad
extends ContentFrameLayout {
    private /* synthetic */ zs i;

    public aad(zs zs2, Context context) {
        this.i = zs2;
        super(context);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.i.a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) return super.onInterceptTouchEvent(motionEvent);
        int n = (int)motionEvent.getX();
        int n2 = (int)motionEvent.getY();
        if (n >= -5 && n2 >= -5 && n <= 5 + this.getWidth() && n2 <= 5 + this.getHeight()) return super.onInterceptTouchEvent(motionEvent);
        boolean bl2 = true;
        if (!bl2) return super.onInterceptTouchEvent(motionEvent);
        zs zs2 = this.i;
        zs2.a(zs2.g(0), true);
        return true;
    }

    public final void setBackgroundResource(int n) {
        this.setBackgroundDrawable(akj.a().a(this.getContext(), n, false));
    }
}

