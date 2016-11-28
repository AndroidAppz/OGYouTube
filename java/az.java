/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.design.widget.CoordinatorLayout
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 *  rw
 *  xt
 */
import android.support.design.widget.CoordinatorLayout;
import android.view.View;

final class az
implements Runnable {
    private final CoordinatorLayout a;
    private final View b;
    private /* synthetic */ ay c;

    az(ay ay2, CoordinatorLayout coordinatorLayout, View view) {
        this.c = ay2;
        this.a = coordinatorLayout;
        this.b = view;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        if (this.b == null || this.c.b == null) return;
        if (this.c.b.g()) {
            this.c.a_(this.a, this.b, this.c.b.c());
            rw.a((View)this.b, (Runnable)this);
            return;
        }
        this.c.a(this.a, this.b);
    }
}

