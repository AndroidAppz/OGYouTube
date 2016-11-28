/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 */
import java.util.concurrent.ThreadFactory;

final class awq
implements ThreadFactory {
    awq() {
    }

    public final Thread newThread(Runnable runnable) {
        void var4_2 = this;
        synchronized (var4_2) {
            Thread thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }
}

