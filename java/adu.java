/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
import android.os.Bundle;
import java.util.List;

public final class adu {
    final Bundle a;
    private aed b;

    public adu(aed aed2, boolean bl2) {
        if (aed2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        this.a = new Bundle();
        this.b = aed2;
        this.a.putBundle("selector", aed2.a);
        this.a.putBoolean("activeScan", bl2);
    }

    private final void c() {
        if (this.b == null) {
            this.b = aed.a(this.a.getBundle("selector"));
            if (this.b == null) {
                this.b = aed.c;
            }
        }
    }

    public final aed a() {
        this.c();
        return this.b;
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof adu;
        boolean bl3 = false;
        if (bl2) {
            adu adu2 = (adu)object;
            boolean bl4 = this.a().equals(adu2.a());
            bl3 = false;
            if (bl4) {
                boolean bl5 = this.b();
                boolean bl6 = adu2.b();
                bl3 = false;
                if (bl5 == bl6) {
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
        int n2 = this.a().hashCode();
        if (this.b()) {
            n = 1;
            do {
                return n ^ n2;
                break;
            } while (true);
        }
        n = 0;
        return n ^ n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DiscoveryRequest{ selector=").append((Object)this.a());
        stringBuilder.append(", activeScan=").append(this.b());
        StringBuilder stringBuilder2 = stringBuilder.append(", isValid=");
        this.c();
        aed aed2 = this.b;
        aed2.b();
        boolean bl2 = !aed2.b.contains((Object)null);
        stringBuilder2.append(bl2);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

