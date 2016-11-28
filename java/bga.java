/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  java.lang.Object
 */
import android.content.res.Resources;
import android.graphics.Bitmap;

public final class bga
implements axt {
    private final axt a;
    private final Resources b;
    private final bbb c;

    public bga(Resources resources, bbb bbb2, axt axt2) {
        this.b = (Resources)blm.a((Object)resources, "Argument must not be null");
        this.c = (bbb)blm.a(bbb2, "Argument must not be null");
        this.a = (axt)blm.a(axt2, "Argument must not be null");
    }

    @Override
    public final bap a(Object object, int n, int n2, axs axs2) {
        bap bap2 = this.a.a(object, n, n2, axs2);
        if (bap2 == null) {
            return null;
        }
        return bha.a(this.b, this.c, (Bitmap)bap2.b());
    }

    @Override
    public final boolean a(Object object, axs axs2) {
        return this.a.a(object, axs2);
    }
}

