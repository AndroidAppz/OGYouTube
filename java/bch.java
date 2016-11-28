/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.format.Formatter
 *  android.util.Log
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.Log;

public final class bch {
    public final int a;
    public final int b;
    public final int c;
    private final Context d;

    /*
     * Enabled aggressive block sorting
     */
    public bch(Context context, ActivityManager activityManager, bck bck2, float f2, float f3, int n, float f4, float f5) {
        int n2;
        this.d = context;
        if (bch.a(activityManager)) {
            n /= 2;
        }
        this.c = n;
        int n3 = activityManager.getMemoryClass() << 10 << 10;
        boolean bl2 = bch.a(activityManager);
        float f6 = n3;
        if (!bl2) {
            f5 = f4;
        }
        int n4 = Math.round((float)(f6 * f5));
        int n5 = bck2.a() * bck2.b() << 2;
        int n6 = Math.round((float)(f3 * (float)n5));
        int n7 = Math.round((float)(f2 * (float)n5));
        if (n7 + n6 <= (n2 = n4 - this.c)) {
            this.b = n7;
            this.a = n6;
        } else {
            float f7 = (float)n2 / (f3 + f2);
            this.b = Math.round((float)(f7 * f2));
            this.a = Math.round((float)(f7 * f3));
        }
        if (Log.isLoggable((String)"MemorySizeCalculator", (int)3)) {
            String string = String.valueOf((Object)super.a(this.b));
            String string2 = String.valueOf((Object)super.a(this.a));
            String string3 = String.valueOf((Object)super.a(this.c));
            boolean bl3 = n7 + n6 > n4;
            String string4 = String.valueOf((Object)super.a(n4));
            int n8 = activityManager.getMemoryClass();
            boolean bl4 = bch.a(activityManager);
            new StringBuilder(177 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length() + String.valueOf((Object)string4).length()).append("Calculation complete, Calculated memory cache size: ").append(string).append(", pool size: ").append(string2).append(", byte array size: ").append(string3).append(", memory class limited? ").append(bl3).append(", max size: ").append(string4).append(", memoryClass: ").append(n8).append(", isLowMemoryDevice: ").append(bl4);
        }
    }

    private final String a(int n) {
        return Formatter.formatFileSize((Context)this.d, (long)n);
    }

    private static boolean a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        if (Build.VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }
}

