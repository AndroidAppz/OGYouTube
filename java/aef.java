/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  lv
 *  lz
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class aef {
    public static final boolean a = Log.isLoggable((String)"MediaRouter", (int)3);
    public static aej b;
    final Context c;
    final ArrayList d = new ArrayList();

    aef(Context context) {
        this.c = context;
    }

    public static aef a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        aef.d();
        if (b == null) {
            aej aej2;
            b = aej2 = new aej(context.getApplicationContext());
            afr afr2 = aej2.i = new afr(aej2.a, aej2);
            if (!afr2.c) {
                afr2.c = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                afr2.a.registerReceiver(afr2.d, intentFilter, null, afr2.b);
                afr2.b.post(afr2.e);
            }
        }
        return b.a(context);
    }

    public static List a() {
        aef.d();
        return aef.b.c;
    }

    public static void a(int n) {
        if (n < 0 || n > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        aef.d();
        aeu aeu2 = b.d();
        if (b.b() != aeu2) {
            b.a(aeu2, n);
            return;
        }
        b.a(b.a(), n);
    }

    public static void a(aeu aeu2) {
        if (aeu2 == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        aef.d();
        if (a) {
            new StringBuilder("selectRoute: ").append((Object)aeu2);
        }
        b.a(aeu2, 3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(lv lv2) {
        if (a) {
            new StringBuilder("addMediaSessionCompat: ").append((Object)lv2);
        }
        aej aej2 = b;
        aej2.o = lv2;
        if (Build.VERSION.SDK_INT >= 21) {
            Object object = lv2 != null ? lv2.a.d() : null;
            if (aej2.m != null) {
                aej2.m.a();
                if (object != null) {
                    aej2.m = new aem(aej2, object);
                    aej2.e();
                    return;
                }
            }
            aej2.m = null;
            return;
        } else {
            if (Build.VERSION.SDK_INT < 14) return;
            {
                if (aej2.n != null) {
                    aej2.b(aej2.n.e());
                    lv lv3 = aej2.n;
                    mh mh2 = aej2.p;
                    if (mh2 == null) {
                        throw new IllegalArgumentException("Listener may not be null");
                    }
                    lv3.c.remove((Object)mh2);
                }
                aej2.n = lv2;
                if (lv2 == null) return;
                {
                    mh mh3 = aej2.p;
                    if (mh3 == null) {
                        throw new IllegalArgumentException("Listener may not be null");
                    }
                    lv2.c.add((Object)mh3);
                    if (!lv2.b()) return;
                    {
                        aej2.a(lv2.e());
                        return;
                    }
                }
            }
        }
    }

    public static boolean a(aed aed2, int n) {
        if (aed2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        aef.d();
        return b.a(aed2, n);
    }

    static boolean a(Object object, Object object2) {
        if (object == object2 || object != null && object2 != null && object.equals(object2)) {
            return true;
        }
        return false;
    }

    private final int b(aeg aeg2) {
        int n = this.d.size();
        for (int i = 0; i < n; ++i) {
            if (((aeh)this.d.get((int)i)).b != aeg2) continue;
            return i;
        }
        return -1;
    }

    public static aeu b() {
        aef.d();
        return b.a();
    }

    public static aeu c() {
        aef.d();
        return b.b();
    }

    public static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(aed var1, aeg var2_3, int var3_2) {
        var4_4 = true;
        if (var1 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (var2_3 == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        aef.d();
        if (aef.a) {
            new StringBuilder("addCallback: selector=").append((Object)var1).append(", callback=").append((Object)var2_3).append(", flags=").append(Integer.toHexString((int)var3_2));
        }
        if ((var5_5 = super.b(var2_3)) < 0) {
            var6_6 = new aeh((aef)this, var2_3);
            this.d.add((Object)var6_6);
        } else {
            var6_6 = (aeh)this.d.get(var5_5);
        }
        if ((var3_2 & (-1 ^ var6_6.d)) != 0) {
            var6_6.d = var3_2 | var6_6.d;
            var8_7 = var4_4;
        } else {
            var8_7 = false;
        }
        var9_8 = var6_6.c;
        var10_9 = false;
        if (var1 == null) ** GOTO lbl-1000
        var9_8.b();
        var1.b();
        var10_9 = var9_8.b.containsAll((Collection)var1.b);
        if (!var10_9) lbl-1000: // 2 sources:
        {
            var6_6.c = new aee(var6_6.c).a(var1).a();
        } else {
            var4_4 = var8_7;
        }
        if (var4_4 == false) return;
        aef.b.c();
    }

    public final void a(aeg aeg2) {
        int n;
        if (aeg2 == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        aef.d();
        if (a) {
            new StringBuilder("removeCallback: callback=").append((Object)aeg2);
        }
        if ((n = super.b(aeg2)) >= 0) {
            this.d.remove(n);
            b.c();
        }
    }
}

