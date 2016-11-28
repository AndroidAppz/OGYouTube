/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class awi
implements biz {
    public static final bka a;
    private static final bka g;
    public final avw b;
    final biy c;
    final bjf d;
    final bji e;
    bjt f;
    private final bje h;
    private final Runnable i;
    private final Handler j;
    private final bir k;
    private bjt l;

    static {
        bka bka2 = bka.a(Bitmap.class);
        bka2.t = true;
        g = bka2;
        bka.a((Class)bhw.class).t = true;
        a = (bka)((bka)bka.b(azn.b).a(avz.d)).a();
    }

    public awi(avw avw2, biy biy2, bje bje2) {
        super(avw2, biy2, bje2, new bjf(), avw2.d);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private awi(avw avw2, biy biy2, bje bje2, bjf bjf2, bit bit2) {
        List list;
        this.e = new bji();
        this.i = new awj(this);
        this.j = new Handler(Looper.getMainLooper());
        this.b = avw2;
        this.c = biy2;
        this.h = bje2;
        this.d = bjf2;
        this.k = bit2.a(avw2.b.getBaseContext(), new awm(bjf2));
        if (bln.c()) {
            this.j.post(this.i);
        } else {
            biy2.a(this);
        }
        biy2.a(this.k);
        this.f = this.l = avw2.b.c;
        List list2 = list = avw2.e;
        synchronized (list2) {
            if (avw2.e.contains((Object)this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            avw2.e.add((Object)this);
            return;
        }
    }

    public final awf a(Class class_) {
        return new awf(this.b.b, (awi)this, class_);
    }

    public final void a() {
        this.b.b.onLowMemory();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(bkm bkm2) {
        List list;
        if (bkm2 == null) {
            return;
        }
        if (!bln.b()) {
            this.j.post((Runnable)new awk((awi)this, bkm2));
            return;
        }
        if (this.b(bkm2)) return;
        avw avw2 = this.b;
        List list2 = list = avw2.e;
        // MONITORENTER : list2
        Iterator iterator = avw2.e.iterator();
        do {
            if (iterator.hasNext()) continue;
            // MONITOREXIT : list2
            throw new IllegalStateException("Failed to remove target from managers");
        } while (!((awi)iterator.next()).b(bkm2));
        // MONITOREXIT : list2
    }

    @Override
    public final void b() {
        bln.a();
        bjf bjf2 = this.d;
        bjf2.c = false;
        for (bjv bjv2 : bln.a((Collection)bjf2.a)) {
            if (bjv2.f() || bjv2.g() || bjv2.e()) continue;
            bjv2.a();
        }
        bjf2.b.clear();
        this.e.b();
    }

    final boolean b(bkm bkm2) {
        bjv bjv2 = bkm2.a();
        if (bjv2 == null) {
            return true;
        }
        if (this.d.a(bjv2)) {
            this.e.a.remove((Object)bkm2);
            bkm2.a((bjv)null);
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        bln.a();
        bjf bjf2 = this.d;
        bjf2.c = true;
        for (bjv bjv2 : bln.a((Collection)bjf2.a)) {
            if (!bjv2.e()) continue;
            bjv2.c();
            bjf2.b.add((Object)bjv2);
        }
        this.e.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d() {
        List list;
        this.e.d();
        Iterator iterator = new ArrayList((Collection)this.e.a).iterator();
        while (iterator.hasNext()) {
            this.a((bkm)iterator.next());
        }
        this.e.a.clear();
        this.d.a();
        this.c.b(this);
        this.c.b(this.k);
        this.j.removeCallbacks(this.i);
        avw avw2 = this.b;
        List list2 = list = avw2.e;
        synchronized (list2) {
            if (!avw2.e.contains((Object)this)) {
                throw new IllegalStateException("Cannot register not yet registered manager");
            }
            avw2.e.remove((Object)this);
            return;
        }
    }

    public final awf e() {
        return this.a(Bitmap.class).a(new bgg()).a(g);
    }

    public final String toString() {
        String string = String.valueOf((Object)super.toString());
        String string2 = String.valueOf((Object)this.d);
        String string3 = String.valueOf((Object)this.h);
        return new StringBuilder(21 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append(string).append("{tracker=").append(string2).append(", treeNode=").append(string3).append("}").toString();
    }
}

