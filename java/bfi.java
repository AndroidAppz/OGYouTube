/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 *  java.lang.Object
 */
import android.content.ContentResolver;
import android.net.Uri;

public final class bfi
implements ben,
bfj {
    private final ContentResolver a;

    public bfi(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override
    public final axx a(Uri uri) {
        return new ayg(this.a, uri);
    }

    @Override
    public final bel a(bet bet2) {
        return new bfh((bfj)this);
    }
}

