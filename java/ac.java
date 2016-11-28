/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.design.widget.CoordinatorLayout
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  java.lang.Object
 */
import android.support.design.widget.CoordinatorLayout;
import android.view.ViewTreeObserver;

public final class ac
implements ViewTreeObserver.OnPreDrawListener {
    private /* synthetic */ CoordinatorLayout a;

    public ac(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.a.a(false);
        return true;
    }
}

