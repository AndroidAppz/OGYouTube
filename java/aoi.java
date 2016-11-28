/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class aoi
extends ViewGroup.MarginLayoutParams {
    public aow c;
    public final Rect d = new Rect();
    public boolean e = true;
    boolean f = false;

    public aoi(int n, int n2) {
        super(n, n2);
    }

    public aoi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public aoi(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public aoi(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public aoi(aoi aoi2) {
        super((ViewGroup.LayoutParams)aoi2);
    }
}

