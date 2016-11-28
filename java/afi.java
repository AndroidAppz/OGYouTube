/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRouter
 *  android.media.MediaRouter$RouteInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
import android.media.MediaRouter;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class afi {
    private Method a;
    private int b;

    public afi() {
        if (Build.VERSION.SDK_INT != 17) {
            throw new UnsupportedOperationException();
        }
        try {
            this.b = MediaRouter.RouteInfo.class.getField("STATUS_CONNECTING").getInt((Object)null);
            this.a = MediaRouter.RouteInfo.class.getMethod("getStatusCode", new Class[0]);
            return;
        }
        catch (IllegalAccessException var3_1) {
            return;
        }
        catch (NoSuchMethodException var2_2) {
            return;
        }
        catch (NoSuchFieldException var1_3) {
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean a(Object object) {
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo)object;
        if (this.a == null) return false;
        try {
            int n = (Integer)this.a.invoke((Object)routeInfo, new Object[0]);
            int n2 = this.b;
            if (n != n2) return false;
            return true;
        }
        catch (InvocationTargetException var4_5) {
            // empty catch block
        }
        return false;
        catch (IllegalAccessException illegalAccessException) {
            return false;
        }
    }
}

