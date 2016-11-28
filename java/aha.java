/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Resources
 *  java.lang.Object
 */
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;

public final class aha {
    public Context a;

    private aha(Context context) {
        this.a = context;
    }

    public static aha a(Context context) {
        return new aha(context);
    }

    public final boolean a() {
        if (this.a.getApplicationInfo().targetSdkVersion >= 16) {
            return this.a.getResources().getBoolean(acr.a);
        }
        return this.a.getResources().getBoolean(acr.b);
    }
}

