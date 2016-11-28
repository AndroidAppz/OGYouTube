/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SearchView
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  java.lang.Object
 *  java.lang.String
 */
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;

public final class aph
implements AdapterView.OnItemClickListener {
    private /* synthetic */ SearchView a;

    public aph(SearchView searchView) {
        this.a = searchView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n, long l) {
        SearchView.access$1800((SearchView)this.a, (int)n, (int)0, (String)null);
    }
}

