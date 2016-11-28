/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRouter
 *  android.media.MediaRouter$UserRouteInfo
 *  android.media.MediaRouter$VolumeCallback
 *  java.lang.Object
 */
import android.media.MediaRouter;

public final class afb {
    public static void a(Object object, int n) {
        ((MediaRouter.UserRouteInfo)object).setPlaybackType(n);
    }

    public static void a(Object object, Object object2) {
        ((MediaRouter.UserRouteInfo)object).setVolumeCallback((MediaRouter.VolumeCallback)object2);
    }

    public static void b(Object object, int n) {
        ((MediaRouter.UserRouteInfo)object).setPlaybackStream(n);
    }

    public static void c(Object object, int n) {
        ((MediaRouter.UserRouteInfo)object).setVolume(n);
    }

    public static void d(Object object, int n) {
        ((MediaRouter.UserRouteInfo)object).setVolumeMax(n);
    }

    public static void e(Object object, int n) {
        ((MediaRouter.UserRouteInfo)object).setVolumeHandling(n);
    }
}

