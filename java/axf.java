/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
final class axf {
    static final /* synthetic */ int[] a;

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    static {
        axf.a = new int[avz.values().length];
        try {
            axf.a[avz.d.ordinal()] = 1;
        }
        catch (NoSuchFieldError var0_2) {
            ** continue;
        }
lbl6: // 2 sources:
        do {
            try {
                axf.a[avz.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError var1_1) {
                ** continue;
            }
lbl11: // 2 sources:
            do {
                try {
                    axf.a[avz.a.ordinal()] = 3;
                    return;
                }
                catch (NoSuchFieldError var2) {
                    return;
                }
                break;
            } while (true);
            break;
        } while (true);
    }
}

