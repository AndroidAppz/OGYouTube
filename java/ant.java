/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.support.v7.widget.RecyclerView;

public final class ant
implements Runnable {
    private /* synthetic */ RecyclerView a;

    public ant(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        if (!this.a.m || this.a.isLayoutRequested()) {
            return;
        }
        this.a.a();
    }
}

