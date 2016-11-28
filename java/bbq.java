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

final class bbq
implements bbn {
    int a;
    Bitmap.Config b;
    private final bbr c;

    public bbq(bbr bbr2) {
        this.c = bbr2;
    }

    @Override
    public final void a() {
        this.c.a(this);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof bbq;
        boolean bl3 = false;
        if (bl2) {
            bbq bbq2 = (bbq)object;
            int n = this.a;
            int n2 = bbq2.a;
            bl3 = false;
            if (n == n2) {
                boolean bl4 = bln.a((Object)this.b, (Object)bbq2.b);
                bl3 = false;
                if (bl4) {
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
        int n2 = 31 * this.a;
        if (this.b != null) {
            n = this.b.hashCode();
            do {
                return n + n2;
                break;
            } while (true);
        }
        n = 0;
        return n + n2;
    }

    public final String toString() {
        return bbo.a(this.a, this.b);
    }
}

