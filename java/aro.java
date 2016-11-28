/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class aro {
    asb a;
    Set b = new HashSet();
    arp c;

    aro(asb asb2) {
        new HashMap();
        this.a = asb2;
        this.c = new arq();
    }

    public static aro a() {
        asb asb2 = asb.a();
        if (asb2 != null) {
            return asb2.o;
        }
        return null;
    }

    final void b() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((ara)iterator.next()).g();
        }
        this.b.clear();
        this.c.a();
    }
}

