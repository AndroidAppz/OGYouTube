/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
final class awk
implements Runnable {
    private /* synthetic */ bkm a;
    private /* synthetic */ awi b;

    awk(awi awi2, bkm bkm2) {
        this.b = awi2;
        this.a = bkm2;
    }

    public final void run() {
        this.b.a(this.a);
    }
}

