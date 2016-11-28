/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Math
 */
final class bgm
extends bgk {
    bgm() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final float a(int n, int n2, int n3, int n4) {
        int n5 = 1;
        int n6 = (int)Math.ceil((double)Math.max((float)((float)n2 / (float)n4), (float)((float)n / (float)n3)));
        int n7 = Math.max((int)n5, (int)Integer.highestOneBit((int)n6));
        if (n7 < n6) {
            do {
                return 1.0f / (float)(n7 << n5);
                break;
            } while (true);
        }
        n5 = 0;
        return 1.0f / (float)(n7 << n5);
    }

    @Override
    public final int a() {
        return bgr.a;
    }
}

