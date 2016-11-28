/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
final class akd {
    int a;
    int b;
    Object c;
    int d;

    akd(int n, int n2, int n3, Object object) {
        this.a = n;
        this.b = n2;
        this.d = n3;
        this.c = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        akd akd2 = (akd)object;
        if (this.a != akd2.a) {
            return false;
        }
        if (this.a == 8 && Math.abs((int)(this.d - this.b)) == 1 && this.d == akd2.b && this.b == akd2.d) return true;
        if (this.d != akd2.d) {
            return false;
        }
        if (this.b != akd2.b) {
            return false;
        }
        if (this.c != null) {
            if (this.c.equals(akd2.c)) return true;
            return false;
        }
        if (akd2.c != null) return false;
        return true;
    }

    public final int hashCode() {
        return 31 * (31 * this.a + this.b) + this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append(Integer.toHexString((int)System.identityHashCode((Object)this))).append("[");
        switch (this.a) {
            default: {
                string = "??";
                do {
                    return stringBuilder.append(string).append(",s:").append(this.b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
                    break;
                } while (true);
            }
            case 1: {
                string = "add";
                return stringBuilder.append(string).append(",s:").append(this.b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
            }
            case 2: {
                string = "rm";
                return stringBuilder.append(string).append(",s:").append(this.b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
            }
            case 4: {
                string = "up";
                return stringBuilder.append(string).append(",s:").append(this.b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
            }
            case 8: 
        }
        string = "mv";
        return stringBuilder.append(string).append(",s:").append(this.b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
    }
}

