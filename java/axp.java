/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
public final class axp {
    public static final axr a = new axq();
    final Object b;
    final axr c;
    final String d;
    volatile byte[] e;

    public axp(String string, Object object, axr axr2) {
        this.d = blm.a(string);
        this.b = object;
        this.c = (axr)blm.a(axr2, "Argument must not be null");
    }

    public static axp a(String string, Object object) {
        return new axp(string, object, a);
    }

    public static axp a(String string, Object object, axr axr2) {
        return new axp(string, object, axr2);
    }

    public final boolean equals(Object object) {
        if (object instanceof axp) {
            axp axp2 = (axp)object;
            return this.d.equals((Object)axp2.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        String string = this.d;
        return new StringBuilder(14 + String.valueOf((Object)string).length()).append("Option{key='").append(string).append("'}").toString();
    }
}

