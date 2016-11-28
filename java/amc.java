/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.util.ArrayList
 *  rw
 *  tp
 *  uf
 */
import android.view.View;
import java.util.ArrayList;

final class amc
extends ami {
    private /* synthetic */ aow a;
    private /* synthetic */ tp b;
    private /* synthetic */ alx c;

    amc(alx alx2, aow aow2, tp tp2) {
        this.c = alx2;
        this.a = aow2;
        this.b = tp2;
    }

    @Override
    public final void a(View view) {
    }

    @Override
    public final void b(View view) {
        this.b.a(null);
        this.c.e(this.a);
        this.c.d.remove((Object)this.a);
        this.c.c();
    }

    @Override
    public final void c(View view) {
        rw.c((View)view, (float)1.0f);
    }
}

