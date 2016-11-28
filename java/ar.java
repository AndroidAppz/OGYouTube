/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.view.animation.Interpolator
 *  f
 *  rw
 */
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;

public class ar
extends al {
    boolean c;

    public ar(de de2, bd bd2) {
        super(de2, bd2);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    final void a(aw aw2, boolean bl2) {
        if (this.c) return;
        if (this.i.getVisibility() != 0) {
            return;
        }
        if (rw.v((View)this.i) && !this.i.isInEditMode()) {
            this.i.animate().cancel();
            this.i.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator((TimeInterpolator)f.c).setListener((Animator.AnimatorListener)new as((ar)this, false, aw2));
            return;
        }
        this.i.a(8, false);
        if (aw2 == null) return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final void b(aw aw2, boolean bl2) {
        if (!this.c && this.i.getVisibility() == 0) return;
        if (rw.v((View)this.i) && !this.i.isInEditMode()) {
            this.i.animate().cancel();
            if (this.i.getVisibility() != 0) {
                this.i.setAlpha(0.0f);
                this.i.setScaleY(0.0f);
                this.i.setScaleX(0.0f);
            }
            this.i.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator((TimeInterpolator)f.d).setListener((Animator.AnimatorListener)new at((ar)this, false, aw2));
            return;
        }
        this.i.a(0, false);
        this.i.setAlpha(1.0f);
        this.i.setScaleY(1.0f);
        this.i.setScaleX(1.0f);
    }

    @Override
    boolean d() {
        return true;
    }

    @Override
    final void e() {
        this.i.getRotation();
    }
}

