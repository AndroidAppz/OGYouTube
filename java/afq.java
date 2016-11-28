/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

final class afq
extends Handler {
    final WeakReference a;

    public afq(afl afl2) {
        this.a = new WeakReference((Object)afl2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void handleMessage(Message var1) {
        var2_2 = (afl)this.a.get();
        if (var2_2 == null) return;
        var3_3 = var1.what;
        var4_4 = var1.arg1;
        var5_5 = var1.arg2;
        var6_6 = var1.obj;
        var7_7 = var1.peekData();
        switch (var3_3) {
            case 0: {
                if (var4_4 == var2_2.f) {
                    var2_2.f = 0;
                    var19_9 = var2_2.h;
                    if (var19_9.n == var2_2) {
                        if (afk.i) {
                            new StringBuilder().append((Object)var19_9).append(": Service connection error - ").append("Registation failed");
                        }
                        var19_9.e();
                    }
                }
                if ((aei)var2_2.g.get(var4_4) == null) return;
                var2_2.g.remove(var4_4);
                return;
            }
            case 1: {
                return;
            }
            case 2: {
                if (var6_6 != null && !(var6_6 instanceof Bundle)) ** GOTO lbl57
                var15_10 = (Bundle)var6_6;
                if (var2_2.e == 0 && var4_4 == var2_2.f && var5_5 > 0) {
                    var2_2.f = 0;
                    var2_2.e = var5_5;
                    var16_11 = var2_2.h;
                    var17_12 = aea.a(var15_10);
                    if (var16_11.n == var2_2) {
                        if (afk.i) {
                            new StringBuilder().append((Object)var16_11).append(": Descriptor changed, descriptor=").append((Object)var17_12);
                        }
                        var16_11.a(var17_12);
                    }
                    var2_2.h.a(var2_2);
                    return;
                }
                var8_8 = false;
                ** GOTO lbl72
            }
            case 5: {
                if (var6_6 != null && !(var6_6 instanceof Bundle)) ** GOTO lbl57
                var11_13 = (Bundle)var6_6;
                if (var2_2.e != 0) {
                    var12_14 = var2_2.h;
                    var13_15 = aea.a(var11_13);
                    if (var12_14.n != var2_2) return;
                    if (afk.i) {
                        new StringBuilder().append((Object)var12_14).append(": Descriptor changed, descriptor=").append((Object)var13_15);
                    }
                    var12_14.a(var13_15);
                    return;
                }
                var8_8 = false;
                ** GOTO lbl72
            }
            case 3: {
                if (var6_6 != null && !(var6_6 instanceof Bundle)) ** GOTO lbl57
                if ((aei)var2_2.g.get(var4_4) != null) {
                    var2_2.g.remove(var4_4);
                    return;
                }
                ** GOTO lbl59
            }
lbl57: // 4 sources:
            default: {
                ** GOTO lbl69
            }
lbl59: // 1 sources:
            var8_8 = false;
            ** GOTO lbl72
            case 4: 
        }
        if (var6_6 != null && !(var6_6 instanceof Bundle)) ** GOTO lbl69
        if (var7_7 != null) {
            var7_7.getString("error");
        }
        if ((aei)var2_2.g.get(var4_4) != null) {
            var2_2.g.remove(var4_4);
            return;
        }
        ** GOTO lbl71
lbl69: // 2 sources:
        var8_8 = false;
        ** GOTO lbl72
lbl71: // 1 sources:
        var8_8 = false;
lbl72: // 5 sources:
        if (var8_8 != false) return;
        if (afk.i == false) return;
        new StringBuilder("Unhandled message from server: ").append((Object)var1);
    }
}

