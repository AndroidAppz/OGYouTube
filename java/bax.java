/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.graphics.Bitmap;

final class bax
implements bbm {
    private final baz a = new baz();
    private final bbe b = new bbe();

    bax() {
    }

    static String c(int n, int n2, Bitmap.Config config) {
        String string = String.valueOf((Object)config);
        return new StringBuilder(27 + String.valueOf((Object)string).length()).append("[").append(n).append("x").append(n2).append("], ").append(string).toString();
    }

    @Override
    public final Bitmap a() {
        return (Bitmap)this.b.a();
    }

    @Override
    public final Bitmap a(int n, int n2, Bitmap.Config config) {
        bay bay2 = this.a.a(n, n2, config);
        return (Bitmap)this.b.a(bay2);
    }

    @Override
    public final void a(Bitmap bitmap) {
        bay bay2 = this.a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        this.b.a(bay2, (Object)bitmap);
    }

    @Override
    public final String b(int n, int n2, Bitmap.Config config) {
        return bax.c(n, n2, config);
    }

    @Override
    public final String b(Bitmap bitmap) {
        return bax.c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override
    public final int c(Bitmap bitmap) {
        return bln.a(bitmap);
    }

    public final String toString() {
        String string = String.valueOf((Object)this.b);
        return new StringBuilder(21 + String.valueOf((Object)string).length()).append("AttributeStrategy:\n  ").append(string).toString();
    }
}

