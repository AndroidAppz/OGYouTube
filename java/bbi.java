/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
final class bbi
implements bbn {
    int a;
    Class b;
    private final bbj c;

    bbi(bbj bbj2) {
        this.c = bbj2;
    }

    @Override
    public final void a() {
        this.c.a(this);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof bbi;
        boolean bl3 = false;
        if (bl2) {
            bbi bbi2 = (bbi)object;
            int n = this.a;
            int n2 = bbi2.a;
            bl3 = false;
            if (n == n2) {
                Class class_ = this.b;
                Class class_2 = bbi2.b;
                bl3 = false;
                if (class_ == class_2) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int hashCode() {
        int n;
        int n2 = 31 * this.a;
        if (this.b != null) {
            n = this.b.hashCode();
            do {
                return n + n2;
                break;
            } while (true);
        }
        n = 0;
        return n + n2;
    }

    public final String toString() {
        int n = this.a;
        String string = String.valueOf((Object)this.b);
        return new StringBuilder(27 + String.valueOf((Object)string).length()).append("Key{size=").append(n).append("array=").append(string).append("}").toString();
    }
}

