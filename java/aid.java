/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionProvider
 *  android.view.SubMenu
 *  android.view.View
 */
import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class aid
extends py {
    final ActionProvider d;
    private /* synthetic */ aic e;

    public aid(aic aic2, Context context, ActionProvider actionProvider) {
        this.e = aic2;
        super(context);
        this.d = actionProvider;
    }

    @Override
    public final View a() {
        return this.d.onCreateActionView();
    }

    @Override
    public final void a(SubMenu subMenu) {
        this.d.onPrepareSubMenu(this.e.a(subMenu));
    }

    @Override
    public final boolean e() {
        return this.d.onPerformDefaultAction();
    }

    @Override
    public final boolean f() {
        return this.d.hasSubMenu();
    }
}

