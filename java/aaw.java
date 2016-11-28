/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  java.lang.Object
 */
import android.view.animation.Animation;

final class aaw
implements Animation.AnimationListener {
    private /* synthetic */ aas a;

    aaw(aas aas2) {
        this.a = aas2;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.e(true);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

