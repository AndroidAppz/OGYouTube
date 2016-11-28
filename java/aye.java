/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.FilterInputStream
 *  java.io.InputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 */
import java.io.FilterInputStream;
import java.io.InputStream;

public final class aye
extends FilterInputStream {
    private static final byte[] a = new byte[]{-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    private static final int b = 31;
    private final byte c;
    private int d;

    public aye(InputStream inputStream, int n) {
        super(inputStream);
        if (n < -1 || n > 8) {
            throw new IllegalArgumentException(new StringBuilder(43).append("Cannot add invalid orientation: ").append(n).toString());
        }
        this.c = (byte)n;
    }

    public final void mark(int n) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int read() {
        int n = this.d < 2 || this.d > b ? super.read() : (this.d == b ? this.c : 255 & a[-2 + this.d]);
        if (n != -1) {
            this.d = 1 + this.d;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int read(byte[] arrby, int n, int n2) {
        int n3;
        if (this.d > b) {
            n3 = super.read(arrby, n, n2);
        } else if (this.d == b) {
            arrby[n] = this.c;
            n3 = 1;
        } else if (this.d < 2) {
            n3 = super.read(arrby, n, 2 - this.d);
        } else {
            n3 = Math.min((int)(b - this.d), (int)n2);
            System.arraycopy((Object)a, (int)(-2 + this.d), (Object)arrby, (int)n, (int)n3);
        }
        if (n3 > 0) {
            this.d = n3 + this.d;
        }
        return n3;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long l) {
        long l2 = super.skip(l);
        if (l2 > 0) {
            this.d = (int)(l2 + (long)this.d);
        }
        return l2;
    }
}

