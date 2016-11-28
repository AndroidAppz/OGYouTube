/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
import android.net.Uri;
import java.util.List;

public final class ayq {
    public static boolean a(int n, int n2) {
        if (n <= 512 && n2 <= 384) {
            return true;
        }
        return false;
    }

    public static boolean a(Uri uri) {
        if (uri != null && "content".equals((Object)uri.getScheme()) && "media".equals((Object)uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static boolean b(Uri uri) {
        return uri.getPathSegments().contains((Object)"video");
    }
}

