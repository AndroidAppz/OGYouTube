/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
final class aur
implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ long b;
    private /* synthetic */ auq c;

    aur(auq auq2, String string, long l) {
        this.c = auq2;
        this.a = string;
        this.b = l;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
        this.c.a.a(this.toString());
    }
}

