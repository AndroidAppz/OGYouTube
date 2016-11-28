/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v7.widget.ActionBarContextView
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class ahf
extends ahb
implements ahx {
    private Context c;
    private ActionBarContextView d;
    private ahc e;
    private WeakReference f;
    private boolean g;
    private ahw h;

    public ahf(Context context, ActionBarContextView actionBarContextView, ahc ahc2) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = ahc2;
        ahw ahw2 = new ahw(actionBarContextView.getContext());
        ahw2.e = 1;
        this.h = ahw2;
        this.h.a((ahx)this);
    }

    @Override
    public final MenuInflater a() {
        return new MenuInflater(this.d.getContext());
    }

    @Override
    public final void a(int n) {
        this.b(this.c.getString(n));
    }

    @Override
    public final void a(ahw ahw2) {
        this.d();
        this.d.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(View view) {
        this.d.a(view);
        WeakReference weakReference = view != null ? new WeakReference((Object)view) : null;
        this.f = weakReference;
    }

    @Override
    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    @Override
    public final void a(boolean bl2) {
        super.a(bl2);
        this.d.a(bl2);
    }

    @Override
    public final boolean a(ahw ahw2, MenuItem menuItem) {
        return this.e.a((ahb)this, menuItem);
    }

    @Override
    public final Menu b() {
        return this.h;
    }

    @Override
    public final void b(int n) {
        this.a(this.c.getString(n));
    }

    @Override
    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    @Override
    public final void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.sendAccessibilityEvent(32);
        this.e.a(this);
    }

    @Override
    public final void d() {
        this.e.b(this, this.h);
    }

    @Override
    public final CharSequence f() {
        return this.d.f;
    }

    @Override
    public final CharSequence g() {
        return this.d.g;
    }

    @Override
    public final boolean h() {
        return this.d.i;
    }

    @Override
    public final View i() {
        if (this.f != null) {
            return (View)this.f.get();
        }
        return null;
    }
}

