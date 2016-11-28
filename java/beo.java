/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  pg
 */
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class beo {
    private final bet a;
    private final bep b;

    public beo(Context context, pg pg2) {
        super(new bet(pg2));
    }

    private beo(bet bet2) {
        this.b = new bep();
        this.a = bet2;
    }

    public final List a(Class class_) {
        void var4_2 = this;
        synchronized (var4_2) {
            List list = this.a.b(class_);
            return list;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List a(Object object) {
        void var14_2 = this;
        synchronized (var14_2) {
            List list;
            Class class_ = object.getClass();
            beq beq2 = (beq)this.b.a.get((Object)class_);
            List list2 = beq2 == null ? null : beq2.a;
            if (list2 != null) {
                list = list2;
            } else {
                List list3 = Collections.unmodifiableList((List)this.a.a(class_));
                if ((beq)this.b.a.put((Object)class_, (Object)new beq(list3)) != null) {
                    String string = String.valueOf((Object)class_);
                    throw new IllegalStateException(new StringBuilder(34 + String.valueOf((Object)string).length()).append("Already cached loaders for model: ").append(string).toString());
                }
                list = list3;
            }
            int n = list.size();
            ArrayList arrayList = new ArrayList(n);
            int n2 = 0;
            while (n2 < n) {
                bel bel2 = (bel)list.get(n2);
                if (bel2.a(object)) {
                    arrayList.add((Object)bel2);
                }
                ++n2;
            }
            return arrayList;
        }
    }

    public final void a(Class class_, Class class_2, ben ben2) {
        void var5_4 = this;
        synchronized (var5_4) {
            this.a.a(class_, class_2, ben2);
            this.b.a();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Class class_, Class class_2, ben ben2) {
        void var7_4 = this;
        synchronized (var7_4) {
            Iterator iterator = this.a.b(class_, class_2, ben2).iterator();
            do {
                if (!iterator.hasNext()) {
                    this.b.a();
                    return;
                }
                iterator.next();
            } while (true);
        }
    }
}

