/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.Writer
 *  java.lang.Object
 *  java.lang.Void
 *  java.util.concurrent.Callable
 */
import java.io.Writer;
import java.util.concurrent.Callable;

final class awp
implements Callable {
    private /* synthetic */ awo a;

    awp(awo awo2) {
        this.a = awo2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Void a() {
        awo awo2;
        awo awo3 = awo2 = this.a;
        synchronized (awo3) {
            if (this.a.c == null) {
                return null;
            }
            this.a.c();
            if (this.a.b()) {
                this.a.a();
                this.a.d = 0;
            }
            return null;
        }
    }

    public final /* synthetic */ Object call() {
        return this.a();
    }
}

