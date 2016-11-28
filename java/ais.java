/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 *  kj
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class ais
extends aiq
implements SubMenu {
    ais(Context context, kj kj2) {
        super(context, (kh)kj2);
    }

    public final void clearHeader() {
        ((kj)this.d).clearHeader();
    }

    public final MenuItem getItem() {
        return this.a(((kj)this.d).getItem());
    }

    public final SubMenu setHeaderIcon(int n) {
        ((kj)this.d).setHeaderIcon(n);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((kj)this.d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int n) {
        ((kj)this.d).setHeaderTitle(n);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((kj)this.d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((kj)this.d).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int n) {
        ((kj)this.d).setIcon(n);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((kj)this.d).setIcon(drawable);
        return this;
    }
}

