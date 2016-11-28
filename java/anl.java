/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.PopupWindow
 *  java.lang.Object
 *  java.lang.Runnable
 *  rw
 */
import android.view.View;
import android.widget.PopupWindow;

final class anl
implements Runnable {
    private /* synthetic */ ana a;

    anl(ana ana2) {
        this.a = ana2;
    }

    public final void run() {
        if (this.a.f != null && rw.x((View)this.a.f) && this.a.f.getCount() > this.a.f.getChildCount() && this.a.f.getChildCount() <= this.a.l) {
            this.a.e.setInputMethodMode(2);
            this.a.b();
        }
    }
}

