/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.ActionProvider
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.ViewDebug
 *  android.view.ViewDebug$CapturedViewProperty
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  pz
 *  qa
 *  rd
 */
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class aia
implements ki {
    final int a;
    ahw b;
    public int c = 0;
    public py d;
    private final int e;
    private final int f;
    private final int g;
    private CharSequence h;
    private CharSequence i;
    private Intent j;
    private char k;
    private char l;
    private Drawable m;
    private int n = 0;
    private air o;
    private MenuItem.OnMenuItemClickListener p;
    private int q = 16;
    private View r;
    private rd s;
    private boolean t = false;

    aia(ahw ahw2, int n, int n2, int n3, int n4, CharSequence charSequence, int n5) {
        this.b = ahw2;
        this.e = n2;
        this.f = n;
        this.g = n3;
        this.a = n4;
        this.h = charSequence;
        this.c = n5;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e(boolean bl2) {
        int n = this.q;
        int n2 = -3 & this.q;
        int n3 = bl2 ? 2 : 0;
        this.q = n3 | n2;
        if (n != this.q) {
            this.b.b(false);
        }
    }

    public final CharSequence a(aio aio2) {
        if (aio2 != null && aio2.b()) {
            return this.getTitleCondensed();
        }
        return this.getTitle();
    }

    @Override
    public final ki a(py py2) {
        if (this.d != null) {
            py py3 = this.d;
            py3.c = null;
            py3.b = null;
        }
        this.r = null;
        this.d = py2;
        this.b.b(true);
        if (this.d != null) {
            this.d.a(new aib((aia)this));
        }
        return this;
    }

    @Override
    public final ki a(rd rd2) {
        this.s = rd2;
        return this;
    }

    @Override
    public final py a() {
        return this.d;
    }

    public final void a(air air2) {
        this.o = air2;
        air2.setHeaderTitle(this.getTitle());
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(boolean bl2) {
        int n = -5 & this.q;
        int n2 = bl2 ? 4 : 0;
        this.q = n2 | n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        if (this.p != null && this.p.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        if (this.b.a(this.b.k(), this)) return true;
        if (this.j != null) {
            try {
                this.b.a.startActivity(this.j);
                return true;
            }
            catch (ActivityNotFoundException var1_1) {
                Log.e((String)"MenuItemImpl", (String)"Can't find activity to handle intent; ignoring", (Throwable)var1_1);
            }
        }
        if (this.d == null) return false;
        if (this.d.e()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    final boolean b(boolean bl2) {
        int n = this.q;
        int n2 = -9 & this.q;
        int n3 = bl2 ? 0 : 8;
        int n4 = this.q = n3 | n2;
        boolean bl3 = false;
        if (n == n4) return bl3;
        return true;
    }

    public final char c() {
        if (this.b.b()) {
            return this.l;
        }
        return this.k;
    }

    public final void c(boolean bl2) {
        if (bl2) {
            this.q = 32 | this.q;
            return;
        }
        this.q = -33 & this.q;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final boolean collapseActionView() {
        if ((8 & this.c) == 0) {
            return false;
        }
        if (this.r == null) {
            return true;
        }
        if (this.s == null) return this.b.b(this);
        if (!this.s.b((MenuItem)this)) return false;
        return this.b.b(this);
    }

    public final void d(boolean bl2) {
        this.t = bl2;
        this.b.b(false);
    }

    public final boolean d() {
        if (this.b.c() && this.c() != '\u0000') {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if ((4 & this.q) != 0) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean expandActionView() {
        if (!this.i() || this.s != null && !this.s.a((MenuItem)this)) {
            return false;
        }
        return this.b.a(this);
    }

    public final boolean f() {
        if ((32 & this.q) == 32) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((1 & this.c) == 1) {
            return true;
        }
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        if (this.r != null) {
            return this.r;
        }
        if (this.d != null) {
            this.r = this.d.a(this);
            return this.r;
        }
        return null;
    }

    public final char getAlphabeticShortcut() {
        return this.l;
    }

    public final int getGroupId() {
        return this.f;
    }

    public final Drawable getIcon() {
        if (this.m != null) {
            return this.m;
        }
        if (this.n != 0) {
            Drawable drawable = akj.a().a(this.b.a, this.n, false);
            this.n = 0;
            this.m = drawable;
            return drawable;
        }
        return null;
    }

    public final Intent getIntent() {
        return this.j;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.e;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final char getNumericShortcut() {
        return this.k;
    }

    public final int getOrder() {
        return this.g;
    }

    public final SubMenu getSubMenu() {
        return this.o;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.i != null ? this.i : this.h;
        if (Build.VERSION.SDK_INT >= 18) return charSequence;
        if (charSequence == null) return charSequence;
        if (charSequence instanceof String) return charSequence;
        return charSequence.toString();
    }

    public final boolean h() {
        if ((2 & this.c) == 2) {
            return true;
        }
        return false;
    }

    public final boolean hasSubMenu() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        int n = 8 & this.c;
        boolean bl2 = false;
        if (n != 0) {
            if (this.r == null && this.d != null) {
                this.r = this.d.a(this);
            }
            View view = this.r;
            bl2 = false;
            if (view != null) {
                bl2 = true;
            }
        }
        return bl2;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.t;
    }

    public final boolean isCheckable() {
        if ((1 & this.q) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((2 & this.q) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((16 & this.q) != 0) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean isVisible() {
        if (this.d != null && this.d.b()) {
            if ((8 & this.q) == 0 && this.d.c()) return true;
            return false;
        }
        if ((8 & this.q) != 0) return false;
        return true;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override
    public final /* synthetic */ MenuItem setActionView(int n) {
        Context context = this.b.a;
        this.setActionView(LayoutInflater.from((Context)context).inflate(n, (ViewGroup)new LinearLayout(context), false));
        return this;
    }

    @Override
    public final /* synthetic */ MenuItem setActionView(View view) {
        this.r = view;
        this.d = null;
        if (view != null && view.getId() == -1 && this.e > 0) {
            view.setId(this.e);
        }
        this.b.g();
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.l == c2) {
            return this;
        }
        this.l = Character.toLowerCase((char)c2);
        this.b.b(false);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setCheckable(boolean bl2) {
        int n = this.q;
        int n2 = -2 & this.q;
        int n3 = bl2 ? 1 : 0;
        this.q = n3 | n2;
        if (n != this.q) {
            this.b.b(false);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setChecked(boolean bl2) {
        if ((4 & this.q) == 0) {
            super.e(bl2);
            return this;
        }
        ahw ahw2 = this.b;
        int n = this.getGroupId();
        int n2 = ahw2.c.size();
        int n3 = 0;
        while (n3 < n2) {
            aia aia2 = (aia)ahw2.c.get(n3);
            if (aia2.getGroupId() == n && aia2.e() && aia2.isCheckable()) {
                boolean bl3 = aia2 == this;
                aia2.e(bl3);
            }
            ++n3;
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setEnabled(boolean bl2) {
        this.q = bl2 ? 16 | this.q : -17 & this.q;
        this.b.b(false);
        return this;
    }

    public final MenuItem setIcon(int n) {
        this.m = null;
        this.n = n;
        this.b.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.n = 0;
        this.m = drawable;
        this.b.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.j = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.k == c2) {
            return this;
        }
        this.k = c2;
        this.b.b(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.k = c2;
        this.l = Character.toLowerCase((char)c3);
        this.b.b(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int n) {
        switch (n & 3) {
            default: {
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            }
            case 0: 
            case 1: 
            case 2: 
        }
        this.c = n;
        this.b.g();
    }

    @Override
    public final /* synthetic */ MenuItem setShowAsActionFlags(int n) {
        this.setShowAsAction(n);
        return this;
    }

    public final MenuItem setTitle(int n) {
        return this.setTitle(this.b.a.getString(n));
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.h = charSequence;
        this.b.b(false);
        if (this.o != null) {
            this.o.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.i = charSequence;
        this.b.b(false);
        return this;
    }

    public final MenuItem setVisible(boolean bl2) {
        if (this.b(bl2)) {
            this.b.f();
        }
        return this;
    }

    public final String toString() {
        if (this.h != null) {
            return this.h.toString();
        }
        return null;
    }
}

