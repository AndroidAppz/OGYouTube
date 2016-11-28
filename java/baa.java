/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.MessageQueue
 *  android.os.MessageQueue$IdleHandler
 *  java.lang.Object
 *  java.lang.ref.Reference
 *  java.lang.ref.ReferenceQueue
 *  java.util.Map
 */
import android.os.MessageQueue;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Map;

final class baa
implements MessageQueue.IdleHandler {
    private final Map a;
    private final ReferenceQueue b;

    public baa(Map map, ReferenceQueue referenceQueue) {
        this.a = map;
        this.b = referenceQueue;
    }

    public final boolean queueIdle() {
        bab bab2 = (bab)this.b.poll();
        if (bab2 != null) {
            this.a.remove((Object)bab2.a);
        }
        return true;
    }
}

