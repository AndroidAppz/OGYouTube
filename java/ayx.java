/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.MessageDigest
 */
import java.security.MessageDigest;

final class ayx
implements axo {
    private final axo b;
    private final axo c;

    public ayx(axo axo2, axo axo3) {
        this.b = axo2;
        this.c = axo3;
    }

    @Override
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof ayx;
        boolean bl3 = false;
        if (bl2) {
            ayx ayx2 = (ayx)object;
            boolean bl4 = this.b.equals(ayx2.b);
            bl3 = false;
            if (bl4) {
                boolean bl5 = this.c.equals(ayx2.c);
                bl3 = false;
                if (bl5) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    @Override
    public final int hashCode() {
        return 31 * this.b.hashCode() + this.c.hashCode();
    }

    public final String toString() {
        String string = String.valueOf((Object)this.b);
        String string2 = String.valueOf((Object)this.c);
        return new StringBuilder(36 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append("DataCacheKey{sourceKey=").append(string).append(", signature=").append(string2).append("}").toString();
    }
}

