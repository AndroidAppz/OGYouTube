/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.app.OverlayListView
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 */
import android.support.v7.app.OverlayListView;
import android.view.View;

final class aba
implements View.OnClickListener {
    private /* synthetic */ aas a;

    aba(aas aas2) {
        this.a = aas2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        aas aas2 = this.a;
        boolean bl2 = !this.a.I;
        aas2.I = bl2;
        if (this.a.I) {
            this.a.n.setVisibility(0);
        }
        this.a.e();
        this.a.d(true);
    }
}

