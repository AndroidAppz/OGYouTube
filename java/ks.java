/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  kt
 *  ku
 *  kw
 *  kx
 */
import android.os.Build;

public class ks {
    public final int a;
    public final int b;
    public int c;
    public ku d;
    private Object e;

    public ks(int n, int n2, int n3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
    }

    public final Object a() {
        if (this.e != null || Build.VERSION.SDK_INT < 21) {
            return this.e;
        }
        this.e = new kw(this.a, this.b, this.c, (kx)new kt(this));
        return this.e;
    }

    public void a(int n) {
    }

    public void b(int n) {
    }
}

