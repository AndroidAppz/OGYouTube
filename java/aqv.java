/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  pg
 *  ph
 */
public final class aqv {
    public static pg d = new ph(20);
    public int a;
    public aoe b;
    aoe c;

    private aqv() {
    }

    public static aqv a() {
        aqv aqv2 = (aqv)d.a();
        if (aqv2 == null) {
            aqv2 = new aqv();
        }
        return aqv2;
    }

    static void a(aqv aqv2) {
        aqv2.a = 0;
        aqv2.b = null;
        aqv2.c = null;
        d.a((Object)aqv2);
    }
}

