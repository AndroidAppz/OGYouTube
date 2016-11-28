/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.Object
 */
import android.view.MenuItem;
import android.view.Window;

final class acc
implements aqo {
    private /* synthetic */ aca a;

    acc(aca aca2) {
        this.a = aca2;
    }

    @Override
    public final boolean a(MenuItem menuItem) {
        return this.a.c.onMenuItemSelected(0, menuItem);
    }
}

