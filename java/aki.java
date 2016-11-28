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
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.widget.CompoundButton
 *  java.lang.Object
 *  ji
 *  wi
 *  wl
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class aki {
    private final CompoundButton a;
    private final akj b;
    private ColorStateList c = null;
    private PorterDuff.Mode d = null;
    private boolean e = false;
    private boolean f = false;
    private boolean g;

    aki(CompoundButton compoundButton, akj akj2) {
        this.a = compoundButton;
        this.b = akj2;
    }

    private final void b() {
        Drawable drawable = wi.a((CompoundButton)this.a);
        if (drawable != null && (this.e || this.f)) {
            Drawable drawable2 = ji.e((Drawable)drawable).mutate();
            if (this.e) {
                ji.a((Drawable)drawable2, (ColorStateList)this.c);
            }
            if (this.f) {
                ji.a((Drawable)drawable2, (PorterDuff.Mode)this.d);
            }
            if (drawable2.isStateful()) {
                drawable2.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(drawable2);
        }
    }

    final int a(int n) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT < 17 && (drawable = wi.a((CompoundButton)this.a)) != null) {
            n += drawable.getIntrinsicWidth();
        }
        return n;
    }

    final void a() {
        if (this.g) {
            this.g = false;
            return;
        }
        this.g = true;
        this.b();
    }

    final void a(ColorStateList colorStateList) {
        this.c = colorStateList;
        this.e = true;
        super.b();
    }

    final void a(PorterDuff.Mode mode) {
        this.d = mode;
        this.f = true;
        super.b();
    }

    final void a(AttributeSet attributeSet, int n) {
        TypedArray typedArray = this.a.getContext().obtainStyledAttributes(attributeSet, ada.ag, n, 0);
        try {
            int n2;
            if (typedArray.hasValue(ada.ah) && (n2 = typedArray.getResourceId(ada.ah, 0)) != 0) {
                this.a.setButtonDrawable(this.b.a(this.a.getContext(), n2, false));
            }
            if (typedArray.hasValue(ada.ai)) {
                CompoundButton compoundButton = this.a;
                ColorStateList colorStateList = typedArray.getColorStateList(ada.ai);
                wi.a.a(compoundButton, colorStateList);
            }
            if (typedArray.hasValue(ada.aj)) {
                CompoundButton compoundButton = this.a;
                PorterDuff.Mode mode = amj.a(typedArray.getInt(ada.aj, -1));
                wi.a.a(compoundButton, mode);
            }
            return;
        }
        finally {
            typedArray.recycle();
        }
    }
}

