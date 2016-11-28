/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Transformation
 */
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

final class abc
extends Animation {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ View c;

    abc(int n, int n2, View view) {
        this.a = n;
        this.b = n2;
        this.c = view;
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        int n = this.a - (int)(f * (float)(this.a - this.b));
        aas.b(this.c, n);
    }
}

