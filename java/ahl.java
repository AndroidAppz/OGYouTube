/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 *  tp
 *  uf
 *  ug
 */
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class ahl {
    public final ArrayList a;
    uf b;
    boolean c;
    private long d = -1;
    private Interpolator e;
    private final ug f;

    public ahl() {
        this.f = new ahm(this);
        this.a = new ArrayList();
    }

    public final ahl a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public final ahl a(tp tp2) {
        if (!this.c) {
            this.a.add((Object)tp2);
        }
        return this;
    }

    public final ahl a(uf uf2) {
        if (!this.c) {
            this.b = uf2;
        }
        return this;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        for (tp tp2 : this.a) {
            if (this.d >= 0) {
                tp2.a(this.d);
            }
            if (this.e != null) {
                tp2.a(this.e);
            }
            if (this.b != null) {
                tp2.a((uf)this.f);
            }
            tp2.b();
        }
        this.c = true;
    }

    public final void b() {
        if (!this.c) {
            return;
        }
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((tp)iterator.next()).a();
        }
        this.c = false;
    }

    public final ahl c() {
        if (!this.c) {
            this.d = 250;
        }
        return this;
    }
}

