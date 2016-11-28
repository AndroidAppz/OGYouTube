/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  java.lang.Math
 */
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class apa
extends Drawable {
    float a;
    float b;
    boolean c = false;
    boolean d = true;
    private final Paint e;
    private final RectF f;
    private final Rect g;
    private PorterDuffColorFilter h;
    private ColorStateList i;
    private PorterDuff.Mode j;

    public apa(int n, float f2) {
        this.a = f2;
        this.e = new Paint(5);
        this.e.setColor(n);
        this.f = new RectF();
        this.g = new Rect();
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(this.getState(), 0), mode);
    }

    final void a(Rect rect) {
        if (rect == null) {
            rect = this.getBounds();
        }
        this.f.set((float)rect.left, (float)rect.top, (float)rect.right, (float)rect.bottom);
        this.g.set(rect);
        if (this.c) {
            float f2 = apb.a(this.b, this.a, this.d);
            float f3 = apb.b(this.b, this.a, this.d);
            this.g.inset((int)Math.ceil((double)f3), (int)Math.ceil((double)f2));
            this.f.set(this.g);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void draw(Canvas canvas) {
        boolean bl2;
        Paint paint = this.e;
        if (this.h != null && paint.getColorFilter() == null) {
            paint.setColorFilter((ColorFilter)this.h);
            bl2 = true;
        } else {
            bl2 = false;
        }
        canvas.drawRoundRect(this.f, this.a, this.a, paint);
        if (bl2) {
            paint.setColorFilter(null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.g, this.a);
    }

    public final boolean isStateful() {
        if (this.i != null && this.i.isStateful() || super.isStateful()) {
            return true;
        }
        return false;
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a(rect);
    }

    protected final boolean onStateChange(int[] arrn) {
        if (this.i != null && this.j != null) {
            this.h = super.a(this.i, this.j);
            return true;
        }
        return false;
    }

    public final void setAlpha(int n) {
        this.e.setAlpha(n);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        this.h = super.a(this.i, this.j);
        this.invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.j = mode;
        this.h = super.a(this.i, this.j);
        this.invalidateSelf();
    }
}

