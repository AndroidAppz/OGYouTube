/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 */
import android.view.animation.Animation;

final class am
extends g {
    private /* synthetic */ boolean a;
    private /* synthetic */ al b;

    am(al al2, boolean bl2, aw aw2) {
        this.b = al2;
        this.a = bl2;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        this.b.a = false;
        this.b.i.a(8, this.a);
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        this.b.a = true;
    }
}

