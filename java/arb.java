/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.renderscript.Allocation
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 */
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import java.nio.Buffer;
import java.nio.ByteBuffer;

final class arb
extends ara {
    private Bitmap f = null;

    arb() {
    }

    private final void i() {
        this.f = Bitmap.createBitmap((int)this.a[0], (int)this.a[1], (Bitmap.Config)Bitmap.Config.ARGB_8888);
    }

    @Override
    public final int a() {
        return 16;
    }

    @Override
    public final Object a(int n) {
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void a(ara ara2) {
        int n = ara2.a();
        if ((n & 16) != 0) {
            this.f = (Bitmap)ara2.a(16);
        } else if ((n & 1) != 0) {
            super.i();
            ByteBuffer byteBuffer = (ByteBuffer)ara2.a(1);
            this.f.copyPixelsFromBuffer((Buffer)byteBuffer);
            byteBuffer.rewind();
        } else if ((n & 2) != 0) {
            super.i();
            asv asv2 = (asv)ara2.a(4);
            Bitmap bitmap = this.f;
            int n2 = this.a[0];
            int n3 = this.a[1];
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)(n2 * n3 << 2));
            asa.a(asv2, byteBuffer, n2, n3);
            bitmap.copyPixelsFromBuffer((Buffer)byteBuffer);
        } else {
            if ((n & 32) == 0) throw new RuntimeException("Cannot sync bytebuffer backing!");
            if (!aqz.i()) throw new RuntimeException("Cannot sync bytebuffer backing!");
            super.i();
            ((Allocation)ara2.a(32)).copyTo(this.f);
        }
        ara2.d();
        this.d = false;
    }

    @Override
    public final void a(arx arx2) {
        this.b(arx2);
    }

    @Override
    public final void a(Object object) {
        this.f = (Bitmap)object;
    }

    @Override
    public final int b() {
        return 16;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int e() {
        return 4;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g() {
        this.f = null;
    }

    @Override
    public final int h() {
        return 4 * this.a[0] * this.a[1];
    }
}

