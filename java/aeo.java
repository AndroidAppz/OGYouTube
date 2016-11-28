/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
final class aeo
implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ aen b;

    aeo(aen aen2, int n) {
        this.b = aen2;
        this.a = n;
    }

    public final void run() {
        if (this.b.e.c.j != null) {
            this.b.e.c.j.a(this.a);
        }
    }
}

