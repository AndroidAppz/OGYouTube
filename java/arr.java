/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.PriorityQueue
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

abstract class arr
extends arp {
    private int b = 0;
    private PriorityQueue c = new PriorityQueue(4, (Comparator)new ars());

    public arr() {
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final ara a(int n, int n2, int[] arrn, int n3) {
        boolean bl2;
        ara ara2;
        int n4;
        int[] arrn2;
        Iterator iterator = this.c.iterator();
        do {
            if (!iterator.hasNext()) return null;
            ara2 = (ara)iterator.next();
        } while (((n4 = n == 2 ? ara2.b() : ara2.a()) & n2) != n2 || !(bl2 = (arrn2 = ara2.a) == null || arrn == null || Arrays.equals((int[])arrn2, (int[])arrn)) || n3 != ara2.b);
        this.c.remove((Object)ara2);
        this.b -= ara2.h();
        this.c(ara2);
        return ara2;
    }

    @Override
    public final void a() {
        this.c.clear();
        this.b = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(ara ara2) {
        int n = ara2.h();
        if (n > this.a) {
            return false;
        }
        this.b = n + this.b;
        while (this.b > this.a) {
            ara ara3 = (ara)this.c.poll();
            this.b -= ara3.h();
            ara3.g();
        }
        boolean bl2 = true;
        if (bl2) {
            this.b(ara2);
            this.c.add((Object)ara2);
            return true;
        }
        return false;
    }

    protected abstract void b(ara var1);

    protected abstract void c(ara var1);
}

