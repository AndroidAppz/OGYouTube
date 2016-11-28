/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.IllegalThreadStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.os.Looper;

public final class bai
implements bap {
    final boolean a;
    baj b;
    axo c;
    private int d;
    private boolean e;
    private final bap f;

    public bai(bap bap2, boolean bl2) {
        this.f = (bap)blm.a(bap2, "Argument must not be null");
        this.a = bl2;
    }

    @Override
    public final Class a() {
        return this.f.a();
    }

    @Override
    public final Object b() {
        return this.f.b();
    }

    @Override
    public final int c() {
        return this.f.c();
    }

    @Override
    public final void d() {
        if (this.d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.e) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.e = true;
        this.f.d();
    }

    public final void e() {
        if (this.e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals((Object)Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.d = 1 + this.d;
    }

    public final void f() {
        int n;
        if (this.d <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals((Object)Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        this.d = n = -1 + this.d;
        if (n == 0) {
            this.b.b(this.c, this);
        }
    }

    public final String toString() {
        boolean bl2 = this.a;
        String string = String.valueOf((Object)this.b);
        String string2 = String.valueOf((Object)this.c);
        int n = this.d;
        boolean bl3 = this.e;
        String string3 = String.valueOf((Object)this.f);
        return new StringBuilder(101 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append("EngineResource{isCacheable=").append(bl2).append(", listener=").append(string).append(", key=").append(string2).append(", acquired=").append(n).append(", isRecycled=").append(bl3).append(", resource=").append(string3).append("}").toString();
    }
}

