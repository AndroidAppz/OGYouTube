/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.LinearGradient
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.RadialGradient
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Drawable
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.String
 */
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

final class apb
extends Drawable {
    static apc b;
    private static double f;
    final int a;
    float c;
    float d;
    boolean e = true;
    private Paint g;
    private Paint h;
    private Paint i;
    private RectF j;
    private Path k;
    private float l;
    private float m;
    private boolean n = true;
    private final int o;
    private final int p;
    private boolean q = false;

    static {
        f = Math.cos((double)Math.toRadians((double)45.0));
    }

    apb(Resources resources, int n, float f2, float f3, float f4) {
        float f5;
        this.o = resources.getColor(adc.d);
        this.p = resources.getColor(adc.c);
        this.a = resources.getDimensionPixelSize(add.a);
        this.g = new Paint(5);
        this.g.setColor(n);
        this.h = new Paint(5);
        this.h.setStyle(Paint.Style.FILL);
        this.c = (int)(f2 + 0.5f);
        this.j = new RectF();
        this.i = new Paint(this.h);
        this.i.setAntiAlias(false);
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f3 + ". Must be >= 0");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f4 + ". Must be >= 0");
        }
        float f6 = apb.a(f3);
        if (f6 > (f5 = (float)apb.a(f4))) {
            if (!this.q) {
                this.q = true;
            }
            f6 = f5;
        }
        if (this.m != f6 || this.d != f5) {
            this.m = f6;
            this.d = f5;
            this.l = (int)(0.5f + (f6 * 1.5f + (float)this.a));
            this.n = true;
            this.invalidateSelf();
        }
    }

    static float a(float f2, float f3, boolean bl2) {
        if (bl2) {
            return (float)((double)(1.5f * f2) + (1.0 - f) * (double)f3);
        }
        return 1.5f * f2;
    }

    private static int a(float f2) {
        int n = (int)(0.5f + f2);
        if (n % 2 == 1) {
            --n;
        }
        return n;
    }

    static float b(float f2, float f3, boolean bl2) {
        if (bl2) {
            f2 = (float)((double)f2 + (1.0 - f) * (double)f3);
        }
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void draw(Canvas canvas) {
        int n = 1;
        if (this.n) {
            Rect rect = this.getBounds();
            float f2 = 1.5f * this.d;
            this.j.set((float)rect.left + this.d, f2 + (float)rect.top, (float)rect.right - this.d, (float)rect.bottom - f2);
            RectF rectF = new RectF(- this.c, - this.c, this.c, this.c);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(- this.l, - this.l);
            if (this.k == null) {
                this.k = new Path();
            } else {
                this.k.reset();
            }
            this.k.setFillType(Path.FillType.EVEN_ODD);
            this.k.moveTo(- this.c, 0.0f);
            this.k.rLineTo(- this.l, 0.0f);
            this.k.arcTo(rectF2, 180.0f, 90.0f, false);
            this.k.arcTo(rectF, 270.0f, -90.0f, false);
            this.k.close();
            float f3 = this.c / (this.c + this.l);
            Paint paint = this.h;
            float f4 = this.c + this.l;
            int[] arrn = new int[3];
            arrn[0] = this.o;
            arrn[n] = this.o;
            arrn[2] = this.p;
            float[] arrf = new float[3];
            arrf[0] = 0.0f;
            arrf[n] = f3;
            arrf[2] = 1.0f;
            paint.setShader((Shader)new RadialGradient(0.0f, 0.0f, f4, arrn, arrf, Shader.TileMode.CLAMP));
            Paint paint2 = this.i;
            float f5 = - this.c + this.l;
            float f6 = - this.c - this.l;
            int[] arrn2 = new int[3];
            arrn2[0] = this.o;
            arrn2[n] = this.o;
            arrn2[2] = this.p;
            paint2.setShader((Shader)new LinearGradient(0.0f, f5, 0.0f, f6, arrn2, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.i.setAntiAlias(false);
            this.n = false;
        }
        canvas.translate(0.0f, this.m / 2.0f);
        float f7 = - this.c - this.l;
        float f8 = this.c + (float)this.a + this.m / 2.0f;
        int n2 = this.j.width() - f8 * 2.0f > 0.0f ? n : 0;
        if (this.j.height() - f8 * 2.0f <= 0.0f) {
            n = 0;
        }
        int n3 = canvas.save();
        canvas.translate(f8 + this.j.left, f8 + this.j.top);
        canvas.drawPath(this.k, this.h);
        if (n2 != 0) {
            canvas.drawRect(0.0f, f7, this.j.width() - f8 * 2.0f, - this.c, this.i);
        }
        canvas.restoreToCount(n3);
        int n4 = canvas.save();
        canvas.translate(this.j.right - f8, this.j.bottom - f8);
        canvas.rotate(180.0f);
        canvas.drawPath(this.k, this.h);
        if (n2 != 0) {
            canvas.drawRect(0.0f, f7, this.j.width() - f8 * 2.0f, - this.c + this.l, this.i);
        }
        canvas.restoreToCount(n4);
        int n5 = canvas.save();
        canvas.translate(f8 + this.j.left, this.j.bottom - f8);
        canvas.rotate(270.0f);
        canvas.drawPath(this.k, this.h);
        if (n != 0) {
            canvas.drawRect(0.0f, f7, this.j.height() - f8 * 2.0f, - this.c, this.i);
        }
        canvas.restoreToCount(n5);
        int n6 = canvas.save();
        canvas.translate(this.j.right - f8, f8 + this.j.top);
        canvas.rotate(90.0f);
        canvas.drawPath(this.k, this.h);
        if (n != 0) {
            canvas.drawRect(0.0f, f7, this.j.height() - f8 * 2.0f, - this.c, this.i);
        }
        canvas.restoreToCount(n6);
        canvas.translate(0.0f, (- this.m) / 2.0f);
        b.a(canvas, this.j, this.c, this.g);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean getPadding(Rect rect) {
        int n = (int)Math.ceil((double)apb.a(this.d, this.c, this.e));
        int n2 = (int)Math.ceil((double)apb.b(this.d, this.c, this.e));
        rect.set(n2, n, n2, n);
        return true;
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.n = true;
    }

    public final void setAlpha(int n) {
        this.g.setAlpha(n);
        this.h.setAlpha(n);
        this.i.setAlpha(n);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }
}

