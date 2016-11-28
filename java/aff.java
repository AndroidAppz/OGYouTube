/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.display.DisplayManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class aff
implements Runnable {
    final Handler a;
    Method b;
    boolean c;
    private final DisplayManager d;

    public aff(Context context, Handler handler) {
        if (Build.VERSION.SDK_INT != 17) {
            throw new UnsupportedOperationException();
        }
        this.d = (DisplayManager)context.getSystemService("display");
        this.a = handler;
        try {
            this.b = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
            return;
        }
        catch (NoSuchMethodException var3_3) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        if (this.c) {
            try {
                this.b.invoke((Object)this.d, new Object[0]);
            }
            catch (IllegalAccessException var4_1) {
                Log.w((String)"MediaRouterJellybeanMr1", (String)"Cannot scan for wifi displays.", (Throwable)var4_1);
            }
            catch (InvocationTargetException var1_2) {
                Log.w((String)"MediaRouterJellybeanMr1", (String)"Cannot scan for wifi displays.", (Throwable)var1_2);
            }
            this.a.postDelayed((Runnable)this, 15000);
        }
    }
}

