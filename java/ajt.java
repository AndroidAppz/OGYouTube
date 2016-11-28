/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigDecimal
 */
import android.content.ComponentName;
import java.math.BigDecimal;

public final class ajt {
    public final ComponentName a;
    public final long b;
    public final float c;

    public ajt(ComponentName componentName, long l, float f) {
        this.a = componentName;
        this.b = l;
        this.c = f;
    }

    public ajt(String string, long l, float f) {
        super(ComponentName.unflattenFromString((String)string), l, f);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        ajt ajt2 = (ajt)object;
        if (this.a == null ? ajt2.a != null : !this.a.equals((Object)ajt2.a)) {
            return false;
        }
        if (this.b != ajt2.b) {
            return false;
        }
        if (Float.floatToIntBits((float)this.c) == Float.floatToIntBits((float)ajt2.c)) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int hashCode() {
        int n;
        if (this.a == null) {
            n = 0;
            do {
                return 31 * (31 * (n + 31) + (int)(this.b ^ this.b >>> 32)) + Float.floatToIntBits((float)this.c);
                break;
            } while (true);
        }
        n = this.a.hashCode();
        return 31 * (31 * (n + 31) + (int)(this.b ^ this.b >>> 32)) + Float.floatToIntBits((float)this.c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("; activity:").append((Object)this.a);
        stringBuilder.append("; time:").append(this.b);
        stringBuilder.append("; weight:").append((Object)new BigDecimal((double)this.c));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

