/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRouter
 *  android.media.MediaRouter$RouteInfo
 *  java.lang.Object
 */
import android.media.MediaRouter;

public final class agd
extends adz {
    private final Object a;

    public agd(Object object) {
        this.a = object;
    }

    @Override
    public final void b(int n) {
        ((MediaRouter.RouteInfo)this.a).requestSetVolume(n);
    }

    @Override
    public final void c(int n) {
        ((MediaRouter.RouteInfo)this.a).requestUpdateVolume(n);
    }
}

