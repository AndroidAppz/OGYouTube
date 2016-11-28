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

public final class aof
implements aod {
    private /* synthetic */ RecyclerView a;

    public aof(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(aow aow2) {
        boolean bl2 = true;
        aow2.a(bl2);
        if (aow2.f != null && aow2.g == null) {
            aow2.f = null;
        }
        aow2.g = null;
        boolean bl3 = (16 & aow2.h) != 0 ? bl2 : false;
        if (!bl3) {
            boolean bl4;
            RecyclerView recyclerView = this.a;
            View view = aow2.a;
            recyclerView.b();
            alr alr2 = recyclerView.e;
            int n = alr2.a.a(view);
            if (n == -1) {
                alr2.b(view);
                bl4 = bl2;
            } else if (alr2.b.c(n)) {
                alr2.b.d(n);
                alr2.b(view);
                alr2.a.a(n);
                bl4 = bl2;
            } else {
                bl4 = false;
            }
            if (bl4) {
                aow aow3 = RecyclerView.a((View)view);
                recyclerView.c.b(aow3);
                recyclerView.c.a(aow3);
            }
            if (bl4) {
                bl2 = false;
            }
            recyclerView.a(bl2);
            if (!bl4 && aow2.n()) {
                this.a.removeDetachedView(aow2.a, false);
            }
        }
    }
}

