/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SearchView
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 */
import android.support.v7.widget.SearchView;
import android.view.ViewTreeObserver;

public final class apo
implements ViewTreeObserver.OnGlobalLayoutListener {
    private /* synthetic */ SearchView a;

    public apo(SearchView searchView) {
        this.a = searchView;
    }

    public final void onGlobalLayout() {
        SearchView.access$300((SearchView)this.a);
    }
}

