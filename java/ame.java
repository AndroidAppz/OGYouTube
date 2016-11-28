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

final class ame
extends ami {
    private /* synthetic */ amg a;
    private /* synthetic */ tp b;
    private /* synthetic */ alx c;

    ame(alx alx2, amg amg2, tp tp2) {
        this.c = alx2;
        this.a = amg2;
        this.b = tp2;
    }

    @Override
    public final void a(View view) {
    }

    @Override
    public final void b(View view) {
        this.b.a(null);
        rw.c((View)view, (float)1.0f);
        rw.a((View)view, (float)0.0f);
        rw.b((View)view, (float)0.0f);
        this.c.e(this.a.a);
        this.c.g.remove((Object)this.a.a);
        this.c.c();
    }
}

