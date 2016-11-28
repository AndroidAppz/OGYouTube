/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.PointF
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.graphics.Matrix;
import android.graphics.PointF;

public class atc {
    public final PointF a;
    public final PointF b;
    public final PointF c;
    public final PointF d;

    public atc(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = new PointF(f2, f3);
        this.b = new PointF(f4, f5);
        this.c = new PointF(f6, f7);
        this.d = new PointF(f8, f9);
    }

    private atc(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
        this.d = pointF4;
    }

    public static Matrix a(atc atc2, atc atc3) {
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(atc2.b(), 0, atc3.b(), 0, 3);
        return matrix;
    }

    public static atc a() {
        return new atc(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public static atc a(float f2, float f3, float f4, float f5) {
        return new atc(new PointF(f2, f3), new PointF(f2 + f4, f3), new PointF(f2, f3 + f5), new PointF(f2 + f4, f3 + f5));
    }

    private final float[] b() {
        float[] arrf = new float[]{this.a.x, this.a.y, this.b.x, this.b.y, this.c.x, this.c.y, this.d.x, this.d.y};
        return arrf;
    }

    public String toString() {
        float f2 = this.a.x;
        float f3 = this.a.y;
        float f4 = this.b.x;
        float f5 = this.b.y;
        float f6 = this.c.x;
        float f7 = this.c.y;
        float f8 = this.d.x;
        float f9 = this.d.y;
        return new StringBuilder(140).append("Quad(").append(f2).append(", ").append(f3).append(", ").append(f4).append(", ").append(f5).append(", ").append(f6).append(", ").append(f7).append(", ").append(f8).append(", ").append(f9).append(")").toString();
    }
}

