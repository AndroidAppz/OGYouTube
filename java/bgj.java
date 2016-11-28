/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  java.lang.Object
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 */
import android.content.Context;
import android.graphics.Bitmap;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class bgj
extends bgf {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    public bgj(Context context) {
        super(context);
    }

    @Override
    protected final Bitmap a(bbb bbb2, Bitmap bitmap, int n, int n2) {
        return bhf.c(bbb2, bitmap, n, n2);
    }

    @Override
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof bgj;
    }

    @Override
    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterInside".hashCode();
    }
}

