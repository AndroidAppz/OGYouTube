/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.FloatBuffer
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

final class asn {
    int a;
    boolean b;
    int c;
    int d;
    int e;
    FloatBuffer f;
    private String g;
    private int h;

    public asn(String string, int n) {
        this.g = string;
        this.a = n;
        this.h = -1;
    }

    public final void a(float[] arrf) {
        this.b = false;
        this.c = 8;
        this.d = 2;
        this.e = 5126;
        if (this.h != arrf.length) {
            this.f = ByteBuffer.allocateDirect((int)(arrf.length << 2)).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.h = arrf.length;
        }
        this.f.put(arrf).position(0);
    }

    public final String toString() {
        return this.g;
    }
}

