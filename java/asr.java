/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.content.Context
 *  android.content.pm.ConfigurationInfo
 *  android.os.Handler
 *  android.os.Looper
 *  android.renderscript.RenderScript
 *  android.util.Log
 *  android.view.SurfaceHolder
 *  android.view.SurfaceView
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.RenderScript;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class asr {
    public Context a = null;
    Set b = new HashSet();
    public Set c = new HashSet();
    public ast d = new ast();
    boolean e;
    RenderScript f;
    private boolean g;

    /*
     * Enabled aggressive block sorting
     */
    public asr(Context context, ass ass2) {
        boolean bl2 = ((ActivityManager)context.getSystemService((String)"activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072;
        this.e = bl2;
        if (ass2.b && !this.e) {
            throw new RuntimeException("Cannot create context that requires GL support on this platform!");
        }
        int n = arf.a();
        boolean bl3 = false;
        if (n > 0) {
            bl3 = true;
        }
        this.g = bl3;
        if (ass2.a && !this.g) {
            throw new RuntimeException("Cannot create context that requires a camera on this platform!");
        }
        if (Looper.myLooper() == null) {
            throw new RuntimeException("MffContext must be created in a thread with a Looper!");
        }
        new Handler();
        this.a = context.getApplicationContext();
        if (ass2.a && arf.b()) {
            SurfaceView surfaceView = new SurfaceView(context);
            surfaceView.getHolder().setType(3);
            Activity activity = context instanceof Activity ? (Activity)context : null;
            if (activity == null) {
                Log.w((String)"MffContext", (String)"Could not find activity for dummy surface! Consider specifying your own SurfaceView!");
                return;
            }
            activity.addContentView((View)surfaceView, new ViewGroup.LayoutParams(1, 1));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        ast ast2;
        ast ast3 = ast2 = this.d;
        synchronized (ast3) {
            if (this.d.a == 2) {
                Set set;
                Set set2 = set = this.c;
                synchronized (set2) {
                    Iterator iterator = this.c.iterator();
                    while (iterator.hasNext()) {
                        ((asb)iterator.next()).m.a(asb.g);
                    }
                }
                this.d.a = 1;
            }
            return;
        }
    }
}

