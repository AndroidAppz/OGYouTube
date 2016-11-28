/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 */
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class awx {
    private static final String k = awx.class.getSimpleName();
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public int[] e;
    public int f;
    public axa g;
    public awy h;
    public Bitmap i;
    public boolean j;
    private int[] l;
    private int m;
    private int n;
    private short[] o;
    private byte[] p;
    private byte[] q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;

    private awx(awy awy2) {
        this.m = 0;
        this.n = 0;
        this.h = awy2;
        this.g = new axa();
    }

    public awx(awy awy2, axa axa2, ByteBuffer byteBuffer, int n) {
        super(awy2);
        super.a(axa2, byteBuffer, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final Bitmap a(awz var1, awz var2_2) {
        var3_3 = this.e;
        if (var2_2 == null) {
            Arrays.fill((int[])var3_3, (int)0);
        }
        if (var2_2 != null && var2_2.g > 0) {
            if (var2_2.g == 2) {
                if (!var1.f) {
                    var90_4 = this.g.k;
                } else {
                    var89_5 = this.f;
                    var90_4 = 0;
                    if (var89_5 == 0) {
                        this.j = true;
                        var90_4 = 0;
                    }
                }
                Arrays.fill((int[])var3_3, (int)var90_4);
            } else if (var2_2.g == 3 && this.i != null) {
                this.i.getPixels(var3_3, 0, this.v, 0, 0, this.v, this.u);
            }
        }
        this.m = 0;
        this.n = 0;
        if (var1 != null) {
            this.a.position(var1.j);
        }
        var4_6 = var1 == null ? this.g.f * this.g.g : var1.c * var1.d;
        if (this.d == null || this.d.length < var4_6) {
            this.d = this.h.a(var4_6);
        }
        if (this.o == null) {
            this.o = new short[4096];
        }
        if (this.p == null) {
            this.p = new byte[4096];
        }
        if (this.q == null) {
            this.q = new byte[4097];
        }
        var5_7 = super.d();
        var6_8 = 1 << var5_7;
        var7_9 = var6_8 + 1;
        var8_10 = var6_8 + 2;
        var9_11 = -1;
        var10_12 = var5_7 + 1;
        var11_13 = -1 + (1 << var10_12);
        for (var12_14 = 0; var12_14 < var6_8; ++var12_14) {
            this.o[var12_14] = 0;
            this.p[var12_14] = (byte)var12_14;
        }
        var13_15 = 0;
        var14_16 = 0;
        var15_17 = 0;
        var16_18 = 0;
        var17_19 = 0;
        var18_20 = var10_12;
        var19_21 = var11_13;
        var20_22 = var8_10;
        var21_23 = 0;
        var22_24 = 0;
        var23_25 = 0;
        block6 : do {
            if (var14_16 >= var4_6) ** GOTO lbl59
            if (var22_24 == 0) {
                var22_24 = super.e();
                if (var22_24 <= 0) {
                    this.s = 3;
lbl59: // 3 sources:
                    for (var24_55 = var23_25; var24_55 < var4_6; ++var24_55) {
                        this.d[var24_55] = 0;
                    }
                    break;
                }
                var21_23 = 0;
            }
            var59_35 = var13_15 + ((255 & this.b[var21_23]) << var17_19);
            var60_45 = var17_19 + 8;
            var61_33 = var21_23 + 1;
            var62_43 = var22_24 - 1;
            var63_39 = var18_20;
            var64_30 = var19_21;
            var65_48 = var16_18;
            var66_38 = var59_35;
            var67_32 = var23_25;
            var68_41 = var20_22;
            var69_47 = var60_45;
            while (var69_47 >= var63_39) {
                var71_27 = var66_38 & var64_30;
                var72_26 = var66_38 >> var63_39;
                var69_47 -= var63_39;
                if (var71_27 == var6_8) {
                    var63_39 = var5_7 + 1;
                    var64_30 = -1 + (1 << var63_39);
                    var68_41 = var6_8 + 2;
                    var66_38 = var72_26;
                    var9_11 = -1;
                    continue;
                }
                if (var71_27 > var68_41) {
                    this.s = 3;
                    var16_18 = var65_48;
                    var17_19 = var69_47;
                    var18_20 = var63_39;
                    var20_22 = var68_41;
                    var21_23 = var61_33;
                    var23_25 = var67_32;
                    var13_15 = var72_26;
                    var19_21 = var64_30;
                    var22_24 = var62_43;
                    continue block6;
                }
                if (var71_27 != var7_9) {
                    if (var9_11 == -1) {
                        var86_36 = this.q;
                        var87_44 = var15_17 + 1;
                        var86_36[var15_17] = this.p[var71_27];
                        var15_17 = var87_44;
                        var65_48 = var71_27;
                        var9_11 = var71_27;
                        var66_38 = var72_26;
                        continue;
                    }
                    if (var71_27 >= var68_41) {
                        var84_31 = this.q;
                        var85_53 = var15_17 + 1;
                        var84_31[var15_17] = var65_48;
                        var15_17 = var85_53;
                        var73_52 = var9_11;
                    } else {
                        var73_52 = var71_27;
                    }
                    while (var73_52 >= var6_8) {
                        var82_28 = this.q;
                        var83_29 = var15_17 + 1;
                        var82_28[var15_17] = this.p[var73_52];
                        var73_52 = this.o[var73_52];
                        var15_17 = var83_29;
                    }
                    var65_48 = 255 & this.p[var73_52];
                    var74_54 = this.q;
                    var75_46 = var15_17 + 1;
                    var74_54[var15_17] = (byte)var65_48;
                    if (var68_41 < 4096) {
                        this.o[var68_41] = (short)var9_11;
                        this.p[var68_41] = (byte)var65_48;
                        if ((++var68_41 & var64_30) == 0 && var68_41 < 4096) {
                            ++var63_39;
                            var64_30 += var68_41;
                        }
                    }
                    var76_51 = var14_16;
                    var77_49 = var75_46;
                    while (var77_49 > 0) {
                        var79_40 = this.d;
                        var80_42 = var67_32 + 1;
                        var81_37 = this.q;
                        var79_40[var67_32] = var81_37[--var77_49];
                        ++var76_51;
                        var67_32 = var80_42;
                    }
                    var66_38 = var72_26;
                    var9_11 = var71_27;
                    var78_50 = var76_51;
                    var15_17 = var77_49;
                    var14_16 = var78_50;
                    continue;
                }
                var16_18 = var65_48;
                var17_19 = var69_47;
                var18_20 = var63_39;
                var20_22 = var68_41;
                var21_23 = var61_33;
                var23_25 = var67_32;
                var13_15 = var72_26;
                var19_21 = var64_30;
                var22_24 = var62_43;
                continue block6;
            }
            var16_18 = var65_48;
            var19_21 = var64_30;
            var22_24 = var62_43;
            var18_20 = var63_39;
            var21_23 = var61_33;
            var70_34 = var69_47;
            var20_22 = var68_41;
            var23_25 = var67_32;
            var13_15 = var66_38;
            var17_19 = var70_34;
        } while (true);
        var25_56 = var1.d / this.t;
        var26_57 = var1.b / this.t;
        var27_58 = var1.c / this.t;
        var28_59 = var1.a / this.t;
        var29_60 = 1;
        var30_61 = 8;
        var31_62 = 0;
        var32_63 = this.f == 0;
        var33_64 = 0;
        do {
            if (var33_64 >= var25_56) ** GOTO lbl198
            if (!var1.e) ** GOTO lbl205
            if (var31_62 >= var25_56) {
                switch (++var29_60) {
                    case 2: {
                        var31_62 = 4;
                        break;
                    }
                    case 3: {
                        var31_62 = 2;
                        var30_61 = 4;
                        break;
                    }
                    case 4: {
                        var31_62 = 1;
                        var30_61 = 2;
                    }
                }
            }
            var35_88 = var31_62 + var30_61;
            var36_67 = var30_61;
            var37_66 = var29_60;
            ** GOTO lbl209
lbl198: // 1 sources:
            if (this.r && (var1.g == 0 || var1.g == 1)) {
                if (this.i == null) {
                    this.i = super.f();
                }
                this.i.setPixels(var3_3, 0, this.v, 0, 0, this.v, this.u);
            }
            var34_89 = super.f();
            var34_89.setPixels(var3_3, 0, this.v, 0, 0, this.v, this.u);
            return var34_89;
lbl205: // 1 sources:
            var35_88 = var31_62;
            var36_67 = var30_61;
            var37_66 = var29_60;
            var31_62 = var33_64;
lbl209: // 2 sources:
            if ((var38_77 = var31_62 + var26_57) < this.u) {
                var39_87 = var38_77 * this.v;
                var40_78 = var39_87 + var28_59;
                var41_82 = var40_78 + var27_58;
                var42_69 = var39_87 + this.v < var41_82 ? var39_87 + this.v : var41_82;
                var43_74 = var33_64 * this.t * var1.c;
                var44_86 = var43_74 + (var42_69 - var40_78) * this.t;
                for (var45_79 = var40_78; var45_79 < var42_69; var43_74 += this.t, ++var45_79) {
                    var46_84 = var1.c;
                    var47_73 = 0;
                    var48_75 = 0;
                    var49_72 = 0;
                    var50_80 = 0;
                    var51_85 = 0;
                    for (var52_71 = var43_74; var52_71 < var43_74 + this.t && var52_71 < this.d.length && var52_71 < var44_86; ++var52_71) {
                        var57_76 = 255 & this.d[var52_71];
                        var58_83 = this.l[var57_76];
                        if (var58_83 == 0) continue;
                        var47_73 += var58_83 >>> 24;
                        var48_75 += 255 & var58_83 >> 16;
                        var49_72 += 255 & var58_83 >> 8;
                        var50_80 += var58_83 & 255;
                        ++var51_85;
                    }
                    for (var53_65 = var43_74 + var46_84; var53_65 < var43_74 + var46_84 + this.t && var53_65 < this.d.length && var53_65 < var44_86; ++var53_65) {
                        var55_70 = 255 & this.d[var53_65];
                        var56_81 = this.l[var55_70];
                        if (var56_81 == 0) continue;
                        var47_73 += var56_81 >>> 24;
                        var48_75 += 255 & var56_81 >> 16;
                        var49_72 += 255 & var56_81 >> 8;
                        var50_80 += var56_81 & 255;
                        ++var51_85;
                    }
                    var54_68 = var51_85 == 0 ? 0 : var47_73 / var51_85 << 24 | var48_75 / var51_85 << 16 | var49_72 / var51_85 << 8 | var50_80 / var51_85;
                    if (var54_68 != 0) {
                        var3_3[var45_79] = var54_68;
                        continue;
                    }
                    if (this.j || !var32_63) continue;
                    this.j = true;
                }
            }
            ++var33_64;
            var31_62 = var35_88;
            var30_61 = var36_67;
            var29_60 = var37_66;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a(axa axa2, ByteBuffer byteBuffer, int n) {
        void var9_4 = this;
        synchronized (var9_4) {
            if (n <= 0) {
                throw new IllegalArgumentException(new StringBuilder(41).append("Sample size must be >=0, not: ").append(n).toString());
            }
            int n2 = Integer.highestOneBit((int)n);
            this.s = 0;
            this.g = axa2;
            this.j = false;
            this.f = -1;
            this.a = byteBuffer.asReadOnlyBuffer();
            this.a.position(0);
            this.a.order(ByteOrder.LITTLE_ENDIAN);
            this.r = false;
            Iterator iterator = axa2.e.iterator();
            while (iterator.hasNext()) {
                if (((awz)iterator.next()).g != 3) continue;
                this.r = true;
                break;
            }
            this.t = n2;
            this.d = this.h.a(axa2.f * axa2.g);
            this.e = this.h.b(axa2.f / n2 * (axa2.g / n2));
            this.v = axa2.f / n2;
            this.u = axa2.g / n2;
            return;
        }
    }

    private final void c() {
        if (this.m > this.n) {
            return;
        }
        if (this.c == null) {
            this.c = this.h.a(16384);
        }
        this.n = 0;
        this.m = Math.min((int)this.a.remaining(), (int)16384);
        this.a.get(this.c, 0, this.m);
    }

    private final int d() {
        byte by2;
        try {
            this.c();
            byte[] arrby = this.c;
            int n = this.n;
            this.n = n + 1;
            by2 = arrby[n];
        }
        catch (Exception var1_4) {
            this.s = 1;
            return 0;
        }
        return by2 & 255;
    }

    /*
     * Exception decompiling
     */
    private final int e() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.util.ConcurrentModificationException
        // java.util.LinkedList$ReverseLinkIterator.next(LinkedList.java:217)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.extractLabelledBlocks(Block.java:212)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:485)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.transform(Op04StructuredStatement.java:639)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.insertLabelledBlocks(Op04StructuredStatement.java:649)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:816)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:220)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:165)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:91)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:354)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:751)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:683)
        // org.benf.cfr.reader.Main.doJar(Main.java:128)
        // com.njlabs.showjava.processor.JavaExtractor$1.run(JavaExtractor.java:100)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private final Bitmap f() {
        Bitmap.Config config = this.j ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        Bitmap bitmap = this.h.a(this.v, this.u, config);
        if (Build.VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
        return bitmap;
    }

    public final void a() {
        this.f = (1 + this.f) % this.g.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bitmap b() {
        awx awx2 = this;
        synchronized (awx2) {
            if (this.g.c <= 0 || this.f < 0) {
                if (Log.isLoggable((String)k, (int)3)) {
                    int n = this.g.c;
                    int n2 = this.f;
                    new StringBuilder(71).append("unable to decode frame, frameCount=").append(n).append(" framePointer=").append(n2);
                }
                this.s = 1;
            }
            if (this.s == 1 || this.s == 2) {
                if (!Log.isLoggable((String)k, (int)3)) return null;
                int n = this.s;
                new StringBuilder(42).append("Unable to decode frame, status=").append(n);
                return null;
            }
            this.s = 0;
            awz awz2 = (awz)this.g.e.get(this.f);
            int n = -1 + this.f;
            awz awz3 = n >= 0 ? (awz)this.g.e.get(n) : null;
            int n3 = this.g.k;
            if (awz2.k == null) {
                this.l = this.g.a;
            } else {
                this.l = awz2.k;
                if (this.g.j == awz2.h) {
                    this.g.k = 0;
                }
            }
            boolean bl2 = awz2.f;
            int n4 = 0;
            if (bl2) {
                int n5 = this.l[awz2.h];
                this.l[awz2.h] = 0;
                n4 = n5;
            }
            if (this.l == null) {
                this.s = 1;
                return null;
            }
            Bitmap bitmap = this.a(awz2, awz3);
            if (awz2.f) {
                this.l[awz2.h] = n4;
            }
            this.g.k = n3;
            return bitmap;
        }
    }
}

