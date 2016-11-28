/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
public final class arx {
    private static asy e = new asy();
    final int a;
    final int b;
    private final int c;
    private final Class d;

    private arx(int n, int n2, int n3, Class class_) {
        this.a = n;
        this.b = n2;
        this.d = class_;
        this.c = n3;
    }

    public static arx a() {
        return arx.a(0, -1, 0, null);
    }

    public static arx a(int n) {
        return arx.a(301, 2, n, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static arx a(int n, int n2, int n3, Class class_) {
        String string = class_ != null ? class_.getName() : "0";
        String string2 = String.valueOf((Object)string);
        String string3 = new StringBuilder(36 + String.valueOf((Object)string2).length()).append(n).append(":").append(n2).append(":").append(n3).append(":").append(string2).toString();
        arx arx2 = (arx)e.get((Object)string3);
        if (arx2 != null) return arx2;
        arx2 = new arx(n, n2, n3, class_);
        e.put((Object)string3, (Object)arx2);
        return arx2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static arx a(arx var0_1, arx var1) {
        if (var0_1.a != 0) ** GOTO lbl4
        var3_2 = var1;
        ** GOTO lbl38
lbl4: // 1 sources:
        if (var1.a != 0) ** GOTO lbl7
        var3_2 = var0_1;
        ** GOTO lbl38
lbl7: // 1 sources:
        if (var0_1.a != 1 || var1.a != 1) ** GOTO lbl25
        var11_5 = Math.max((int)var0_1.b, (int)var1.b);
        var12_6 = var0_1.d;
        var13_7 = var1.d;
        if (var12_6 == null) {
            var12_6 = var13_7;
        } else if (var13_7 != null) {
            if (var12_6.isAssignableFrom(var13_7)) {
                var12_6 = var13_7;
            } else if (!var13_7.isAssignableFrom(var12_6)) {
                var12_6 = null;
            }
        }
        var14_8 = var12_6 != null || var0_1.d == null;
        var3_2 = null;
        if (!var14_8) ** GOTO lbl39
        var3_2 = arx.a(1, var11_5, 0, var12_6);
        ** GOTO lbl38
lbl25: // 1 sources:
        var2_9 = var0_1.b;
        var3_2 = null;
        if (var2_9 > 0) {
            var4_10 = var0_1.a;
            var5_11 = var1.a;
            var3_2 = null;
            if (var4_10 == var5_11) {
                var6_12 = var0_1.b;
                var7_13 = var1.b;
                var3_2 = null;
                if (var6_12 == var7_13) {
                    var8_14 = var0_1.c | var1.c;
                    var3_2 = arx.a(var0_1.a, var0_1.b, var8_14, null);
lbl38: // 4 sources:
                    if (var3_2 != null) return var3_2;
                }
            }
        }
lbl39: // 8 sources:
        var9_3 = String.valueOf((Object)var0_1);
        var10_4 = String.valueOf((Object)var1);
        throw new RuntimeException(new StringBuilder(40 + String.valueOf((Object)var9_3).length() + String.valueOf((Object)var10_4).length()).append("Incompatible types in connection: ").append(var9_3).append(" vs. ").append(var10_4).append("!").toString());
    }

    public static arx a(Class class_) {
        return arx.a(1, 0, 0, class_);
    }

    public static arx b() {
        return arx.a(1, 0, 0, null);
    }

    public final int c() {
        int n = 4;
        switch (this.a) {
            default: {
                n = 0;
            }
            case 102: 
            case 103: 
            case 200: 
            case 201: 
            case 301: {
                return n;
            }
            case 100: {
                return 1;
            }
            case 101: 
        }
        return 2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof arx;
        boolean bl3 = false;
        if (bl2) {
            arx arx2 = (arx)object;
            int n = this.a;
            int n2 = arx2.a;
            bl3 = false;
            if (n == n2) {
                int n3 = this.b;
                int n4 = arx2.b;
                bl3 = false;
                if (n3 == n4) {
                    int n5 = this.c;
                    int n6 = arx2.c;
                    bl3 = false;
                    if (n5 == n6) {
                        Class class_ = this.d;
                        Class class_2 = arx2.d;
                        bl3 = false;
                        if (class_ == class_2) {
                            bl3 = true;
                        }
                    }
                }
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return this.a ^ this.b ^ this.c ^ this.d.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        String string;
        int n = this.a;
        Class class_ = this.d;
        switch (n) {
            default: {
                string = "?";
                break;
            }
            case 100: {
                string = "int8";
                break;
            }
            case 101: {
                string = "int16";
                break;
            }
            case 102: {
                string = "int32";
                break;
            }
            case 103: {
                string = "int64";
                break;
            }
            case 200: {
                string = "float32";
                break;
            }
            case 201: {
                string = "float64";
                break;
            }
            case 301: {
                string = "rgba8888";
                break;
            }
            case 1: {
                String string2 = class_ == null ? "*" : class_.getSimpleName();
                string = new StringBuilder(2 + String.valueOf((Object)string2).length()).append("<").append(string2).append(">").toString();
                break;
            }
            case 0: {
                string = "*";
            }
        }
        String string3 = String.valueOf((Object)string);
        int n2 = this.b;
        String string4 = new StringBuilder(13 + String.valueOf((Object)string3).length()).append(string3).append("[").append(n2).append("]").toString();
        if ((1 & this.c) != 0) {
            string4 = String.valueOf((Object)string4).concat("(rcpu)");
        }
        if ((2 & this.c) != 0) {
            string4 = String.valueOf((Object)string4).concat("(rgpu)");
        }
        if ((4 & this.c) != 0) {
            string4 = String.valueOf((Object)string4).concat("(ralloc)");
        }
        if ((8 & this.c) != 0) {
            string4 = String.valueOf((Object)string4).concat("(wcpu)");
        }
        if ((16 & this.c) != 0) {
            string4 = String.valueOf((Object)string4).concat("(wgpu)");
        }
        if ((32 & this.c) == 0) return string4;
        return String.valueOf((Object)string4).concat("(walloc)");
    }
}

