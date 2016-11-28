/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

final class ali
extends alh {
    private static final int[] b = new int[]{16843666, 16843667};
    private aqg c;
    private aqg d;

    ali(TextView textView) {
        super(textView);
    }

    @Override
    final void a() {
        super.a();
        if (this.c != null || this.d != null) {
            Drawable[] arrdrawable = this.a.getCompoundDrawablesRelative();
            this.a(arrdrawable[0], this.c);
            this.a(arrdrawable[2], this.d);
        }
    }

    @Override
    final void a(AttributeSet attributeSet, int n) {
        super.a(attributeSet, n);
        Context context = this.a.getContext();
        akj akj2 = akj.a();
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, b, n, 0);
        if (typedArray.hasValue(0)) {
            this.c = ali.a(context, akj2, typedArray.getResourceId(0, 0));
        }
        if (typedArray.hasValue(1)) {
            this.d = ali.a(context, akj2, typedArray.getResourceId(1, 0));
        }
        typedArray.recycle();
    }
}

