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

final class aaa
implements aim {
    private /* synthetic */ zs a;

    aaa(zs zs2) {
        this.a = zs2;
    }

    @Override
    public final void a(ahw ahw2, boolean bl2) {
        this.a.b(ahw2);
    }

    @Override
    public final boolean a(ahw ahw2) {
        Window.Callback callback = this.a.c.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, (Menu)ahw2);
        }
        return true;
    }
}

