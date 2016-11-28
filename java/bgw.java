/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class bgw
implements bgy {
    private final ByteBuffer a;

    public bgw(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override
    public final int a() {
        return 65280 & this.c() << 8 | 255 & this.c();
    }

    @Override
    public final int a(byte[] arrby, int n) {
        int n2 = Math.min((int)n, (int)this.a.remaining());
        this.a.get(arrby, 0, n);
        return n2;
    }

    @Override
    public final long a(long l) {
        int n = (int)Math.min((long)this.a.remaining(), (long)l);
        this.a.position(n + this.a.position());
        return n;
    }

    @Override
    public final short b() {
        return (short)(255 & this.c());
    }

    @Override
    public final int c() {
        if (this.a.remaining() <= 0) {
            return -1;
        }
        return this.a.get();
    }
}

