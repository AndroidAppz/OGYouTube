/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.animation.AnimationUtils
 */
import android.content.Context;
import android.view.animation.AnimationUtils;

public final class ax
extends ar {
    public ax(de de2, bd bd2) {
        super(de2, bd2);
        if (!de2.isInEditMode()) {
            AnimationUtils.loadInterpolator((Context)this.i.getContext(), (int)17563661);
        }
    }

    @Override
    final void a(int[] arrn) {
    }

    @Override
    final void c() {
    }

    @Override
    final boolean d() {
        return false;
    }
}

