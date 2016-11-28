/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.CollapsibleActionView
 *  android.view.View
 *  android.widget.FrameLayout
 */
import android.content.Context;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class aie
extends FrameLayout
implements ahd {
    final CollapsibleActionView a;

    aie(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView)view;
        this.addView(view);
    }

    @Override
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}

