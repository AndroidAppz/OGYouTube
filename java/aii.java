/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionProvider
 *  android.view.ActionProvider$VisibilityListener
 *  android.view.MenuItem
 *  android.view.View
 *  qa
 */
import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

final class aii
extends aid
implements ActionProvider.VisibilityListener {
    private qa e;

    public aii(aih aih2, Context context, ActionProvider actionProvider) {
        super(aih2, context, actionProvider);
    }

    @Override
    public final View a(MenuItem menuItem) {
        return this.d.onCreateActionView(menuItem);
    }

    @Override
    public final void a(qa qa2) {
        this.e = qa2;
        this.d.setVisibilityListener((ActionProvider.VisibilityListener)this);
    }

    @Override
    public final boolean b() {
        return this.d.overridesItemVisibility();
    }

    @Override
    public final boolean c() {
        return this.d.isVisible();
    }

    @Override
    public final void d() {
        this.d.refreshVisibility();
    }

    public final void onActionProviderVisibilityChanged(boolean bl2) {
        if (this.e != null) {
            this.e.a();
        }
    }
}

