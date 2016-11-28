/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  java.lang.Object
 *  java.security.MessageDigest
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.security.MessageDigest;

public final class bgc
implements axv {
    private final Context b;
    private final bbb c;
    private final axv d;

    public bgc(Context context, axv axv2) {
        super(context, avw.a((Context)context).a, axv2);
    }

    private bgc(Context context, bbb bbb2, axv axv2) {
        this.b = context.getApplicationContext();
        this.c = (bbb)blm.a(bbb2, "Argument must not be null");
        this.d = (axv)blm.a(axv2, "Argument must not be null");
    }

    @Override
    public final bap a(bap bap2, int n, int n2) {
        bge bge2 = bge.a(((BitmapDrawable)bap2.b()).getBitmap(), this.c);
        bap bap3 = this.d.a(bge2, n, n2);
        if (bap3.equals((Object)bge2)) {
            return bap2;
        }
        Context context = this.b;
        Bitmap bitmap = (Bitmap)bap3.b();
        return bha.a(context.getResources(), avw.a((Context)context).a, bitmap);
    }

    @Override
    public final void a(MessageDigest messageDigest) {
        this.d.a(messageDigest);
    }

    @Override
    public final boolean equals(Object object) {
        if (object instanceof bgc) {
            bgc bgc2 = (bgc)object;
            return this.d.equals((Object)bgc2.d);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }
}

