/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

final class ann
extends adr {
    boolean a = true;

    public ann(Drawable drawable) {
        super(drawable);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.a) {
            super.draw(canvas);
        }
    }

    @Override
    public final void setHotspot(float f2, float f3) {
        if (this.a) {
            super.setHotspot(f2, f3);
        }
    }

    @Override
    public final void setHotspotBounds(int n, int n2, int n3, int n4) {
        if (this.a) {
            super.setHotspotBounds(n, n2, n3, n4);
        }
    }

    @Override
    public final boolean setState(int[] arrn) {
        if (this.a) {
            return super.setState(arrn);
        }
        return false;
    }

    @Override
    public final boolean setVisible(boolean bl2, boolean bl3) {
        if (this.a) {
            return super.setVisible(bl2, bl3);
        }
        return false;
    }
}

