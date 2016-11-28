/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.util.Log
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class bgd
implements axu {
    private static axp a = axp.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    private static axp b = new axp("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, axp.a);

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    private static boolean a(bap var0_1, File var1, axs var2_2) {
        var3_3 = (Bitmap)var0_1.b();
        var4_4 = bli.a();
        var6_5 = (Bitmap.CompressFormat)var2_2.a(bgd.b);
        if (var6_5 != null) {
            var7_6 = var6_5;
lbl6: // 3 sources:
            do {
                var8_7 = (Integer)var2_2.a(bgd.a);
                var9_8 = new FileOutputStream(var1);
                var3_3.compress(var7_6, var8_7, (OutputStream)var9_8);
                var9_8.close();
                var11_9 = true;
                var9_8.close();
lbl16: // 5 sources:
                do {
                    if (Log.isLoggable((String)"BitmapEncoder", (int)2)) {
                        var13_10 = String.valueOf((Object)var7_6);
                        var14_11 = bln.a(var3_3);
                        var15_12 = bli.a(var4_4);
                        new StringBuilder(70 + String.valueOf((Object)var13_10).length()).append("Compressed with type: ").append(var13_10).append(" of size ").append(var14_11).append(" in ").append(var15_12);
                    }
                    return var11_9;
                    break;
                } while (true);
                break;
            } while (true);
        }
        if (!var3_3.hasAlpha()) ** GOTO lbl26
        var7_6 = Bitmap.CompressFormat.PNG;
        ** GOTO lbl6
lbl26: // 1 sources:
        var7_6 = Bitmap.CompressFormat.JPEG;
        ** while (true)
        catch (IOException var22_13) {
            var9_8 = null;
lbl30: // 2 sources:
            do {
                var11_9 = false;
                if (var9_8 == null) ** GOTO lbl16
                try {
                    var9_8.close();
                    var11_9 = false;
                }
                catch (IOException var12_14) {
                    var11_9 = false;
                }
                ** GOTO lbl16
                break;
            } while (true);
        }
        catch (Throwable var18_15) {
            var9_8 = null;
lbl42: // 2 sources:
            if (var9_8 != null) {
                var9_8.close();
            }
lbl45: // 4 sources:
            do {
                throw var18_16;
                break;
            } while (true);
        }
        catch (IOException var21_18) {
            ** continue;
        }
        {
            catch (IOException var19_19) {
                ** continue;
            }
        }
        catch (Throwable var18_17) {
            ** GOTO lbl42
        }
        catch (IOException var10_20) {
            ** continue;
        }
    }

    @Override
    public final axl a(axs axs2) {
        return axl.b;
    }
}

