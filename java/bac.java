/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  pg
 */
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

public final class bac
implements aze,
blv {
    private static final bad r = new bad();
    private static final Handler s = new Handler(Looper.getMainLooper(), (Handler.Callback)new bae());
    public final List a = new ArrayList(2);
    public final blx b = new bly();
    public final baf c;
    public final bco d;
    public final bco e;
    public final bco f;
    public axo g;
    public boolean h;
    public boolean i;
    bap j;
    axj k;
    public boolean l;
    public boolean m;
    public List n;
    bai o;
    public azc p;
    public volatile boolean q;
    private final pg t;
    private bak u;

    bac(bco bco2, bco bco3, bco bco4, baf baf2, pg pg2) {
        this(bco2, bco3, bco4, baf2, pg2, r);
    }

    private bac(bco bco2, bco bco3, bco bco4, baf baf2, pg pg2, bad bad2) {
        this.d = bco2;
        this.e = bco3;
        this.f = bco4;
        this.c = baf2;
        this.t = pg2;
    }

    public final bco a() {
        if (this.i) {
            return this.f;
        }
        return this.e;
    }

    @Override
    public final void a(azc azc2) {
        if (this.q) {
            s.obtainMessage(3, (Object)this).sendToTarget();
            return;
        }
        this.a().execute(azc2);
    }

    @Override
    public final void a(bak bak2) {
        this.u = bak2;
        s.obtainMessage(2, (Object)this).sendToTarget();
    }

    @Override
    public final void a(bap bap2, axj axj2) {
        this.j = bap2;
        this.k = axj2;
        s.obtainMessage(1, (Object)this).sendToTarget();
    }

    public final void a(bkb bkb2) {
        bln.a();
        this.b.a();
        if (this.l) {
            bkb2.a(this.o, this.k);
            return;
        }
        if (this.m) {
            bkb2.a(this.u);
            return;
        }
        this.a.add((Object)bkb2);
    }

    public final void a(boolean bl2) {
        bln.a();
        this.a.clear();
        this.g = null;
        this.o = null;
        this.j = null;
        if (this.n != null) {
            this.n.clear();
        }
        this.m = false;
        this.q = false;
        this.l = false;
        azc azc2 = this.p;
        if (azc2.d.a(bl2)) {
            azc2.a();
        }
        this.p = null;
        this.u = null;
        this.k = null;
        this.t.a((Object)this);
    }

    final boolean b(bkb bkb2) {
        if (this.n != null && this.n.contains((Object)bkb2)) {
            return true;
        }
        return false;
    }

    @Override
    public final blx b_() {
        return this.b;
    }

    final void c() {
        this.b.a();
        if (this.q) {
            this.a(false);
            return;
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        if (this.m) {
            throw new IllegalStateException("Already failed once");
        }
        this.m = true;
        this.c.a(this.g, null);
        for (bkb bkb2 : this.a) {
            if (this.b(bkb2)) continue;
            bkb2.a(this.u);
        }
        this.a(false);
    }
}

