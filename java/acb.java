/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.View
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.view.Menu;
import android.view.View;
import android.view.Window;

final class acb
implements Runnable {
    private /* synthetic */ aca a;

    acb(aca aca2) {
        this.a = aca2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        aca aca2 = this.a;
        Menu menu = aca2.j();
        ahw ahw2 = menu instanceof ahw ? (ahw)menu : null;
        if (ahw2 != null) {
            ahw2.d();
        }
        try {
            menu.clear();
            if (!aca2.c.onCreatePanelMenu(0, menu) || !aca2.c.onPreparePanel(0, null, menu)) {
                menu.clear();
            }
            return;
        }
        finally {
            if (ahw2 != null) {
                ahw2.e();
            }
        }
    }
}

