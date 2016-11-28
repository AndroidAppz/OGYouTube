/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  java.lang.Object
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class anw
implements aqw {
    private /* synthetic */ RecyclerView a;

    public anw(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override
    public final void a(aow aow2) {
        aoh aoh2 = this.a.i;
        View view = aow2.a;
        aom aom2 = this.a.c;
        alr alr2 = aoh2.f;
        int n = alr2.a.a(view);
        if (n >= 0) {
            if (alr2.b.d(n)) {
                alr2.b(view);
            }
            alr2.a.a(n);
        }
        aom2.a(view);
    }

    @Override
    public final void a(aow aow2, aoe aoe2, aoe aoe3) {
        this.a.c.b(aow2);
        RecyclerView recyclerView = this.a;
        recyclerView.a(aow2);
        aow2.a(false);
        if (recyclerView.w.a(aow2, aoe2, aoe3)) {
            recyclerView.j();
        }
    }

    @Override
    public final void b(aow aow2, aoe aoe2, aoe aoe3) {
        RecyclerView recyclerView = this.a;
        aow2.a(false);
        if (recyclerView.w.b(aow2, aoe2, aoe3)) {
            recyclerView.j();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void c(aow aow2, aoe aoe2, aoe aoe3) {
        aow2.a(false);
        if (this.a.r) {
            if (!this.a.w.a(aow2, aow2, aoe2, aoe3)) return;
            {
                this.a.j();
                return;
            }
        } else {
            if (!this.a.w.c(aow2, aoe2, aoe3)) return;
            {
                this.a.j();
                return;
            }
        }
    }
}

