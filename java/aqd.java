/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SwitchCompat
 *  android.view.animation.Animation
 *  android.view.animation.Transformation
 */
import android.support.v7.widget.SwitchCompat;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class aqd
extends Animation {
    private float a;
    private float b;
    private /* synthetic */ SwitchCompat c;

    public aqd(SwitchCompat switchCompat, float f2, float f3) {
        this.c = switchCompat;
        this.a = f2;
        this.b = f3 - f2;
    }

    protected final void applyTransformation(float f2, Transformation transformation) {
        this.c.a(this.a + f2 * this.b);
    }
}

