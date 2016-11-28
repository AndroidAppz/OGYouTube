/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Object
 */
import android.view.animation.Interpolator;

public final class anv
implements Interpolator {
    public final float getInterpolation(float f2) {
        float f3 = f2 - 1.0f;
        return 1.0f + f3 * (f3 * (f3 * (f3 * f3)));
    }
}

