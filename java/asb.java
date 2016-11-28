/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.ConditionVariable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.ThreadLocal
 *  java.util.HashSet
 *  java.util.Set
 */
import android.os.ConditionVariable;
import java.util.HashSet;
import java.util.Set;

public final class asb {
    static int a = -1;
    static int b = -2;
    static final String c = asb.class.getSimpleName();
    static final asd d = new asd(2, null);
    public static final asd e = new asd(10, null);
    public static final asd f = new asd(7, null);
    static final asd g;
    static final asd h;
    public static final asd i;
    static ThreadLocal p;
    final asr j;
    final Set k;
    asi l;
    public ase m;
    public Thread n;
    aro o;
    final asg q;

    static {
        new asd(12, null);
        new asd(6, null);
        new asd(13, null);
        g = new asd(9, null);
        new asd(8, null);
        h = new asd(3, null);
        i = new asd(4, null);
        p = new ThreadLocal();
    }

    public asb(asr asr2) {
        super(asr2, new asc());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private asb(asr asr2, asc asc2) {
        Set set;
        this.k = new HashSet();
        this.n = null;
        this.o = null;
        this.q = new asg();
        this.j = asr2;
        this.o = new aro((asb)this);
        this.l = new asf();
        this.m = new ase((asb)this, asc2.b);
        this.n = new Thread((Runnable)this.m);
        this.n.setPriority(asc2.a);
        this.n.start();
        asr asr3 = this.j;
        Set set2 = set = asr3.c;
        synchronized (set2) {
            asr3.c.add((Object)this);
            return;
        }
    }

    public static asb a() {
        return (asb)p.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(ari ari2) {
        void var3_2 = this;
        synchronized (var3_2) {
            if (ari2.d != this) {
                throw new IllegalArgumentException("Graph must be attached to runner!");
            }
            this.m.e.close();
            this.m.a(1, ari2);
            return;
        }
    }

    public final boolean b() {
        if (!this.m.a.b(1)) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean c() {
        asg asg2;
        asg asg3 = asg2 = this.q;
        // MONITORENTER : asg3
        // MONITOREXIT : asg3
        return false;
    }

    public final boolean d() {
        if (this.m.b && this.j.e) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean e() {
        asg asg2;
        asg asg3 = asg2 = this.q;
        synchronized (asg3) {
            return this.q.a;
        }
    }
}

