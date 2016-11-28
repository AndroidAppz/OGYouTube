/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SearchView
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  java.lang.Object
 */
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;

public final class api
implements AdapterView.OnItemSelectedListener {
    private /* synthetic */ SearchView a;

    public api(SearchView searchView) {
        this.a = searchView;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int n, long l) {
        SearchView.access$1900((SearchView)this.a, (int)n);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}

