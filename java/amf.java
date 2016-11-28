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

final class amf
extends ami {
    private /* synthetic */ amg a;
    private /* synthetic */ tp b;
    private /* synthetic */ View c;
    private /* synthetic */ alx d;

    amf(alx alx2, amg amg2, tp tp2, View view) {
        this.d = alx2;
        this.a = amg2;
        this.b = tp2;
        this.c = view;
    }

    @Override
    public final void a(View view) {
    }

    @Override
    public final void b(View view) {
        this.b.a(null);
        rw.c((View)this.c, (float)1.0f);
        rw.a((View)this.c, (float)0.0f);
        rw.b((View)this.c, (float)0.0f);
        this.d.e(this.a.b);
        this.d.g.remove((Object)this.a.b);
        this.d.c();
    }
}

