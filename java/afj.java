/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRouter
 *  android.media.MediaRouter$RouteInfo
 *  android.util.Log
 *  android.view.Display
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
import android.media.MediaRouter;
import android.util.Log;
import android.view.Display;

public final class afj {
    public static Display a(Object object) {
        try {
            Display display = ((MediaRouter.RouteInfo)object).getPresentationDisplay();
            return display;
        }
        catch (NoSuchMethodError var1_2) {
            Log.w((String)"MediaRouterJellybeanMr1", (String)"Cannot get presentation display for the route.", (Throwable)var1_2);
            return null;
        }
    }
}

