/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  java.lang.Class
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  pg
 */
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class awf
implements Cloneable {
    private static final awn e = new avv();
    public final avy a;
    public final Class b;
    public bjt c;
    public bjz d;
    private final awi f;
    private final bjt g;
    private awn h = e;
    private Object i;
    private boolean j;

    static {
        ((bka)((bka)new bka().a(azn.b)).a(avz.d)).a();
    }

    awf(avy avy2, awi awi2, Class class_) {
        this.f = awi2;
        this.a = (avy)((Object)blm.a((Object)avy2, "Argument must not be null"));
        this.b = class_;
        this.c = this.g = awi2.f;
    }

    private awf a() {
        try {
            awf awf2 = (awf)super.clone();
            awf2.c = (bjt)awf2.c.clone();
            awf2.h = awf2.h.a();
            return awf2;
        }
        catch (CloneNotSupportedException var1_2) {
            throw new RuntimeException((Throwable)var1_2);
        }
    }

    public final awf a(awn awn2) {
        this.h = (awn)blm.a(awn2, "Argument must not be null");
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final awf a(bjt bjt2) {
        blm.a(bjt2, "Argument must not be null");
        bjt bjt3 = this.g == this.c ? (bjt)this.c.clone() : this.c;
        while (bjt3.v) {
            bjt3 = (bjt)bjt3.clone();
        }
        if (bjt.b(bjt2.a, 2)) {
            bjt3.b = bjt2.b;
        }
        if (bjt.b(bjt2.a, 262144)) {
            bjt3.w = bjt2.w;
        }
        if (bjt.b(bjt2.a, 4)) {
            bjt3.c = bjt2.c;
        }
        if (bjt.b(bjt2.a, 8)) {
            bjt3.d = bjt2.d;
        }
        if (bjt.b(bjt2.a, 16)) {
            bjt3.e = bjt2.e;
        }
        if (bjt.b(bjt2.a, 32)) {
            bjt3.f = bjt2.f;
        }
        if (bjt.b(bjt2.a, 64)) {
            bjt3.g = bjt2.g;
        }
        if (bjt.b(bjt2.a, 128)) {
            bjt3.h = bjt2.h;
        }
        if (bjt.b(bjt2.a, 256)) {
            bjt3.i = bjt2.i;
        }
        if (bjt.b(bjt2.a, 512)) {
            bjt3.k = bjt2.k;
            bjt3.j = bjt2.j;
        }
        if (bjt.b(bjt2.a, 1024)) {
            bjt3.l = bjt2.l;
        }
        if (bjt.b(bjt2.a, 4096)) {
            bjt3.s = bjt2.s;
        }
        if (bjt.b(bjt2.a, 8192)) {
            bjt3.o = bjt2.o;
        }
        if (bjt.b(bjt2.a, 16384)) {
            bjt3.p = bjt2.p;
        }
        if (bjt.b(bjt2.a, 32768)) {
            bjt3.u = bjt2.u;
        }
        if (bjt.b(bjt2.a, 65536)) {
            bjt3.n = bjt2.n;
        }
        if (bjt.b(bjt2.a, 131072)) {
            bjt3.m = bjt2.m;
        }
        if (bjt.b(bjt2.a, 2048)) {
            bjt3.r.putAll(bjt2.r);
        }
        if (!bjt3.n) {
            bjt3.r.clear();
            bjt3.a = -2049 & bjt3.a;
            bjt3.m = false;
            bjt3.a = -131073 & bjt3.a;
        }
        bjt3.a |= bjt2.a;
        bjt3.q.a(bjt2.q);
        this.c = bjt3.c();
        return this;
    }

    public final awf a(Object object) {
        this.i = object;
        this.j = true;
        return this;
    }

    public final bkm a(bkm bkm2) {
        bln.a();
        blm.a(bkm2, "Argument must not be null");
        if (!this.j) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        if (bkm2.a() != null) {
            this.f.a(bkm2);
        }
        this.c.t = true;
        awn awn2 = this.h;
        avz avz2 = this.c.d;
        int n = this.c.k;
        int n2 = this.c.j;
        bjt bjt2 = this.c;
        bjt2.t = true;
        avy avy2 = this.a;
        Object object = this.i;
        Class class_ = this.b;
        bjz bjz2 = this.d;
        azt azt2 = this.a.d;
        bkx bkx2 = awn2.a;
        bkc bkc2 = (bkc)bkc.a.a();
        if (bkc2 == null) {
            bkc2 = new bkc();
        }
        bkc2.c = avy2;
        bkc2.d = object;
        bkc2.e = class_;
        bkc2.f = bjt2;
        bkc2.g = n;
        bkc2.h = n2;
        bkc2.i = avz2;
        bkc2.j = bkm2;
        bkc2.k = bjz2;
        bkc2.b = null;
        bkc2.l = azt2;
        bkc2.m = bkx2;
        bkc2.n = bke.a;
        bkm2.a(bkc2);
        awi awi2 = this.f;
        awi2.e.a.add((Object)bkm2);
        bjf bjf2 = awi2.d;
        bjf2.a.add((Object)bkc2);
        if (!bjf2.c) {
            bkc2.a();
            return bkm2;
        }
        bjf2.b.add((Object)bkc2);
        return bkm2;
    }

    public final /* synthetic */ Object clone() {
        return this.a();
    }
}

