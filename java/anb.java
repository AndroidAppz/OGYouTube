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

final class anb
implements Runnable {
    private /* synthetic */ ana a;

    anb(ana ana2) {
        this.a = ana2;
    }

    public final void run() {
        View view = this.a.m;
        if (view != null && view.getWindowToken() != null) {
            this.a.b();
        }
    }
}

