/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class as
extends AnimatorListenerAdapter {
    private boolean a;
    private /* synthetic */ boolean b;
    private /* synthetic */ ar c;

    as(ar ar2, boolean bl2, aw aw2) {
        this.c = ar2;
        this.b = bl2;
    }

    public final void onAnimationCancel(Animator animator) {
        this.c.c = false;
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.c = false;
        if (!this.a) {
            this.c.i.a(8, this.b);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.c.c = true;
        this.a = false;
        this.c.i.a(0, this.b);
    }
}

