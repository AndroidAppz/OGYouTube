/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks2
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Configuration
 *  android.os.Handler
 *  android.os.Looper
 */
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;

public final class avy
extends ContextWrapper
implements ComponentCallbacks2 {
    public final Handler a;
    public final awa b;
    final bka c;
    final azt d;
    public final int e;
    private final ComponentCallbacks2 f;

    public avy(Context context, awa awa2, bkj bkj2, bka bka2, azt azt2, ComponentCallbacks2 componentCallbacks2, int n) {
        super(context.getApplicationContext());
        this.b = awa2;
        this.c = bka2;
        this.d = azt2;
        this.f = componentCallbacks2;
        this.e = n;
        this.a = new Handler(Looper.getMainLooper());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f.onConfigurationChanged(configuration);
    }

    public final void onLowMemory() {
        this.f.onLowMemory();
    }

    public final void onTrimMemory(int n) {
        this.f.onTrimMemory(n);
    }
}

