/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.BlockingQueue
 */
import java.util.concurrent.BlockingQueue;

final class auf
implements Runnable {
    private /* synthetic */ auq a;
    private /* synthetic */ aue b;

    auf(aue aue2, auq auq2) {
        this.b = aue2;
        this.a = auq2;
    }

    public final void run() {
        try {
            this.b.a.put((Object)this.a);
            return;
        }
        catch (InterruptedException var1_1) {
            return;
        }
    }
}

