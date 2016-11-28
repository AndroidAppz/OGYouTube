/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.Map
 *  java.util.concurrent.BlockingQueue
 */
import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public final class aue
extends Thread {
    private static final boolean c = avc.b;
    final BlockingQueue a;
    volatile boolean b = false;
    private final BlockingQueue d;
    private final auc e;
    private final aux f;

    public aue(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, auc auc2, aux aux2) {
        this.d = blockingQueue;
        this.a = blockingQueue2;
        this.e = auc2;
        this.f = aux2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        if (c) {
            avc.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority((int)10);
        this.e.a();
        do {
            auq auq2;
            aud aud2;
            try {
                do {
                    auq2 = (auq)this.d.take();
                    auq2.a("cache-queue-take");
                    if (auq2.h()) {
                        auq2.b("cache-discard-canceled");
                        continue;
                    }
                    aud2 = this.e.a(auq2.e());
                    if (aud2 == null) {
                        auq2.a("cache-miss");
                        this.a.put((Object)auq2);
                        continue;
                    }
                    break;
                } while (true);
            }
            catch (InterruptedException var1_2) {
                if (!this.b) continue;
                return;
            }
            if (aud2.a()) {
                auq2.a("cache-hit-expired");
                auq2.a(aud2);
                this.a.put((Object)auq2);
                continue;
            }
            auq2.a("cache-hit");
            auu auu2 = auq2.a(new aun(aud2.a, aud2.g));
            auq2.a("cache-hit-parsed");
            if (!aud2.b()) {
                this.f.a(auq2, auu2);
                continue;
            }
            auq2.a("cache-hit-refresh-needed");
            auq2.a(aud2);
            auu2.d = true;
            this.f.a(auq2, auu2, new auf(this, auq2));
        } while (true);
    }
}

