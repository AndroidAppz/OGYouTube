/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.LinkedList
 *  java.util.List
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class avg {
    private static Comparator e = new avh();
    private List a = new LinkedList();
    private List b = new ArrayList(64);
    private int c = 0;
    private final int d;

    public avg(int n) {
        this.d = n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void a() {
        avg avg2 = this;
        synchronized (avg2) {
            while (this.c > this.d) {
                byte[] arrby = (byte[])this.a.remove(0);
                this.b.remove((Object)arrby);
                this.c -= arrby.length;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(byte[] arrby) {
        void var7_2 = this;
        synchronized (var7_2) {
            int n;
            int n2;
            if (arrby != null && (n = arrby.length) <= (n2 = this.d)) {
                this.a.add((Object)arrby);
                int n3 = Collections.binarySearch((List)this.b, (Object)arrby, (Comparator)e);
                if (n3 < 0) {
                    n3 = -1 + (- n3);
                }
                this.b.add(n3, (Object)arrby);
                this.c += arrby.length;
                super.a();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final byte[] a(int n) {
        void var7_2 = this;
        // MONITORENTER : var7_2
        int n2 = 0;
        while (n2 < this.b.size()) {
            byte[] arrby = (byte[])this.b.get(n2);
            if (arrby.length >= n) {
                this.c -= arrby.length;
                this.b.remove(n2);
                this.a.remove((Object)arrby);
                // MONITOREXIT : var7_2
                return arrby;
            }
            ++n2;
        }
        return new byte[n];
    }
}

