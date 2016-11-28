/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Color
 *  android.support.v7.app.MediaRouteVolumeSlider
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  jh
 */
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.app.MediaRouteVolumeSlider;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;

public final class abq {
    public static float a(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    static int a(Context context, int n, int n2) {
        if (n != 0) {
            TypedArray typedArray = context.obtainStyledAttributes(n, new int[]{n2});
            int n3 = typedArray.getColor(0, 0);
            typedArray.recycle();
            if (n3 != 0) {
                return n3;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Context a(Context context, int n) {
        int n2;
        boolean bl2 = true;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(agn.d, typedValue, bl2) || typedValue.data == 0) {
            bl2 = false;
        }
        if (bl2) {
            if (abq.c(context, n) == -570425344) {
                n2 = agv.b;
                return new ContextThemeWrapper(context, n2);
            }
            n2 = agv.c;
            return new ContextThemeWrapper(context, n2);
        }
        if (abq.c(context, n) == -570425344) {
            n2 = agv.d;
            return new ContextThemeWrapper(context, n2);
        }
        n2 = agv.a;
        return new ContextThemeWrapper(context, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int n = abq.c(context, 0);
        int n2 = Color.alpha((int)n) != 255 ? jh.a((int)n, (int)((Integer)view.getTag())) : n;
        if (mediaRouteVolumeSlider.a != n2) {
            if (Color.alpha((int)n2) != 255) {
                Log.e((String)"MediaRouteVolumeSlider", (String)("Volume slider color cannot be translucent: #" + Integer.toHexString((int)n2)));
            }
            mediaRouteVolumeSlider.a = n2;
        }
    }

    public static int b(Context context, int n) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static int c(Context context, int n) {
        if (jh.b((int)-1, (int)abq.a(context, n, agn.b)) >= 3.0) {
            return -1;
        }
        return -570425344;
    }
}

