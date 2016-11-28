/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v7.widget.RecyclerView
 *  android.util.Log
 *  android.view.View
 *  android.view.animation.Interpolator
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  rw
 *  wt
 *  xt
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class aov
implements Runnable {
    public int a;
    public int b;
    public xt c;
    public final /* synthetic */ RecyclerView d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    public aov(RecyclerView recyclerView) {
        this.d = recyclerView;
        this.e = RecyclerView.G;
        this.f = false;
        this.g = false;
        this.c = xt.a((Context)recyclerView.getContext(), (Interpolator)RecyclerView.G);
    }

    private void a(int n, int n2, int n3) {
        super.a(n, n2, n3, RecyclerView.G);
    }

    private void a(int n, int n2, int n3, Interpolator interpolator) {
        if (this.e != interpolator) {
            this.e = interpolator;
            this.c = xt.a((Context)this.d.getContext(), (Interpolator)interpolator);
        }
        this.d.a(2);
        this.b = 0;
        this.a = 0;
        this.c.a(0, 0, n, n2, n3);
        this.a();
    }

    public final void a() {
        if (this.f) {
            this.g = true;
            return;
        }
        this.d.removeCallbacks((Runnable)this);
        rw.a((View)this.d, (Runnable)this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n, int n2) {
        int n3;
        int n4;
        int n5 = Math.abs((int)n);
        boolean bl2 = n5 > (n3 = Math.abs((int)n2));
        int n6 = (int)Math.sqrt((double)0.0);
        int n7 = (int)Math.sqrt((double)(n * n + n2 * n2));
        int n8 = bl2 ? this.d.getWidth() : this.d.getHeight();
        int n9 = n8 / 2;
        float f2 = Math.min((float)1.0f, (float)(1.0f * (float)n7 / (float)n8));
        float f3 = (float)n9 + (float)n9 * (float)Math.sin((double)((float)(0.4712389167638204 * (double)(f2 - 0.5f))));
        if (n6 > 0) {
            n4 = 4 * Math.round((float)(1000.0f * Math.abs((float)(f3 / (float)n6))));
        } else {
            int n10 = bl2 ? n5 : n3;
            n4 = (int)(300.0f * (1.0f + (float)n10 / (float)n8));
        }
        super.a(n, n2, Math.min((int)n4, (int)2000));
    }

    public final void b() {
        this.d.removeCallbacks((Runnable)this);
        this.c.h();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void run() {
        if (this.d.i == null) {
            this.b();
            return;
        }
        this.g = false;
        this.f = true;
        this.d.a();
        var1_1 = this.c;
        var2_2 = this.d.i.h;
        if (!var1_1.g()) ** GOTO lbl257
        var15_3 = var1_1.b();
        var16_4 = var1_1.c();
        var17_5 = var15_3 - this.a;
        var18_6 = var16_4 - this.b;
        this.a = var15_3;
        this.b = var16_4;
        if (this.d.h == null) ** GOTO lbl203
        this.d.b();
        this.d.g();
        if (var17_5 != 0) {
            var36_7 = this.d.i.a(var17_5, this.d.c, this.d.z);
            var35_8 = var17_5 - var36_7;
        } else {
            var35_8 = 0;
            var36_7 = 0;
        }
        var19_9 = 0;
        var37_10 = 0;
        if (var18_6 != 0) {
            var37_10 = this.d.i.b(var18_6, this.d.c, this.d.z);
            var19_9 = var18_6 - var37_10;
        }
        this.d.k();
        this.d.h();
        this.d.a(false);
        if (var2_2 == null || var2_2.d || !var2_2.e) ** GOTO lbl199
        var39_11 = this.d.z.a();
        if (var39_11 != 0) ** GOTO lbl41
        var2_2.d();
        var21_12 = var37_10;
        var20_13 = var35_8;
        var22_14 = var36_7;
        ** GOTO lbl207
lbl41: // 1 sources:
        if (var2_2.a < var39_11) ** GOTO lbl123
        var2_2.a = var39_11 - 1;
        var54_29 = var17_5 - var35_8;
        var55_30 = var18_6 - var19_9;
        var56_31 = var2_2.b;
        if (!var2_2.e || var2_2.a == -1 || var56_31 == null) {
            var2_2.d();
        }
        var2_2.d = false;
        if (var2_2.f != null) {
            if (RecyclerView.c((View)var2_2.f) == var2_2.a) {
                var63_32 = var2_2.f;
                var2_2.a(var63_32, var2_2.g);
                var65_33 = var2_2.g;
                if (var65_33.d >= 0) {
                    var67_34 = var65_33.d;
                    var65_33.d = -1;
                    var56_31.c(var67_34);
                    var65_33.f = false;
                } else if (var65_33.f) {
                    if (var65_33.e != null && var65_33.c <= 0) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    if (var65_33.c <= 0) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    if (var65_33.e == null) {
                        if (var65_33.c == Integer.MIN_VALUE) {
                            var56_31.y.a(var65_33.a, var65_33.b);
                        } else {
                            var56_31.y.a(var65_33.a, var65_33.b, var65_33.c);
                        }
                    } else {
                        var56_31.y.a(var65_33.a, var65_33.b, var65_33.c, var65_33.e);
                    }
                    var65_33.g = 1 + var65_33.g;
                    if (var65_33.g > 10) {
                        Log.e((String)"RecyclerView", (String)"Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    var65_33.f = false;
                } else {
                    var65_33.g = 0;
                }
                var2_2.d();
            } else {
                Log.e((String)"RecyclerView", (String)"Passed over target position while smooth scrolling.");
                var2_2.f = null;
            }
        }
        if (!var2_2.e) ** GOTO lbl119
        var2_2.a(var54_29, var55_30, var2_2.g);
        var58_35 = var2_2.g.d >= 0;
        var59_36 = var2_2.g;
        if (var59_36.d >= 0) {
            var61_37 = var59_36.d;
            var59_36.d = -1;
            var56_31.c(var61_37);
            var59_36.f = false;
        } else if (var59_36.f) {
            if (var59_36.e != null && var59_36.c <= 0) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (var59_36.c <= 0) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            if (var59_36.e == null) {
                if (var59_36.c == Integer.MIN_VALUE) {
                    var56_31.y.a(var59_36.a, var59_36.b);
                } else {
                    var56_31.y.a(var59_36.a, var59_36.b, var59_36.c);
                }
            } else {
                var56_31.y.a(var59_36.a, var59_36.b, var59_36.c, var59_36.e);
            }
            var59_36.g = 1 + var59_36.g;
            if (var59_36.g > 10) {
                Log.e((String)"RecyclerView", (String)"Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            var59_36.f = false;
        } else {
            var59_36.g = 0;
        }
        if (!var58_35) ** GOTO lbl119
        if (var2_2.e) {
            var2_2.d = true;
            var56_31.y.a();
            var21_12 = var37_10;
            var20_13 = var35_8;
            var22_14 = var36_7;
        } else {
            var2_2.d();
lbl119: // 3 sources:
            var21_12 = var37_10;
            var20_13 = var35_8;
            var22_14 = var36_7;
        }
        ** GOTO lbl207
lbl123: // 1 sources:
        var40_38 = var17_5 - var35_8;
        var41_39 = var18_6 - var19_9;
        var42_40 = var2_2.b;
        if (!var2_2.e || var2_2.a == -1 || var42_40 == null) {
            var2_2.d();
        }
        var2_2.d = false;
        if (var2_2.f != null) {
            if (RecyclerView.c((View)var2_2.f) == var2_2.a) {
                var49_41 = var2_2.f;
                var2_2.a(var49_41, var2_2.g);
                var51_42 = var2_2.g;
                if (var51_42.d >= 0) {
                    var53_43 = var51_42.d;
                    var51_42.d = -1;
                    var42_40.c(var53_43);
                    var51_42.f = false;
                } else if (var51_42.f) {
                    if (var51_42.e != null && var51_42.c <= 0) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    if (var51_42.c <= 0) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    if (var51_42.e == null) {
                        if (var51_42.c == Integer.MIN_VALUE) {
                            var42_40.y.a(var51_42.a, var51_42.b);
                        } else {
                            var42_40.y.a(var51_42.a, var51_42.b, var51_42.c);
                        }
                    } else {
                        var42_40.y.a(var51_42.a, var51_42.b, var51_42.c, var51_42.e);
                    }
                    var51_42.g = 1 + var51_42.g;
                    if (var51_42.g > 10) {
                        Log.e((String)"RecyclerView", (String)"Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    var51_42.f = false;
                } else {
                    var51_42.g = 0;
                }
                var2_2.d();
            } else {
                Log.e((String)"RecyclerView", (String)"Passed over target position while smooth scrolling.");
                var2_2.f = null;
            }
        }
        if (!var2_2.e) ** GOTO lbl199
        var2_2.a(var40_38, var41_39, var2_2.g);
        var44_44 = var2_2.g.d >= 0;
        var45_45 = var2_2.g;
        if (var45_45.d >= 0) {
            var47_46 = var45_45.d;
            var45_45.d = -1;
            var42_40.c(var47_46);
            var45_45.f = false;
        } else if (var45_45.f) {
            if (var45_45.e != null && var45_45.c <= 0) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (var45_45.c <= 0) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            if (var45_45.e == null) {
                if (var45_45.c == Integer.MIN_VALUE) {
                    var42_40.y.a(var45_45.a, var45_45.b);
                } else {
                    var42_40.y.a(var45_45.a, var45_45.b, var45_45.c);
                }
            } else {
                var42_40.y.a(var45_45.a, var45_45.b, var45_45.c, var45_45.e);
            }
            var45_45.g = 1 + var45_45.g;
            if (var45_45.g > 10) {
                Log.e((String)"RecyclerView", (String)"Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            var45_45.f = false;
        } else {
            var45_45.g = 0;
        }
        if (!var44_44) ** GOTO lbl199
        if (var2_2.e) {
            var2_2.d = true;
            var42_40.y.a();
            var21_12 = var37_10;
            var20_13 = var35_8;
            var22_14 = var36_7;
        } else {
            var2_2.d();
lbl199: // 4 sources:
            var21_12 = var37_10;
            var20_13 = var35_8;
            var22_14 = var36_7;
        }
        ** GOTO lbl207
lbl203: // 1 sources:
        var19_9 = 0;
        var20_13 = 0;
        var21_12 = 0;
        var22_14 = 0;
lbl207: // 6 sources:
        if (!this.d.k.isEmpty()) {
            this.d.invalidate();
        }
        if (rw.a((View)this.d) != 2) {
            this.d.b(var17_5, var18_6);
        }
        if (var20_13 != 0 || var19_9 != 0) {
            var23_15 = (int)var1_1.f();
            if (var20_13 != var15_3) {
                var33_16 = var20_13 < 0 ? - var23_15 : (var20_13 > 0 ? var23_15 : 0);
                var24_17 = var33_16;
            } else {
                var24_17 = 0;
            }
            if (var19_9 != var16_4) {
                if (var19_9 < 0) {
                    var23_15 = - var23_15;
                } else if (var19_9 <= 0) {
                    var23_15 = 0;
                }
            } else {
                var23_15 = 0;
            }
            if (rw.a((View)this.d) != 2) {
                var28_18 = this.d;
                if (var24_17 < 0) {
                    var28_18.c();
                    var28_18.s.a(- var24_17);
                } else if (var24_17 > 0) {
                    var28_18.d();
                    var28_18.u.a(var24_17);
                }
                if (var23_15 < 0) {
                    var28_18.e();
                    var28_18.t.a(- var23_15);
                } else if (var23_15 > 0) {
                    var28_18.f();
                    var28_18.v.a(var23_15);
                }
                if (var24_17 != 0 || var23_15 != 0) {
                    rw.c((View)var28_18);
                }
            }
            if (!(var24_17 == 0 && var20_13 != var15_3 && var1_1.d() != 0 || var23_15 == 0 && var19_9 != var16_4 && var1_1.e() != 0)) {
                var1_1.h();
            }
        }
        if (var22_14 != 0 || var21_12 != 0) {
            this.d.d(var22_14, var21_12);
        }
        if (!RecyclerView.a((RecyclerView)this.d)) {
            this.d.invalidate();
        }
        var25_19 = var18_6 != 0 && this.d.i.j() != false && var21_12 == var18_6;
        var26_20 = var17_5 != 0 && this.d.i.i() != false && var22_14 == var17_5;
        var27_21 = var17_5 == 0 && (var18_6 == 0 || var26_20 != false) || var25_19 != false;
        if (var1_1.a() || !var27_21) {
            this.d.a(0);
        } else {
            this.a();
        }
lbl257: // 3 sources:
        if (var2_2 != null) {
            if (var2_2.d) {
                var3_22 = var2_2.b;
                if (!var2_2.e || var2_2.a == -1 || var3_22 == null) {
                    var2_2.d();
                }
                var2_2.d = false;
                if (var2_2.f != null) {
                    if (RecyclerView.c((View)var2_2.f) == var2_2.a) {
                        var10_23 = var2_2.f;
                        var2_2.a(var10_23, var2_2.g);
                        var12_24 = var2_2.g;
                        if (var12_24.d >= 0) {
                            var14_25 = var12_24.d;
                            var12_24.d = -1;
                            var3_22.c(var14_25);
                            var12_24.f = false;
                        } else if (var12_24.f) {
                            if (var12_24.e != null && var12_24.c <= 0) {
                                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                            }
                            if (var12_24.c <= 0) {
                                throw new IllegalStateException("Scroll duration must be a positive number");
                            }
                            if (var12_24.e == null) {
                                if (var12_24.c == Integer.MIN_VALUE) {
                                    var3_22.y.a(var12_24.a, var12_24.b);
                                } else {
                                    var3_22.y.a(var12_24.a, var12_24.b, var12_24.c);
                                }
                            } else {
                                var3_22.y.a(var12_24.a, var12_24.b, var12_24.c, var12_24.e);
                            }
                            var12_24.g = 1 + var12_24.g;
                            if (var12_24.g > 10) {
                                Log.e((String)"RecyclerView", (String)"Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            var12_24.f = false;
                        } else {
                            var12_24.g = 0;
                        }
                        var2_2.d();
                    } else {
                        Log.e((String)"RecyclerView", (String)"Passed over target position while smooth scrolling.");
                        var2_2.f = null;
                    }
                }
                if (var2_2.e) {
                    var2_2.a(0, 0, var2_2.g);
                    var5_26 = var2_2.g.d >= 0;
                    var6_27 = var2_2.g;
                    if (var6_27.d >= 0) {
                        var8_28 = var6_27.d;
                        var6_27.d = -1;
                        var3_22.c(var8_28);
                        var6_27.f = false;
                    } else if (var6_27.f) {
                        if (var6_27.e != null && var6_27.c <= 0) {
                            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                        }
                        if (var6_27.c <= 0) {
                            throw new IllegalStateException("Scroll duration must be a positive number");
                        }
                        if (var6_27.e == null) {
                            if (var6_27.c == Integer.MIN_VALUE) {
                                var3_22.y.a(var6_27.a, var6_27.b);
                            } else {
                                var3_22.y.a(var6_27.a, var6_27.b, var6_27.c);
                            }
                        } else {
                            var3_22.y.a(var6_27.a, var6_27.b, var6_27.c, var6_27.e);
                        }
                        var6_27.g = 1 + var6_27.g;
                        if (var6_27.g > 10) {
                            Log.e((String)"RecyclerView", (String)"Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        var6_27.f = false;
                    } else {
                        var6_27.g = 0;
                    }
                    if (var5_26) {
                        if (var2_2.e) {
                            var2_2.d = true;
                            var3_22.y.a();
                        } else {
                            var2_2.d();
                        }
                    }
                }
            }
            if (!this.g) {
                var2_2.d();
            }
        }
        this.f = false;
        if (this.g == false) return;
        this.a();
    }
}

