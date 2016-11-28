/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.graphics.Bitmap;

public final class arn
extends arm {
    arn(aqy aqy2) {
        super(aqy2);
    }

    public final void a(Bitmap bitmap) {
        arx arx2 = this.a.a;
        Bitmap.Config config = bitmap.getConfig();
        switch (arx2.a) {
            default: {
                String string = String.valueOf((Object)arx2);
                throw new IllegalArgumentException(new StringBuilder(48 + String.valueOf((Object)string).length()).append("Unsupported frame type '").append(string).append("' for bitmap assignment!").toString());
            }
            case 301: 
        }
        if (config != Bitmap.Config.ARGB_8888 && (bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false)) == null) {
            throw new RuntimeException("Could not convert bitmap to frame-type RGBA8888!");
        }
        int[] arrn = this.a.b;
        if (bitmap.getWidth() != arrn[0] || bitmap.getHeight() != arrn[1]) {
            int n = bitmap.getWidth();
            int n2 = bitmap.getHeight();
            int n3 = arrn[0];
            int n4 = arrn[1];
            throw new IllegalArgumentException(new StringBuilder(94).append("Cannot assign bitmap of size ").append(n).append("x").append(n2).append(" to frame of size ").append(n3).append("x").append(n4).append("!").toString());
        }
        this.a.b(2, 16).a((Object)bitmap);
        this.a.a();
    }

    public final asz j() {
        return (asz)this.a.a(1, 2);
    }

    public final asv k() {
        return (asv)this.a.a(2, 4);
    }
}

