/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.FilterInputStream
 *  java.io.InputStream
 */
import java.io.FilterInputStream;
import java.io.InputStream;

final class avk
extends FilterInputStream {
    int a = 0;

    avk(InputStream inputStream) {
        super(inputStream);
    }

    public final int read() {
        int n = super.read();
        if (n != -1) {
            this.a = 1 + this.a;
        }
        return n;
    }

    public final int read(byte[] arrby, int n, int n2) {
        int n3 = super.read(arrby, n, n2);
        if (n3 != -1) {
            this.a = n3 + this.a;
        }
        return n3;
    }
}

