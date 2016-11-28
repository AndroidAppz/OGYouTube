/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SearchView
 *  android.view.KeyEvent
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  java.lang.Object
 */
import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.widget.TextView;

public final class apr
implements TextView.OnEditorActionListener {
    private /* synthetic */ SearchView a;

    public apr(SearchView searchView) {
        this.a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int n, KeyEvent keyEvent) {
        SearchView.access$900((SearchView)this.a);
        return true;
    }
}

