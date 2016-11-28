/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.support.v7.widget.ShareActionProvider
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.ShareActionProvider;
import android.view.MenuItem;

public final class apy
implements MenuItem.OnMenuItemClickListener {
    private /* synthetic */ ShareActionProvider a;

    public apy(ShareActionProvider shareActionProvider) {
        this.a = shareActionProvider;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ajq ajq2 = ajq.a(this.a.d, this.a.e);
        menuItem.getItemId();
        ajq2.b();
        return true;
    }
}

