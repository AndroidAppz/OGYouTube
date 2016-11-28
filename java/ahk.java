/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  qy
 */
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

final class ahk {
    Menu a;
    int b;
    int c;
    int d;
    int e;
    boolean f;
    boolean g;
    boolean h;
    int i;
    int j;
    CharSequence k;
    CharSequence l;
    int m;
    char n;
    char o;
    int p;
    boolean q;
    boolean r;
    boolean s;
    int t;
    int u;
    String v;
    String w;
    String x;
    py y;
    final /* synthetic */ ahi z;

    public ahk(ahi ahi2, Menu menu) {
        this.z = ahi2;
        this.a = menu;
        this.a();
    }

    static char a(String string) {
        if (string == null) {
            return '\u0000';
        }
        return string.charAt(0);
    }

    final Object a(String string, Class[] arrclass, Object[] arrobject) {
        try {
            Constructor constructor = this.z.c.getClassLoader().loadClass(string).getConstructor(arrclass);
            constructor.setAccessible(true);
            Object object = constructor.newInstance(arrobject);
            return object;
        }
        catch (Exception var4_6) {
            Log.w((String)"SupportMenuInflater", (String)("Cannot instantiate class: " + string), (Throwable)var4_6);
            return null;
        }
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a(MenuItem menuItem) {
        boolean bl2 = true;
        MenuItem menuItem2 = menuItem.setChecked(this.q).setVisible(this.r).setEnabled(this.s);
        boolean bl3 = this.p > 0 ? bl2 : false;
        menuItem2.setCheckable(bl3).setTitleCondensed(this.l).setIcon(this.m).setAlphabeticShortcut(this.n).setNumericShortcut(this.o);
        if (this.t >= 0) {
            qy.a((MenuItem)menuItem, (int)this.t);
        }
        if (this.x != null) {
            if (this.z.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            ahi ahi2 = this.z;
            if (ahi2.d == null) {
                ahi2.d = ahi2.a((Object)ahi2.c);
            }
            menuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)new ahj(ahi2.d, this.x));
        }
        if (this.p >= 2) {
            if (menuItem instanceof aia) {
                ((aia)menuItem).a(bl2);
            } else if (menuItem instanceof aic) {
                aic aic2 = (aic)menuItem;
                try {
                    if (aic2.e == null) {
                        Class class_ = ((ki)aic2.d).getClass();
                        Class[] arrclass = new Class[]{Boolean.TYPE};
                        aic2.e = class_.getDeclaredMethod("setExclusiveCheckable", arrclass);
                    }
                    Method method = aic2.e;
                    Object object = aic2.d;
                    Object[] arrobject = new Object[]{true};
                    method.invoke(object, arrobject);
                }
                catch (Exception var11_12) {
                    Log.w((String)"MenuItemWrapper", (String)"Error while calling setExclusiveCheckable", (Throwable)var11_12);
                }
            }
        }
        if (this.v != null) {
            qy.a((MenuItem)menuItem, (View)((View)this.a(this.v, ahi.a, this.z.b)));
        } else {
            bl2 = false;
        }
        if (this.u > 0) {
            if (!bl2) {
                qy.b((MenuItem)menuItem, (int)this.u);
            } else {
                Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (this.y != null) {
            qy.a((MenuItem)menuItem, (py)this.y);
        }
    }

    public final SubMenu b() {
        this.h = true;
        SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        this.a(subMenu.getItem());
        return subMenu;
    }
}

