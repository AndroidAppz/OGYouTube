/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
final class arh {
    public int a = 1;

    arh() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a() {
        arh arh2 = this;
        synchronized (arh2) {
            int n = this.a;
            if (n != 4) return false;
            return true;
        }
    }
}

