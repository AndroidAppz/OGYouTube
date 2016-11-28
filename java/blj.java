/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class blj {
    private final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);
    private int b;
    private int c = 0;

    public blj(int n) {
        this.b = n;
    }

    public int a(Object object) {
        return 1;
    }

    public final void a() {
        this.b(0);
    }

    public void a(Object object, Object object2) {
    }

    public final int b() {
        blj blj2 = this;
        synchronized (blj2) {
            int n = this.c;
            return n;
        }
    }

    public final Object b(Object object) {
        void var4_2 = this;
        synchronized (var4_2) {
            Object object2 = this.a.get(object);
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b(Object object, Object object2) {
        void var5_3 = this;
        synchronized (var5_3) {
            if (this.a(object2) >= this.b) {
                this.a(object, object2);
                return null;
            }
            Object object3 = this.a.put(object, object2);
            if (object2 != null) {
                this.c += this.a(object2);
            }
            if (object3 != null) {
                this.c -= this.a(object3);
            }
            this.b(this.b);
            return object3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(int n) {
        void var7_2 = this;
        synchronized (var7_2) {
            while (this.c > n) {
                Map.Entry entry = (Map.Entry)this.a.entrySet().iterator().next();
                Object object = entry.getValue();
                this.c -= this.a(object);
                Object object2 = entry.getKey();
                this.a.remove(object2);
                this.a(object2, object);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(Object object) {
        void var4_2 = this;
        synchronized (var4_2) {
            Object object2 = this.a.remove(object);
            if (object2 != null) {
                this.c -= this.a(object2);
            }
            return object2;
        }
    }
}

