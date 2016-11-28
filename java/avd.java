/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class avd {
    public static final boolean a = avc.b;
    private final List b = new ArrayList();
    private boolean c = false;

    avd() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string) {
        void var20_2 = this;
        synchronized (var20_2) {
            long l;
            this.c = true;
            int n = this.b.size();
            if (n == 0) {
                l = 0;
            } else {
                long l2 = ((ave)this.b.get((int)0)).c;
                l = ((ave)this.b.get((int)(-1 + this.b.size()))).c - l2;
            }
            if (l > 0) {
                long l3 = ((ave)this.b.get((int)0)).c;
                Object[] arrobject = new Object[]{l, string};
                avc.d("(%-4d ms) %s", arrobject);
                Iterator iterator = this.b.iterator();
                long l4 = l3;
                while (iterator.hasNext()) {
                    ave ave2 = (ave)iterator.next();
                    long l5 = ave2.c;
                    Object[] arrobject2 = new Object[]{l5 - l4, ave2.b, ave2.a};
                    avc.d("(+%-4d) [%2d] %s", arrobject2);
                    l4 = l5;
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string, long l) {
        void var6_3 = this;
        synchronized (var6_3) {
            if (this.c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.b.add((Object)new ave(string, l, SystemClock.elapsedRealtime()));
            return;
        }
    }

    protected final void finalize() {
        if (!this.c) {
            this.a("Request on the loose");
            avc.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}

