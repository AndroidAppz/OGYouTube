/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRouter
 *  android.media.MediaRouter$RouteInfo
 *  android.media.MediaRouter$VolumeCallback
 *  java.lang.Object
 */
import android.media.MediaRouter;

final class afd
extends MediaRouter.VolumeCallback {
    private afc a;

    public afd(afc afc2) {
        this.a = afc2;
    }

    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int n) {
        this.a.a((Object)routeInfo, n);
    }

    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int n) {
        this.a.b((Object)routeInfo, n);
    }
}

