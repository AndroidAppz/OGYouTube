/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.PriorityQueue
 *  jh
 */
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

final class adg {
    private static final Comparator f = new adh();
    final int[] a;
    final int[] b;
    final List c;
    private adn[] d;
    private final float[] e;

    /*
     * Enabled aggressive block sorting
     */
    adg(int[] arrn, int n, adn[] arradn) {
        int[] arrn2;
        int[] arrn3;
        int n2 = 0;
        this.e = new float[3];
        this.d = arradn;
        this.b = arrn3 = new int[32768];
        for (int i = 0; i < arrn.length; ++i) {
            int n3;
            int n4 = arrn[i];
            int n5 = adg.b(Color.red((int)n4), 8, 5);
            int n6 = adg.b(Color.green((int)n4), 8, 5);
            arrn[i] = n3 = adg.b(Color.blue((int)n4), 8, 5) | (n5 << 10 | n6 << 5);
            arrn3[n3] = 1 + arrn3[n3];
        }
        int n7 = 0;
        for (int j = 0; j < 32768; ++j) {
            if (arrn3[j] > 0) {
                jh.a((int)adg.d(j), (float[])this.e);
                if (super.a(this.e)) {
                    arrn3[j] = 0;
                }
            }
            if (arrn3[j] <= 0) continue;
            ++n7;
        }
        this.a = arrn2 = new int[n7];
        int n8 = 0;
        for (int k = 0; k < 32768; ++k) {
            int n9;
            if (arrn3[k] > 0) {
                n9 = n8 + 1;
                arrn2[n8] = k;
            } else {
                n9 = n8;
            }
            n8 = n9;
        }
        if (n7 <= n) {
            this.c = new ArrayList();
            int n10 = arrn2.length;
            while (n2 < n10) {
                int n11 = arrn2[n2];
                this.c.add((Object)new adp(adg.d(n11), arrn3[n11]));
                ++n2;
            }
            return;
        } else {
            PriorityQueue priorityQueue = new PriorityQueue(n, f);
            priorityQueue.offer((Object)new adi((adg)this, 0, -1 + this.a.length));
            adg.a(priorityQueue, n);
            this.c = super.a((Collection)priorityQueue);
        }
    }

    static int a(int n) {
        return 31 & n >> 10;
    }

    static int a(int n, int n2, int n3) {
        return Color.rgb((int)adg.b(n, 5, 8), (int)adg.b(n2, 5, 8), (int)adg.b(n3, 5, 8));
    }

    private final List a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            adp adp2 = ((adi)iterator.next()).e();
            if (super.a(adp2.a())) continue;
            arrayList.add((Object)adp2);
        }
        return arrayList;
    }

    private static void a(PriorityQueue priorityQueue, int n) {
        adi adi2;
        while (priorityQueue.size() < n && (adi2 = (adi)priorityQueue.poll()) != null && adi2.b()) {
            if (!adi2.b()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int n2 = adi2.d();
            adi adi3 = new adi(adi2.b, n2 + 1, adi2.a);
            adi2.a = n2;
            adi2.c();
            priorityQueue.offer((Object)adi3);
            priorityQueue.offer((Object)adi2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void a(int[] arrn, int n, int n2, int n3) {
        switch (n) {
            case -2: {
                while (n2 <= n3) {
                    int n4 = arrn[n2];
                    arrn[n2] = (31 & n4 >> 5) << 10 | (31 & n4 >> 10) << 5 | n4 & 31;
                    ++n2;
                }
            }
            default: {
                return;
            }
            case -1: 
        }
        while (n2 <= n3) {
            int n5 = arrn[n2];
            arrn[n2] = (n5 & 31) << 10 | (31 & n5 >> 5) << 5 | 31 & n5 >> 10;
            ++n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean a(float[] arrf) {
        adn[] arradn = this.d;
        boolean bl2 = false;
        if (arradn == null) return bl2;
        int n = this.d.length;
        bl2 = false;
        if (n <= 0) return bl2;
        int n2 = this.d.length;
        int n3 = 0;
        do {
            bl2 = false;
            if (n3 >= n2) return bl2;
            if (!this.d[n3].a(arrf)) {
                return true;
            }
            ++n3;
        } while (true);
    }

    static int b(int n) {
        return 31 & n >> 5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int b(int n, int n2, int n3) {
        int n4;
        if (n3 > n2) {
            n4 = n << n3 - n2;
            do {
                return n4 & -1 + (1 << n3);
                break;
            } while (true);
        }
        n4 = n >> n2 - n3;
        return n4 & -1 + (1 << n3);
    }

    static int c(int n) {
        return n & 31;
    }

    private static int d(int n) {
        return adg.a(31 & n >> 10, 31 & n >> 5, n & 31);
    }
}

