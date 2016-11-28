/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.View
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.PopupWindow
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.os.Handler;
import android.view.View;
import android.widget.AbsListView;
import android.widget.PopupWindow;

final class anj
implements AbsListView.OnScrollListener {
    private /* synthetic */ ana a;

    anj(ana ana2) {
        this.a = ana2;
    }

    public final void onScroll(AbsListView absListView, int n, int n2, int n3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int n) {
        if (n == 1 && !this.a.g() && this.a.e.getContentView() != null) {
            this.a.p.removeCallbacks((Runnable)this.a.o);
            this.a.o.run();
        }
    }
}

