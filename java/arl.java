/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 */
import java.nio.ByteBuffer;

public class arl
extends ark {
    private int c = 0;

    arl(aqy aqy2) {
        super(aqy2);
        int[] arrn = aqy2.b;
        this.c = 1;
        int n = arrn.length;
        for (int i = 0; i < n; ++i) {
            this.c = arrn[i] * this.c;
        }
    }

    public final ByteBuffer a(int n) {
        if (this.b && n == 2) {
            String string = String.valueOf((Object)this);
            throw new RuntimeException(new StringBuilder(40 + String.valueOf((Object)string).length()).append("Attempting to write to read-only frame ").append(string).append("!").toString());
        }
        return (ByteBuffer)this.a.a(n, 1);
    }

    @Override
    public final void a(int[] arrn) {
        super.a(arrn);
    }

    @Override
    public final int[] g() {
        return super.g();
    }
}

