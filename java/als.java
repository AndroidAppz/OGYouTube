/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
public final class als {
    public long a = 0;
    public als b;

    als() {
    }

    private final void a() {
        if (this.b == null) {
            this.b = new als();
        }
    }

    public final void a(int n) {
        while (n >= 64) {
            super.a();
            als als2 = als2.b;
            n -= 64;
        }
        als2.a |= 1 << n;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(int n, boolean bl2) {
        do {
            als als2;
            if (n >= 64) {
                super.a();
                als2 = als2.b;
                n -= 64;
                continue;
            }
            boolean bl3 = (Long.MIN_VALUE & als2.a) != 0;
            long l = (1 << n) - 1;
            als2.a = l & als2.a | (als2.a & (l ^ -1)) << 1;
            if (bl2) {
                als2.a(n);
            } else {
                als2.b(n);
            }
            if (!bl3 && als2.b == null) {
                return;
            }
            als2.a();
            als2 = als2.b;
            bl2 = bl3;
            n = 0;
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void b(int n) {
        while (n >= 64) {
            if (als2.b == null) return;
            als als2 = als2.b;
            n -= 64;
        }
        als2.a &= -1 ^ 1 << n;
    }

    final boolean c(int n) {
        while (n >= 64) {
            super.a();
            als als2 = als2.b;
            n -= 64;
        }
        if ((als2.a & 1 << n) != 0) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    final boolean d(int n) {
        while (n >= 64) {
            super.a();
            als als2 = als2.b;
            n -= 64;
        }
        long l = 1 << n;
        boolean bl2 = (l & als2.a) != 0;
        als2.a &= l ^ -1;
        long l2 = l - 1;
        als2.a = l2 & als2.a | Long.rotateRight((long)(als2.a & (l2 ^ -1)), (int)1);
        if (als2.b != null) {
            if (als2.b.c(0)) {
                als2.a(63);
            }
            als2.b.d(0);
        }
        return bl2;
    }

    final int e(int n) {
        if (this.b == null) {
            if (n >= 64) {
                return Long.bitCount((long)this.a);
            }
            return Long.bitCount((long)(this.a & (1 << n) - 1));
        }
        if (n < 64) {
            return Long.bitCount((long)(this.a & (1 << n) - 1));
        }
        return this.b.e(n - 64) + Long.bitCount((long)this.a);
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString((long)this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString((long)this.a);
    }
}

