/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaRouter
 *  android.media.MediaRouter$UserRouteInfo
 *  android.media.RemoteControlClient
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.Context;
import android.media.MediaRouter;
import android.media.RemoteControlClient;

final class afw
extends afv {
    private final Object c;
    private final Object d;
    private final Object e;
    private boolean f;

    public afw(Context context, Object object) {
        super(object);
        this.c = context.getSystemService("media_router");
        this.d = aev.a(this.c, "");
        this.e = aev.b(this.c, this.d);
    }

    @Override
    public final void a(afz afz2) {
        afb.c(this.e, afz2.a);
        afb.d(this.e, afz2.b);
        afb.e(this.e, afz2.c);
        afb.b(this.e, afz2.d);
        afb.a(this.e, afz2.e);
        if (!this.f) {
            this.f = true;
            afb.a(this.e, aev.a(new afx((afw)this)));
            Object object = this.e;
            Object object2 = this.a;
            ((MediaRouter.UserRouteInfo)object).setRemoteControlClient((RemoteControlClient)object2);
        }
    }
}

