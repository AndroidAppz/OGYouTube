/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  java.lang.Object
 *  rw
 *  sj
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public final class akf {
    private final View a;
    private final akj b;
    private aqg c;
    private aqg d;
    private aqg e;

    public akf(View view, akj akj2) {
        this.a = view;
        this.b = akj2;
    }

    public final ColorStateList a() {
        if (this.d != null) {
            return this.d.a;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n) {
        ColorStateList colorStateList = this.b != null ? this.b.a(this.a.getContext(), n) : null;
        this.b(colorStateList);
    }

    public final void a(ColorStateList colorStateList) {
        if (this.d == null) {
            this.d = new aqg();
        }
        this.d.a = colorStateList;
        this.d.d = true;
        this.c();
    }

    public final void a(PorterDuff.Mode mode) {
        if (this.d == null) {
            this.d = new aqg();
        }
        this.d.b = mode;
        this.d.c = true;
        this.c();
    }

    public final void a(AttributeSet attributeSet, int n) {
        TypedArray typedArray = this.a.getContext().obtainStyledAttributes(attributeSet, ada.cx, n, 0);
        try {
            ColorStateList colorStateList;
            if (typedArray.hasValue(ada.cy) && (colorStateList = this.b.a(this.a.getContext(), typedArray.getResourceId(ada.cy, -1))) != null) {
                this.b(colorStateList);
            }
            if (typedArray.hasValue(ada.cz)) {
                View view = this.a;
                ColorStateList colorStateList2 = typedArray.getColorStateList(ada.cz);
                rw.a.a(view, colorStateList2);
            }
            if (typedArray.hasValue(ada.cA)) {
                View view = this.a;
                PorterDuff.Mode mode = amj.a(typedArray.getInt(ada.cA, -1));
                rw.a.a(view, mode);
            }
            return;
        }
        finally {
            typedArray.recycle();
        }
    }

    public final PorterDuff.Mode b() {
        if (this.d != null) {
            return this.d.b;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.c == null) {
                this.c = new aqg();
            }
            this.c.a = colorStateList;
            this.c.d = true;
        } else {
            this.c = null;
        }
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c() {
        Drawable drawable = this.a.getBackground();
        if (drawable == null) return;
        if (this.d != null) {
            akj.a(drawable, this.d, this.a.getDrawableState());
            return;
        }
        if (this.c != null) {
            akj.a(drawable, this.c, this.a.getDrawableState());
            return;
        }
        if (Build.VERSION.SDK_INT != 21 || !(drawable instanceof GradientDrawable)) return;
        {
            boolean bl2 = true;
            if (!bl2) return;
            {
                PorterDuff.Mode mode;
                View view;
                if (this.e == null) {
                    this.e = new aqg();
                }
                aqg aqg2 = this.e;
                aqg2.a = null;
                aqg2.d = false;
                aqg2.b = null;
                aqg2.c = false;
                View view2 = this.a;
                ColorStateList colorStateList = rw.a.B(view2);
                if (colorStateList != null) {
                    aqg2.d = true;
                    aqg2.a = colorStateList;
                }
                if ((mode = rw.a.C(view = this.a)) != null) {
                    aqg2.c = true;
                    aqg2.b = mode;
                }
                if (!aqg2.d && !aqg2.c) return;
                {
                    akj.a(drawable, aqg2, this.a.getDrawableState());
                    return;
                }
            }
        }
    }
}

