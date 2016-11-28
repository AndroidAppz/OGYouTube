/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.ActionBarContextView
 *  android.view.View
 *  android.view.ViewParent
 *  android.widget.PopupWindow
 *  rw
 *  tp
 *  uf
 *  ug
 *  zs
 */
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewParent;
import android.widget.PopupWindow;

final class aac
extends ug {
    private /* synthetic */ aab a;

    aac(aab aab2) {
        this.a = aab2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(View view) {
        this.a.a.r.setVisibility(8);
        if (this.a.a.s != null) {
            this.a.a.s.dismiss();
        } else if (this.a.a.r.getParent() instanceof View) {
            rw.r((View)((View)this.a.a.r.getParent()));
        }
        this.a.a.r.removeAllViews();
        this.a.a.u.a(null);
        this.a.a.u = null;
    }
}

