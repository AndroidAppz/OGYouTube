/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.net.Uri
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 */
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

public final class bez
implements ben {
    private final Resources a;

    public bez(Resources resources) {
        this.a = resources;
    }

    @Override
    public final bel a(bet bet2) {
        return new bex(this.a, bet2.a(Uri.class, InputStream.class));
    }
}

