/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
final class ach {
    static ach a;
    public long b;
    public long c;
    public int d;

    ach() {
    }

    public final void a(long l, double d2, double d3) {
        float f = (float)(l - 946728000000L) / 8.64E7f;
        float f2 = 6.24006f + 0.01720197f * f;
        double d4 = 3.141592653589793 + (1.796593063 + ((double)f2 + 0.03341960161924362 * Math.sin((double)f2) + 3.4906598739326E-4 * Math.sin((double)(2.0f * f2)) + 5.236000106378924E-6 * Math.sin((double)(3.0f * f2))));
        double d5 = (- d3) / 360.0;
        double d6 = d5 + (double)(9.0E-4f + (float)Math.round((double)((double)(f - 9.0E-4f) - d5))) + 0.0053 * Math.sin((double)f2) + -0.0069 * Math.sin((double)(2.0 * d4));
        double d7 = Math.asin((double)(Math.sin((double)d4) * Math.sin((double)0.4092797040939331)));
        double d8 = 0.01745329238474369 * d2;
        double d9 = (Math.sin((double)-0.10471975803375244) - Math.sin((double)d8) * Math.sin((double)d7)) / (Math.cos((double)d8) * Math.cos((double)d7));
        if (d9 >= 1.0) {
            this.d = 1;
            this.b = -1;
            this.c = -1;
            return;
        }
        if (d9 <= -1.0) {
            this.d = 0;
            this.b = -1;
            this.c = -1;
            return;
        }
        float f3 = (float)(Math.acos((double)d9) / 6.283185307179586);
        this.b = 946728000000L + Math.round((double)(8.64E7 * (d6 + (double)f3)));
        this.c = 946728000000L + Math.round((double)(8.64E7 * (d6 - (double)f3)));
        if (this.c < l && this.b > l) {
            this.d = 0;
            return;
        }
        this.d = 1;
    }
}

