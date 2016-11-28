/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.app.MediaRouteActionProvider
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
import android.support.v7.app.MediaRouteActionProvider;
import java.lang.ref.WeakReference;

public final class aaj
extends aeg {
    private final WeakReference a;

    public aaj(MediaRouteActionProvider mediaRouteActionProvider) {
        this.a = new WeakReference((Object)mediaRouteActionProvider);
    }

    private final void d(aef aef2) {
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider)this.a.get();
        if (mediaRouteActionProvider != null) {
            mediaRouteActionProvider.d();
            return;
        }
        aef2.a((aeg)this);
    }

    @Override
    public final void a(aef aef2) {
        super.d(aef2);
    }

    @Override
    public final void a(aef aef2, aeu aeu2) {
        super.d(aef2);
    }

    @Override
    public final void b(aef aef2) {
        super.d(aef2);
    }

    @Override
    public final void b(aef aef2, aeu aeu2) {
        super.d(aef2);
    }

    @Override
    public final void c(aef aef2) {
        super.d(aef2);
    }

    @Override
    public final void c(aef aef2, aeu aeu2) {
        super.d(aef2);
    }
}

