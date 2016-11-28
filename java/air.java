/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  it
 *  java.lang.CharSequence
 *  java.lang.String
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class air
extends ahw
implements SubMenu {
    public ahw k;
    private aia l;

    public air(Context context, ahw ahw2, aia aia2) {
        super(context);
        this.k = ahw2;
        this.l = aia2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String a() {
        if (this.l == null) return null;
        int n = this.l.getItemId();
        if (n != 0) return super.a() + ":" + n;
        return null;
    }

    @Override
    public final void a(ahx ahx2) {
        this.k.a(ahx2);
    }

    @Override
    final boolean a(ahw ahw2, MenuItem menuItem) {
        if (super.a(ahw2, menuItem) || this.k.a(ahw2, menuItem)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean a(aia aia2) {
        return this.k.a(aia2);
    }

    @Override
    public final boolean b() {
        return this.k.b();
    }

    @Override
    public final boolean b(aia aia2) {
        return this.k.b(aia2);
    }

    @Override
    public final boolean c() {
        return this.k.c();
    }

    public final MenuItem getItem() {
        return this.l;
    }

    @Override
    public final ahw k() {
        return this.k;
    }

    public final SubMenu setHeaderIcon(int n) {
        super.a(it.a((Context)this.a, (int)n));
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.a(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int n) {
        super.a(this.a.getResources().getString(n));
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.a(null, null, view);
        return this;
    }

    public final SubMenu setIcon(int n) {
        this.l.setIcon(n);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    @Override
    public final void setQwertyMode(boolean bl2) {
        this.k.setQwertyMode(bl2);
    }
}

