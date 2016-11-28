/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  fc
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b {
    public final Intent a = new Intent("android.intent.action.VIEW");
    public Bundle b = null;

    public b() {
        this(0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    private b(byte var1) {
        super();
        var2_2 = new Bundle();
        if (Build.VERSION.SDK_INT >= 18) {
            var2_2.putBinder("android.support.customtabs.extra.SESSION", null);
lbl7: // 4 sources:
            do {
                this.a.putExtras(var2_2);
                return;
                break;
            } while (true);
        }
        if (fc.b) ** GOTO lbl16
        try {
            fc.a = var9_3 = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
            var9_3.setAccessible(true);
        }
        catch (NoSuchMethodException var8_7) {
            ** continue;
        }
lbl14: // 2 sources:
        do {
            fc.b = true;
lbl16: // 2 sources:
            if (fc.a == null) ** GOTO lbl7
            try {
                fc.a.invoke((Object)var2_2, new Object[]{"android.support.customtabs.extra.SESSION", null});
                ** GOTO lbl7
            }
            catch (InvocationTargetException var6_4) lbl-1000: // 3 sources:
            {
                do {
                    fc.a = null;
                    ** continue;
                    break;
                } while (true);
            }
            catch (IllegalAccessException var5_5) {
                ** GOTO lbl-1000
            }
            catch (IllegalArgumentException var3_6) {
                ** continue;
            }
            break;
        } while (true);
    }
}

