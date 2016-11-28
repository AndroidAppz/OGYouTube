/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class bgx {
    public final ByteBuffer a;

    public bgx(byte[] arrby, int n) {
        this.a = (ByteBuffer)ByteBuffer.wrap((byte[])arrby).order(ByteOrder.BIG_ENDIAN).limit(n);
    }

    public final int a(int n) {
        return this.a.getInt(n);
    }

    public final short b(int n) {
        return this.a.getShort(n);
    }
}

