/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  java.lang.Object
 */
import android.view.MenuItem;

final class aig
extends aht
implements MenuItem.OnMenuItemClickListener {
    private /* synthetic */ aic a;

    aig(aic aic2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = aic2;
        super((Object)onMenuItemClickListener);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((MenuItem.OnMenuItemClickListener)this.d).onMenuItemClick(this.a.a(menuItem));
    }
}

