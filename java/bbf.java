/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
import java.util.List;

final class bbf {
    final Object a;
    List b;
    bbf c;
    bbf d;

    public bbf() {
        this(null);
    }

    public bbf(Object object) {
        this.d = this;
        this.c = this;
        this.a = object;
    }

    public final Object a() {
        int n = this.b();
        if (n > 0) {
            return this.b.remove(n - 1);
        }
        return null;
    }

    public final int b() {
        if (this.b != null) {
            return this.b.size();
        }
        return 0;
    }
}

