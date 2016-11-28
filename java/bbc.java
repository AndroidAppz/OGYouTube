/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  java.lang.Object
 */
import android.graphics.Bitmap;

public final class bbc
implements bbb {
    @Override
    public final Bitmap a(int n, int n2, Bitmap.Config config) {
        return Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
    }

    @Override
    public final void a() {
    }

    @Override
    public final void a(int n) {
    }

    @Override
    public final void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override
    public final Bitmap b(int n, int n2, Bitmap.Config config) {
        return Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
    }
}

