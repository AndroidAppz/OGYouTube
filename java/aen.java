/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Runnable
 */
final class aen
extends ks {
    final /* synthetic */ aem e;

    aen(aem aem2, int n, int n2, int n3) {
        this.e = aem2;
        super(n, n2, n3);
    }

    @Override
    public final void a(int n) {
        this.e.c.g.post((Runnable)new aeo((aen)this, n));
    }

    @Override
    public final void b(int n) {
        this.e.c.g.post((Runnable)new aep((aen)this, n));
    }
}

