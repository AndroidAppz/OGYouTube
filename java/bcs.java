/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
public class bcs
extends Enum {
    public static final bcs a;
    private static /* enum */ bcs b;
    private static /* enum */ bcs c;
    private static /* enum */ bcs d;
    private static final /* synthetic */ bcs[] e;

    static {
        b = new bcs();
        c = new bct("LOG");
        d = new bcu("THROW");
        bcs[] arrbcs = new bcs[]{b, c, d};
        e = arrbcs;
        a = c;
    }

    bcs() {
        super(string, n);
    }

    public static bcs[] values() {
        return (bcs[])e.clone();
    }

    protected void a(Throwable throwable) {
    }
}

