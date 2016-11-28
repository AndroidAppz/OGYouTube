/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  rw
 */
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class aqx {
    private static Method a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT < 18) return;
        try {
            Method method;
            a = method = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            if (method.isAccessible()) return;
            a.setAccessible(true);
            return;
        }
        catch (NoSuchMethodException var0_1) {
            return;
        }
    }

    public static int a(int n, int n2) {
        return n | n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(View view, Rect rect, Rect rect2) {
        if (a == null) return;
        try {
            a.invoke((Object)view, new Object[]{rect, rect2});
            return;
        }
        catch (Exception var3_3) {
            return;
        }
    }

    public static boolean a(View view) {
        if (rw.f((View)view) == 1) {
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b(View view) {
        if (Build.VERSION.SDK_INT < 16) return;
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke((Object)view, new Object[0]);
            return;
        }
        catch (IllegalAccessException var3_2) {
            return;
        }
        catch (InvocationTargetException var2_3) {
            return;
        }
        catch (NoSuchMethodException var1_4) {
            return;
        }
    }
}

