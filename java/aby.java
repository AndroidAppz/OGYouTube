/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.drawable.BitmapDrawable
 *  android.view.animation.Interpolator
 *  java.lang.Object
 */
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

public final class aby {
    public BitmapDrawable a;
    public float b = 1.0f;
    public Rect c;
    public Interpolator d;
    public long e;
    public Rect f;
    public int g;
    public float h = 1.0f;
    public float i = 1.0f;
    public long j;
    public boolean k;
    public boolean l;
    public abz m;

    public aby(BitmapDrawable bitmapDrawable, Rect rect) {
        this.a = bitmapDrawable;
        this.f = rect;
        this.c = new Rect(rect);
        if (this.a != null && this.c != null) {
            this.a.setAlpha((int)(255.0f * this.b));
            this.a.setBounds(this.c);
        }
    }
}

