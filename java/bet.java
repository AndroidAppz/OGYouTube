/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  pg
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bet {
    private static final bew a = new bew();
    private static final bel b = new beu();
    private final List c;
    private final Set d;
    private final pg e;

    public bet(pg pg2) {
        super(pg2, a);
    }

    private bet(pg pg2, bew bew2) {
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = pg2;
    }

    private final bel a(bev bev2) {
        return (bel)blm.a(bev2.b.a((bet)this), "Argument must not be null");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final List b(Class class_, Class class_2) {
        void var8_3 = this;
        synchronized (var8_3) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                bev bev2 = (bev)iterator.next();
                if (!bev2.a(class_, class_2)) continue;
                iterator.remove();
                arrayList.add((Object)bev2.b);
            }
            return arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final bel a(Class class_, Class class_2) {
        void var13_3 = this;
        synchronized (var13_3) {
            ArrayList arrayList;
            boolean bl2;
            try {
                arrayList = new ArrayList();
                Iterator iterator = this.c.iterator();
                bl2 = false;
                while (iterator.hasNext()) {
                    bev bev2 = (bev)iterator.next();
                    if (this.d.contains((Object)bev2)) {
                        bl2 = true;
                        continue;
                    }
                    if (!bev2.a(class_, class_2)) continue;
                    this.d.add((Object)bev2);
                    arrayList.add((Object)super.a(bev2));
                    this.d.remove((Object)bev2);
                }
                if (arrayList.size() > 1) {
                    return new ber((List)arrayList, this.e);
                }
            }
            catch (Throwable var5_8) {
                this.d.clear();
                throw var5_8;
            }
            if (arrayList.size() == 1) {
                return (bel)arrayList.get(0);
            }
            if (bl2) return b;
            throw new awc(class_, class_2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final List a(Class class_) {
        void var10_2 = this;
        synchronized (var10_2) {
            try {
                ArrayList arrayList = new ArrayList();
                for (bev bev2 : this.c) {
                    if (this.d.contains((Object)bev2) || !bev2.a(class_)) continue;
                    this.d.add((Object)bev2);
                    arrayList.add((Object)super.a(bev2));
                    this.d.remove((Object)bev2);
                }
                return arrayList;
            }
            catch (Throwable var4_6) {
                this.d.clear();
                throw var4_6;
            }
            finally {
            }
        }
    }

    final void a(Class class_, Class class_2, ben ben2) {
        void var6_4 = this;
        synchronized (var6_4) {
            bev bev2 = new bev(class_, class_2, ben2);
            this.c.add(this.c.size(), (Object)bev2);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final List b(Class class_) {
        void var7_2 = this;
        synchronized (var7_2) {
            ArrayList arrayList = new ArrayList();
            for (bev bev2 : this.c) {
                if (arrayList.contains((Object)bev2.a) || !bev2.a(class_)) continue;
                arrayList.add((Object)bev2.a);
            }
            return arrayList;
        }
    }

    final List b(Class class_, Class class_2, ben ben2) {
        void var6_4 = this;
        synchronized (var6_4) {
            List list = super.b(class_, class_2);
            this.a(class_, class_2, ben2);
            return list;
        }
    }
}

