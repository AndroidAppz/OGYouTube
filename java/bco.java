/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Future
 *  java.util.concurrent.PriorityBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Pattern
 */
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class bco
extends ThreadPoolExecutor {
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    private final boolean b;

    public bco(int n, int n2, long l, String string, bcs bcs2, boolean bl2, boolean bl3, BlockingQueue blockingQueue) {
        super(n, n2, l, TimeUnit.MILLISECONDS, blockingQueue, (ThreadFactory)new bcq(string, bcs2, bl2));
        this.b = bl3;
    }

    private bco(int n, int n2, String string, bcs bcs2, boolean bl2, boolean bl3) {
        this(n, n2, 0, string, bcs2, bl2, false, (BlockingQueue)new PriorityBlockingQueue());
    }

    public bco(int n, String string, bcs bcs2, boolean bl2) {
        super(n, n, string, bcs2, bl2, false);
    }

    public static bco a() {
        return new bco(1, "disk-cache", bcs.a, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Future a(Future future) {
        if (!this.b) return future;
        {
            boolean bl2 = false;
            try {
                boolean bl3;
                while (!(bl3 = future.isDone())) {
                    try {
                        future.get();
                        continue;
                    }
                    catch (ExecutionException var6_5) {
                        throw new RuntimeException((Throwable)var6_5);
                    }
                    catch (InterruptedException var5_4) {
                        bl2 = true;
                        continue;
                    }
                }
                return future;
            }
            finally {
                if (bl2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int b() {
        File[] arrfile;
        int n;
        try {
            File[] arrfile2;
            arrfile = arrfile2 = new File("/sys/devices/system/cpu/").listFiles((FilenameFilter)new bcp(Pattern.compile((String)"cpu[0-9]+")));
        }
        catch (Throwable var0_3) {
            if (Log.isLoggable((String)"GlideExecutor", (int)6)) {
                Log.e((String)"GlideExecutor", (String)"Failed to calculate accurate cpu count", (Throwable)var0_3);
            }
            arrfile = null;
        }
        if (arrfile != null) {
            n = arrfile.length;
            return Math.min((int)4, (int)Math.max((int)Math.max((int)1, (int)Runtime.getRuntime().availableProcessors()), (int)n));
        }
        n = 0;
        return Math.min((int)4, (int)Math.max((int)Math.max((int)1, (int)Runtime.getRuntime().availableProcessors()), (int)n));
    }

    public final void execute(Runnable runnable) {
        if (this.b) {
            runnable.run();
            return;
        }
        super.execute(runnable);
    }

    public final Future submit(Runnable runnable) {
        return super.a(super.submit(runnable));
    }

    public final Future submit(Runnable runnable, Object object) {
        return super.a(super.submit(runnable, object));
    }

    public final Future submit(Callable callable) {
        return super.a(super.submit(callable));
    }
}

