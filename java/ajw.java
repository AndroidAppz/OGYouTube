/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.ActivityChooserView
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 */
import android.support.v7.widget.ActivityChooserView;
import android.view.ViewTreeObserver;

public final class ajw
implements ViewTreeObserver.OnGlobalLayoutListener {
    private /* synthetic */ ActivityChooserView a;

    public ajw(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onGlobalLayout() {
        if (!this.a.c()) return;
        {
            if (!this.a.isShown()) {
                this.a.d().d();
                return;
            } else {
                this.a.d().b();
                if (this.a.h == null) return;
                {
                    this.a.h.a(true);
                    return;
                }
            }
        }
    }
}

