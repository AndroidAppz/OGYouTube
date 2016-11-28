/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  kk
 *  kn
 *  le
 *  ne
 */
final class abh
extends lf {
    private /* synthetic */ aas d;

    abh(aas aas2) {
        this.d = aas2;
    }

    @Override
    public final void a() {
        if (this.d.B != null) {
            this.d.B.a((lf)this.d.C);
            this.d.B = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(kn kn2) {
        aas aas2 = this.d;
        kk kk2 = kn2 == null ? null : kn2.a();
        aas2.E = kk2;
        this.d.a(false);
    }

    @Override
    public final void a(ne ne2) {
        this.d.D = ne2;
        this.d.a(false);
    }
}

