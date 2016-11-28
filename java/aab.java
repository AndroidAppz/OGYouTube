/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.ActionBarContextView
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.Window
 *  android.widget.PopupWindow
 *  java.lang.Object
 *  java.lang.Runnable
 *  rw
 *  tp
 *  uf
 *  zs
 */
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

final class aab
implements ahc {
    final /* synthetic */ zs a;
    private ahc b;

    public aab(zs zs2, ahc ahc2) {
        this.a = zs2;
        this.b = ahc2;
    }

    @Override
    public final void a(ahb ahb2) {
        this.b.a(ahb2);
        if (this.a.s != null) {
            this.a.c.getDecorView().removeCallbacks(this.a.t);
        }
        if (this.a.r != null) {
            this.a.l();
            this.a.u = rw.p((View)this.a.r).a(0.0f);
            this.a.u.a((uf)new aac((aab)this));
        }
        this.a.q = null;
    }

    @Override
    public final boolean a(ahb ahb2, Menu menu) {
        return this.b.a(ahb2, menu);
    }

    @Override
    public final boolean a(ahb ahb2, MenuItem menuItem) {
        return this.b.a(ahb2, menuItem);
    }

    @Override
    public final boolean b(ahb ahb2, Menu menu) {
        return this.b.b(ahb2, menu);
    }
}

