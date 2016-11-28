/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.support.v7.widget.ActionBarContextView
 *  android.support.v7.widget.ActionBarOverlayLayout
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public final class aco
extends ahb
implements ahx {
    private final Context c;
    private final ahw d;
    private ahc e;
    private WeakReference f;
    private /* synthetic */ ack g;

    public aco(ack ack2, Context context, ahc ahc2) {
        this.g = ack2;
        this.c = context;
        this.e = ahc2;
        ahw ahw2 = new ahw(context);
        ahw2.e = 1;
        this.d = ahw2;
        this.d.a((ahx)this);
    }

    @Override
    public final MenuInflater a() {
        return new ahi(this.c);
    }

    @Override
    public final void a(int n) {
        this.b(this.g.a.getResources().getString(n));
    }

    @Override
    public final void a(ahw ahw2) {
        if (this.e == null) {
            return;
        }
        this.d();
        this.g.e.a();
    }

    @Override
    public final void a(View view) {
        this.g.e.a(view);
        this.f = new WeakReference((Object)view);
    }

    @Override
    public final void a(CharSequence charSequence) {
        this.g.e.b(charSequence);
    }

    @Override
    public final void a(boolean bl2) {
        super.a(bl2);
        this.g.e.a(bl2);
    }

    @Override
    public final boolean a(ahw ahw2, MenuItem menuItem) {
        if (this.e != null) {
            return this.e.a((ahb)this, menuItem);
        }
        return false;
    }

    @Override
    public final Menu b() {
        return this.d;
    }

    @Override
    public final void b(int n) {
        this.a(this.g.a.getResources().getString(n));
    }

    @Override
    public final void b(CharSequence charSequence) {
        this.g.e.a(charSequence);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void c() {
        if (this.g.g != this) {
            return;
        }
        if (!ack.a(false, this.g.k, false)) {
            this.g.h = this;
            this.g.i = this.e;
        } else {
            this.e.a(this);
        }
        this.e = null;
        this.g.g(false);
        ActionBarContextView actionBarContextView = this.g.e;
        if (actionBarContextView.h == null) {
            actionBarContextView.b();
        }
        this.g.d.a().sendAccessibilityEvent(32);
        this.g.b.a(this.g.m);
        this.g.g = null;
    }

    @Override
    public final void d() {
        if (this.g.g != this) {
            return;
        }
        this.d.d();
        try {
            this.e.b(this, this.d);
            return;
        }
        finally {
            this.d.e();
        }
    }

    public final boolean e() {
        this.d.d();
        try {
            boolean bl2 = this.e.a((ahb)this, this.d);
            return bl2;
        }
        finally {
            this.d.e();
        }
    }

    @Override
    public final CharSequence f() {
        return this.g.e.f;
    }

    @Override
    public final CharSequence g() {
        return this.g.e.g;
    }

    @Override
    public final boolean h() {
        return this.g.e.i;
    }

    @Override
    public final View i() {
        if (this.f != null) {
            return (View)this.f.get();
        }
        return null;
    }
}

