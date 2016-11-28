/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRouter
 *  android.media.MediaRouter$RouteInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Method
 */
import android.media.MediaRouter;
import android.os.Build;
import java.lang.reflect.Method;

public final class afa {
    Method a;

    public afa() {
        if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT > 17) {
            throw new UnsupportedOperationException();
        }
        try {
            Class[] arrclass = new Class[]{Integer.TYPE, MediaRouter.RouteInfo.class};
            this.a = MediaRouter.class.getMethod("selectRouteInt", arrclass);
            return;
        }
        catch (NoSuchMethodException var1_2) {
            return;
        }
    }
}

