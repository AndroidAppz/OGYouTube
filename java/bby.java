/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayDeque
 *  java.util.Queue
 */
import java.util.ArrayDeque;
import java.util.Queue;

final class bby {
    final Queue a = new ArrayDeque();

    bby() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final bbx a() {
        Queue queue;
        bbx bbx2;
        Queue queue2 = queue = this.a;
        synchronized (queue2) {
            bbx2 = (bbx)this.a.poll();
        }
        if (bbx2 != null) return bbx2;
        return new bbx();
    }
}

