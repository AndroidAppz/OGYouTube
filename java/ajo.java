/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.ActionMenuView
 *  android.view.MenuItem
 *  java.lang.Object
 */
import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

public final class ajo
implements ahx {
    private /* synthetic */ ActionMenuView a;

    public ajo(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override
    public final void a(ahw ahw2) {
        if (this.a.d != null) {
            this.a.d.a(ahw2);
        }
    }

    @Override
    public final boolean a(ahw ahw2, MenuItem menuItem) {
        if (this.a.e != null && this.a.e.a(menuItem)) {
            return true;
        }
        return false;
    }
}

