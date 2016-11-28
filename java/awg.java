/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
public final class awg
implements Runnable {
    private /* synthetic */ bjx a;
    private /* synthetic */ awf b;

    public awg(awf awf2, bjx bjx2) {
        this.b = awf2;
        this.a = bjx2;
    }

    public final void run() {
        if (!this.a.isCancelled()) {
            this.b.a(this.a);
        }
    }
}

