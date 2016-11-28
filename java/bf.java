/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.design.widget.Snackbar
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  java.lang.Object
 */
import android.support.design.widget.Snackbar;
import android.view.animation.Animation;

public final class bf
implements Animation.AnimationListener {
    private /* synthetic */ int a;
    private /* synthetic */ Snackbar b;

    bf(Snackbar snackbar, int n) {
        this.b = snackbar;
        this.a = n;
    }

    public final void onAnimationEnd(Animation animation) {
        Snackbar.c();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

