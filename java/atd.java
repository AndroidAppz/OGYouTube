/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  java.lang.Math
 *  java.lang.Object
 */
import android.graphics.PointF;

public final class atd {
    public arn a = null;
    public asl b;
    public final boolean c;

    public atd(boolean bl2) {
        this.c = bl2;
        if (this.c) {
            this.b = asl.a();
        }
    }

    public static int[] a(int[] arrn, atc atc2) {
        int[] arrn2 = new int[]{(int)Math.ceil((double)(new PointF(atc2.b.x - atc2.a.x, atc2.b.y - atc2.a.y).length() * (float)arrn[0])), (int)Math.ceil((double)(new PointF(atc2.c.x - atc2.a.x, atc2.c.y - atc2.a.y).length() * (float)arrn[1]))};
        return arrn2;
    }
}

