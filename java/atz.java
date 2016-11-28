/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 */
import android.os.Build;

public final class atz {
    private static boolean a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        boolean bl2 = Build.VERSION.SDK_INT >= 18;
        a = bl2;
    }

    public static void a() {
    }

    public static void a(String string) {
        if (a && string.length() > 127) {
            string.substring(0, 127);
        }
    }
}

