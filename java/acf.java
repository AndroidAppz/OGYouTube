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

final class acf
implements aim {
    private /* synthetic */ aca a;

    acf(aca aca2) {
        this.a = aca2;
    }

    @Override
    public final void a(ahw ahw2, boolean bl2) {
        if (this.a.c != null) {
            this.a.c.onPanelClosed(0, (Menu)ahw2);
        }
    }

    @Override
    public final boolean a(ahw ahw2) {
        if (ahw2 == null && this.a.c != null) {
            this.a.c.onMenuOpened(0, (Menu)ahw2);
        }
        return true;
    }
}

