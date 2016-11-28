/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.drawable.Drawable
 *  android.support.v7.widget.Toolbar
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  rw
 *  yu
 */
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

final class aca
extends yt {
    alw a;
    boolean b;
    Window.Callback c;
    ahu d;
    private boolean e;
    private boolean f;
    private ArrayList g = new ArrayList();
    private final Runnable h;
    private final aqo i;

    public aca(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.h = new acb((aca)this);
        this.i = new acc((aca)this);
        this.a = new aqr(toolbar, false);
        this.c = new acg((aca)this, callback);
        this.a.a(this.c);
        toolbar.l = this.i;
        this.a.a(charSequence);
    }

    @Override
    public final void a() {
        this.a.a((Drawable)null);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(int n) {
        alw alw2 = this.a;
        CharSequence charSequence = n != 0 ? this.a.b().getText(n) : null;
        alw2.b(charSequence);
    }

    @Override
    public final void a(int n, int n2) {
        int n3 = this.a.l();
        this.a.a(n & n2 | n3 & ~ n2);
    }

    @Override
    public final void a(Configuration configuration) {
        super.a(configuration);
    }

    @Override
    public final void a(Drawable drawable) {
        this.a.b(drawable);
    }

    @Override
    public final void a(View view, yu yu2) {
        if (view != null) {
            view.setLayoutParams((ViewGroup.LayoutParams)yu2);
        }
        this.a.a(view);
    }

    @Override
    public final void a(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(boolean bl2) {
        int n = bl2 ? 2 : 0;
        this.a(n, 2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(int n, KeyEvent keyEvent) {
        Menu menu = this.j();
        if (menu != null) {
            int n2 = keyEvent != null ? keyEvent.getDeviceId() : -1;
            boolean bl2 = KeyCharacterMap.load((int)n2).getKeyboardType() != 1;
            menu.setQwertyMode(bl2);
            menu.performShortcut(n, keyEvent, 0);
        }
        return true;
    }

    @Override
    public final void b() {
        this.a(0, 8);
    }

    @Override
    public final void b(int n) {
        this.a.b(n);
    }

    @Override
    public final void b(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b(boolean bl2) {
        int n = bl2 ? 4 : 0;
        this.a(n, 4);
    }

    @Override
    public final int c() {
        return this.a.l();
    }

    @Override
    public final void c(boolean bl2) {
    }

    @Override
    public final void d(boolean bl2) {
    }

    @Override
    public final boolean d() {
        if (this.a.m() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Context e() {
        return this.a.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void e(boolean bl2) {
        if (bl2 == this.f) {
            return;
        }
        this.f = bl2;
        int n = this.g.size();
        int n2 = 0;
        while (n2 < n) {
            this.g.get(n2);
            ++n2;
        }
    }

    @Override
    public final boolean f() {
        this.a.a().removeCallbacks(this.h);
        rw.a((View)this.a.a(), (Runnable)this.h);
        return true;
    }

    @Override
    public final boolean g() {
        if (this.a.c()) {
            this.a.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean h() {
        ViewGroup viewGroup = this.a.a();
        if (viewGroup != null && !viewGroup.hasFocus()) {
            viewGroup.requestFocus();
            return true;
        }
        return false;
    }

    @Override
    final void i() {
        this.a.a().removeCallbacks(this.h);
    }

    final Menu j() {
        if (!this.e) {
            this.a.a(new acd(this), new ace(this));
            this.e = true;
        }
        return this.a.n();
    }
}

