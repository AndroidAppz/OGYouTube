/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  java.lang.Class
 *  java.lang.Object
 */
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class bha
implements bap {
    private final Bitmap a;
    private final Resources b;
    private final bbb c;

    private bha(Resources resources, bbb bbb2, Bitmap bitmap) {
        this.b = (Resources)blm.a((Object)resources, "Argument must not be null");
        this.c = (bbb)blm.a(bbb2, "Argument must not be null");
        this.a = (Bitmap)blm.a((Object)bitmap, "Argument must not be null");
    }

    public static bha a(Resources resources, bbb bbb2, Bitmap bitmap) {
        return new bha(resources, bbb2, bitmap);
    }

    @Override
    public final Class a() {
        return BitmapDrawable.class;
    }

    @Override
    public final /* synthetic */ Object b() {
        return new BitmapDrawable(this.b, this.a);
    }

    @Override
    public final int c() {
        return bln.a(this.a);
    }

    @Override
    public final void d() {
        this.c.a(this.a);
    }
}

