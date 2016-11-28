/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  pe
 */
import android.content.ComponentName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class aet
extends aeu {
    public List a = new ArrayList();

    aet(aes aes2, String string, String string2) {
        super(aes2, string, string2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    final int a(ads var1) {
        var2_2 = 1;
        if (this.u == var1) ** GOTO lbl11
        this.u = var1;
        if (var1 == null) ** GOTO lbl11
        var4_3 = var1.b();
        var5_4 = new ArrayList();
        var6_5 = var4_3.size() != this.a.size() ? var2_2 : 0;
        var7_6 = var4_3.iterator();
        var3_7 = var6_5;
        ** GOTO lbl13
lbl11: // 2 sources:
        var3_7 = 0;
        ** GOTO lbl29
lbl13: // 2 sources:
        while (var7_6.hasNext()) {
            var8_8 = (String)var7_6.next();
            var9_11 = aef.b;
            var10_13 = this.b.c.a.flattenToShortString();
            var11_9 = (String)var9_11.d.get((Object)new pe((Object)var10_13, (Object)var8_8));
            var12_12 = aef.b.a(var11_9);
            if (var12_12 == null) ** GOTO lbl-1000
            var5_4.add((Object)var12_12);
            if (var3_7 == 0 && !this.a.contains((Object)var12_12)) {
                var13_10 = var2_2;
            } else lbl-1000: // 2 sources:
            {
                var13_10 = var3_7;
            }
            var3_7 = var13_10;
        }
        if (var3_7 != 0) {
            this.a = var5_4;
        }
lbl29: // 4 sources:
        if (var3_7 != 0) {
            return var2_2 | super.b(var1);
        }
        var2_2 = 0;
        return var2_2 | super.b(var1);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append('[');
        int n = this.a.size();
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.a.get(i));
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

