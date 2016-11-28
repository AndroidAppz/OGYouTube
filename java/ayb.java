/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Map
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class ayb {
    private static final aya b = new ayc();
    private final Map a = new HashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final axz a(Object object) {
        void var8_2 = this;
        synchronized (var8_2) {
            blm.a(object, "Argument must not be null");
            aya aya2 = (aya)this.a.get((Object)object.getClass());
            if (aya2 == null) {
                for (aya aya3 : this.a.values()) {
                    if (!aya3.a().isAssignableFrom(object.getClass())) continue;
                    aya2 = aya3;
                    break;
                }
            }
            if (aya2 != null) return aya2.a(object);
            aya2 = b;
            return aya2.a(object);
        }
    }

    public final void a(aya aya2) {
        void var4_2 = this;
        synchronized (var4_2) {
            this.a.put((Object)aya2.a(), (Object)aya2);
            return;
        }
    }
}

