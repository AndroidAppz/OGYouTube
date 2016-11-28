/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
import java.util.ArrayList;
import java.util.List;

public abstract class aoc {
    private ArrayList a = new ArrayList();
    public aod h = null;
    long i = 120;
    long j = 120;
    long k = 250;
    long l = 250;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int d(aow aow2) {
        int n = 14 & aow2.h;
        if (aow2.j()) {
            return 4;
        }
        if ((n & 4) != 0) return n;
        int n2 = aow2.c;
        int n3 = aow2.d();
        if (n2 == -1) return n;
        if (n3 == -1) return n;
        if (n2 == n3) return n;
        return n | 2048;
    }

    public abstract void a();

    public abstract boolean a(aow var1, aoe var2, aoe var3);

    public abstract boolean a(aow var1, aow var2, aoe var3, aoe var4);

    public boolean a(aow aow2, List list) {
        return this.f(aow2);
    }

    public abstract boolean b();

    public abstract boolean b(aow var1, aoe var2, aoe var3);

    public abstract void c(aow var1);

    public abstract boolean c(aow var1, aoe var2, aoe var3);

    public abstract void d();

    public final void e() {
        int n = this.a.size();
        for (int i = 0; i < n; ++i) {
            this.a.get(i);
        }
        this.a.clear();
    }

    public final void e(aow aow2) {
        if (this.h != null) {
            this.h.a(aow2);
        }
    }

    public boolean f(aow aow2) {
        return true;
    }
}

