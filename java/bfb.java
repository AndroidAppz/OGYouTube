/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

public final class bfb
implements bel {
    private final bel a;

    public bfb(bel bel2) {
        this.a = bel2;
    }

    private static Uri a(String string) {
        return Uri.fromFile((File)new File(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        Uri uri;
        String string = (String)object;
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        if (string.startsWith("/")) {
            uri = bfb.a(string);
        } else {
            uri = Uri.parse((String)string);
            if (uri.getScheme() == null) {
                uri = bfb.a(string);
            }
        }
        if (uri == null) {
            return null;
        }
        return this.a.a((Object)uri, n, n2, axs2);
    }
}

