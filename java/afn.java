/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
final class afn
implements Runnable {
    private /* synthetic */ afl a;

    afn(afl afl2) {
        this.a = afl2;
    }

    public final void run() {
        afk afk2 = this.a.h;
        afl afl2 = this.a;
        if (afk2.n == afl2) {
            if (afk.i) {
                new StringBuilder().append((Object)afk2).append(": Service connection died");
            }
            afk2.f();
        }
    }
}

