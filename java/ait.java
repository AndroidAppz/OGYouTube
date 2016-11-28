/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.support.v7.widget.ActionMenuView
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  java.lang.Math
 *  re
 *  rw
 *  tp
 *  uf
 */
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class ait
extends ViewGroup {
    public final Context a;
    public ActionMenuView b;
    public ajd c;
    public int d;
    public tp e;
    private aiu f;
    private boolean g;
    private boolean h;

    ait(Context context) {
        super(context, null);
    }

    ait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public ait(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.f = new aiu((ait)this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(acq.a, typedValue, true) && typedValue.resourceId != 0) {
            this.a = new ContextThemeWrapper(context, typedValue.resourceId);
            return;
        }
        this.a = context;
    }

    public static int a(int n, int n2, boolean bl2) {
        if (bl2) {
            return n - n2;
        }
        return n + n2;
    }

    public static int a(View view, int n, int n2) {
        view.measure(View.MeasureSpec.makeMeasureSpec((int)n, (int)Integer.MIN_VALUE), n2);
        return Math.max((int)0, (int)(n - view.getMeasuredWidth()));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(View view, int n, int n2, int n3, boolean bl2) {
        int n4 = view.getMeasuredWidth();
        int n5 = view.getMeasuredHeight();
        int n6 = n2 + (n3 - n5) / 2;
        if (bl2) {
            view.layout(n - n4, n6, n, n5 + n6);
        } else {
            view.layout(n, n6, n + n4, n5 + n6);
        }
        if (!bl2) return n4;
        return - n4;
    }

    static /* synthetic */ void a(ait ait2) {
        ait2.setVisibility(0);
    }

    static /* synthetic */ void a(ait ait2, int n) {
        ait2.setVisibility(n);
    }

    public tp a(int n, long l) {
        if (this.e != null) {
            this.e.a();
        }
        if (n == 0) {
            if (this.getVisibility() != 0) {
                rw.c((View)this, (float)0.0f);
            }
            tp tp2 = rw.p((View)this).a(1.0f);
            tp2.a(l);
            tp2.a((uf)this.f.a(tp2, n));
            return tp2;
        }
        tp tp3 = rw.p((View)this).a(0.0f);
        tp3.a(l);
        tp3.a((uf)this.f.a(tp3, n));
        return tp3;
    }

    public void a(int n) {
        this.d = n;
        this.requestLayout();
    }

    public boolean a() {
        if (this.c != null) {
            return this.c.c();
        }
        return false;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        TypedArray typedArray = this.getContext().obtainStyledAttributes(null, ada.a, acq.c, 0);
        this.a(typedArray.getLayoutDimension(ada.j, 0));
        typedArray.recycle();
        if (this.c != null) {
            ajd ajd2 = this.c;
            ajd2.i = ajd2.b.getResources().getInteger(acw.a);
            if (ajd2.c != null) {
                ajd2.c.b(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int n = re.a((MotionEvent)motionEvent);
        if (n == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean bl2 = super.onHoverEvent(motionEvent);
            if (n == 9 && !bl2) {
                this.h = true;
            }
        }
        if (n == 10 || n == 3) {
            this.h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n = re.a((MotionEvent)motionEvent);
        if (n == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean bl2 = super.onTouchEvent(motionEvent);
            if (n == 0 && !bl2) {
                this.g = true;
            }
        }
        if (n == 1 || n == 3) {
            this.g = false;
        }
        return true;
    }

    public void setVisibility(int n) {
        if (n != this.getVisibility()) {
            if (this.e != null) {
                this.e.a();
            }
            super.setVisibility(n);
        }
    }
}

