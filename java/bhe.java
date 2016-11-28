/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  java.io.IOException
 *  java.lang.Object
 */
import android.graphics.Bitmap;
import java.io.IOException;

final class bhe
implements bgu {
    private final bhb a;
    private final blh b;

    public bhe(bhb bhb2, blh blh2) {
        this.a = bhb2;
        this.b = blh2;
    }

    @Override
    public final void a() {
        this.a.a();
    }

    @Override
    public final void a(bbb bbb2, Bitmap bitmap) {
        IOException iOException = this.b.a;
        if (iOException != null) {
            if (bitmap != null) {
                bbb2.a(bitmap);
            }
            throw iOException;
        }
    }
}

