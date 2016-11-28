/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.content.Context;
import android.graphics.Bitmap;

public abstract class bgf
implements axv {
    private final bbb b;

    public bgf(Context context) {
        super(avw.a((Context)context).a);
    }

    private bgf(bbb bbb2) {
        this.b = bbb2;
    }

    protected abstract Bitmap a(bbb var1, Bitmap var2, int var3, int var4);

    @Override
    public final bap a(bap bap2, int n, int n2) {
        Bitmap bitmap;
        if (!bln.a(n, n2)) {
            throw new IllegalArgumentException(new StringBuilder(128).append("Cannot apply transformation on width: ").append(n).append(" or height: ").append(n2).append(" less than or equal to zero and not Target.SIZE_ORIGINAL").toString());
        }
        Bitmap bitmap2 = (Bitmap)bap2.b();
        if (n == Integer.MIN_VALUE) {
            n = bitmap2.getWidth();
        }
        if (n2 == Integer.MIN_VALUE) {
            n2 = bitmap2.getHeight();
        }
        if (bitmap2.equals((Object)(bitmap = this.a(this.b, bitmap2, n, n2)))) {
            return bap2;
        }
        return bge.a(bitmap, this.b);
    }
}

