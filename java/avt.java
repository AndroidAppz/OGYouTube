/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Future
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class avt
implements auv,
auw,
Future {
    private boolean a = false;
    private Object b;
    private avb c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object a(Long l) {
        void var4_2 = this;
        synchronized (var4_2) {
            if (this.c != null) {
                throw new ExecutionException((Throwable)this.c);
            }
            if (this.a) {
                return this.b;
            }
            if (l == null) {
                this.wait(0);
            } else if (l > 0) {
                this.wait(l.longValue());
            }
            if (this.c != null) {
                throw new ExecutionException((Throwable)this.c);
            }
            if (this.a) return this.b;
            throw new TimeoutException();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean cancel(boolean bl2) {
        void var2_2 = this;
        // MONITORENTER : var2_2
        // MONITOREXIT : var2_2
        return false;
    }

    public final Object get() {
        try {
            Object object = this.a(null);
            return object;
        }
        catch (TimeoutException var1_2) {
            throw new AssertionError((Object)var1_2);
        }
    }

    public final Object get(long l, TimeUnit timeUnit) {
        return super.a(TimeUnit.MILLISECONDS.convert(l, timeUnit));
    }

    public final boolean isCancelled() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isDone() {
        avt avt2 = this;
        synchronized (avt2) {
            if (this.a) return true;
            if (this.c != null) return true;
            boolean bl2 = this.isCancelled();
            if (!bl2) return false;
            return true;
        }
    }

    @Override
    public final void onErrorResponse(avb avb2) {
        void var3_2 = this;
        synchronized (var3_2) {
            this.c = avb2;
            this.notifyAll();
            return;
        }
    }

    @Override
    public final void onResponse(Object object) {
        void var3_2 = this;
        synchronized (var3_2) {
            this.a = true;
            this.b = object;
            this.notifyAll();
            return;
        }
    }
}

