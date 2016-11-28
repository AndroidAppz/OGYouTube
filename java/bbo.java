/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NavigableMap
 *  java.util.Set
 *  java.util.TreeMap
 */
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public final class bbo
implements bbm {
    private static final Bitmap.Config[] a;
    private static final Bitmap.Config[] b;
    private static final Bitmap.Config[] c;
    private static final Bitmap.Config[] d;
    private final bbr e = new bbr();
    private final bbe f = new bbe();
    private final Map g = new HashMap();

    static {
        Bitmap.Config[] arrconfig = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null};
        a = arrconfig;
        Bitmap.Config[] arrconfig2 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        b = arrconfig2;
        Bitmap.Config[] arrconfig3 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        c = arrconfig3;
        Bitmap.Config[] arrconfig4 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
        d = arrconfig4;
    }

    static String a(int n, Bitmap.Config config) {
        String string = String.valueOf((Object)config);
        return new StringBuilder(15 + String.valueOf((Object)string).length()).append("[").append(n).append("](").append(string).append(")").toString();
    }

    private final NavigableMap a(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap)this.g.get((Object)config);
        if (navigableMap == null) {
            navigableMap = new TreeMap();
            this.g.put((Object)config, (Object)navigableMap);
        }
        return navigableMap;
    }

    private final void a(Integer n, Bitmap bitmap) {
        NavigableMap navigableMap = super.a(bitmap.getConfig());
        Integer n2 = (Integer)navigableMap.get((Object)n);
        if (n2 == null) {
            String string = String.valueOf((Object)n);
            String string2 = String.valueOf((Object)this.b(bitmap));
            String string3 = String.valueOf((Object)this);
            throw new NullPointerException(new StringBuilder(56 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append("Tried to decrement empty size, size: ").append(string).append(", removed: ").append(string2).append(", this: ").append(string3).toString());
        }
        if (n2 == 1) {
            navigableMap.remove((Object)n);
            return;
        }
        navigableMap.put((Object)n, (Object)(-1 + n2));
    }

    @Override
    public final Bitmap a() {
        Bitmap bitmap = (Bitmap)this.f.a();
        if (bitmap != null) {
            this.a(bln.a(bitmap), bitmap);
        }
        return bitmap;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final Bitmap a(int var1, int var2_3, Bitmap.Config var3_2) {
        var4_4 = 0;
        var5_5 = bln.a(var1, var2_3, var3_2);
        var6_6 = this.e.a(var5_5, var3_2);
        switch (bbp.a[var3_2.ordinal()]) {
            default: {
                var7_7 = new Bitmap.Config[]{var3_2};
                break;
            }
            case 1: {
                var7_7 = bbo.a;
                break;
            }
            case 2: {
                var7_7 = bbo.b;
                break;
            }
            case 3: {
                var7_7 = bbo.c;
                break;
            }
            case 4: {
                var7_7 = bbo.d;
            }
        }
        var8_8 = var7_7.length;
        while (var4_4 < var8_8) {
            var12_10 = var7_7[var4_4];
            var13_9 = (Integer)super.a(var12_10).ceilingKey((Object)var5_5);
            if (var13_9 != null && var13_9 <= var5_5 << 3) {
                if (var13_9 == var5_5 && !(var12_10 == null ? var3_2 != null : var12_10.equals((Object)var3_2) == false)) break;
                this.e.a(var6_6);
                var9_11 = this.e.a(var13_9, var12_10);
            } else {
                ++var4_4;
                continue;
            }
lbl30: // 2 sources:
            do {
                var10_12 = (Bitmap)this.f.a(var9_11);
                if (var10_12 == null) return var10_12;
                super.a(var9_11.a, var10_12);
                var11_13 = var10_12.getConfig() != null ? var10_12.getConfig() : Bitmap.Config.ARGB_8888;
                var10_12.reconfigure(var1, var2_3, var11_13);
                return var10_12;
                break;
            } while (true);
        }
        var9_11 = var6_6;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(Bitmap bitmap) {
        int n = bln.a(bitmap);
        bbq bbq2 = this.e.a(n, bitmap.getConfig());
        this.f.a(bbq2, (Object)bitmap);
        NavigableMap navigableMap = super.a(bitmap.getConfig());
        Integer n2 = (Integer)navigableMap.get((Object)bbq2.a);
        Integer n3 = bbq2.a;
        int n4 = n2 == null ? 1 : 1 + n2;
        navigableMap.put((Object)n3, (Object)n4);
    }

    @Override
    public final String b(int n, int n2, Bitmap.Config config) {
        return bbo.a(bln.a(n, n2, config), config);
    }

    @Override
    public final String b(Bitmap bitmap) {
        return bbo.a(bln.a(bitmap), bitmap.getConfig());
    }

    @Override
    public final int c(Bitmap bitmap) {
        return bln.a(bitmap);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SizeConfigStrategy{groupedMap=").append((Object)this.f).append(", sortedSizes=(");
        for (Map.Entry entry : this.g.entrySet()) {
            stringBuilder.append(entry.getKey()).append('[').append(entry.getValue()).append("], ");
        }
        if (!this.g.isEmpty()) {
            stringBuilder.replace(-2 + stringBuilder.length(), stringBuilder.length(), "");
        }
        return stringBuilder.append(")}").toString();
    }
}

