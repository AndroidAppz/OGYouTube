/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.opengl.GLES20
 *  android.opengl.GLUtils
 *  android.renderscript.Allocation
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.nio.ByteBuffer
 *  java.util.HashMap
 *  javax.microedition.khronos.egl.EGLContext
 *  javax.microedition.khronos.egl.EGLDisplay
 *  javax.microedition.khronos.egl.EGLSurface
 */
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.renderscript.Allocation;
import java.nio.ByteBuffer;
import java.util.HashMap;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

final class are
extends ara {
    private asv f = null;
    private asz g = null;

    are() {
    }

    private final asz i() {
        if (!this.g.d) {
            asz asz2 = this.g;
            int n = this.a[0];
            int n2 = this.a[1];
            asa.a(asz2.a, asz2.b, null, n, n2);
            asz2.d = true;
        }
        return this.g;
    }

    private final asv j() {
        if (this.f == null) {
            asz asz2 = this.i();
            asv asv2 = (asv)asv.a.get();
            if (asv2 == null) {
                throw new RuntimeException("Can't call forTexture() without main target set.");
            }
            asv2.c();
            int[] arrn = new int[1];
            GLES20.glGenFramebuffers((int)1, (int[])arrn, (int)0);
            asa.a("glGenFramebuffers");
            int n = arrn[0];
            GLES20.glBindFramebuffer((int)36160, (int)n);
            asa.a("glBindFramebuffer");
            GLES20.glFramebufferTexture2D((int)36160, (int)36064, (int)asz2.b, (int)asz2.a, (int)0);
            asa.a("glFramebufferTexture2D");
            this.f = new asv(asv2.b, asv2.c, asv2.f(), n, false, false);
        }
        return this.f;
    }

    @Override
    public final int a() {
        return 2;
    }

    @Override
    public final Object a(int n) {
        switch (n) {
            default: {
                throw new RuntimeException("Illegal access to texture!");
            }
            case 2: {
                return super.i();
            }
            case 4: 
        }
        return super.j();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void a(ara ara2) {
        int n = ara2.a();
        if ((n & 1) != 0) {
            ByteBuffer byteBuffer = (ByteBuffer)ara2.a(1);
            this.g.a(byteBuffer, this.a[0], this.a[1]);
        } else if ((n & 16) != 0) {
            Bitmap bitmap = (Bitmap)ara2.a(16);
            asz asz2 = this.g;
            int n2 = asz2.a;
            int n3 = asz2.b;
            GLES20.glBindTexture((int)n3, (int)n2);
            GLUtils.texImage2D((int)n3, (int)0, (Bitmap)bitmap, (int)0);
            asa.a("glTexImage2D");
            asa.b();
            asz2.d = true;
        } else if ((n & 2) != 0) {
            asz asz3 = (asz)ara2.a(2);
            int n4 = this.a[0];
            int n5 = this.a[1];
            asv asv2 = super.j();
            asv asv3 = asv.b();
            asl asl2 = (asl)asv.d.get((Object)asv3.c);
            if (asl2 == null) {
                asl2 = asl.a();
                asv.d.put((Object)asv3.c, (Object)asl2);
            }
            asl2.a(asz3, asv2, n4, n5);
        } else {
            if ((n & 32) == 0) throw new RuntimeException("Cannot sync bytebuffer backing!");
            if (!aqz.i()) throw new RuntimeException("Cannot sync bytebuffer backing!");
            Allocation allocation = (Allocation)ara2.a(32);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)this.h());
            allocation.copyTo(byteBuffer.array());
            this.g.a(byteBuffer, this.a[0], this.a[1]);
        }
        ara2.d();
        this.d = false;
    }

    @Override
    public final void a(arx arx2) {
        this.b(arx2);
        this.g = new asz(asa.a(), 3553);
    }

    @Override
    public final int b() {
        return 4;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int e() {
        return 2;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g() {
        if (this.f != null) {
            this.f.e();
        }
        if (this.g.d) {
            asz asz2 = this.g;
            if (GLES20.glIsTexture((int)asz2.a) && asz2.c) {
                int[] arrn = new int[]{asz2.a};
                asa.b("glDeleteTextures");
                GLES20.glDeleteTextures((int)1, (int[])arrn, (int)0);
                asa.a("glDeleteTextures");
            }
            asz2.a = 0;
        }
    }

    @Override
    public final int h() {
        return 4 * this.a[0] * this.a[1];
    }
}

