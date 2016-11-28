/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  java.lang.Object
 */
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

final class alg
implements PopupWindow.OnDismissListener {
    private /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    private /* synthetic */ ald b;

    alg(ald ald2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = ald2;
        this.a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}

