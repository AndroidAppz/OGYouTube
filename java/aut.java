/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.PriorityBlockingQueue
 *  java.util.concurrent.atomic.AtomicInteger
 */
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class aut {
    final Map a;
    final Set b;
    final PriorityBlockingQueue c;
    public final auc d;
    List e;
    private AtomicInteger f;
    private final PriorityBlockingQueue g;
    private final auk h;
    private final aux i;
    private aul[] j;
    private aue k;

    private aut(auc auc2, auk auk2) {
        super(auc2, auk2, 4, new auh(new Handler(Looper.getMainLooper())));
    }

    public aut(auc auc2, auk auk2, byte by2) {
        super(auc2, auk2);
    }

    public aut(auc auc2, auk auk2, int n, aux aux2) {
        this.f = new AtomicInteger();
        this.a = new HashMap();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.g = new PriorityBlockingQueue();
        this.e = new ArrayList();
        this.d = auc2;
        this.h = auk2;
        this.j = new aul[n];
        this.i = aux2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final auq a(auq auq2) {
        Map map;
        Set set;
        auq2.a((aut)this);
        Set set2 = set = this.b;
        synchronized (set2) {
            this.b.add((Object)auq2);
        }
        auq2.b = this.f.incrementAndGet();
        auq2.a("add-to-queue");
        if (!auq2.c) {
            this.g.add((Object)auq2);
            return auq2;
        }
        Map map2 = map = this.a;
        synchronized (map2) {
            String string = auq2.e();
            if (this.a.containsKey((Object)string)) {
                Queue queue = (Queue)this.a.get((Object)string);
                if (queue == null) {
                    queue = new LinkedList();
                }
                queue.add((Object)auq2);
                this.a.put((Object)string, (Object)queue);
                if (avc.b) {
                    avc.a("Request for cacheKey=%s is in flight, putting on hold.", string);
                }
            } else {
                this.a.put((Object)string, (Object)null);
                this.c.add((Object)auq2);
            }
            return auq2;
        }
    }

    public final void a() {
        int n = 0;
        if (this.k != null) {
            aue aue2 = this.k;
            aue2.b = true;
            aue2.interrupt();
        }
        for (int i = 0; i < this.j.length; ++i) {
            if (this.j[i] == null) continue;
            aul aul2 = this.j[i];
            aul2.a = true;
            aul2.interrupt();
        }
        this.k = new aue((BlockingQueue)this.c, (BlockingQueue)this.g, this.d, this.i);
        this.k.start();
        while (n < this.j.length) {
            aul aul3;
            this.j[n] = aul3 = new aul((BlockingQueue)this.g, this.h, this.d, this.i);
            aul3.start();
            ++n;
        }
    }
}

