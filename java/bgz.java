/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 */
import java.io.InputStream;

public final class bgz
implements bgy {
    private final InputStream a;

    public bgz(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override
    public final int a() {
        return 65280 & this.a.read() << 8 | 255 & this.a.read();
    }

    @Override
    public final int a(byte[] arrby, int n) {
        int n2;
        int n3;
        for (n2 = n; n2 > 0 && (n3 = this.a.read(arrby, n - n2, n2)) != -1; n2 -= n3) {
        }
        return n - n2;
    }

    @Override
    public final long a(long l) {
        if (l < 0) {
            return 0;
        }
        long l2 = l;
        while (l2 > 0) {
            long l3 = this.a.skip(l2);
            if (l3 > 0) {
                l2 -= l3;
                continue;
            }
            if (this.a.read() == -1) break;
            --l2;
        }
        return l - l2;
    }

    @Override
    public final short b() {
        return (short)(255 & this.a.read());
    }

    @Override
    public final int c() {
        return this.a.read();
    }
}

