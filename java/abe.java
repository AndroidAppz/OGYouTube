/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.app.OverlayListView
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.List
 */
import android.support.v7.app.OverlayListView;
import android.view.animation.Animation;
import java.util.List;

final class abe
implements Animation.AnimationListener {
    private /* synthetic */ aas a;

    abe(aas aas2) {
        this.a = aas2;
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        OverlayListView overlayListView = this.a.n;
        for (aby aby2 : overlayListView.a) {
            if (aby2.k) continue;
            aby2.j = overlayListView.getDrawingTime();
            aby2.k = true;
        }
        this.a.n.postDelayed(this.a.Q, (long)this.a.L);
    }
}

