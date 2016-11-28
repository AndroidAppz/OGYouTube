/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class at
extends AnimatorListenerAdapter {
    private /* synthetic */ boolean a;
    private /* synthetic */ ar b;

    at(ar ar2, boolean bl2, aw aw2) {
        this.b = ar2;
        this.a = bl2;
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.b.i.a(0, this.a);
    }
}

