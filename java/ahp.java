/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.view.menu.ActionMenuItemView
 *  android.view.View
 *  android.widget.PopupWindow
 */
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.PopupWindow;

public final class ahp
extends ane {
    private /* synthetic */ ActionMenuItemView d;

    public ahp(ActionMenuItemView actionMenuItemView) {
        this.d = actionMenuItemView;
        super((View)actionMenuItemView);
    }

    @Override
    public final ana a() {
        if (this.d.c != null) {
            return this.d.c.a();
        }
        return null;
    }

    @Override
    protected final boolean b() {
        ahy ahy2 = this.d.b;
        boolean bl2 = false;
        if (ahy2 != null) {
            boolean bl3 = this.d.b.a(this.d.a);
            bl2 = false;
            if (bl3) {
                ana ana2 = this.a();
                bl2 = false;
                if (ana2 != null) {
                    boolean bl4 = ana2.e.isShowing();
                    bl2 = false;
                    if (bl4) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }
}

