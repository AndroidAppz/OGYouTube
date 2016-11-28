/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  java.io.File
 *  java.lang.Object
 */
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

public final class bgb
implements axu {
    private final bbb a;
    private final axu b;

    public bgb(bbb bbb2, axu axu2) {
        this.a = bbb2;
        this.b = axu2;
    }

    @Override
    public final axl a(axs axs2) {
        return this.b.a(axs2);
    }

    @Override
    public final /* synthetic */ boolean a(Object object, File file, axs axs2) {
        bap bap2 = (bap)object;
        return this.b.a((Object)new bge(((BitmapDrawable)bap2.b()).getBitmap(), this.a), file, axs2);
    }
}

