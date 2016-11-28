/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Queue
 *  java.util.concurrent.locks.Lock
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

final class bbw {
    final Map a = new HashMap();
    final bby b = new bby();

    bbw() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a(axo axo2) {
        void var14_2 = this;
        synchronized (var14_2) {
            bbx bbx2 = (bbx)blm.a((bbx)this.a.get((Object)axo2), "Argument must not be null");
            if (bbx2.b <= 0) {
                String string = String.valueOf((Object)axo2);
                int n = bbx2.b;
                throw new IllegalStateException(new StringBuilder(77 + String.valueOf((Object)string).length()).append("Cannot release a lock that is not held, key: ").append(string).append(", interestedThreads: ").append(n).toString());
            }
            bbx2.b = -1 + bbx2.b;
            if (bbx2.b == 0) {
                Queue queue;
                bbx bbx3 = (bbx)this.a.remove((Object)axo2);
                if (!bbx3.equals((Object)bbx2)) {
                    String string = String.valueOf((Object)bbx2);
                    String string2 = String.valueOf((Object)bbx3);
                    String string3 = String.valueOf((Object)axo2);
                    throw new IllegalStateException(new StringBuilder(75 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append("Removed the wrong lock, expected to remove: ").append(string).append(", but actually removed: ").append(string2).append(", key: ").append(string3).toString());
                }
                bby bby2 = this.b;
                Queue queue2 = queue = bby2.a;
                synchronized (queue2) {
                    if (bby2.a.size() < 10) {
                        bby2.a.offer((Object)bbx3);
                    }
                }
            }
        }
        bbx2.a.unlock();
    }
}

