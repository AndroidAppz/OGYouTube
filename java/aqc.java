/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.SwitchCompat
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  java.lang.Object
 */
import android.support.v7.widget.SwitchCompat;
import android.view.animation.Animation;

public final class aqc
implements Animation.AnimationListener {
    private /* synthetic */ boolean a;
    private /* synthetic */ SwitchCompat b;

    public aqc(SwitchCompat switchCompat, boolean bl2) {
        this.b = switchCompat;
        this.a = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onAnimationEnd(Animation animation) {
        if (this.b.a == animation) {
            SwitchCompat switchCompat = this.b;
            float f2 = this.a ? 1.0f : 0.0f;
            switchCompat.a(f2);
            this.b.a = null;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

