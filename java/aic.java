/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.view.ActionProvider
 *  android.view.CollapsibleActionView
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.reflect.Method
 *  rd
 */
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public class aic
extends ahs
implements MenuItem {
    public Method e;

    aic(Context context, ki ki2) {
        super(context, ki2);
    }

    aid a(ActionProvider actionProvider) {
        return new aid((aic)this, this.a, actionProvider);
    }

    public boolean collapseActionView() {
        return ((ki)this.d).collapseActionView();
    }

    public boolean expandActionView() {
        return ((ki)this.d).expandActionView();
    }

    public ActionProvider getActionProvider() {
        py py2 = ((ki)this.d).a();
        if (py2 instanceof aid) {
            return ((aid)py2).d;
        }
        return null;
    }

    public View getActionView() {
        View view = ((ki)this.d).getActionView();
        if (view instanceof aie) {
            view = (View)((aie)view).a;
        }
        return view;
    }

    public char getAlphabeticShortcut() {
        return ((ki)this.d).getAlphabeticShortcut();
    }

    public int getGroupId() {
        return ((ki)this.d).getGroupId();
    }

    public Drawable getIcon() {
        return ((ki)this.d).getIcon();
    }

    public Intent getIntent() {
        return ((ki)this.d).getIntent();
    }

    public int getItemId() {
        return ((ki)this.d).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((ki)this.d).getMenuInfo();
    }

    public char getNumericShortcut() {
        return ((ki)this.d).getNumericShortcut();
    }

    public int getOrder() {
        return ((ki)this.d).getOrder();
    }

    public SubMenu getSubMenu() {
        return this.a(((ki)this.d).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((ki)this.d).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((ki)this.d).getTitleCondensed();
    }

    public boolean hasSubMenu() {
        return ((ki)this.d).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((ki)this.d).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((ki)this.d).isCheckable();
    }

    public boolean isChecked() {
        return ((ki)this.d).isChecked();
    }

    public boolean isEnabled() {
        return ((ki)this.d).isEnabled();
    }

    public boolean isVisible() {
        return ((ki)this.d).isVisible();
    }

    /*
     * Enabled aggressive block sorting
     */
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ki ki2 = (ki)this.d;
        aid aid2 = actionProvider != null ? this.a(actionProvider) : null;
        ki2.a(aid2);
        return this;
    }

    public MenuItem setActionView(int n) {
        ((ki)this.d).setActionView(n);
        View view = ((ki)this.d).getActionView();
        if (view instanceof CollapsibleActionView) {
            ((ki)this.d).setActionView((View)new aie(view));
        }
        return this;
    }

    public MenuItem setActionView(View object) {
        if (object instanceof CollapsibleActionView) {
            object = new aie((View)object);
        }
        ((ki)this.d).setActionView((View)object);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        ((ki)this.d).setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setCheckable(boolean bl2) {
        ((ki)this.d).setCheckable(bl2);
        return this;
    }

    public MenuItem setChecked(boolean bl2) {
        ((ki)this.d).setChecked(bl2);
        return this;
    }

    public MenuItem setEnabled(boolean bl2) {
        ((ki)this.d).setEnabled(bl2);
        return this;
    }

    public MenuItem setIcon(int n) {
        ((ki)this.d).setIcon(n);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((ki)this.d).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((ki)this.d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        ((ki)this.d).setNumericShortcut(c2);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ki ki2 = (ki)this.d;
        aif aif2 = onActionExpandListener != null ? new aif((aic)this, onActionExpandListener) : null;
        ki2.a(aif2);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ki ki2 = (ki)this.d;
        aig aig2 = onMenuItemClickListener != null ? new aig((aic)this, onMenuItemClickListener) : null;
        ki2.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)aig2);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        ((ki)this.d).setShortcut(c2, c3);
        return this;
    }

    public void setShowAsAction(int n) {
        ((ki)this.d).setShowAsAction(n);
    }

    public MenuItem setShowAsActionFlags(int n) {
        ((ki)this.d).setShowAsActionFlags(n);
        return this;
    }

    public MenuItem setTitle(int n) {
        ((ki)this.d).setTitle(n);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((ki)this.d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((ki)this.d).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean bl2) {
        return ((ki)this.d).setVisible(bl2);
    }
}

