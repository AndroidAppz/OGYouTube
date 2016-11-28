/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.widget.RemoteViews
 *  hw
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;

final class abx {
    /*
     * Enabled aggressive block sorting
     */
    static RemoteViews a(Context context, hw hw2) {
        boolean bl2 = hw2.c() == null;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), acx.s);
        remoteViews.setImageViewResource(acv.a, hw2.a());
        if (!bl2) {
            remoteViews.setOnClickPendingIntent(acv.a, hw2.c());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(acv.a, hw2.b());
        }
        return remoteViews;
    }

    /*
     * Enabled aggressive block sorting
     */
    static RemoteViews a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n, Bitmap bitmap, CharSequence charSequence4, boolean bl2, long l, int n2, boolean bl3) {
        boolean bl4;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), n2);
        if (bitmap != null && Build.VERSION.SDK_INT >= 16) {
            remoteViews.setViewVisibility(acv.v, 0);
            remoteViews.setImageViewBitmap(acv.v, bitmap);
        } else {
            remoteViews.setViewVisibility(acv.v, 8);
        }
        if (charSequence != null) {
            remoteViews.setTextViewText(acv.W, charSequence);
        }
        boolean bl5 = false;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(acv.S, charSequence2);
            bl5 = true;
        }
        if (charSequence3 != null) {
            remoteViews.setTextViewText(acv.x, charSequence3);
            remoteViews.setViewVisibility(acv.x, 0);
            bl4 = true;
        } else {
            remoteViews.setViewVisibility(acv.x, 8);
            bl4 = bl5;
        }
        boolean bl6 = false;
        if (charSequence4 != null) {
            int n3 = Build.VERSION.SDK_INT;
            bl6 = false;
            if (n3 >= 16) {
                remoteViews.setTextViewText(acv.S, charSequence4);
                if (charSequence2 != null) {
                    remoteViews.setTextViewText(acv.T, charSequence2);
                    remoteViews.setViewVisibility(acv.T, 0);
                    bl6 = true;
                } else {
                    remoteViews.setViewVisibility(acv.T, 8);
                    bl6 = false;
                }
                if (bl6 && Build.VERSION.SDK_INT >= 16) {
                    if (bl3) {
                        float f = context.getResources().getDimensionPixelSize(act.g);
                        remoteViews.setTextViewTextSize(acv.S, 0, f);
                    }
                    remoteViews.setViewPadding(acv.y, 0, 0, 0, 0);
                }
            }
        }
        if (l != 0) {
            remoteViews.setViewVisibility(acv.V, 0);
            remoteViews.setLong(acv.V, "setTime", l);
        }
        int n4 = acv.z;
        int n5 = bl4 ? 0 : 8;
        remoteViews.setViewVisibility(n4, n5);
        return remoteViews;
    }
}

