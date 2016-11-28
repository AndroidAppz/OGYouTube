/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  lv
 */
final class aek
implements mh {
    private /* synthetic */ aej a;

    aek(aej aej2) {
        this.a = aej2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        if (this.a.n == null) return;
        if (this.a.n.b()) {
            this.a.a(this.a.n.e());
            return;
        }
        this.a.b(this.a.n.e());
    }
}

