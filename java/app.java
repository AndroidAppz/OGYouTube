/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SearchView
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 */
import android.support.v7.widget.SearchView;
import android.view.View;

public final class app
implements View.OnClickListener {
    private /* synthetic */ SearchView a;

    public app(SearchView searchView) {
        this.a = searchView;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        if (view == SearchView.access$400((SearchView)this.a)) {
            SearchView.access$500((SearchView)this.a);
            return;
        } else {
            if (view == SearchView.access$600((SearchView)this.a)) {
                SearchView.access$700((SearchView)this.a);
                return;
            }
            if (view == SearchView.access$800((SearchView)this.a)) {
                SearchView.access$900((SearchView)this.a);
                return;
            }
            if (view == SearchView.access$1000((SearchView)this.a)) {
                SearchView.access$1100((SearchView)this.a);
                return;
            }
            if (view != SearchView.access$1200((SearchView)this.a)) return;
            {
                SearchView.access$1300((SearchView)this.a);
                return;
            }
        }
    }
}

