/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.app.OverlayListView
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.support.v7.app.OverlayListView;
import android.view.ViewTreeObserver;

final class aat
implements Runnable {
    private /* synthetic */ aas a;

    aat(aas aas2) {
        this.a = aas2;
    }

    public final void run() {
        aas aas2 = this.a;
        aas2.f(true);
        aas2.n.requestLayout();
        aas2.n.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new aav(aas2));
    }
}

