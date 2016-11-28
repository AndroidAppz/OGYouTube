/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public final class bfo
implements bel {
    private final bei a;

    public bfo() {
        this(null);
    }

    public bfo(bei bei2) {
        this.a = bei2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        bdy bdy2 = (bdy)object;
        if (this.a == null) return new bem(bdy2, new ayh(bdy2));
        bdy bdy3 = (bdy)this.a.a(bdy2, 0, 0);
        if (bdy3 == null) {
            bei bei2 = this.a;
            bek bek2 = bek.a(bdy2, 0, 0);
            bei2.a.b(bek2, bdy2);
            return new bem(bdy2, new ayh(bdy2));
        }
        bdy2 = bdy3;
        return new bem(bdy2, new ayh(bdy2));
    }
}

