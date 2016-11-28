/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.support.design.widget.Snackbar
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.os.Handler;
import android.support.design.widget.Snackbar;

public final class bh
implements bo {
    final /* synthetic */ Snackbar a;

    bh(Snackbar snackbar) {
        this.a = snackbar;
    }

    @Override
    public final void a() {
        if (bq.a().c(null)) {
            Snackbar.a.post((Runnable)new bi(this));
        }
    }
}

