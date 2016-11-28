/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  java.lang.Object
 *  rd
 */
import android.view.MenuItem;

final class aif
extends aht
implements rd {
    private /* synthetic */ aic a;

    aif(aic aic2, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = aic2;
        super((Object)onActionExpandListener);
    }

    public final boolean a(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener)this.d).onMenuItemActionExpand(this.a.a(menuItem));
    }

    public final boolean b(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener)this.d).onMenuItemActionCollapse(this.a.a(menuItem));
    }
}

