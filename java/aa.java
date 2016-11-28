/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.design.widget.CoordinatorLayout
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$OnHierarchyChangeListener
 *  java.lang.Object
 *  java.util.List
 */
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class aa
implements ViewGroup.OnHierarchyChangeListener {
    private /* synthetic */ CoordinatorLayout a;

    public aa(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (this.a.f != null) {
            this.a.f.onChildViewAdded(view, view2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.a;
        int n = coordinatorLayout.a.size();
        boolean bl2 = false;
        for (int i = 0; i < n; ++i) {
            boolean bl3;
            View view3 = (View)coordinatorLayout.a.get(i);
            if (view3 == view2) {
                bl3 = true;
            } else {
                if (bl2) {
                    view3.getLayoutParams();
                }
                bl3 = bl2;
            }
            bl2 = bl3;
        }
        if (this.a.f != null) {
            this.a.f.onChildViewRemoved(view, view2);
        }
    }
}

