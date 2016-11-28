/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SearchView
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  qf
 */
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

public final class apq
implements View.OnKeyListener {
    private /* synthetic */ SearchView a;

    public apq(SearchView searchView) {
        this.a = searchView;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean onKey(View view, int n, KeyEvent keyEvent) {
        if (SearchView.access$1400((SearchView)this.a) != null) {
            if (SearchView.access$1200((SearchView)this.a).isPopupShowing() && SearchView.access$1200((SearchView)this.a).getListSelection() != -1) {
                return SearchView.access$1500((SearchView)this.a, (View)view, (int)n, (KeyEvent)keyEvent);
            }
            if (TextUtils.getTrimmedLength((CharSequence)SearchView.access$1200((SearchView)this.a).getText()) == 0) {
                return false;
            }
            boolean bl2 = false;
            if (!bl2) {
                if (!qf.a((KeyEvent)keyEvent)) return false;
                if (keyEvent.getAction() == 1 && n == 66) {
                    view.cancelLongPress();
                    SearchView.access$1700((SearchView)this.a, (int)0, (String)null, (String)SearchView.access$1200((SearchView)this.a).getText().toString());
                    return true;
                }
            }
        }
        return false;
    }
}

