/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Rect
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.support.v7.app.OverlayListView
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout
 *  android.widget.ListView
 *  android.widget.RelativeLayout
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.OverlayListView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class abb
implements ViewTreeObserver.OnGlobalLayoutListener {
    private /* synthetic */ boolean a;
    private /* synthetic */ aas b;

    abb(aas aas2, boolean bl2) {
        this.b = aas2;
        this.a = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onGlobalLayout() {
        int n;
        int n2;
        Bitmap bitmap;
        int n3;
        this.b.j.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        if (this.b.J) {
            this.b.K = true;
            return;
        }
        aas aas2 = this.b;
        boolean bl2 = this.a;
        int n4 = aas2.l.getLayoutParams().height;
        aas.b((View)aas2.l, -1);
        aas2.c(aas2.d());
        View view = aas2.getWindow().getDecorView();
        view.measure(View.MeasureSpec.makeMeasureSpec((int)aas2.getWindow().getAttributes().width, (int)1073741824), 0);
        aas.b((View)aas2.l, n4);
        if (aas2.k.getDrawable() instanceof BitmapDrawable && (bitmap = ((BitmapDrawable)aas2.k.getDrawable()).getBitmap()) != null) {
            int n5 = aas2.a(bitmap.getWidth(), bitmap.getHeight());
            ImageView imageView = aas2.k;
            ImageView.ScaleType scaleType = bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER;
            imageView.setScaleType(scaleType);
            n3 = n5;
        } else {
            n3 = 0;
        }
        int n6 = aas2.b(aas2.d());
        int n7 = aas2.p.size();
        int n8 = aas2.b() == null ? 0 : aas2.x * aas2.b().a.size();
        if (n7 > 0) {
            n8 += aas2.z;
        }
        int n9 = Math.min((int)n8, (int)aas2.y);
        if (!aas2.I) {
            n9 = 0;
        }
        int n10 = n6 + Math.max((int)n3, (int)n9);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int n11 = aas2.i.getMeasuredHeight() - aas2.j.getMeasuredHeight();
        int n12 = rect.height() - n11;
        if (n3 > 0 && n10 <= n12) {
            aas2.k.setVisibility(0);
            aas.b((View)aas2.k, n3);
            n = n3;
            n2 = n10;
        } else {
            if (aas2.n.getLayoutParams().height + aas2.l.getMeasuredHeight() >= aas2.j.getMeasuredHeight()) {
                aas2.k.setVisibility(8);
            }
            n2 = n9 + n6;
            n = 0;
        }
        if (aas2.d() && n2 <= n12) {
            aas2.m.setVisibility(0);
        } else {
            aas2.m.setVisibility(8);
        }
        boolean bl3 = aas2.m.getVisibility() == 0;
        aas2.c(bl3);
        boolean bl4 = aas2.m.getVisibility() == 0;
        int n13 = aas2.b(bl4);
        int n14 = n13 + Math.max((int)n, (int)n9);
        if (n14 > n12) {
            n9 -= n14 - n12;
            n14 = n12;
        }
        aas2.l.clearAnimation();
        aas2.n.clearAnimation();
        aas2.j.clearAnimation();
        if (bl2) {
            aas2.a((View)aas2.l, n13);
            aas2.a((View)aas2.n, n9);
            aas2.a((View)aas2.j, n14);
        } else {
            aas.b((View)aas2.l, n13);
            aas.b((View)aas2.n, n9);
            aas.b((View)aas2.j, n14);
        }
        aas.b((View)aas2.h, rect.height());
        List list = aas2.b() == null ? null : aas2.b().a;
        if (list == null) {
            aas2.p.clear();
            aas2.o.notifyDataSetChanged();
            return;
        }
        if (new HashSet((Collection)aas2.p).equals((Object)new HashSet((Collection)list))) {
            aas2.o.notifyDataSetChanged();
            return;
        }
        HashMap hashMap = bl2 ? abo.a((ListView)aas2.n, aas2.o) : null;
        HashMap hashMap2 = bl2 ? abo.a(aas2.f, (ListView)aas2.n, aas2.o) : null;
        List list2 = aas2.p;
        HashSet hashSet = new HashSet((Collection)list);
        hashSet.removeAll((Collection)list2);
        aas2.q = hashSet;
        HashSet hashSet2 = new HashSet((Collection)aas2.p);
        hashSet2.removeAll((Collection)list);
        aas2.r = hashSet2;
        aas2.p.addAll(0, (Collection)aas2.q);
        aas2.p.removeAll((Collection)aas2.r);
        aas2.o.notifyDataSetChanged();
        if (bl2 && aas2.I && aas2.q.size() + aas2.r.size() > 0) {
            aas2.n.setEnabled(false);
            aas2.n.requestLayout();
            aas2.J = true;
            aas2.n.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new abd(aas2, (Map)hashMap, (Map)hashMap2));
            return;
        }
        aas2.q = null;
        aas2.r = null;
    }
}

