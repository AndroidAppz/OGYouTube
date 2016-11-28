/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ari {
    asr a;
    public HashMap b = new HashMap();
    arg[] c = null;
    asb d;
    final HashSet e = new HashSet();
    final Object f = new Object();
    public ari g;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    ari(asr asr2, ari ari2) {
        Set set;
        asr asr3 = this.a = asr2;
        Set set2 = set = asr3.b;
        // MONITORENTER : set2
        asr3.b.add((Object)this);
        // MONITOREXIT : set2
        if (ari2 == null) return;
        this.g = ari2;
        this.g.e.add((Object)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a(asb asb2) {
        if (this.d == null) {
            Set set;
            Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((ari)iterator.next()).a(asb2);
            }
            Set set2 = set = asb2.k;
            synchronized (set2) {
                asb2.k.add((Object)this);
            }
            this.d = asb2;
            return;
        } else {
            if (this.d == asb2) return;
            {
                throw new RuntimeException("Cannot attach FilterGraph to GraphRunner that is already attached to another GraphRunner!");
            }
        }
    }

    public final asb a() {
        if (this.d == null) {
            this.a(new asb(this.a));
        }
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b() {
        Object object;
        Object object2 = object = this.f;
        // MONITORENTER : object2
        Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((ari)iterator.next()).b();
        }
        // MONITOREXIT : object2
        if (this.d == null) return;
        asb asb2 = this.d;
        if (this.a() != asb2) {
            throw new IllegalArgumentException("Attempting to tear down graph with foreign GraphRunner!");
        }
        asb2.m.a(11, this);
    }
}

