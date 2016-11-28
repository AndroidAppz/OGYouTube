/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.widget.PopupWindow
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

final class ank
implements View.OnTouchListener {
    private /* synthetic */ ana a;

    ank(ana ana2) {
        this.a = ana2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int n = motionEvent.getAction();
        int n2 = (int)motionEvent.getX();
        int n3 = (int)motionEvent.getY();
        if (n == 0 && this.a.e != null && this.a.e.isShowing() && n2 >= 0 && n2 < this.a.e.getWidth() && n3 >= 0 && n3 < this.a.e.getHeight()) {
            this.a.p.postDelayed((Runnable)this.a.o, 250);
            return false;
        }
        if (n != 1) return false;
        this.a.p.removeCallbacks((Runnable)this.a.o);
        return false;
    }
}

