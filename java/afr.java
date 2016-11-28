/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class afr {
    final Context a;
    final Handler b;
    boolean c;
    final BroadcastReceiver d;
    final Runnable e;
    private final afu f;
    private final PackageManager g;
    private final ArrayList h = new ArrayList();

    public afr(Context context, afu afu2) {
        this.d = new afs((afr)this);
        this.e = new aft((afr)this);
        this.a = context;
        this.f = afu2;
        this.b = new Handler();
        this.g = context.getPackageManager();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final int a(String string, String string2) {
        int n = this.h.size();
        int n2 = 0;
        while (n2 < n) {
            afk afk2 = (afk)this.h.get(n2);
            if (afk2.j.getPackageName().equals((Object)string) && afk2.j.getClassName().equals((Object)string2)) {
                return n2;
            }
            boolean bl2 = false;
            if (bl2) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void a() {
        if (!this.c) {
            return;
        }
        var1_1 = new Intent("android.media.MediaRouteProviderService");
        var2_2 = this.g.queryIntentServices(var1_1, 0).iterator();
        var3_3 = 0;
        do {
            if (!var2_2.hasNext()) ** GOTO lbl30
            var8_4 = ((ResolveInfo)var2_2.next()).serviceInfo;
            if (var8_4 == null) ** GOTO lbl44
            var10_10 = this.a(var8_4.packageName, var8_4.name);
            if (var10_10 < 0) {
                var11_5 = new afk(this.a, new ComponentName(var8_4.packageName, var8_4.name));
                var11_5.a();
                var12_8 = this.h;
                var13_6 = var3_3 + 1;
                var12_8.add(var3_3, (Object)var11_5);
                this.f.a(var11_5);
                var3_3 = var13_6;
                continue;
            }
            if (var10_10 < var3_3) ** GOTO lbl44
            var14_9 = (afk)this.h.get(var10_10);
            var14_9.a();
            if (var14_9.n == null && var14_9.c()) {
                var14_9.e();
                var14_9.d();
            }
            var15_11 = this.h;
            var9_7 = var3_3 + 1;
            Collections.swap((List)var15_11, (int)var10_10, (int)var3_3);
            ** GOTO lbl45
lbl30: // 1 sources:
            if (var3_3 >= this.h.size()) return;
            var4_12 = -1 + this.h.size();
            while (var4_12 >= var3_3) {
                var5_13 = (afk)this.h.get(var4_12);
                this.f.b(var5_13);
                this.h.remove((Object)var5_13);
                if (var5_13.m) {
                    if (afk.i) {
                        new StringBuilder().append((Object)var5_13).append(": Stopping");
                    }
                    var5_13.m = false;
                    var5_13.b();
                }
                --var4_12;
            }
            return;
lbl44: // 2 sources:
            var9_7 = var3_3;
lbl45: // 2 sources:
            var3_3 = var9_7;
        } while (true);
    }
}

