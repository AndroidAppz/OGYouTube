/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

final class awu
implements Closeable {
    final Charset a;
    int b;
    private final InputStream c;
    private byte[] d;
    private int e;

    public awu(InputStream inputStream, Charset charset) {
        super(inputStream, charset, 0);
    }

    private awu(InputStream inputStream, Charset charset, byte by2) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        }
        if (!charset.equals((Object)aww.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.c = inputStream;
        this.a = charset;
        this.d = new byte[8192];
    }

    private final void b() {
        int n = this.c.read(this.d, 0, this.d.length);
        if (n == -1) {
            throw new EOFException();
        }
        this.e = 0;
        this.b = n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a() {
        InputStream inputStream;
        InputStream inputStream2 = inputStream = this.c;
        synchronized (inputStream2) {
            if (this.d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.e >= this.b) {
                this.b();
            }
            int n = this.e;
            do {
                if (n == this.b) break;
                if (this.d[n] == 10) {
                    int n2 = n != this.e && this.d[n - 1] == 13 ? n - 1 : n;
                    String string = new String(this.d, this.e, n2 - this.e, this.a.name());
                    this.e = n + 1;
                    return string;
                }
                ++n;
            } while (true);
            awv awv2 = new awv(this, 80 + (this.b - this.e));
            block5 : do {
                awv2.write(this.d, this.e, this.b - this.e);
                this.b = -1;
                this.b();
                int n3 = this.e;
                do {
                    if (n3 == this.b) continue block5;
                    if (this.d[n3] == 10) {
                        if (n3 != this.e) {
                            awv2.write(this.d, this.e, n3 - this.e);
                        }
                        this.e = n3 + 1;
                        return awv2.toString();
                    }
                    ++n3;
                } while (true);
                break;
            } while (true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        InputStream inputStream;
        InputStream inputStream2 = inputStream = this.c;
        synchronized (inputStream2) {
            if (this.d != null) {
                this.d = null;
                this.c.close();
            }
            return;
        }
    }
}

