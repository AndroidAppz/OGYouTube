/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.drawable.BitmapDrawable
 *  android.support.v7.app.OverlayListView
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationSet
 *  android.view.animation.Interpolator
 *  android.view.animation.TranslateAnimation
 *  java.lang.Object
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.OverlayListView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class abd
implements ViewTreeObserver.OnGlobalLayoutListener {
    private /* synthetic */ Map a;
    private /* synthetic */ Map b;
    private /* synthetic */ aas c;

    abd(aas aas2, Map map, Map map2) {
        this.c = aas2;
        this.a = map;
        this.b = map2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onGlobalLayout() {
        this.c.n.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        aas aas2 = this.c;
        Map map = this.a;
        Map map2 = this.b;
        if (aas2.q != null && aas2.r != null) {
            int n = aas2.q.size() - aas2.r.size();
            abe abe2 = new abe(aas2);
            int n2 = aas2.n.getFirstVisiblePosition();
            boolean bl2 = false;
            for (int i = 0; i < aas2.n.getChildCount(); ++i) {
                boolean bl3;
                View view = aas2.n.getChildAt(i);
                int n3 = n2 + i;
                aeu aeu2 = (aeu)aas2.o.getItem(n3);
                Rect rect = (Rect)map.get((Object)aeu2);
                int n4 = view.getTop();
                int n5 = rect != null ? rect.top : n4 + n * aas2.x;
                AnimationSet animationSet = new AnimationSet(true);
                if (aas2.q != null && aas2.q.contains((Object)aeu2)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration((long)aas2.M);
                    animationSet.addAnimation((Animation)alphaAnimation);
                    n5 = n4;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float)(n5 - n4), 0.0f);
                translateAnimation.setDuration((long)aas2.L);
                animationSet.addAnimation((Animation)translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(aas2.O);
                if (!bl2) {
                    bl3 = true;
                    animationSet.setAnimationListener((Animation.AnimationListener)abe2);
                } else {
                    bl3 = bl2;
                }
                view.clearAnimation();
                view.startAnimation((Animation)animationSet);
                map.remove((Object)aeu2);
                map2.remove((Object)aeu2);
                bl2 = bl3;
            }
            for (Map.Entry entry : map2.entrySet()) {
                aby aby2;
                aeu aeu3 = (aeu)entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)entry.getValue();
                Rect rect = (Rect)map.get((Object)aeu3);
                if (aas2.r.contains((Object)aeu3)) {
                    aby aby3 = new aby(bitmapDrawable, rect);
                    aby3.h = 1.0f;
                    aby3.i = 0.0f;
                    aby3.e = aas2.N;
                    aby3.d = aas2.O;
                    aby2 = aby3;
                } else {
                    int n6 = n * aas2.x;
                    aby aby4 = new aby(bitmapDrawable, rect);
                    aby4.g = n6;
                    aby4.e = aas2.L;
                    aby4.d = aas2.O;
                    aby4.m = new aau(aas2, aeu3);
                    aas2.s.add((Object)aeu3);
                    aby2 = aby4;
                }
                aas2.n.a.add((Object)aby2);
            }
        }
    }
}

