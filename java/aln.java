/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.RectF
 *  java.lang.Math
 *  java.lang.Object
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

final class aln
implements apc {
    private /* synthetic */ alm a;

    aln(alm alm2) {
        this.a = alm2;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
        float f3 = 2.0f * f2;
        float f4 = rectF.width() - f3 - 1.0f;
        float f5 = rectF.height() - f3 - 1.0f;
        if (f2 >= 1.0f) {
            float f6 = f2 + 0.5f;
            this.a.a.set(- f6, - f6, f6, f6);
            int n = canvas.save();
            canvas.translate(f6 + rectF.left, f6 + rectF.top);
            canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint);
            canvas.translate(f4, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint);
            canvas.translate(f5, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint);
            canvas.translate(f4, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint);
            canvas.restoreToCount(n);
            canvas.drawRect(f6 + rectF.left - 1.0f, rectF.top, 1.0f + (rectF.right - f6), f6 + rectF.top, paint);
            canvas.drawRect(f6 + rectF.left - 1.0f, 1.0f + (rectF.bottom - f6), 1.0f + (rectF.right - f6), rectF.bottom, paint);
        }
        canvas.drawRect(rectF.left, rectF.top + Math.max((float)0.0f, (float)(f2 - 1.0f)), rectF.right, 1.0f + (rectF.bottom - f2), paint);
    }
}

