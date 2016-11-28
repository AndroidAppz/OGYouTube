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
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
import android.media.MediaRouter;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class aey {
    private Method a;

    public aey() {
        if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT > 17) {
            throw new UnsupportedOperationException();
        }
        try {
            this.a = MediaRouter.class.getMethod("getSystemAudioRoute", new Class[0]);
            return;
        }
        catch (NoSuchMethodException var1_1) {
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
    public final Object a(Object object) {
        MediaRouter mediaRouter = (MediaRouter)object;
        if (this.a == null) return mediaRouter.getRouteAt(0);
        try {
            return this.a.invoke((Object)mediaRouter, new Object[0]);
        }
        catch (InvocationTargetException var4_4) {
            // empty catch block
        }
        return mediaRouter.getRouteAt(0);
        catch (IllegalAccessException illegalAccessException) {
            return mediaRouter.getRouteAt(0);
        }
    }
}

