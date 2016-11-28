/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.util.SparseBooleanArray
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 */
import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class adl {
    final Bitmap a;
    public int b = 16;
    private final List c = new ArrayList();
    private int d = 25600;
    private int e = -1;
    private final List f = new ArrayList();

    public adl(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        this.f.add((Object)adj.f);
        this.a = bitmap;
        this.c.add((Object)adq.a);
        this.c.add((Object)adq.b);
        this.c.add((Object)adq.c);
        this.c.add((Object)adq.d);
        this.c.add((Object)adq.e);
        this.c.add((Object)adq.f);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final adj a() {
        if (this.a != null) {
            var31_1 = this.a;
            var32_2 = -1.0;
            if (this.d > 0) {
                var42_3 = var31_1.getWidth() * var31_1.getHeight();
                if (var42_3 > this.d) {
                    var32_2 = (double)this.d / (double)var42_3;
                }
            } else if (this.e > 0 && (var34_4 = Math.max((int)var31_1.getWidth(), (int)var31_1.getHeight())) > this.e) {
                var32_2 = (double)this.e / (double)var34_4;
            }
            var35_5 = var32_2 <= 0.0 ? var31_1 : Bitmap.createScaledBitmap((Bitmap)var31_1, (int)((int)Math.ceil((double)(var32_2 * (double)var31_1.getWidth()))), (int)((int)Math.ceil((double)(var32_2 * (double)var31_1.getHeight()))), (boolean)false);
            var36_6 = var35_5.getWidth();
            var37_7 = var35_5.getHeight();
            var38_8 = new int[var36_6 * var37_7];
            var35_5.getPixels(var38_8, 0, var36_6, 0, 0, var36_6, var37_7);
            var39_9 = this.b;
            var40_10 = this.f.isEmpty() != false ? null : (adn[])this.f.toArray((Object[])new adn[this.f.size()]);
            var41_11 = new adg(var38_8, var39_9, var40_10);
            if (var35_5 != this.a) {
                var35_5.recycle();
            }
            var1_12 = var41_11.c;
        } else {
            var1_12 = null;
        }
        var2_13 = new adj(var1_12, this.c);
        var3_14 = var2_13.b.size();
        var4_15 = 0;
        do {
            if (var4_15 >= var3_14) {
                var2_13.d.clear();
                return var2_13;
            }
            var5_34 = (adq)var2_13.b.get(var4_15);
            var6_19 = var5_34.i.length;
            var7_26 = 0.0f;
            for (var8_28 = 0; var8_28 < var6_19; ++var8_28) {
                var30_29 = var5_34.i[var8_28];
                if (var30_29 <= 0.0f) continue;
                var7_26 += var30_29;
            }
            var9_37 = var2_13.c;
            var10_40 = 0.0f;
            var11_16 = null;
            var12_39 = var2_13.a.size();
            for (var13_31 = 0; var13_31 < var12_39; ++var13_31) {
                var15_18 = (adp)var2_13.a.get(var13_31);
                var16_25 = var15_18.a();
                var17_23 = var16_25[1] >= var5_34.g[0] && var16_25[1] <= var5_34.g[2] && var16_25[2] >= var5_34.h[0] && var16_25[2] <= var5_34.h[2] && var2_13.d.get(var15_18.a) == false;
                if (!var17_23) ** GOTO lbl-1000
                var19_32 = var15_18.a();
                var20_27 = var5_34.i[0] FCMPL 0.0f;
                var21_24 = 0.0f;
                if (var20_27 > 0) {
                    var21_24 = var5_34.i[0] * (1.0f - Math.abs((float)(var19_32[1] - var5_34.g[1])));
                }
                var22_33 = var5_34.i[1] FCMPL 0.0f;
                var23_21 = 0.0f;
                if (var22_33 > 0) {
                    var23_21 = var5_34.i[1] * (1.0f - Math.abs((float)(var19_32[2] - var5_34.h[1])));
                }
                var24_38 = var5_34.i[2] FCMPL 0.0f;
                var25_22 = 0.0f;
                if (var24_38 > 0) {
                    var25_22 = var5_34.i[2] * ((float)var15_18.b / (float)var2_13.e);
                }
                var26_20 = var25_22 + (var21_24 + var23_21);
                if (var11_16 == null || var26_20 > var10_40) {
                    var18_36 = var26_20;
                } else lbl-1000: // 2 sources:
                {
                    var15_18 = var11_16;
                    var18_36 = var10_40;
                }
                var10_40 = var18_36;
                var11_16 = var15_18;
            }
            if (var11_16 != null && var5_34.j) {
                var2_13.d.append(var11_16.a, true);
            }
            var9_37.put((Object)var5_34, (Object)var11_16);
            ++var4_15;
        } while (true);
    }
}

