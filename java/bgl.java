/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Math
 */
final class bgl
extends bgk {
    bgl() {
    }

    @Override
    public final float a(int n, int n2, int n3, int n4) {
        int n5 = Math.min((int)(n2 / n4), (int)(n / n3));
        if (n5 == 0) {
            return 1.0f;
        }
        return 1.0f / (float)Integer.highestOneBit((int)n5);
    }

    @Override
    public final int a() {
        return bgr.b;
    }
}

