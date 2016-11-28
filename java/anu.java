/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.support.v7.widget.RecyclerView;

public final class anu
implements Runnable {
    private /* synthetic */ RecyclerView a;

    public anu(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        if (this.a.w != null) {
            this.a.w.a();
        }
        this.a.E = false;
    }
}

