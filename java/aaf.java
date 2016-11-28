/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.Object
 *  zl
 *  zs
 */
import android.view.Menu;
import android.view.Window;

final class aaf
implements aim {
    private /* synthetic */ zs a;

    aaf(zs zs2) {
        this.a = zs2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(ahw ahw2, boolean bl2) {
        aae aae2;
        ahw ahw3 = ahw2.k();
        boolean bl3 = ahw3 != ahw2;
        zs zs2 = this.a;
        if (bl3) {
            ahw2 = ahw3;
        }
        if ((aae2 = zs2.a((Menu)ahw2)) != null) {
            if (!bl3) {
                this.a.a(aae2, bl2);
                return;
            }
            this.a.a(aae2.a, aae2, (Menu)ahw3);
            this.a.a(aae2, true);
        }
    }

    @Override
    public final boolean a(ahw ahw2) {
        Window.Callback callback;
        if (ahw2 == null && this.a.h && (callback = this.a.c.getCallback()) != null && !this.a.n) {
            callback.onMenuOpened(108, (Menu)ahw2);
        }
        return true;
    }
}

