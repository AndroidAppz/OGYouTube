/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  java.lang.Math
 *  ji
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public final class ajh
extends akr
implements ajl {
    final /* synthetic */ ajd a;

    public ajh(ajd ajd2, Context context) {
        this.a = ajd2;
        super(context, null, acq.i);
        this.setClickable(true);
        this.setFocusable(true);
        this.setVisibility(0);
        this.setEnabled(true);
        this.setOnTouchListener((View.OnTouchListener)new aji((ajh)this, (View)this));
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        this.playSoundEffect(0);
        this.a.c();
        return true;
    }

    protected final boolean setFrame(int n, int n2, int n3, int n4) {
        boolean bl2 = super.setFrame(n, n2, n3, n4);
        Drawable drawable = this.getDrawable();
        Drawable drawable2 = this.getBackground();
        if (drawable != null && drawable2 != null) {
            int n5 = this.getWidth();
            int n6 = this.getHeight();
            int n7 = Math.max((int)n5, (int)n6) / 2;
            int n8 = this.getPaddingLeft() - this.getPaddingRight();
            int n9 = this.getPaddingTop() - this.getPaddingBottom();
            int n10 = (n5 + n8) / 2;
            int n11 = (n6 + n9) / 2;
            ji.a((Drawable)drawable2, (int)(n10 - n7), (int)(n11 - n7), (int)(n10 + n7), (int)(n11 + n7));
        }
        return bl2;
    }
}

