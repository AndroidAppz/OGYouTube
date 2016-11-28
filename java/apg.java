/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v7.widget.SearchView
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.reflect.Method
 */
import android.content.Context;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Method;

public final class apg
implements Runnable {
    private /* synthetic */ SearchView a;

    public apg(SearchView searchView) {
        this.a = searchView;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager)this.a.getContext().getSystemService("input_method");
        if (inputMethodManager == null) return;
        aps aps2 = SearchView.HIDDEN_METHOD_INVOKER;
        SearchView searchView = this.a;
        if (aps2.c != null) {
            try {
                Method method = aps2.c;
                Object[] arrobject = new Object[]{0, null};
                method.invoke((Object)inputMethodManager, arrobject);
                return;
            }
            catch (Exception var5_6) {
                // empty catch block
            }
        }
        inputMethodManager.showSoftInput((View)searchView, 0);
    }
}

