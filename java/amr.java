/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class amr
extends ViewGroup.MarginLayoutParams {
    public float g;
    public int h = -1;

    public amr(int n, int n2) {
        super(n, n2);
        this.g = 0.0f;
    }

    public amr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, ada.au);
        this.g = typedArray.getFloat(ada.aw, 0.0f);
        this.h = typedArray.getInt(ada.av, -1);
        typedArray.recycle();
    }

    public amr(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

