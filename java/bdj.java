/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

final class bdj
implements axx {
    private final File a;

    public bdj(File file) {
        this.a = file;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void a(avz avz2, axy axy2) {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = bld.a(this.a);
        }
        catch (IOException var3_4) {
            axy2.a((Exception)var3_4);
            return;
        }
        axy2.a((Object)byteBuffer);
    }

    @Override
    public final void b() {
    }

    @Override
    public final Class c() {
        return ByteBuffer.class;
    }

    @Override
    public final axj d() {
        return axj.a;
    }
}

