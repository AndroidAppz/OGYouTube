/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.InflateException
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

final class ahj
implements MenuItem.OnMenuItemClickListener {
    private static final Class[] a = new Class[]{MenuItem.class};
    private Object b;
    private Method c;

    public ahj(Object object, String string) {
        this.b = object;
        Class class_ = object.getClass();
        try {
            this.c = class_.getMethod(string, a);
            return;
        }
        catch (Exception var4_4) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + string + " in class " + class_.getName());
            inflateException.initCause((Throwable)var4_4);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.c.getReturnType() == Boolean.TYPE) {
                return (Boolean)this.c.invoke(this.b, new Object[]{menuItem});
            }
            this.c.invoke(this.b, new Object[]{menuItem});
            return true;
        }
        catch (Exception var2_2) {
            throw new RuntimeException((Throwable)var2_2);
        }
    }
}

