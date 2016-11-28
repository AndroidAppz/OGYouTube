/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.support.v7.widget.Toolbar
 *  android.util.AttributeSet
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.ImageButton
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.ArrayList
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import java.util.ArrayList;

public final class aqm
implements ail {
    public aia a;
    private ahw b;
    private /* synthetic */ Toolbar c;

    public aqm(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override
    public final void a(ahw ahw2, boolean bl2) {
    }

    @Override
    public final void a(Context context, ahw ahw2) {
        if (this.b != null && this.a != null) {
            this.b.b(this.a);
        }
        this.b = ahw2;
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final boolean a(air air2) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void b(boolean var1) {
        if (this.a == null) return;
        var2_2 = this.b;
        var3_3 = false;
        if (var2_2 == null) ** GOTO lbl-1000
        var5_4 = this.b.size();
        var6_5 = 0;
        do {
            var3_3 = false;
            if (var6_5 < var5_4) {
                if (this.b.getItem(var6_5) == this.a) {
                    return;
                }
            } else lbl-1000: // 2 sources:
            {
                this.c(this.a);
                return;
            }
            ++var6_5;
        } while (true);
    }

    @Override
    public final boolean b(aia aia2) {
        Toolbar toolbar = this.c;
        if (toolbar.d == null) {
            toolbar.d = new ImageButton(toolbar.getContext(), null, acq.L);
            toolbar.d.setImageDrawable(toolbar.b);
            toolbar.d.setContentDescription(toolbar.c);
            aqn aqn2 = new aqn();
            aqn2.a = 8388611 | 112 & toolbar.h;
            aqn2.b = 2;
            toolbar.d.setLayoutParams((ViewGroup.LayoutParams)aqn2);
            toolbar.d.setOnClickListener((View.OnClickListener)new aql(toolbar));
        }
        if (this.c.d.getParent() != this.c) {
            this.c.addView((View)this.c.d);
        }
        this.c.e = aia2.getActionView();
        this.a = aia2;
        if (this.c.e.getParent() != this.c) {
            aqn aqn3 = new aqn();
            aqn3.a = 8388611 | 112 & this.c.h;
            aqn3.b = 2;
            this.c.e.setLayoutParams((ViewGroup.LayoutParams)aqn3);
            this.c.addView(this.c.e);
        }
        this.c.j();
        this.c.requestLayout();
        aia2.d(true);
        if (this.c.e instanceof ahd) {
            ((ahd)this.c.e).onActionViewExpanded();
        }
        return true;
    }

    @Override
    public final boolean c(aia aia2) {
        if (this.c.e instanceof ahd) {
            ((ahd)this.c.e).onActionViewCollapsed();
        }
        this.c.removeView(this.c.e);
        this.c.removeView((View)this.c.d);
        this.c.e = null;
        Toolbar toolbar = this.c;
        for (int i = -1 + toolbar.k.size(); i >= 0; --i) {
            toolbar.addView((View)toolbar.k.get(i));
        }
        toolbar.k.clear();
        this.a = null;
        this.c.requestLayout();
        aia2.d(false);
        return true;
    }
}

