/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.view.ActionProvider
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  it
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  rd
 */
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class aho
implements ki {
    private final int a;
    private final int b;
    private final int c;
    private CharSequence d;
    private CharSequence e;
    private Intent f;
    private char g;
    private char h;
    private Drawable i;
    private Context j;
    private int k = 16;

    public aho(Context context, CharSequence charSequence) {
        this.j = context;
        this.a = 16908332;
        this.b = 0;
        this.c = 0;
        this.d = charSequence;
    }

    @Override
    public final ki a(py py2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final ki a(rd rd2) {
        return this;
    }

    @Override
    public final py a() {
        return null;
    }

    @Override
    public final boolean collapseActionView() {
        return false;
    }

    @Override
    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final View getActionView() {
        return null;
    }

    public final char getAlphabeticShortcut() {
        return this.h;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.i;
    }

    public final Intent getIntent() {
        return this.f;
    }

    public final int getItemId() {
        return this.a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final char getNumericShortcut() {
        return this.g;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.d;
    }

    public final CharSequence getTitleCondensed() {
        if (this.e != null) {
            return this.e;
        }
        return this.d;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        if ((1 & this.k) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((2 & this.k) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((16 & this.k) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((8 & this.k) == 0) {
            return true;
        }
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final /* synthetic */ MenuItem setActionView(int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.h = c2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setCheckable(boolean bl2) {
        int n = -2 & this.k;
        int n2 = bl2 ? 1 : 0;
        this.k = n2 | n;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setChecked(boolean bl2) {
        int n = -3 & this.k;
        int n2 = bl2 ? 2 : 0;
        this.k = n2 | n;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setEnabled(boolean bl2) {
        int n = -17 & this.k;
        int n2 = bl2 ? 16 : 0;
        this.k = n2 | n;
        return this;
    }

    public final MenuItem setIcon(int n) {
        this.i = it.a((Context)this.j, (int)n);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.i = drawable;
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.g = c2;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.g = c2;
        this.h = c3;
        return this;
    }

    @Override
    public final void setShowAsAction(int n) {
    }

    @Override
    public final /* synthetic */ MenuItem setShowAsActionFlags(int n) {
        this.setShowAsAction(n);
        return this;
    }

    public final MenuItem setTitle(int n) {
        this.d = this.j.getResources().getString(n);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setVisible(boolean bl2) {
        int n = 8 & this.k;
        int n2 = bl2 ? 0 : 8;
        this.k = n2 | n;
        return this;
    }
}

