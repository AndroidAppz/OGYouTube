/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

final class ang
implements Runnable {
    private /* synthetic */ ane a;

    ang(ane ane2) {
        this.a = ane2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        ane ane2 = this.a;
        ane2.d();
        View view = ane2.a;
        if (!view.isEnabled() || view.isLongClickable() || !ane2.b()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain((long)l, (long)l, (int)3, (float)0.0f, (float)0.0f, (int)0);
        view.onTouchEvent(motionEvent);
        motionEvent.recycle();
        ane2.b = true;
        ane2.c = true;
    }
}

