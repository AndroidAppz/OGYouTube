/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.PopupWindow
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 *  xj
 *  xp
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

public final class akt
extends PopupWindow {
    private static final boolean a;
    private boolean b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        boolean bl2 = Build.VERSION.SDK_INT < 21;
        a = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public akt(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        aqi aqi2 = aqi.a(context, attributeSet, ada.bd, n);
        if (aqi2.e(ada.bf)) {
            boolean bl2 = aqi2.a(ada.bf, false);
            if (a) {
                this.b = bl2;
            } else {
                xj.a.a((PopupWindow)this, bl2);
            }
        }
        this.setBackgroundDrawable(aqi2.a(ada.be));
        aqi2.a.recycle();
        if (Build.VERSION.SDK_INT >= 14) return;
        try {
            Field field = PopupWindow.class.getDeclaredField("mAnchor");
            field.setAccessible(true);
            Field field2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field2.setAccessible(true);
            field2.set((Object)this, (Object)new aku(field, (PopupWindow)this, (ViewTreeObserver.OnScrollChangedListener)field2.get((Object)this)));
            return;
        }
        catch (Exception var5_8) {
            return;
        }
    }

    public final void showAsDropDown(View view, int n, int n2) {
        if (a && this.b) {
            n2 -= view.getHeight();
        }
        super.showAsDropDown(view, n, n2);
    }

    public final void showAsDropDown(View view, int n, int n2, int n3) {
        if (a && this.b) {
            n2 -= view.getHeight();
        }
        super.showAsDropDown(view, n, n2, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void update(View view, int n, int n2, int n3, int n4) {
        int n5 = a && this.b ? n2 - view.getHeight() : n2;
        super.update(view, n, n5, n3, n4);
    }
}

