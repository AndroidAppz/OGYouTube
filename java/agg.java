/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaRouter
 *  android.media.MediaRouter$RouteInfo
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.Log
 *  android.view.Display
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 */
import android.content.Context;
import android.media.MediaRouter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.Method;
import java.util.ArrayList;

class agg
extends agc
implements afg {
    private aff o;
    private afi p;

    public agg(Context context, agl agl2) {
        super(context, agl2);
    }

    @Override
    protected void a(age age2, adt adt2) {
        Display display;
        super.a(age2, adt2);
        if (!((MediaRouter.RouteInfo)age2.a).isEnabled()) {
            adt2.a(false);
        }
        if (this.a(age2)) {
            adt2.a.putBoolean("connecting", true);
        }
        if ((display = afj.a(age2.a)) != null) {
            adt2.f(display.getDisplayId());
        }
    }

    protected boolean a(age age2) {
        if (this.p == null) {
            this.p = new afi();
        }
        return this.p.a(age2.a);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void b() {
        super.b();
        if (this.o == null) {
            this.o = new aff(this.a, this.c);
        }
        aff aff2 = this.o;
        int n = this.l ? this.k : 0;
        if ((n & 2) != 0) {
            if (aff2.c) return;
            {
                if (aff2.b == null) {
                    Log.w((String)"MediaRouterJellybeanMr1", (String)"Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
                    return;
                }
                aff2.c = true;
                aff2.a.post((Runnable)aff2);
                return;
            }
        } else {
            if (!aff2.c) return;
            {
                aff2.c = false;
                aff2.a.removeCallbacks((Runnable)aff2);
                return;
            }
        }
    }

    @Override
    protected final Object c() {
        return new afh(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void f(Object object) {
        int n = this.g(object);
        if (n >= 0) {
            age age2 = (age)this.n.get(n);
            Display display = afj.a(object);
            int n2 = display != null ? display.getDisplayId() : -1;
            if (n2 == age2.c.s()) return;
            age2.c = new adt(age2.c).f(n2).a();
            this.a();
        }
    }
}

