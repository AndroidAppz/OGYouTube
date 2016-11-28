/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 */
import android.view.View;

final class aax
implements View.OnClickListener {
    private /* synthetic */ aas a;

    aax(aas aas2) {
        this.a = aas2;
    }

    public final void onClick(View view) {
        this.a.dismiss();
    }
}

