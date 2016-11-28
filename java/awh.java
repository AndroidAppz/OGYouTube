/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
import android.widget.ImageView;

public final class awh {
    public static final /* synthetic */ int[] a;
    private static /* synthetic */ int[] b;

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    static {
        awh.b = new int[avz.values().length];
        try {
            awh.b[avz.d.ordinal()] = 1;
        }
        catch (NoSuchFieldError var0_8) {
            ** continue;
        }
lbl6: // 2 sources:
        do {
            try {
                awh.b[avz.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError var1_7) {
                ** continue;
            }
lbl11: // 2 sources:
            do {
                try {
                    awh.b[avz.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError var2_6) {
                    ** continue;
                }
lbl16: // 2 sources:
                do {
                    try {
                        awh.b[avz.a.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError var3_5) {
                        ** continue;
                    }
lbl21: // 2 sources:
                    do {
                        awh.a = new int[ImageView.ScaleType.values().length];
                        try {
                            awh.a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError var4_4) {
                            ** continue;
                        }
lbl27: // 2 sources:
                        do {
                            try {
                                awh.a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError var5_3) {
                                ** continue;
                            }
lbl32: // 2 sources:
                            do {
                                try {
                                    awh.a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
                                }
                                catch (NoSuchFieldError var6_2) {
                                    ** continue;
                                }
lbl37: // 2 sources:
                                do {
                                    try {
                                        awh.a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
                                    }
                                    catch (NoSuchFieldError var7_1) {
                                        ** continue;
                                    }
lbl42: // 2 sources:
                                    do {
                                        try {
                                            awh.a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
                                            return;
                                        }
                                        catch (NoSuchFieldError var8) {
                                            return;
                                        }
                                        break;
                                    } while (true);
                                    break;
                                } while (true);
                                break;
                            } while (true);
                            break;
                        } while (true);
                        break;
                    } while (true);
                    break;
                } while (true);
                break;
            } while (true);
            break;
        } while (true);
    }
}

