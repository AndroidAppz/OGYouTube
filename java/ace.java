/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.Object
 */
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

final class ace
implements ahx {
    private /* synthetic */ aca a;

    ace(aca aca2) {
        this.a = aca2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(ahw ahw2) {
        if (this.a.c == null) return;
        {
            if (this.a.a.f()) {
                this.a.c.onPanelClosed(108, (Menu)ahw2);
                return;
            } else {
                if (!this.a.c.onPreparePanel(0, null, (Menu)ahw2)) return;
                {
                    this.a.c.onMenuOpened(108, (Menu)ahw2);
                    return;
                }
            }
        }
    }

    @Override
    public final boolean a(ahw ahw2, MenuItem menuItem) {
        return false;
    }
}

