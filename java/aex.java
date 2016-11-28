/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRouter
 *  android.media.MediaRouter$Callback
 *  android.media.MediaRouter$RouteGroup
 *  android.media.MediaRouter$RouteInfo
 *  java.lang.Object
 */
import android.media.MediaRouter;

class aex
extends MediaRouter.Callback {
    public final aew a;

    public aex(aew aew2) {
        this.a = aew2;
    }

    public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.b((Object)routeInfo);
    }

    public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.d((Object)routeInfo);
    }

    public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int n) {
    }

    public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.c((Object)routeInfo);
    }

    public void onRouteSelected(MediaRouter mediaRouter, int n, MediaRouter.RouteInfo routeInfo) {
        this.a.a((Object)routeInfo);
    }

    public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
    }

    public void onRouteUnselected(MediaRouter mediaRouter, int n, MediaRouter.RouteInfo routeInfo) {
    }

    public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.e((Object)routeInfo);
    }
}

