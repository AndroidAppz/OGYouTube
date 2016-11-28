/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SearchView
 *  android.text.Editable
 *  android.text.TextWatcher
 *  java.lang.CharSequence
 *  java.lang.Object
 */
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;

public final class apj
implements TextWatcher {
    private /* synthetic */ SearchView a;

    public apj(SearchView searchView) {
        this.a = searchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int n, int n2, int n3) {
    }

    public final void onTextChanged(CharSequence charSequence, int n, int n2, int n3) {
        SearchView.access$2000((SearchView)this.a, (CharSequence)charSequence);
    }
}

