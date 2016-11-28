/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.RectF
 *  java.lang.Object
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

final class alq
implements apc {
    alq() {
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }
}

