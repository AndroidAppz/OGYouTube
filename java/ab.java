/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.support.design.widget.CoordinatorLayout
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  java.lang.String
 *  y
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public final class ab
extends ViewGroup.MarginLayoutParams {
    public y a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public View g;
    public View h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final Rect l;

    public ab() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public ab(ab ab2) {
        super((ViewGroup.MarginLayoutParams)ab2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public ab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, d.F);
        this.c = typedArray.getInteger(d.G, 0);
        this.f = typedArray.getResourceId(d.H, -1);
        this.d = typedArray.getInteger(d.I, 0);
        this.e = typedArray.getInteger(d.K, -1);
        this.b = typedArray.hasValue(d.J);
        if (this.b) {
            this.a = CoordinatorLayout.a((Context)context, (AttributeSet)attributeSet, (String)typedArray.getString(d.J));
        }
        typedArray.recycle();
    }

    public ab(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public ab(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public final void a(y y2) {
        if (this.a != y2) {
            this.a = y2;
            this.b = true;
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2 == this.h || this.a != null && this.a.a_(view2)) {
            return true;
        }
        return false;
    }
}

