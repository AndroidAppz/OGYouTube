/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.SpinnerAdapter
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

final class ald
extends ana {
    CharSequence a;
    ListAdapter b;
    final Rect c;
    final /* synthetic */ ala d;

    public ald(ala ala2, Context context, AttributeSet attributeSet, int n) {
        this.d = ala2;
        super(context, attributeSet, n);
        this.c = new Rect();
        this.m = ala2;
        this.c();
        this.n = new ale((ald)this);
    }

    static /* synthetic */ void a(ald ald2) {
        ald2.b();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void a() {
        var1_1 = this.e.getBackground();
        if (var1_1 != null) {
            var1_1.getPadding(this.d.d);
            var11_2 = aqx.a((View)this.d) != false ? this.d.d.right : - this.d.d.left;
            var3_3 = var11_2;
        } else {
            var2_10 = this.d.d;
            this.d.d.right = 0;
            var2_10.left = 0;
            var3_3 = 0;
        }
        var4_4 = this.d.getPaddingLeft();
        var5_5 = this.d.getPaddingRight();
        var6_6 = this.d.getWidth();
        if (this.d.c != -2) ** GOTO lbl18
        var8_7 = this.d.a((SpinnerAdapter)this.b, this.e.getBackground());
        if (var8_7 <= (var9_8 = this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left - this.d.d.right)) ** GOTO lbl23
        ** GOTO lbl24
lbl18: // 1 sources:
        if (this.d.c == -1) {
            this.a(var6_6 - var4_4 - var5_5);
        } else {
            this.a(this.d.c);
        }
        ** GOTO lbl25
lbl23: // 1 sources:
        var9_8 = var8_7;
lbl24: // 2 sources:
        this.a(Math.max((int)var9_8, (int)(var6_6 - var4_4 - var5_5)));
lbl25: // 3 sources:
        var7_9 = aqx.a((View)this.d) != false ? var3_3 + (var6_6 - var5_5 - this.g) : var3_3 + var4_4;
        this.h = var7_9;
    }

    @Override
    public final void a(ListAdapter listAdapter) {
        super.a(listAdapter);
        this.b = listAdapter;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b() {
        ViewTreeObserver viewTreeObserver;
        boolean bl2 = this.e.isShowing();
        this.a();
        this.e();
        super.b();
        this.f.setChoiceMode(1);
        int n = this.d.getSelectedItemPosition();
        and and2 = this.f;
        if (this.e.isShowing() && and2 != null) {
            and2.a = false;
            and2.setSelection(n);
            if (Build.VERSION.SDK_INT >= 11 && and2.getChoiceMode() != 0) {
                and2.setItemChecked(n, true);
            }
        }
        if (bl2 || (viewTreeObserver = this.d.getViewTreeObserver()) == null) {
            return;
        }
        alf alf2 = new alf(this);
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)alf2);
        this.a(new alg(this, alf2));
    }
}

