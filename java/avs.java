/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 */
import java.io.ByteArrayOutputStream;

public final class avs
extends ByteArrayOutputStream {
    private final avg a;

    public avs(avg avg2, int n) {
        this.a = avg2;
        this.buf = this.a.a(Math.max((int)n, (int)256));
    }

    private final void a(int n) {
        if (n + this.count <= this.buf.length) {
            return;
        }
        byte[] arrby = this.a.a(n + this.count << 1);
        System.arraycopy((Object)this.buf, (int)0, (Object)arrby, (int)0, (int)this.count);
        this.a.a(this.buf);
        this.buf = arrby;
    }

    public final void close() {
        this.a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.a.a(this.buf);
    }

    public final void write(int n) {
        void var3_2 = this;
        synchronized (var3_2) {
            super.a(1);
            super.write(n);
            return;
        }
    }

    public final void write(byte[] arrby, int n, int n2) {
        void var5_4 = this;
        synchronized (var5_4) {
            super.a(n2);
            super.write(arrby, n, n2);
            return;
        }
    }
}

