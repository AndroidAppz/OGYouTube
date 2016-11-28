/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class bbe {
    private final bbf a = new bbf();
    private final Map b = new HashMap();

    bbe() {
    }

    private static void a(bbf bbf2) {
        bbf2.c.d = bbf2;
        bbf2.d.c = bbf2;
    }

    private static void b(bbf bbf2) {
        bbf2.d.c = bbf2.c;
        bbf2.c.d = bbf2.d;
    }

    public final Object a() {
        bbf bbf2 = this.a.d;
        while (!bbf2.equals((Object)this.a)) {
            Object object = bbf2.a();
            if (object != null) {
                return object;
            }
            bbe.b(bbf2);
            this.b.remove(bbf2.a);
            ((bbn)bbf2.a).a();
            bbf2 = bbf2.d;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object a(bbn bbn2) {
        bbf bbf2 = (bbf)this.b.get((Object)bbn2);
        if (bbf2 == null) {
            bbf2 = new bbf(bbn2);
            this.b.put((Object)bbn2, (Object)bbf2);
        } else {
            bbn2.a();
        }
        bbe.b(bbf2);
        bbf2.d = this.a;
        bbf2.c = this.a.c;
        bbe.a(bbf2);
        return bbf2.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(bbn bbn2, Object object) {
        bbf bbf2 = (bbf)this.b.get((Object)bbn2);
        if (bbf2 == null) {
            bbf2 = new bbf(bbn2);
            bbe.b(bbf2);
            bbf2.d = this.a.d;
            bbf2.c = this.a;
            bbe.a(bbf2);
            this.b.put((Object)bbn2, (Object)bbf2);
        } else {
            bbn2.a();
        }
        if (bbf2.b == null) {
            bbf2.b = new ArrayList();
        }
        bbf2.b.add(object);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        bbf bbf2 = this.a.c;
        boolean bl2 = false;
        while (!bbf2.equals((Object)this.a)) {
            bl2 = true;
            stringBuilder.append('{').append(bbf2.a).append(':').append(bbf2.b()).append("}, ");
            bbf2 = bbf2.c;
        }
        if (bl2) {
            stringBuilder.delete(-2 + stringBuilder.length(), stringBuilder.length());
        }
        return stringBuilder.append(" )").toString();
    }
}

