/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.renderscript.Allocation
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.FloatBuffer
 */
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

final class arc
extends ara {
    private ByteBuffer f = null;

    arc() {
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final Object a(int n) {
        return this.f.rewind();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void a(ara ara2) {
        int n = ara2.a();
        if ((n & 2) != 0) {
            asa.a((asv)ara2.a(4), this.f, this.a[0], this.a[1]);
        } else if ((n & 16) != 0) {
            ((Bitmap)ara2.a(16)).copyPixelsToBuffer((Buffer)this.f);
            this.f.rewind();
        } else if ((n & 1) != 0) {
            ByteBuffer byteBuffer = (ByteBuffer)ara2.a(1);
            this.f.put(byteBuffer);
            byteBuffer.rewind();
        } else {
            if ((n & 32) == 0) throw new RuntimeException("Cannot sync bytebuffer backing!");
            if (!aqz.i()) throw new RuntimeException("Cannot sync bytebuffer backing!");
            Allocation allocation = (Allocation)ara2.a(32);
            if (this.c == 301) {
                allocation.copyTo(this.f.array());
            } else {
                if (this.c != 200) {
                    int n2 = this.c;
                    throw new RuntimeException(new StringBuilder(75).append("Trying to sync to an allocation with an unsupported element id: ").append(n2).toString());
                }
                float[] arrf = new float[this.h() / 4];
                allocation.copyTo(arrf);
                this.f.asFloatBuffer().put(arrf);
            }
        }
        ara2.d();
        this.f.rewind();
        this.d = false;
    }

    @Override
    public final void a(arx arx2) {
        int n = arx2.c();
        int[] arrn = this.a;
        int n2 = arrn.length;
        for (int i = 0; i < n2; ++i) {
            n *= arrn[i];
        }
        this.f = ByteBuffer.allocateDirect((int)n);
    }

    @Override
    public final int b() {
        return 1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d() {
        this.f.rewind();
    }

    @Override
    public final int e() {
        return 1;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g() {
        this.f = null;
    }

    @Override
    public final int h() {
        if (this.f == null) {
            return 0;
        }
        return this.f.remaining();
    }
}

