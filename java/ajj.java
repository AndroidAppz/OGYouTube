/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;

final class ajj
extends aij {
    private /* synthetic */ ajd j;

    public ajj(ajd ajd2, Context context, ahw ahw2, View view) {
        this.j = ajd2;
        super(context, ahw2, view, true, acq.j);
        this.i = 8388613;
        this.g = ajd2.n;
    }

    @Override
    public final void onDismiss() {
        super.onDismiss();
        if (this.j.c != null) {
            this.j.c.close();
        }
        this.j.k = null;
    }
}

