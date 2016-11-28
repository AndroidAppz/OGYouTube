/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.View
 *  java.lang.Object
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;

final class aje
extends aij {
    private /* synthetic */ ajd j;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public aje(ajd var1, Context var2_3, air var3_2) {
        this.j = var1;
        super(var2_3, var3_2, null, false, acq.j);
        if (!((aia)var3_2.getItem()).f()) {
            var8_4 = var1.f == null ? (View)var1.e : var1.f;
            this.e = var8_4;
        }
        this.g = var1.n;
        var4_5 = var3_2.size();
        var5_6 = 0;
        do {
            var6_8 = false;
            if (var5_6 >= var4_5) ** GOTO lbl15
            var7_7 = var3_2.getItem(var5_6);
            if (var7_7.isVisible() && var7_7.getIcon() != null) {
                var6_8 = true;
lbl15: // 2 sources:
                this.h = var6_8;
                return;
            }
            ++var5_6;
        } while (true);
    }

    @Override
    public final void onDismiss() {
        super.onDismiss();
        this.j.l = null;
    }
}

