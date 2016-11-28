/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.Toolbar
 *  android.view.MenuItem
 *  java.lang.Object
 */
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public final class aqj
implements ajp {
    private /* synthetic */ Toolbar a;

    public aqj(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override
    public final boolean a(MenuItem menuItem) {
        if (this.a.l != null) {
            return this.a.l.a(menuItem);
        }
        return false;
    }
}

