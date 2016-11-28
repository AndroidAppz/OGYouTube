/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaRouter
 *  android.media.MediaRouter$Callback
 *  android.media.MediaRouter$RouteInfo
 *  android.media.MediaRouter$UserRouteInfo
 *  android.os.Bundle
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.Context;
import android.media.MediaRouter;
import android.os.Bundle;

final class agh
extends agg {
    public agh(Context context, agl agl2) {
        super(context, agl2);
    }

    @Override
    protected final void a(age age2, adt adt2) {
        super.a(age2, adt2);
        CharSequence charSequence = ((MediaRouter.RouteInfo)age2.a).getDescription();
        if (charSequence != null) {
            String string = charSequence.toString();
            adt2.a.putString("status", string);
        }
    }

    @Override
    protected final void a(agf agf2) {
        super.a(agf2);
        Object object = agf2.b;
        String string = agf2.a.f;
        ((MediaRouter.UserRouteInfo)object).setDescription((CharSequence)string);
    }

    @Override
    protected final boolean a(age age2) {
        return ((MediaRouter.RouteInfo)age2.a).isConnecting();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void b() {
        int n = 1;
        if (this.m) {
            aev.a(this.i, this.j);
        }
        this.m = n;
        Object object = this.i;
        int n2 = this.k;
        Object object2 = this.j;
        if (!this.l) {
            n = 0;
        }
        int n3 = n | 2;
        ((MediaRouter)object).addCallback(n2, (MediaRouter.Callback)object2, n3);
    }

    @Override
    protected final Object d() {
        return ((MediaRouter)this.i).getDefaultRoute();
    }

    @Override
    protected final void h(Object object) {
        ((MediaRouter)this.i).selectRoute(8388611, (MediaRouter.RouteInfo)object);
    }
}

