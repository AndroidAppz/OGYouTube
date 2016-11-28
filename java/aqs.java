/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v7.widget.Toolbar
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.CharSequence
 *  java.lang.Object
 */
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

final class aqs
implements View.OnClickListener {
    private aho a;
    private /* synthetic */ aqr b;

    aqs(aqr aqr2) {
        this.b = aqr2;
        this.a = new aho(this.b.a.getContext(), this.b.b);
    }

    public final void onClick(View view) {
        if (this.b.c != null && this.b.d) {
            this.b.c.onMenuItemSelected(0, (MenuItem)this.a);
        }
    }
}

