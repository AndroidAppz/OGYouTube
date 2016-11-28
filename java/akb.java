/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  pg
 *  ph
 */
import java.util.ArrayList;
import java.util.List;

public final class akb
implements anp {
    public final ArrayList a;
    public final ArrayList b;
    int c;
    private pg d;
    private akc e;
    private boolean f;
    private ano g;

    public akb(akc akc2) {
        super(akc2, 0);
    }

    private akb(akc akc2, byte by2) {
        this.d = new ph(30);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = 0;
        this.e = akc2;
        this.f = false;
        this.g = new ano((anp)this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final int a(int var1, int var2_2) {
        var4_4 = var1;
        for (var3_3 = -1 + this.b.size(); var3_3 >= 0; --var3_3) {
            var9_6 = (akd)this.b.get(var3_3);
            if (var9_6.a != 8) ** GOTO lbl38
            if (var9_6.b < var9_6.d) {
                var11_5 = var9_6.b;
                var12_7 = var9_6.d;
            } else {
                var11_5 = var9_6.d;
                var12_7 = var9_6.b;
            }
            if (var4_4 < var11_5 || var4_4 > var12_7) ** GOTO lbl27
            if (var11_5 == var9_6.b) {
                if (var2_2 == 1) {
                    var9_6.d = 1 + var9_6.d;
                } else if (var2_2 == 2) {
                    var9_6.d = -1 + var9_6.d;
                }
                var10_8 = var4_4 + 1;
            } else {
                if (var2_2 == 1) {
                    var9_6.b = 1 + var9_6.b;
                } else if (var2_2 == 2) {
                    var9_6.b = -1 + var9_6.b;
                }
                var10_8 = var4_4 - 1;
            }
            ** GOTO lbl52
lbl27: // 1 sources:
            if (var4_4 >= var9_6.b) ** GOTO lbl36
            if (var2_2 == 1) {
                var9_6.b = 1 + var9_6.b;
                var9_6.d = 1 + var9_6.d;
                var10_8 = var4_4;
            } else {
                if (var2_2 == 2) {
                    var9_6.b = -1 + var9_6.b;
                    var9_6.d = -1 + var9_6.d;
                }
lbl36: // 4 sources:
                var10_8 = var4_4;
            }
            ** GOTO lbl52
lbl38: // 1 sources:
            if (var9_6.b > var4_4) ** GOTO lbl45
            if (var9_6.a != 1) ** GOTO lbl42
            var10_8 = var4_4 - var9_6.d;
            ** GOTO lbl52
lbl42: // 1 sources:
            if (var9_6.a != 2) ** GOTO lbl51
            var10_8 = var4_4 + var9_6.d;
            ** GOTO lbl52
lbl45: // 1 sources:
            if (var2_2 == 1) {
                var9_6.b = 1 + var9_6.b;
                var10_8 = var4_4;
            } else {
                if (var2_2 == 2) {
                    var9_6.b = -1 + var9_6.b;
                }
lbl51: // 4 sources:
                var10_8 = var4_4;
            }
lbl52: // 8 sources:
            var4_4 = var10_8;
        }
        var5_9 = -1 + this.b.size();
        while (var5_9 >= 0) {
            var6_10 = (akd)this.b.get(var5_9);
            if (var6_10.a == 8) {
                if (var6_10.d == var6_10.b || var6_10.d < 0) {
                    this.b.remove(var5_9);
                    this.a(var6_10);
                }
            } else if (var6_10.d <= 0) {
                this.b.remove(var5_9);
                this.a(var6_10);
            }
            --var5_9;
        }
        return var4_4;
    }

    private final void a(akd akd2, int n) {
        this.e.a(akd2);
        switch (akd2.a) {
            default: {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            case 2: {
                this.e.a(n, akd2.d);
                return;
            }
            case 4: 
        }
        this.e.a(n, akd2.d, akd2.c);
    }

    private final void a(List list) {
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            this.a((akd)list.get(i));
        }
        list.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int b(int n, int n2) {
        int n3 = this.b.size();
        int n4 = n;
        while (n2 < n3) {
            akd akd2 = (akd)this.b.get(n2);
            if (akd2.a == 8) {
                if (akd2.b == n4) {
                    n4 = akd2.d;
                } else {
                    if (akd2.b < n4) {
                        --n4;
                    }
                    if (akd2.d <= n4) {
                        ++n4;
                    }
                }
            } else if (akd2.b <= n4) {
                if (akd2.a == 2) {
                    if (n4 < akd2.b + akd2.d) {
                        return -1;
                    }
                    n4 -= akd2.d;
                } else if (akd2.a == 1) {
                    n4 += akd2.d;
                }
            }
            ++n2;
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void b(akd akd2) {
        int n;
        if (akd2.a == 1 || akd2.a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int n2 = super.a(akd2.b, akd2.a);
        int n3 = akd2.b;
        switch (akd2.a) {
            default: {
                throw new IllegalArgumentException("op should be remove or update." + akd2);
            }
            case 4: {
                n = 1;
                break;
            }
            case 2: {
                n = 0;
                break;
            }
        }
        int n4 = 1;
        int n5 = n2;
        int n6 = n3;
        for (int i = 1; i < akd2.d; ++i) {
            boolean bl2;
            int n7 = super.a(akd2.b + n * i, akd2.a);
            switch (akd2.a) {
                default: {
                    bl2 = false;
                    break;
                }
                case 4: {
                    if (n7 == n5 + 1) {
                        bl2 = true;
                        break;
                    }
                    bl2 = false;
                    break;
                }
                case 2: {
                    bl2 = n7 == n5;
                }
            }
            if (bl2) {
                ++n4;
                continue;
            }
            akd akd3 = this.a(akd2.a, n5, n4, akd2.c);
            super.a(akd3, n6);
            this.a(akd3);
            if (akd2.a == 4) {
                n6 += n4;
            }
            n4 = 1;
            n5 = n7;
        }
        Object object = akd2.c;
        this.a(akd2);
        if (n4 > 0) {
            akd akd4 = this.a(akd2.a, n5, n4, object);
            super.a(akd4, n6);
            this.a(akd4);
        }
    }

    private final void c(akd akd2) {
        this.b.add((Object)akd2);
        switch (akd2.a) {
            default: {
                throw new IllegalArgumentException("Unknown update op type for " + akd2);
            }
            case 1: {
                this.e.c(akd2.b, akd2.d);
                return;
            }
            case 8: {
                this.e.d(akd2.b, akd2.d);
                return;
            }
            case 2: {
                this.e.b(akd2.b, akd2.d);
                return;
            }
            case 4: 
        }
        this.e.a(akd2.b, akd2.d, akd2.c);
    }

    private final boolean c(int n) {
        int n2 = this.b.size();
        for (int i = 0; i < n2; ++i) {
            akd akd2 = (akd)this.b.get(i);
            if (akd2.a == 8) {
                if (super.b(akd2.d, i + 1) != n) continue;
                return true;
            }
            if (akd2.a != 1) continue;
            int n3 = akd2.b + akd2.d;
            for (int j = akd2.b; j < n3; ++j) {
                if (super.b(j, i + 1) != n) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public final akd a(int n, int n2, int n3, Object object) {
        akd akd2 = (akd)this.d.a();
        if (akd2 == null) {
            return new akd(n, n2, n3, object);
        }
        akd2.a = n;
        akd2.b = n2;
        akd2.d = n3;
        akd2.c = object;
        return akd2;
    }

    public final void a() {
        this.a((List)this.a);
        this.a((List)this.b);
        this.c = 0;
    }

    @Override
    public final void a(akd akd2) {
        akd2.c = null;
        this.d.a((Object)akd2);
    }

    public final boolean a(int n) {
        if ((n & this.c) != 0) {
            return true;
        }
        return false;
    }

    final int b(int n) {
        return super.b(n, 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void b() {
        var1_1 = this.g;
        var2_2 = this.a;
        block11 : do {
            var3_24 = false;
            var4_26 = -1 + var2_2.size();
            do {
                if (var4_26 < 0) ** GOTO lbl14
                if (((akd)var2_2.get((int)var4_26)).a != 8) ** GOTO lbl12
                if (!var3_24) ** GOTO lbl151
                var5_23 = var4_26;
                ** GOTO lbl15
lbl12: // 1 sources:
                var71_7 = true;
                ** GOTO lbl152
lbl14: // 1 sources:
                var5_23 = -1;
lbl15: // 2 sources:
                if (var5_23 != -1) {
                    var33_4 = var5_23 + 1;
                    var34_27 = (akd)var2_2.get(var5_23);
                    var35_31 = (akd)var2_2.get(var33_4);
                    switch (var35_31.a) {
                        default: {
                            continue block11;
                        }
                        case 1: {
                            var66_32 = var34_27.d;
                            var67_20 = var35_31.b;
                            var68_3 = 0;
                            if (var66_32 < var67_20) {
                                var68_3 = -1;
                            }
                            if (var34_27.b < var35_31.b) {
                                ++var68_3;
                            }
                            if (var35_31.b <= var34_27.b) {
                                var34_27.b += var35_31.d;
                            }
                            if (var35_31.b <= var34_27.d) {
                                var34_27.d += var35_31.d;
                            }
                            var35_31.b = var68_3 + var35_31.b;
                            var2_2.set(var5_23, (Object)var35_31);
                            var2_2.set(var33_4, (Object)var34_27);
                            continue block11;
                        }
                        case 2: {
                            var46_16 = null;
                            if (var34_27.b < var34_27.d) {
                                var62_8 = var35_31.b;
                                var63_33 = var34_27.b;
                                var47_22 = false;
                                var50_9 = false;
                                if (var62_8 == var63_33) {
                                    var64_18 = var35_31.d;
                                    var65_21 = var34_27.d - var34_27.b;
                                    var47_22 = false;
                                    var50_9 = false;
                                    if (var64_18 == var65_21) {
                                        var50_9 = true;
                                    }
                                }
                            } else {
                                var47_22 = true;
                                var48_25 = var35_31.b;
                                var49_19 = 1 + var34_27.d;
                                var50_9 = false;
                                if (var48_25 == var49_19) {
                                    var51_17 = var35_31.d;
                                    var52_15 = var34_27.b - var34_27.d;
                                    var50_9 = false;
                                    if (var51_17 == var52_15) {
                                        var50_9 = true;
                                    }
                                }
                            }
                            if (var34_27.d < var35_31.b) {
                                var35_31.b = -1 + var35_31.b;
                            } else if (var34_27.d < var35_31.b + var35_31.d) {
                                var35_31.d = -1 + var35_31.d;
                                var34_27.a = 2;
                                var34_27.d = 1;
                                if (var35_31.d != 0) continue block11;
                                var2_2.remove(var33_4);
                                var1_1.a.a(var35_31);
                                continue block11;
                            }
                            if (var34_27.b <= var35_31.b) {
                                var35_31.b = 1 + var35_31.b;
                            } else {
                                var54_12 = var34_27.b;
                                var55_14 = var35_31.b + var35_31.d;
                                var46_16 = null;
                                if (var54_12 < var55_14) {
                                    var56_10 = var35_31.b + var35_31.d - var34_27.b;
                                    var46_16 = var1_1.a.a(2, 1 + var34_27.b, var56_10, null);
                                    var35_31.d = var34_27.b - var35_31.b;
                                }
                            }
                            if (var50_9) {
                                var2_2.set(var5_23, (Object)var35_31);
                                var2_2.remove(var33_4);
                                var1_1.a.a(var34_27);
                                continue block11;
                            }
                            if (var47_22) {
                                if (var46_16 != null) {
                                    if (var34_27.b > var46_16.b) {
                                        var34_27.b -= var46_16.d;
                                    }
                                    if (var34_27.d > var46_16.b) {
                                        var34_27.d -= var46_16.d;
                                    }
                                }
                                if (var34_27.b > var35_31.b) {
                                    var34_27.b -= var35_31.d;
                                }
                                if (var34_27.d > var35_31.b) {
                                    var34_27.d -= var35_31.d;
                                }
                            } else {
                                if (var46_16 != null) {
                                    if (var34_27.b >= var46_16.b) {
                                        var34_27.b -= var46_16.d;
                                    }
                                    if (var34_27.d >= var46_16.b) {
                                        var34_27.d -= var46_16.d;
                                    }
                                }
                                if (var34_27.b >= var35_31.b) {
                                    var34_27.b -= var35_31.d;
                                }
                                if (var34_27.d >= var35_31.b) {
                                    var34_27.d -= var35_31.d;
                                }
                            }
                            var2_2.set(var5_23, (Object)var35_31);
                            if (var34_27.b != var34_27.d) {
                                var2_2.set(var33_4, (Object)var34_27);
                            } else {
                                var2_2.remove(var33_4);
                            }
                            if (var46_16 == null) continue block11;
                            var2_2.add(var5_23, (Object)var46_16);
                            continue block11;
                        }
                        case 4: 
                    }
                    var36_6 = null;
                    var37_5 = null;
                    if (var34_27.d < var35_31.b) {
                        var35_31.b = -1 + var35_31.b;
                    } else {
                        var38_29 = var34_27.d;
                        var39_28 = var35_31.b + var35_31.d;
                        var36_6 = null;
                        if (var38_29 < var39_28) {
                            var35_31.d = -1 + var35_31.d;
                            var36_6 = var1_1.a.a(4, var34_27.b, 1, var35_31.c);
                        }
                    }
                    if (var34_27.b <= var35_31.b) {
                        var35_31.b = 1 + var35_31.b;
                    } else {
                        var40_30 = var34_27.b;
                        var41_11 = var35_31.b + var35_31.d;
                        var37_5 = null;
                        if (var40_30 < var41_11) {
                            var42_13 = var35_31.b + var35_31.d - var34_27.b;
                            var37_5 = var1_1.a.a(4, 1 + var34_27.b, var42_13, var35_31.c);
                            var35_31.d -= var42_13;
                        }
                    }
                    var2_2.set(var33_4, (Object)var34_27);
                    if (var35_31.d > 0) {
                        var2_2.set(var5_23, (Object)var35_31);
                    } else {
                        var2_2.remove(var5_23);
                        var1_1.a.a(var35_31);
                    }
                    if (var36_6 != null) {
                        var2_2.add(var5_23, (Object)var36_6);
                    }
                    if (var37_5 == null) continue block11;
                    var2_2.add(var5_23, (Object)var37_5);
                    continue block11;
                }
                break block11;
lbl151: // 1 sources:
                var71_7 = var3_24;
lbl152: // 2 sources:
                --var4_26;
                var3_24 = var71_7;
            } while (true);
            break;
        } while (true);
        var6_34 = this.a.size();
        var7_35 = 0;
        do {
            if (var7_35 >= var6_34) {
                this.a.clear();
                return;
            }
            var8_57 = (akd)this.a.get(var7_35);
            switch (var8_57.a) {
                case 1: {
                    this.c(var8_57);
                    ** break;
                }
                case 2: {
                    var21_39 = var8_57.b;
                    var22_58 = var8_57.b + var8_57.d;
                    var23_37 = -1;
                    var24_47 = var8_57.b;
                    var25_53 = 0;
                    while (var24_47 < var22_58) {
                        if (this.e.a(var24_47) != null || this.c(var24_47)) {
                            var26_52 = false;
                            if (var23_37 == 0) {
                                this.b(this.a(2, var21_39, var25_53, null));
                                var26_52 = true;
                            }
                            var23_37 = 1;
                        } else {
                            var26_52 = false;
                            if (var23_37 == 1) {
                                this.c(this.a(2, var21_39, var25_53, null));
                                var26_52 = true;
                            }
                            var23_37 = 0;
                        }
                        if (var26_52) {
                            var31_48 = var24_47 - var25_53;
                            var29_41 = var22_58 - var25_53;
                            var30_40 = 1;
                        } else {
                            var27_44 = var25_53 + 1;
                            var28_50 = var24_47;
                            var29_41 = var22_58;
                            var30_40 = var27_44;
                            var31_48 = var28_50;
                        }
                        var32_45 = var31_48 + 1;
                        var25_53 = var30_40;
                        var22_58 = var29_41;
                        var24_47 = var32_45;
                    }
                    if (var25_53 != var8_57.d) {
                        this.a(var8_57);
                        var8_57 = this.a(2, var21_39, var25_53, null);
                    }
                    if (var23_37 == 0) {
                        this.b(var8_57);
                        ** break;
                    }
                    this.c(var8_57);
                    ** break;
                }
                case 4: {
                    var9_46 = var8_57.b;
                    var10_60 = var8_57.b + var8_57.d;
                    var12_49 = 0;
                    var13_42 = var9_46;
                    var14_54 = -1;
                    for (var11_36 = var8_57.b; var11_36 < var10_60; ++var11_36) {
                        if (this.e.a(var11_36) != null || this.c(var11_36)) {
                            if (var14_54 == 0) {
                                this.b(this.a(4, var13_42, var12_49, var8_57.c));
                                var12_49 = 0;
                                var13_42 = var11_36;
                            }
                            var16_55 = var13_42;
                            var17_38 = var12_49;
                            var18_59 = 1;
                        } else {
                            if (var14_54 == 1) {
                                this.c(this.a(4, var13_42, var12_49, var8_57.c));
                                var12_49 = 0;
                                var13_42 = var11_36;
                            }
                            var16_55 = var13_42;
                            var17_38 = var12_49;
                            var18_59 = 0;
                        }
                        var19_43 = var17_38 + 1;
                        var20_56 = var18_59;
                        var12_49 = var19_43;
                        var13_42 = var16_55;
                        var14_54 = var20_56;
                    }
                    if (var12_49 != var8_57.d) {
                        var15_51 = var8_57.c;
                        this.a(var8_57);
                        var8_57 = this.a(4, var13_42, var12_49, var15_51);
                    }
                    if (var14_54 == 0) {
                        this.b(var8_57);
                        ** break;
                    }
                    this.c(var8_57);
                }
lbl245: // 6 sources:
                default: {
                    ** GOTO lbl249
                }
                case 8: 
            }
            this.c(var8_57);
lbl249: // 2 sources:
            ++var7_35;
        } while (true);
    }

    public final void c() {
        int n = this.b.size();
        for (int i = 0; i < n; ++i) {
            this.e.b((akd)this.b.get(i));
        }
        this.a((List)this.b);
        this.c = 0;
    }

    public final boolean d() {
        if (this.a.size() > 0) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void e() {
        this.c();
        var1_1 = this.a.size();
        var2_2 = 0;
        do {
            if (var2_2 >= var1_1) {
                this.a((List)this.a);
                this.c = 0;
                return;
            }
            var3_3 = (akd)this.a.get(var2_2);
            switch (var3_3.a) {
                case 1: {
                    this.e.b(var3_3);
                    this.e.c(var3_3.b, var3_3.d);
                    ** break;
                }
                case 2: {
                    this.e.b(var3_3);
                    this.e.a(var3_3.b, var3_3.d);
                    ** break;
                }
                case 4: {
                    this.e.b(var3_3);
                    this.e.a(var3_3.b, var3_3.d, var3_3.c);
                }
lbl22: // 4 sources:
                default: {
                    ** GOTO lbl27
                }
                case 8: 
            }
            this.e.b(var3_3);
            this.e.d(var3_3.b, var3_3.d);
lbl27: // 2 sources:
            ++var2_2;
        } while (true);
    }
}

