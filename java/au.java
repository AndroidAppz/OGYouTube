/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  java.lang.Object
 */
import android.graphics.Rect;
import android.view.ViewTreeObserver;

public abstract class au {
    static final int[] f = new int[]{16842919, 16842910};
    static final int[] g = new int[]{16842908, 16842910};
    static final int[] h = new int[0];
    float d;
    float e;
    public final de i;
    public ViewTreeObserver.OnPreDrawListener j;

    au(de de2) {
        new Rect();
        this.i = de2;
    }

    public abstract void a();

    public abstract void a(aw var1, boolean var2);

    public abstract void a(int[] var1);

    public abstract void b();

    public abstract void b(aw var1, boolean var2);

    public abstract void c();

    public boolean d() {
        return false;
    }

    void e() {
    }
}

