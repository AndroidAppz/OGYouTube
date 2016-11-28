/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.view.View;

final class apf
implements Runnable {
    private /* synthetic */ View a;
    private /* synthetic */ ape b;

    apf(ape ape2, View view) {
        this.b = ape2;
        this.a = view;
    }

    public final void run() {
        int n = this.a.getLeft() - (this.b.getWidth() - this.a.getWidth()) / 2;
        this.b.smoothScrollTo(n, 0);
        this.b.a = null;
    }
}

