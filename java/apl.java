/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.support.v7.widget.SearchView
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.database.Cursor;
import android.support.v7.widget.SearchView;

public final class apl
implements Runnable {
    private /* synthetic */ SearchView a;

    public apl(SearchView searchView) {
        this.a = searchView;
    }

    public final void run() {
        if (SearchView.access$100((SearchView)this.a) != null && SearchView.access$100((SearchView)this.a) instanceof aqa) {
            SearchView.access$100((SearchView)this.a).a(null);
        }
    }
}

