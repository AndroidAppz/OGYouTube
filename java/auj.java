/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
final class auj
implements Runnable {
    private final auq a;
    private final auu b;
    private final Runnable c;

    public auj(auq auq2, auu auu2, Runnable runnable) {
        this.a = auq2;
        this.b = auu2;
        this.c = runnable;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        if (this.a.h()) {
            this.a.b("canceled-at-delivery");
            return;
        } else {
            if (this.b.a()) {
                this.a.a(this.b.a);
            } else {
                this.a.b(this.b.c);
            }
            if (this.b.d) {
                this.a.a("intermediate-response");
            } else {
                this.a.b("done");
            }
            if (this.c == null) return;
            {
                this.c.run();
                return;
            }
        }
    }
}

