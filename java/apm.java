/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SearchView
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  java.lang.Object
 */
import android.support.v7.widget.SearchView;
import android.view.View;

public final class apm
implements View.OnFocusChangeListener {
    private /* synthetic */ SearchView a;

    public apm(SearchView searchView) {
        this.a = searchView;
    }

    public final void onFocusChange(View view, boolean bl2) {
        if (SearchView.access$200((SearchView)this.a) != null) {
            SearchView.access$200((SearchView)this.a).onFocusChange((View)this.a, bl2);
        }
    }
}

