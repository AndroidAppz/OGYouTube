/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IBinder$DeathRecipient
 *  android.os.Messenger
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.List
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

final class afk
extends adv
implements ServiceConnection {
    static final boolean i = Log.isLoggable((String)"MediaRouteProviderProxy", (int)3);
    final ComponentName j;
    final afp k;
    final ArrayList l = new ArrayList();
    boolean m;
    afl n;
    private boolean o;
    private boolean p;

    public afk(Context context, ComponentName componentName) {
        super(context, new ady(componentName));
        this.j = componentName;
        this.k = new afp();
    }

    @Override
    public final adz a(String string) {
        aea aea2 = this.g;
        if (aea2 != null) {
            List list = aea2.a();
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                if (!((ads)list.get(i)).a().equals((Object)string)) continue;
                afo afo2 = new afo((afk)this, string);
                this.l.add((Object)afo2);
                if (this.p) {
                    afo2.a(this.n);
                }
                this.b();
                return afo2;
            }
        }
        return null;
    }

    public final void a() {
        if (!this.m) {
            if (i) {
                new StringBuilder().append((Object)this).append(": Starting");
            }
            this.m = true;
            this.b();
        }
    }

    final void a(afl afl2) {
        if (this.n == afl2) {
            this.p = true;
            int n = this.l.size();
            for (int i = 0; i < n; ++i) {
                ((afo)this.l.get(i)).a(this.n);
            }
            adu adu2 = this.e;
            if (adu2 != null) {
                this.n.a(adu2);
            }
        }
    }

    final void b() {
        if (this.c()) {
            this.d();
            return;
        }
        this.e();
    }

    @Override
    public final void b(adu adu2) {
        if (this.p) {
            this.n.a(adu2);
        }
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    final boolean c() {
        if (this.m && (this.e != null || !this.l.isEmpty())) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void d() {
        if (this.o) return;
        if (i) {
            new StringBuilder().append((Object)this).append(": Binding");
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.j);
        try {
            this.o = this.a.bindService(intent, (ServiceConnection)this, 1);
            if (this.o || !i) return;
            {
                new StringBuilder().append((Object)this).append(": Bind failed");
                return;
            }
        }
        catch (SecurityException var3_2) {
            if (!i) return;
            new StringBuilder().append((Object)this).append(": Bind failed");
            return;
        }
    }

    final void e() {
        if (this.o) {
            if (i) {
                new StringBuilder().append((Object)this).append(": Unbinding");
            }
            this.o = false;
            this.f();
            this.a.unbindService((ServiceConnection)this);
        }
    }

    final void f() {
        if (this.n != null) {
            this.a((aea)null);
            this.p = false;
            int n = this.l.size();
            for (int i = 0; i < n; ++i) {
                ((afo)this.l.get(i)).d();
            }
            afl afl2 = this.n;
            afl2.a(2, 0, 0, null, null);
            afl2.b.a.clear();
            afl2.a.getBinder().unlinkToDeath((IBinder.DeathRecipient)afl2, 0);
            afl2.h.k.post((Runnable)new afm(afl2));
            this.n = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (i) {
            new StringBuilder().append((Object)this).append(": Connected");
        }
        if (!this.o) return;
        {
            this.f();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!aec.a(messenger)) {
                Log.e((String)"MediaRouteProviderProxy", (String)("" + this + ": Service returned invalid messenger binder"));
                return;
            }
            afl afl2 = new afl((afk)this, messenger);
            if (afl2.a()) {
                this.n = afl2;
                return;
            } else {
                if (!i) return;
                {
                    new StringBuilder().append((Object)this).append(": Registration failed");
                    return;
                }
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (i) {
            new StringBuilder().append((Object)this).append(": Service disconnected");
        }
        this.f();
    }

    public final String toString() {
        return "Service connection " + this.j.flattenToShortString();
    }
}

