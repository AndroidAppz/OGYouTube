/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public final class aoo
extends aob {
    private /* synthetic */ RecyclerView a;

    public aoo(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    private final void c() {
        this.a.p = true;
        this.a.requestLayout();
    }

    @Override
    public final void a() {
        this.a.a(null);
        this.a.z.f = true;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.r) {
            recyclerView.r = true;
            int n = recyclerView.e.b();
            for (int i = 0; i < n; ++i) {
                aow aow2 = RecyclerView.a((View)recyclerView.e.c(i));
                if (aow2 == null || aow2.b()) continue;
                aow2.b(512);
            }
            aom aom2 = recyclerView.c;
            int n2 = aom2.c.size();
            for (int j = 0; j < n2; ++j) {
                aow aow3 = (aow)aom2.c.get(j);
                if (aow3 == null) continue;
                aow3.b(512);
            }
        }
        if (!this.a.d.d()) {
            this.a.requestLayout();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(int n, int n2) {
        int n3 = 1;
        this.a.a(null);
        akb akb2 = this.a.d;
        akb2.a.add((Object)akb2.a(n3, n, n2, null));
        akb2.c = 1 | akb2.c;
        if (akb2.a.size() != n3) return;
        if (n3 == 0) return;
        super.c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(int n, int n2, Object object) {
        int n3 = 1;
        this.a.a(null);
        akb akb2 = this.a.d;
        akb2.a.add((Object)akb2.a(4, n, n2, null));
        akb2.c = 4 | akb2.c;
        if (akb2.a.size() != n3) return;
        if (n3 == 0) return;
        super.c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void b(int n, int n2) {
        int n3 = 1;
        this.a.a(null);
        akb akb2 = this.a.d;
        akb2.a.add((Object)akb2.a(2, n, n2, null));
        akb2.c = 2 | akb2.c;
        if (akb2.a.size() != n3) return;
        if (n3 == 0) return;
        super.c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void c(int n, int n2) {
        int n3 = 1;
        this.a.a(null);
        akb akb2 = this.a.d;
        if (n == n2) return;
        akb2.a.add((Object)akb2.a(8, n, n2, null));
        akb2.c = 8 | akb2.c;
        if (akb2.a.size() != n3) return;
        if (n3 == 0) return;
        super.c();
    }
}

