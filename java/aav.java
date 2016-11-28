/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.app.OverlayListView
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  java.lang.Object
 *  java.util.Set
 */
import android.support.v7.app.OverlayListView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import java.util.Set;

final class aav
implements ViewTreeObserver.OnGlobalLayoutListener {
    private /* synthetic */ aas a;

    aav(aas aas2) {
        this.a = aas2;
    }

    public final void onGlobalLayout() {
        this.a.n.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        aas aas2 = this.a;
        if (aas2.q != null && aas2.q.size() != 0) {
            aaw aaw2 = new aaw(aas2);
            int n = aas2.n.getFirstVisiblePosition();
            boolean bl2 = false;
            for (int i = 0; i < aas2.n.getChildCount(); ++i) {
                View view = aas2.n.getChildAt(i);
                int n2 = n + i;
                aeu aeu2 = (aeu)aas2.o.getItem(n2);
                if (!aas2.q.contains((Object)aeu2)) continue;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long)aas2.M);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!bl2) {
                    alphaAnimation.setAnimationListener((Animation.AnimationListener)aaw2);
                    bl2 = true;
                }
                view.clearAnimation();
                view.startAnimation((Animation)alphaAnimation);
            }
        } else {
            aas2.e(true);
        }
    }
}

