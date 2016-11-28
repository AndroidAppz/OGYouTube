/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 */
import java.nio.ByteBuffer;

public final class asz {
    public int a;
    public int b;
    boolean c;
    boolean d = false;

    public asz(int n, int n2) {
        this.a = n;
        this.b = n2;
        this.c = true;
    }

    public final void a(ByteBuffer byteBuffer, int n, int n2) {
        asa.a(this.a, this.b, byteBuffer, n, n2);
        this.d = true;
    }

    public final String toString() {
        int n = this.a;
        int n2 = this.b;
        return new StringBuilder(49).append("TextureSource(id=").append(n).append(", target=").append(n2).append(")").toString();
    }
}

