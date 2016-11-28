/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
final class azy
implements azh {
    private final bbt a;
    private volatile bbs b;

    public azy(bbt bbt2) {
        this.a = bbt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bbs a() {
        if (this.b == null) {
            azy azy2 = this;
            synchronized (azy2) {
                if (this.b == null) {
                    this.b = this.a.a();
                }
                if (this.b == null) {
                    this.b = new bbv();
                }
            }
        }
        return this.b;
    }
}

