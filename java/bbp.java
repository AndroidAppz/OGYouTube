/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
import android.graphics.Bitmap;

final class bbp {
    static final /* synthetic */ int[] a;

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    static {
        bbp.a = new int[Bitmap.Config.values().length];
        try {
            bbp.a[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        }
        catch (NoSuchFieldError var0_3) {
            ** continue;
        }
lbl6: // 2 sources:
        do {
            try {
                bbp.a[Bitmap.Config.RGB_565.ordinal()] = 2;
            }
            catch (NoSuchFieldError var1_2) {
                ** continue;
            }
lbl11: // 2 sources:
            do {
                try {
                    bbp.a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
                }
                catch (NoSuchFieldError var2_1) {
                    ** continue;
                }
lbl16: // 2 sources:
                do {
                    try {
                        bbp.a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
                        return;
                    }
                    catch (NoSuchFieldError var3) {
                        return;
                    }
                    break;
                } while (true);
                break;
            } while (true);
            break;
        } while (true);
    }
}

