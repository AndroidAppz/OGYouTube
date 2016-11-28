/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  yu
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public final class aqn
extends yu {
    public int b;

    public aqn() {
        super(-2, -2);
        this.b = 0;
        this.a = 8388627;
    }

    public aqn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public aqn(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public aqn(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((ViewGroup.LayoutParams)marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public aqn(aqn aqn2) {
        super((yu)aqn2);
        this.b = 0;
        this.b = aqn2.b;
    }

    public aqn(yu yu2) {
        super(yu2);
        this.b = 0;
    }
}

