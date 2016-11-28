/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Object
 */
import android.view.animation.Interpolator;

public final class aot {
    int a = 0;
    int b = 0;
    int c = Integer.MIN_VALUE;
    int d = -1;
    Interpolator e = null;
    boolean f = false;
    int g = 0;

    public aot() {
        this(0, 0);
    }

    private aot(int n, int n2) {
    }

    public final void a(int n, int n2, int n3, Interpolator interpolator) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.e = interpolator;
        this.f = true;
    }
}

