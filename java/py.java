/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  pz
 *  qa
 */
import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class py {
    public final Context a;
    public pz b;
    public qa c;

    public py(Context context) {
        this.a = context;
    }

    public abstract View a();

    public View a(MenuItem menuItem) {
        return this.a();
    }

    public void a(SubMenu subMenu) {
    }

    public void a(qa qa2) {
        if (this.c != null) {
            Log.w((String)"ActionProvider(support)", (String)("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + this.getClass().getSimpleName() + " instance while it is still in use somewhere else?"));
        }
        this.c = qa2;
    }

    public final void a(boolean bl2) {
        if (this.b != null) {
            this.b.a(bl2);
        }
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public void d() {
        if (this.c != null && this.b()) {
            qa qa2 = this.c;
            this.c();
            qa2.a();
        }
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }
}

