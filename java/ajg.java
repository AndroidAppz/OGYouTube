/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.os.IBinder;
import android.view.View;

final class ajg
implements Runnable {
    private ajj a;
    private /* synthetic */ ajd b;

    public ajg(ajd ajd2, ajj ajj2) {
        this.b = ajd2;
        this.a = ajj2;
    }

    public final void run() {
        View view;
        ahw ahw2 = this.b.c;
        if (ahw2.b != null) {
            ahw2.b.a(ahw2);
        }
        if ((view = (View)this.b.e) != null && view.getWindowToken() != null && this.a.b()) {
            this.b.k = this.a;
        }
        this.b.m = null;
    }
}

