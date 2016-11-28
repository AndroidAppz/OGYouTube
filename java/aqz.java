/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.renderscript.Allocation
 *  android.renderscript.Element
 *  android.renderscript.RenderScript
 *  android.renderscript.Type
 *  android.renderscript.Type$Builder
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.Type;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class aqz
extends ara {
    private final RenderScript f;
    private Allocation g = null;

    public aqz(RenderScript renderScript) {
        this.f = renderScript;
    }

    public static boolean i() {
        if (Build.VERSION.SDK_INT >= 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int a() {
        return 32;
    }

    @Override
    public final Object a(int n) {
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(ara ara2) {
        int n = ara2.a();
        if ((n & 2) != 0) {
            asv asv2 = (asv)ara2.a(4);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)this.h());
            asa.a(asv2, byteBuffer, this.a[0], this.a[1]);
            this.g.copyFrom(byteBuffer.array());
        } else if ((n & 16) != 0) {
            Bitmap bitmap = (Bitmap)ara2.a(16);
            this.g.copyFrom(bitmap);
        } else {
            byte[] arrby;
            if ((n & 1) == 0) {
                throw new RuntimeException("Cannot sync allocation backing!");
            }
            ByteBuffer byteBuffer = (ByteBuffer)ara2.a(1);
            if (byteBuffer.order() != ByteOrder.nativeOrder()) {
                throw new RuntimeException("Trying to sync to the ByteBufferBacking with non-native byte order!");
            }
            if (byteBuffer.hasArray()) {
                arrby = byteBuffer.array();
            } else {
                byte[] arrby2 = new byte[this.h()];
                byteBuffer.get(arrby2);
                byteBuffer.rewind();
                arrby = arrby2;
            }
            this.g.copyFromUnchecked(arrby);
        }
        ara2.d();
        this.d = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(arx arx2) {
        int n = 1;
        if (arx2.a != 301 && arx2.a != 200) {
            throw new RuntimeException("Cannot allocate allocation with a non-RGBA or non-float data type!");
        }
        if (this.a == null || this.a.length > 2) {
            throw new RuntimeException("Cannot create an allocation with more than 2 dimensions!");
        }
        int n2 = arx2.a;
        Element element = null;
        switch (n2) {
            case 301: {
                element = Element.RGBA_8888((RenderScript)this.f);
                break;
            }
            case 200: {
                element = Element.F32((RenderScript)this.f);
            }
        }
        Type.Builder builder = new Type.Builder(this.f, element);
        int n3 = this.a.length > 0 ? this.a[0] : n;
        builder.setX(n3);
        if (this.a.length == 2) {
            n = this.a[n];
        }
        builder.setY(n);
        Type type = builder.create();
        this.g = Allocation.createTyped((RenderScript)this.f, (Type)type);
    }

    @Override
    public final int b() {
        return 32;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d() {
    }

    @Override
    public final int e() {
        return 5;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g() {
        if (this.g != null) {
            this.g.destroy();
            this.g = null;
        }
    }

    @Override
    public final int h() {
        int n = 1;
        int[] arrn = this.a;
        int n2 = arrn.length;
        for (int i = 0; i < n2; ++i) {
            n *= arrn[i];
        }
        return n * this.b;
    }
}

