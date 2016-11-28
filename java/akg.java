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
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  it
 *  yo
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public final class akg
extends CheckBox
implements yo {
    private akj a;
    private aki b;

    public akg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, acq.o);
    }

    private akg(Context context, AttributeSet attributeSet, int n) {
        super(aqf.a(context), attributeSet, n);
        this.a = akj.a();
        this.b = new aki((CompoundButton)this, this.a);
        this.b.a(attributeSet, n);
    }

    public final void a(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    public final void a(PorterDuff.Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    public final int getCompoundPaddingLeft() {
        int n = super.getCompoundPaddingLeft();
        if (this.b != null) {
            n = this.b.a(n);
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setButtonDrawable(int n) {
        Drawable drawable = this.a != null ? this.a.a(this.getContext(), n, false) : it.a((Context)this.getContext(), (int)n);
        this.setButtonDrawable(drawable);
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.b != null) {
            this.b.a();
        }
    }
}

