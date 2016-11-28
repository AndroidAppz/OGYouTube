/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.ImageView
 *  it
 *  java.lang.Object
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class akq {
    private final ImageView a;
    private final akj b;

    public akq(ImageView imageView, akj akj2) {
        this.a = imageView;
        this.b = akj2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n) {
        if (n == 0) {
            this.a.setImageDrawable(null);
            return;
        }
        Drawable drawable = this.b != null ? this.b.a(this.a.getContext(), n, false) : it.a((Context)this.a.getContext(), (int)n);
        if (drawable != null) {
            amj.b(drawable);
        }
        this.a.setImageDrawable(drawable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(AttributeSet attributeSet, int n) {
        aqi aqi2 = aqi.a(this.a.getContext(), attributeSet, ada.N, n);
        try {
            Drawable drawable;
            Drawable drawable2;
            int n2;
            Drawable drawable3 = aqi2.b(ada.O);
            if (drawable3 != null) {
                this.a.setImageDrawable(drawable3);
            }
            if ((n2 = aqi2.e(ada.P, -1)) != -1 && (drawable2 = this.b.a(this.a.getContext(), n2, false)) != null) {
                this.a.setImageDrawable(drawable2);
            }
            if ((drawable = this.a.getDrawable()) != null) {
                amj.b(drawable);
            }
            return;
        }
        finally {
            aqi2.a.recycle();
        }
    }
}

