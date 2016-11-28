/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class bgh
implements axt {
    private final bgs a;

    public bgh(bgs bgs2) {
        this.a = bgs2;
    }

    @Override
    public final /* synthetic */ bap a(Object object, int n, int n2, axs axs2) {
        InputStream inputStream = bld.b((ByteBuffer)object);
        return this.a.a(inputStream, n, n2, axs2, bgs.c);
    }

    @Override
    public final /* synthetic */ boolean a(Object object, axs axs2) {
        return bgs.b();
    }
}

