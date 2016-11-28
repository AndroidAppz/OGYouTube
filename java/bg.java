/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.design.widget.Snackbar
 *  android.view.View
 *  java.lang.Object
 */
import android.support.design.widget.Snackbar;
import android.view.View;

public final class bg
implements by {
    private /* synthetic */ Snackbar a;

    bg(Snackbar snackbar) {
        this.a = snackbar;
    }

    @Override
    public final void a(int n) {
        switch (n) {
            default: {
                return;
            }
            case 1: 
            case 2: {
                bq.a().a((bs)null);
                return;
            }
            case 0: 
        }
        bq.a().b(null);
    }

    @Override
    public final void a(View view) {
        view.setVisibility(8);
        Snackbar.a((int)0);
    }
}

