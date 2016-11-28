/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
final class amg {
    public aow a;
    public aow b;
    public int c;
    public int d;
    public int e;
    public int f;

    private amg(aow aow2, aow aow3) {
        this.a = aow2;
        this.b = aow3;
    }

    amg(aow aow2, aow aow3, int n, int n2, int n3, int n4) {
        this(aow2, aow3);
        this.c = n;
        this.d = n2;
        this.e = n3;
        this.f = n4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
}

