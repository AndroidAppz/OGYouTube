/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.Object
 */
import android.view.Menu;
import android.view.Window;

final class acd
implements aim {
    private boolean a;
    private /* synthetic */ aca b;

    acd(aca aca2) {
        this.b = aca2;
    }

    @Override
    public final void a(ahw ahw2, boolean bl2) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b.a.k();
        if (this.b.c != null) {
            this.b.c.onPanelClosed(108, (Menu)ahw2);
        }
        this.a = false;
    }

    @Override
    public final boolean a(ahw ahw2) {
        if (this.b.c != null) {
            this.b.c.onMenuOpened(108, (Menu)ahw2);
            return true;
        }
        return false;
    }
}

