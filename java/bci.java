/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  java.lang.Object
 *  java.lang.String
 */
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class bci {
    public final Context a;
    public ActivityManager b;
    public bck c;
    public float d = 2.0f;
    public float e = 4.0f;
    public float f = 0.4f;
    public float g = 0.33f;
    public int h = 4194304;

    public bci(Context context) {
        this.a = context;
        this.b = (ActivityManager)context.getSystemService("activity");
        this.c = new bcj(context.getResources().getDisplayMetrics());
    }
}

