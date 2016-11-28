/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Queue
 */
import java.util.Queue;

public final class bek {
    private static final Queue a = bln.a(0);
    private int b;
    private int c;
    private Object d;

    private bek() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static bek a(Object object, int n, int n2) {
        Queue queue;
        Queue queue2 = queue = a;
        // MONITORENTER : queue2
        bek bek2 = (bek)a.poll();
        // MONITOREXIT : queue2
        if (bek2 == null) {
            bek2 = new bek();
        }
        bek2.d = object;
        bek2.c = n;
        bek2.b = n2;
        return bek2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Queue queue;
        Queue queue2 = queue = a;
        synchronized (queue2) {
            a.offer((Object)this);
            return;
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof bek;
        boolean bl3 = false;
        if (bl2) {
            bek bek2 = (bek)object;
            int n = this.c;
            int n2 = bek2.c;
            bl3 = false;
            if (n == n2) {
                int n3 = this.b;
                int n4 = bek2.b;
                bl3 = false;
                if (n3 == n4) {
                    boolean bl4 = this.d.equals(bek2.d);
                    bl3 = false;
                    if (bl4) {
                        bl3 = true;
                    }
                }
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return 31 * (31 * this.b + this.c) + this.d.hashCode();
    }
}

