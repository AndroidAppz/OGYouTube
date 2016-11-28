/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.Notification$MediaStyle
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.media.session.MediaSession
 *  android.media.session.MediaSession$Token
 *  android.widget.RemoteViews
 *  gx
 *  hw
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  mm
 */
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class abr
extends gy {
    /*
     * Enabled aggressive block sorting
     */
    static void a(Notification notification, he he2) {
        if (he2.i instanceof abw) {
            Context context = he2.a;
            CharSequence charSequence = he2.b;
            CharSequence charSequence2 = he2.c;
            CharSequence charSequence3 = he2.f;
            Bitmap bitmap = he2.e;
            CharSequence charSequence4 = he2.j;
            long l = he2.t.when;
            ArrayList arrayList = he2.p;
            int n = Math.min((int)arrayList.size(), (int)5);
            int n2 = n <= 3 ? acx.u : acx.t;
            RemoteViews remoteViews = abx.a(context, charSequence, charSequence2, charSequence3, 0, bitmap, charSequence4, false, l, n2, false);
            remoteViews.removeAllViews(acv.B);
            if (n > 0) {
                for (int i = 0; i < n; ++i) {
                    RemoteViews remoteViews2 = abx.a(context, (hw)arrayList.get(i));
                    remoteViews.addView(acv.B, remoteViews2);
                }
            }
            remoteViews.setViewVisibility(acv.m, 8);
            notification.bigContentView = remoteViews;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void a(gx gx2, he he2) {
        if (he2.i instanceof abw) {
            abw abw2 = (abw)he2.i;
            Context context = he2.a;
            CharSequence charSequence = he2.b;
            CharSequence charSequence2 = he2.c;
            CharSequence charSequence3 = he2.f;
            Bitmap bitmap = he2.e;
            CharSequence charSequence4 = he2.j;
            long l = he2.t.when;
            ArrayList arrayList = he2.p;
            int[] arrn = abw2.a;
            RemoteViews remoteViews = abx.a(context, charSequence, charSequence2, charSequence3, 0, bitmap, charSequence4, false, l, acx.v, true);
            int n = arrayList.size();
            int n2 = arrn == null ? 0 : Math.min((int)arrn.length, (int)3);
            remoteViews.removeAllViews(acv.B);
            if (n2 > 0) {
                for (int i = 0; i < n2; ++i) {
                    if (i >= n) {
                        Object[] arrobject = new Object[]{i, n - 1};
                        throw new IllegalArgumentException(String.format((String)"setShowActionsInCompactView: action %d out of bounds (max %d)", (Object[])arrobject));
                    }
                    RemoteViews remoteViews2 = abx.a(context, (hw)arrayList.get(arrn[i]));
                    remoteViews.addView(acv.B, remoteViews2);
                }
            }
            remoteViews.setViewVisibility(acv.t, 0);
            remoteViews.setViewVisibility(acv.m, 8);
            gx2.a().setContent(remoteViews);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void b(gx gx2, hq hq2) {
        if (hq2 instanceof abw) {
            abw abw2 = (abw)hq2;
            int[] arrn = abw2.a;
            Object object = abw2.d != null ? abw2.d.a : null;
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle(gx2.a());
            if (arrn != null) {
                mediaStyle.setShowActionsInCompactView(arrn);
            }
            if (object != null) {
                mediaStyle.setMediaSession((MediaSession.Token)object);
            }
        }
    }
}

