/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public final class ajc
extends ViewGroup.MarginLayoutParams {
    public ajc() {
        super(-1, -1);
    }

    public ajc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ajc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

