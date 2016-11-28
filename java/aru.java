/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Vector
 */
import java.util.Iterator;
import java.util.Vector;

public final class aru {
    arx a = null;
    arx b = null;
    Vector c = new Vector();

    final arx a() {
        arx arx2 = arx.a(this.b, this.a);
        Iterator iterator = this.c.iterator();
        arx arx3 = arx2;
        while (iterator.hasNext()) {
            arx3 = arx.a(arx3, ((art)iterator.next()).b);
        }
        return arx3;
    }
}

