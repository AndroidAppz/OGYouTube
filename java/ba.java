/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.support.design.widget.CoordinatorLayout
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.Math
 *  java.util.List
 *  qb
 *  rw
 */
import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public abstract class ba
extends cx {
    public int a;
    public int b;
    private final Rect c;
    private final Rect d;

    public ba() {
        this.c = new Rect();
        this.d = new Rect();
        this.a = 0;
    }

    public ba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new Rect();
        this.a = 0;
    }

    public abstract View a(List var1);

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int n, int n2, int n3, int n4) {
        View view2;
        int n5 = view.getLayoutParams().height;
        if ((n5 == -1 || n5 == -2) && (view2 = this.a(coordinatorLayout.a(view))) != null) {
            if (rw.s((View)view2) && !rw.s((View)view)) {
                rw.t((View)view);
                if (rw.s((View)view)) {
                    view.requestLayout();
                    return true;
                }
            }
            if (rw.v((View)view2)) {
                int n6 = View.MeasureSpec.getSize((int)n3);
                if (n6 == 0) {
                    n6 = coordinatorLayout.getHeight();
                }
                int n7 = n6 - view2.getMeasuredHeight() + this.c(view2);
                int n8 = n5 == -1 ? 1073741824 : Integer.MIN_VALUE;
                coordinatorLayout.a(view, n, n2, View.MeasureSpec.makeMeasureSpec((int)n7, (int)n8), n4);
                return true;
            }
        }
        return false;
    }

    public float b(View view) {
        return 1.0f;
    }

    public int c(View view) {
        return view.getMeasuredHeight();
    }

    @Override
    protected final void c(CoordinatorLayout coordinatorLayout, View view, int n) {
        View view2 = this.a(coordinatorLayout.a(view));
        if (view2 != null) {
            ab ab2 = (ab)view.getLayoutParams();
            Rect rect = this.c;
            rect.set(coordinatorLayout.getPaddingLeft() + ab2.leftMargin, view2.getBottom() + ab2.topMargin, coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight() - ab2.rightMargin, coordinatorLayout.getHeight() + view2.getBottom() - coordinatorLayout.getPaddingBottom() - ab2.bottomMargin);
            Rect rect2 = this.d;
            int n2 = ab2.c;
            if (n2 == 0) {
                n2 = 8388659;
            }
            qb.a((int)n2, (int)view.getMeasuredWidth(), (int)view.getMeasuredHeight(), (Rect)rect, (Rect)rect2, (int)n);
            int n3 = this.d(view2);
            view.layout(rect2.left, rect2.top - n3, rect2.right, rect2.bottom - n3);
            this.a = rect2.top - view2.getBottom();
            return;
        }
        super.c(coordinatorLayout, view, n);
        this.a = 0;
    }

    public final int d(View view) {
        if (this.b == 0) {
            return 0;
        }
        return bb.a(Math.round((float)(this.b(view) * (float)this.b)), 0, this.b);
    }
}

