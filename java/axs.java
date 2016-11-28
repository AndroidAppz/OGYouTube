/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  or
 *  pj
 */
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Set;

public final class axs
implements axo {
    public final or b = new or();

    public final Object a(axp axp2) {
        if (this.b.containsKey((Object)axp2)) {
            return this.b.get((Object)axp2);
        }
        return axp2.b;
    }

    public final void a(axs axs2) {
        this.b.a((pj)axs2.b);
    }

    @Override
    public final void a(MessageDigest messageDigest) {
        for (Map.Entry entry : this.b.entrySet()) {
            axp axp2 = (axp)entry.getKey();
            Object object = entry.getValue();
            axr axr2 = axp2.c;
            if (axp2.e == null) {
                axp2.e = axp2.d.getBytes(axo.a);
            }
            axr2.a(axp2.e, object, messageDigest);
        }
    }

    @Override
    public final boolean equals(Object object) {
        if (object instanceof axs) {
            axs axs2 = (axs)object;
            return this.b.equals((Object)axs2.b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String string = String.valueOf((Object)this.b);
        return new StringBuilder(16 + String.valueOf((Object)string).length()).append("Options{values=").append(string).append("}").toString();
    }
}

