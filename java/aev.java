/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRouter
 *  android.media.MediaRouter$Callback
 *  android.media.MediaRouter$RouteCategory
 *  android.media.MediaRouter$RouteInfo
 *  android.media.MediaRouter$UserRouteInfo
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
import android.media.MediaRouter;

final class aev {
    public static Object a(afc afc2) {
        return new afd(afc2);
    }

    public static Object a(Object object) {
        return ((MediaRouter)object).getSelectedRoute(8388611);
    }

    public static Object a(Object object, String string) {
        return ((MediaRouter)object).createRouteCategory((CharSequence)string, false);
    }

    public static void a(Object object, Object object2) {
        ((MediaRouter)object).removeCallback((MediaRouter.Callback)object2);
    }

    public static Object b(Object object, Object object2) {
        return ((MediaRouter)object).createUserRoute((MediaRouter.RouteCategory)object2);
    }
}

