/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.drawable.Drawable
 *  android.support.v7.widget.ActionBarContainer
 */
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

public class aiv
extends Drawable {
    final ActionBarContainer a;

    public aiv(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas canvas) {
        if (this.a.e) {
            if (this.a.d == null) return;
            {
                this.a.d.draw(canvas);
                return;
            }
        } else {
            if (this.a.b != null) {
                this.a.b.draw(canvas);
            }
            if (this.a.c == null || !this.a.f) return;
            {
                this.a.c.draw(canvas);
                return;
            }
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int n) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}

