/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.CheckedTextView
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.TextView;

public final class akh
extends CheckedTextView {
    private static final int[] a = new int[]{16843016};
    private akj b;
    private alh c;

    public akh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private akh(Context context, AttributeSet attributeSet, byte by2) {
        super(aqf.a(context), attributeSet, 16843720);
        this.c = alh.a((TextView)this);
        this.c.a(attributeSet, 16843720);
        this.c.a();
        this.b = akj.a();
        aqi aqi2 = aqi.a(this.getContext(), attributeSet, a, 16843720);
        this.setCheckMarkDrawable(aqi2.a(0));
        aqi2.a.recycle();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.a();
        }
    }

    public final void setCheckMarkDrawable(int n) {
        if (this.b != null) {
            this.setCheckMarkDrawable(this.b.a(this.getContext(), n, false));
            return;
        }
        super.setCheckMarkDrawable(n);
    }

    public final void setTextAppearance(Context context, int n) {
        super.setTextAppearance(context, n);
        if (this.c != null) {
            this.c.a(context, n);
        }
    }
}

