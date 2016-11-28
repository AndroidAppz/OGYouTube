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

final class amd
extends ami {
    private /* synthetic */ aow a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ tp d;
    private /* synthetic */ alx e;

    amd(alx alx2, aow aow2, int n, int n2, tp tp2) {
        this.e = alx2;
        this.a = aow2;
        this.b = n;
        this.c = n2;
        this.d = tp2;
    }

    @Override
    public final void a(View view) {
    }

    @Override
    public final void b(View view) {
        this.d.a(null);
        this.e.e(this.a);
        this.e.e.remove((Object)this.a);
        this.e.c();
    }

    @Override
    public final void c(View view) {
        if (this.b != 0) {
            rw.a((View)view, (float)0.0f);
        }
        if (this.c != 0) {
            rw.b((View)view, (float)0.0f);
        }
    }
}

