/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Collections
 *  java.util.Map
 */
import java.util.Collections;
import java.util.Map;

public final class aud {
    public byte[] a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public Map g = Collections.emptyMap();

    public final boolean a() {
        if (this.e < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}

