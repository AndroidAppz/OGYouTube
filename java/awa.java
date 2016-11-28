/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  or
 *  pg
 */
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class awa {
    public final bjl a;
    public final bjr b;
    public final ayb c;
    private final beo d;
    private final bjp e;
    private final bim f;
    private final bjo g = new bjo();
    private final bjn h = new bjn();
    private final pg i = blp.a();

    public awa(Context context) {
        this.d = new beo(context.getApplicationContext(), this.i);
        this.a = new bjl();
        this.e = new bjp();
        this.b = new bjr();
        this.c = new ayb();
        this.f = new bim();
    }

    public final awa a(aya aya2) {
        this.c.a(aya2);
        return this;
    }

    public final awa a(Class class_, axm axm2) {
        this.a.a(class_, axm2);
        return this;
    }

    public final awa a(Class class_, axu axu2) {
        this.b.a(class_, axu2);
        return this;
    }

    public final awa a(Class class_, Class class_2, axt axt2) {
        this.e.a(axt2, class_, class_2);
        return this;
    }

    public final awa a(Class class_, Class class_2, ben ben2) {
        this.d.a(class_, class_2, ben2);
        return this;
    }

    public final awa a(Class class_, Class class_2, bil bil2) {
        this.f.a(class_, class_2, bil2);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final bam a(Class class_, Class class_2, Class class_3) {
        bam bam2 = this.h.b(class_, class_2, class_3);
        if (bam2 == null && !this.h.a(class_, class_2, class_3)) {
            or or2;
            ArrayList arrayList = new ArrayList();
            for (Class class_4 : this.e.b(class_, class_2)) {
                for (Class class_5 : this.f.b(class_4, class_3)) {
                    arrayList.add((Object)new azl(class_, class_4, class_5, this.e.a(class_, class_4), this.f.a(class_4, class_5), this.i));
                }
            }
            bam2 = arrayList.isEmpty() ? null : new bam(class_, class_2, class_3, (List)arrayList, this.i);
            bjn bjn2 = this.h;
            or or3 = or2 = bjn2.a;
            synchronized (or3) {
                bjn2.a.put((Object)new bll(class_, class_2, class_3), (Object)bam2);
            }
        }
        return bam2;
    }

    public final List a(Object object) {
        List list = this.d.a(object);
        if (list.isEmpty()) {
            throw new awc(object);
        }
        return list;
    }

    public final awa b(Class class_, Class class_2, axt axt2) {
        this.e.b(axt2, class_, class_2);
        return this;
    }

    public final awa b(Class class_, Class class_2, ben ben2) {
        this.d.b(class_, class_2, ben2);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List b(Class class_, Class class_2, Class class_3) {
        List list = this.g.a(class_, class_2);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.d.a(class_).iterator();
        block2 : do {
            if (!iterator.hasNext()) {
                or or2;
                bjo bjo2 = this.g;
                List list2 = Collections.unmodifiableList((List)arrayList);
                or or3 = or2 = bjo2.a;
                synchronized (or3) {
                    bjo2.a.put((Object)new bll(class_, class_2), (Object)list2);
                    return arrayList;
                }
            }
            Class class_4 = (Class)iterator.next();
            Iterator iterator2 = this.e.b(class_4, class_2).iterator();
            do {
                if (!iterator2.hasNext()) continue block2;
                Class class_5 = (Class)iterator2.next();
                if (this.f.b(class_5, class_3).isEmpty() || arrayList.contains((Object)class_5)) continue;
                arrayList.add((Object)class_5);
            } while (true);
            break;
        } while (true);
    }
}

