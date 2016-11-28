/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public final class ako
extends EditText
implements rr {
    private akj a;
    private akf b;
    private alh c;

    public ako(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, acq.x);
    }

    private ako(Context context, AttributeSet attributeSet, int n) {
        super(aqf.a(context), attributeSet, n);
        this.a = akj.a();
        this.b = new akf((View)this, this.a);
        this.b.a(attributeSet, n);
        this.c = alh.a((TextView)this);
        this.c.a(attributeSet, n);
        this.c.a();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    @Override
    public final ColorStateList getSupportBackgroundTintList() {
        if (this.b != null) {
            return this.b.a();
        }
        return null;
    }

    @Override
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.b(null);
        }
    }

    public final void setBackgroundResource(int n) {
        super.setBackgroundResource(n);
        if (this.b != null) {
            this.b.a(n);
        }
    }

    @Override
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    @Override
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    public final void setTextAppearance(Context context, int n) {
        super.setTextAppearance(context, n);
        if (this.c != null) {
            this.c.a(context, n);
        }
    }
}

