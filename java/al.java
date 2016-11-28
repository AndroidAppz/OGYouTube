/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.StateSet
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Interpolator
 *  f
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 */
import android.content.Context;
import android.content.res.Resources;
import android.util.StateSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class al
extends au {
    boolean a;
    bc b;
    private int c;
    private bu k;

    public al(de de2, bd bd2) {
        super(de2);
        this.c = de2.getResources().getInteger(17694720);
        bu bu2 = this.k = new bu();
        View view = bu2.a();
        if (view != de2) {
            if (view != null) {
                View view2 = bu2.a();
                int n = bu2.a.size();
                for (int i = 0; i < n; ++i) {
                    Animation animation = ((bw)bu2.a.get((int)i)).b;
                    if (view2.getAnimation() != animation) continue;
                    view2.clearAnimation();
                }
                bu2.d = null;
                bu2.b = null;
                bu2.c = null;
            }
            if (de2 != null) {
                bu2.d = new WeakReference((Object)de2);
            }
        }
        this.k.a(f, super.a(new ap((al)this)));
        this.k.a(g, super.a(new ap((al)this)));
        this.k.a(h, super.a(new aq((al)this)));
    }

    private final Animation a(Animation animation) {
        animation.setInterpolator(f.b);
        animation.setDuration((long)this.c);
        return animation;
    }

    @Override
    final void a() {
    }

    @Override
    void a(aw aw2, boolean bl2) {
        if (this.a || this.i.getVisibility() != 0) {
            return;
        }
        Animation animation = AnimationUtils.loadAnimation((Context)this.i.getContext(), (int)2131034129);
        animation.setInterpolator(f.c);
        animation.setDuration(200);
        animation.setAnimationListener((Animation.AnimationListener)new am((al)this, false, aw2));
        this.i.startAnimation(animation);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    void a(int[] var1) {
        var2_2 = this.k;
        var3_3 = var2_2.a.size();
        for (var4_4 = 0; var4_4 < var3_3; ++var4_4) {
            var9_5 = (bw)var2_2.a.get(var4_4);
            if (!StateSet.stateSetMatches((int[])var9_5.a, (int[])var1)) continue;
            var5_6 = var9_5;
lbl7: // 2 sources:
            do {
                if (var5_6 == var2_2.b) return;
                if (var2_2.b != null && var2_2.c != null) {
                    var8_7 = var2_2.a();
                    if (var8_7 != null && var8_7.getAnimation() == var2_2.c) {
                        var8_7.clearAnimation();
                    }
                    var2_2.c = null;
                }
                var2_2.b = var5_6;
                var6_8 = (View)var2_2.d.get();
                if (var5_6 == null || var6_8 == null || var6_8.getVisibility() != 0) return;
                var2_2.c = var5_6.b;
                var7_9 = var2_2.a();
                if (var7_9 == null) return;
                var7_9.startAnimation(var2_2.c);
                return;
                break;
            } while (true);
        }
        var5_6 = null;
        ** while (true)
    }

    @Override
    final void b() {
    }

    @Override
    void b(aw aw2, boolean bl2) {
        if (this.i.getVisibility() != 0 || this.a) {
            this.i.clearAnimation();
            this.i.a(0, false);
            Animation animation = AnimationUtils.loadAnimation((Context)this.i.getContext(), (int)2131034128);
            animation.setDuration(200);
            animation.setInterpolator(f.d);
            animation.setAnimationListener((Animation.AnimationListener)new an(aw2));
            this.i.startAnimation(animation);
        }
    }

    @Override
    void c() {
        View view;
        bu bu2 = this.k;
        if (bu2.c != null && (view = bu2.a()) != null && view.getAnimation() == bu2.c) {
            view.clearAnimation();
        }
    }
}

