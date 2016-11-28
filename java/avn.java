/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Map
 *  org.apache.http.impl.cookie.DateParseException
 *  org.apache.http.impl.cookie.DateUtils
 */
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public final class avn {
    private static long a(String string) {
        try {
            long l = DateUtils.parseDate((String)string).getTime();
            return l;
        }
        catch (DateParseException var1_2) {
            return 0;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static aud a(aun var0) {
        var1_1 = System.currentTimeMillis();
        var3_2 = var0.c;
        var4_3 = 0;
        var6_4 = 0;
        var8_5 = 0;
        var10_6 = (String)var3_2.get((Object)"Date");
        if (var10_6 != null) {
            var4_3 = avn.a(var10_6);
        }
        if ((var11_7 = (String)var3_2.get((Object)"Cache-Control")) == null) ** GOTO lbl68
        var26_8 = var11_7.split(",");
        var12_10 = false;
        var28_11 = var8_5;
        var30_12 = var6_4;
        block4 : for (var27_9 = 0; var27_9 < var26_8.length; ++var27_9) {
            var32_17 = var26_8[var27_9].trim();
            if (var32_17.equals((Object)"no-cache") || var32_17.equals((Object)"no-store")) {
                return null;
            }
            if (var32_17.startsWith("max-age=")) {
                var30_12 = var37_14 = Long.parseLong((String)var32_17.substring(8));
lbl21: // 6 sources:
                continue block4;
            }
            if (var32_17.startsWith("stale-while-revalidate=")) {
                var28_11 = var34_16 = Long.parseLong((String)var32_17.substring(23));
            }
            if (!var32_17.equals((Object)"must-revalidate") && !var32_17.equals((Object)"proxy-revalidate")) ** GOTO lbl21
            var12_10 = true;
            ** GOTO lbl21
        }
        var6_4 = var30_12;
        var8_5 = var28_11;
        var13_18 = true;
lbl33: // 2 sources:
        if ((var14_19 = (String)var3_2.get((Object)"Expires")) == null) ** GOTO lbl66
        var15_20 = avn.a(var14_19);
lbl35: // 2 sources:
        if ((var17_21 = (String)var3_2.get((Object)"Last-Modified")) == null) ** GOTO lbl64
        var18_22 = avn.a(var17_21);
lbl37: // 2 sources:
        var20_23 = (String)var3_2.get((Object)"ETag");
        if (!var13_18) ** GOTO lbl54
        var23_24 = var1_1 + 1000 * var6_4;
        if (var12_10) {
            var21_25 = var23_24;
lbl42: // 4 sources:
            do {
                var25_26 = new aud();
                var25_26.a = var0.b;
                var25_26.b = var20_23;
                var25_26.f = var23_24;
                var25_26.e = var21_25;
                var25_26.c = var4_3;
                var25_26.d = var18_22;
                var25_26.g = var3_2;
                return var25_26;
                break;
            } while (true);
        }
        var21_25 = var23_24 + 1000 * var8_5;
        ** GOTO lbl42
lbl54: // 1 sources:
        if (var4_3 <= 0 || var15_20 < var4_3) ** GOTO lbl61
        var23_24 = var21_25 = var1_1 + (var15_20 - var4_3);
        ** GOTO lbl42
        catch (Exception var33_13) {}
        ** GOTO lbl21
        catch (Exception var36_15) {
            ** continue;
        }
lbl61: // 1 sources:
        var21_25 = 0;
        var23_24 = 0;
        ** while (true)
lbl64: // 1 sources:
        var18_22 = 0;
        ** GOTO lbl37
lbl66: // 1 sources:
        var15_20 = 0;
        ** GOTO lbl35
lbl68: // 1 sources:
        var12_10 = false;
        var13_18 = false;
        ** GOTO lbl33
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(Map map, String string) {
        String string2 = (String)map.get((Object)"Content-Type");
        if (string2 == null) return string;
        String[] arrstring = string2.split(";");
        int n = 1;
        while (n < arrstring.length) {
            String[] arrstring2 = arrstring[n].trim().split("=");
            if (arrstring2.length == 2 && arrstring2[0].equals((Object)"charset")) {
                return arrstring2[1];
            }
            ++n;
        }
        return string;
    }
}

