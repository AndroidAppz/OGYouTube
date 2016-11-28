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
 *  android.widget.ImageView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class akr
extends ImageView
implements rr {
    private akf a;
    private akq b;

    public akr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public akr(Context context, AttributeSet attributeSet, int n) {
        super(aqf.a(context), attributeSet, n);
        akj akj2 = akj.a();
        this.a = new akf((View)this, akj2);
        this.a.a(attributeSet, n);
        this.b = new akq((ImageView)this, akj2);
        this.b.a(attributeSet, n);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null) {
            this.a.c();
        }
    }

    @Override
    public ColorStateList getSupportBackgroundTintList() {
        if (this.a != null) {
            return this.a.a();
        }
        return null;
    }

    @Override
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.a != null) {
            return this.a.b();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.a != null) {
            this.a.b(null);
        }
    }

    public void setBackgroundResource(int n) {
        super.setBackgroundResource(n);
        if (this.a != null) {
            this.a.a(n);
        }
    }

    public void setImageResource(int n) {
        this.b.a(n);
    }

    @Override
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    @Override
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }
}

