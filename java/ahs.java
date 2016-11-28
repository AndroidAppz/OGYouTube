/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.Map
 *  kj
 *  or
 */
import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

class ahs
extends aht {
    final Context a;
    Map b;
    Map c;

    ahs(Context context, Object object) {
        super(object);
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof ki) {
            MenuItem menuItem2;
            ki ki2 = (ki)menuItem;
            if (this.b == null) {
                this.b = new or();
            }
            if ((menuItem2 = (MenuItem)this.b.get((Object)menuItem)) == null) {
                menuItem2 = aip.a(this.a, ki2);
                this.b.put((Object)ki2, (Object)menuItem2);
            }
            return menuItem2;
        }
        return menuItem;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final SubMenu a(SubMenu subMenu) {
        SubMenu subMenu2;
        if (!(subMenu instanceof kj)) return subMenu;
        kj kj2 = (kj)subMenu;
        if (this.c == null) {
            this.c = new or();
        }
        if ((subMenu2 = (SubMenu)this.c.get((Object)kj2)) != null) return subMenu2;
        Context context = this.a;
        if (Build.VERSION.SDK_INT < 14) throw new UnsupportedOperationException();
        subMenu2 = new ais(context, kj2);
        this.c.put((Object)kj2, (Object)subMenu2);
        return subMenu2;
    }
}

