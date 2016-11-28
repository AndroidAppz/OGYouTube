/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.View
 *  java.lang.Object
 *  rd
 */
import android.view.MenuItem;
import android.view.View;

public interface ki
extends MenuItem {
    public ki a(py var1);

    public ki a(rd var1);

    public py a();

    public boolean collapseActionView();

    public boolean expandActionView();

    public View getActionView();

    public boolean isActionViewExpanded();

    public MenuItem setActionView(int var1);

    public MenuItem setActionView(View var1);

    public void setShowAsAction(int var1);

    public MenuItem setShowAsActionFlags(int var1);
}

