/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public final class auu {
    public final Object a;
    public final aud b;
    public final avb c;
    public boolean d = false;

    private auu(avb avb2) {
        this.a = null;
        this.b = null;
        this.c = avb2;
    }

    private auu(Object object, aud aud2) {
        this.a = object;
        this.b = aud2;
        this.c = null;
    }

    public static auu a(avb avb2) {
        return new auu(avb2);
    }

    public static auu a(Object object, aud aud2) {
        return new auu(object, aud2);
    }

    public final boolean a() {
        if (this.c == null) {
            return true;
        }
        return false;
    }
}

