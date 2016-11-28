/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bec
implements bdz {
    private final Map b;
    private volatile Map c;

    bec(Map map) {
        this.b = Collections.unmodifiableMap((Map)map);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Map a() {
        if (this.c != null) return this.c;
        var13_1 = this;
        // MONITORENTER : var13_1
        if (this.c != null) ** GOTO lbl10
        var2_2 = new HashMap();
        var3_3 = this.b.entrySet().iterator();
        block3 : do {
            if (!var3_3.hasNext()) {
                this.c = Collections.unmodifiableMap((Map)var2_2);
lbl10: // 2 sources:
                // MONITOREXIT : var13_1
                return this.c;
            }
            var4_7 = (Map.Entry)var3_3.next();
            var5_6 = new StringBuilder();
            var6_9 = (List)var4_7.getValue();
            var7_8 = var6_9.size();
            var8_4 = 0;
            do {
                if (var8_4 >= var7_8) ** GOTO lbl25
                var9_5 = ((beb)var6_9.get(var8_4)).a();
                if (TextUtils.isEmpty((CharSequence)var9_5)) ** GOTO lbl28
                var5_6.append(var9_5);
                if (var8_4 == -1 + var6_9.size()) ** GOTO lbl28
                var5_6.append(',');
                ** GOTO lbl28
lbl25: // 1 sources:
                if (TextUtils.isEmpty((CharSequence)var5_6.toString())) continue block3;
                var2_2.put((Object)((String)var4_7.getKey()), (Object)var5_6.toString());
                continue block3;
lbl28: // 3 sources:
                ++var8_4;
            } while (true);
            break;
        } while (true);
    }

    public final boolean equals(Object object) {
        if (object instanceof bec) {
            bec bec2 = (bec)object;
            return this.b.equals((Object)bec2.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String string = String.valueOf((Object)this.b);
        return new StringBuilder(21 + String.valueOf((Object)string).length()).append("LazyHeaders{headers=").append(string).append("}").toString();
    }
}

