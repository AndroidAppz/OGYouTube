/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public final class asj {
    private int a = 1;

    asj() {
    }

    public final int a() {
        asj asj2 = this;
        synchronized (asj2) {
            int n = this.a;
            return n;
        }
    }

    public final void a(int n) {
        void var3_2 = this;
        synchronized (var3_2) {
            this.a = n;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b(int n) {
        void var5_2 = this;
        synchronized (var5_2) {
            int n2 = this.a;
            if ((n2 & n) != n) return false;
            return true;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean c(int n) {
        void var4_2 = this;
        synchronized (var4_2) {
            if ((n & this.a) == n) return false;
            this.a = n | this.a;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d(int n) {
        void var4_2 = this;
        synchronized (var4_2) {
            boolean bl2 = (n & this.a) == n;
            this.a &= ~ n;
            return bl2;
        }
    }
}

