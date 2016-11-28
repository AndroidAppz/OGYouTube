/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  java.lang.Class
 *  java.lang.Object
 */
import android.graphics.Bitmap;

public final class bge
implements bap {
    private final Bitmap a;
    private final bbb b;

    public bge(Bitmap bitmap, bbb bbb2) {
        this.a = (Bitmap)blm.a((Object)bitmap, "Bitmap must not be null");
        this.b = (bbb)blm.a(bbb2, "BitmapPool must not be null");
    }

    public static bge a(Bitmap bitmap, bbb bbb2) {
        if (bitmap == null) {
            return null;
        }
        return new bge(bitmap, bbb2);
    }

    @Override
    public final Class a() {
        return Bitmap.class;
    }

    @Override
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override
    public final int c() {
        return bln.a(this.a);
    }

    @Override
    public final void d() {
        this.b.a(this.a);
    }
}

