/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  java.lang.Object
 *  java.lang.String
 */
import android.graphics.Bitmap;

final class bay
implements bbn {
    int a;
    int b;
    Bitmap.Config c;
    private final baz d;

    public bay(baz baz2) {
        this.d = baz2;
    }

    @Override
    public final void a() {
        this.d.a(this);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof bay;
        boolean bl3 = false;
        if (bl2) {
            bay bay2 = (bay)object;
            int n = this.a;
            int n2 = bay2.a;
            bl3 = false;
            if (n == n2) {
                int n3 = this.b;
                int n4 = bay2.b;
                bl3 = false;
                if (n3 == n4) {
                    Bitmap.Config config = this.c;
                    Bitmap.Config config2 = bay2.c;
                    bl3 = false;
                    if (config == config2) {
                        bl3 = true;
                    }
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
        int n2 = 31 * (31 * this.a + this.b);
        if (this.c != null) {
            n = this.c.hashCode();
            do {
                return n + n2;
                break;
            } while (true);
        }
        n = 0;
        return n + n2;
    }

    public final String toString() {
        return bax.c(this.a, this.b, this.c);
    }
}

