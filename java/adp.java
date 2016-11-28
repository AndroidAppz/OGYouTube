/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  jh
 */
import android.graphics.Color;
import java.util.Arrays;

public final class adp {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public adp(int n, int n2) {
        this.c = Color.red((int)n);
        this.d = Color.green((int)n);
        this.e = Color.blue((int)n);
        this.a = n;
        this.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final void d() {
        if (this.f) return;
        int n = jh.a((int)-1, (int)this.a, (float)4.5f);
        int n2 = jh.a((int)-1, (int)this.a, (float)3.0f);
        if (n != -1 && n2 != -1) {
            this.h = jh.c((int)-1, (int)n);
            this.g = jh.c((int)-1, (int)n2);
            this.f = true;
            return;
        }
        int n3 = jh.a((int)-16777216, (int)this.a, (float)4.5f);
        int n4 = jh.a((int)-16777216, (int)this.a, (float)3.0f);
        if (n3 != -1 && n3 != -1) {
            this.h = jh.c((int)-16777216, (int)n3);
            this.g = jh.c((int)-16777216, (int)n4);
            this.f = true;
            return;
        }
        int n5 = n != -1 ? jh.c((int)-1, (int)n) : jh.c((int)-16777216, (int)n3);
        this.h = n5;
        int n6 = n2 != -1 ? jh.c((int)-1, (int)n2) : jh.c((int)-16777216, (int)n4);
        this.g = n6;
        this.f = true;
    }

    public final float[] a() {
        if (this.i == null) {
            this.i = new float[3];
        }
        jh.a((int)this.c, (int)this.d, (int)this.e, (float[])this.i);
        return this.i;
    }

    public final int b() {
        this.d();
        return this.g;
    }

    public final int c() {
        this.d();
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) return false;
        if (this.getClass() != object.getClass()) {
            return false;
        }
        adp adp2 = (adp)object;
        if (this.b != adp2.b) return false;
        if (this.a == adp2.a) return true;
        return false;
    }

    public final int hashCode() {
        return 31 * this.a + this.b;
    }

    public final String toString() {
        return this.getClass().getSimpleName() + " [RGB: #" + Integer.toHexString((int)this.a) + ']' + " [HSL: " + Arrays.toString((float[])this.a()) + ']' + " [Population: " + this.b + ']' + " [Title Text: #" + Integer.toHexString((int)this.b()) + ']' + " [Body Text: #" + Integer.toHexString((int)this.c()) + ']';
    }
}

