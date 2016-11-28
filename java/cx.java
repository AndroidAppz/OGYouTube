/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.design.widget.CoordinatorLayout
 *  android.util.AttributeSet
 *  android.view.View
 *  y
 */
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

public class cx
extends y {
    private cy a;
    private int b;

    public cx() {
        this.b = 0;
    }

    public cx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public boolean a(int n) {
        if (this.a != null) {
            return this.a.a(n);
        }
        this.b = n;
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int n) {
        this.c(coordinatorLayout, view, n);
        if (this.a == null) {
            this.a = new cy(view);
        }
        this.a.a();
        if (this.b != 0) {
            this.a.a(this.b);
            this.b = 0;
        }
        return true;
    }

    public int b() {
        if (this.a != null) {
            return this.a.a;
        }
        return 0;
    }

    protected void c(CoordinatorLayout coordinatorLayout, View view, int n) {
        coordinatorLayout.a(view, n);
    }
}

