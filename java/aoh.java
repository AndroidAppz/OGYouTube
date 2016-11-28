/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Parcelable
 *  android.support.v7.widget.RecyclerView
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  rw
 *  uk
 *  ut
 *  vf
 *  vt
 */
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class aoh {
    alr f;
    public RecyclerView g;
    public aos h;
    public boolean i = false;
    public boolean j = false;
    boolean k = true;
    int l;
    int m;
    public int n;
    public int o;

    public static int a(int n, int n2, int n3) {
        int n4 = View.MeasureSpec.getMode((int)n);
        int n5 = View.MeasureSpec.getSize((int)n);
        switch (n4) {
            default: {
                n5 = Math.max((int)n2, (int)n3);
            }
            case 1073741824: {
                return n5;
            }
            case Integer.MIN_VALUE: 
        }
        return Math.min((int)n5, (int)Math.max((int)n2, (int)n3));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(int n, int n2, int n3, int n4, boolean bl2) {
        int n5;
        int n6 = Math.max((int)0, (int)(n - n3));
        if (bl2) {
            if (n4 >= 0) {
                n5 = 1073741824;
                n6 = n4;
                return View.MeasureSpec.makeMeasureSpec((int)n6, (int)n5);
            }
            if (n4 == -1) {
                switch (n2) {
                    default: {
                        n6 = 0;
                        n5 = 0;
                        return View.MeasureSpec.makeMeasureSpec((int)n6, (int)n5);
                    }
                    case Integer.MIN_VALUE: 
                    case 1073741824: 
                }
                n5 = n2;
                return View.MeasureSpec.makeMeasureSpec((int)n6, (int)n5);
            }
            if (n4 == -2) {
                n6 = 0;
                n5 = 0;
                return View.MeasureSpec.makeMeasureSpec((int)n6, (int)n5);
            }
        } else {
            if (n4 >= 0) {
                n5 = 1073741824;
                n6 = n4;
                return View.MeasureSpec.makeMeasureSpec((int)n6, (int)n5);
            }
            if (n4 == -1) {
                n5 = n2;
                return View.MeasureSpec.makeMeasureSpec((int)n6, (int)n5);
            }
            if (n4 == -2) {
                if (n2 != Integer.MIN_VALUE) {
                    n5 = 0;
                    if (n2 != 1073741824) return View.MeasureSpec.makeMeasureSpec((int)n6, (int)n5);
                }
                n5 = Integer.MIN_VALUE;
                return View.MeasureSpec.makeMeasureSpec((int)n6, (int)n5);
            }
        }
        n6 = 0;
        n5 = 0;
        return View.MeasureSpec.makeMeasureSpec((int)n6, (int)n5);
    }

    public static int a(View view) {
        return ((aoi)view.getLayoutParams()).c.c();
    }

    public static void a(View view, int n, int n2, int n3, int n4) {
        Rect rect = ((aoi)view.getLayoutParams()).d;
        view.layout(n + rect.left, n2 + rect.top, n3 - rect.right, n4 - rect.bottom);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static boolean b(int n, int n2, int n3) {
        int n4 = View.MeasureSpec.getMode((int)n2);
        int n5 = View.MeasureSpec.getSize((int)n2);
        if (n3 > 0 && n != n3) {
            return false;
        }
        switch (n4) {
            default: {
                return false;
            }
            case Integer.MIN_VALUE: {
                if (n5 < n) return false;
                return true;
            }
            case 0: {
                return true;
            }
            case 1073741824: 
        }
        if (n5 != n) return false;
        return true;
    }

    public static int c(View view) {
        Rect rect = ((aoi)view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int d(View view) {
        Rect rect = ((aoi)view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int e(View view) {
        return view.getLeft() - ((aoi)view.getLayoutParams()).d.left;
    }

    public static int f(View view) {
        return view.getTop() - ((aoi)view.getLayoutParams()).d.top;
    }

    public static int g(View view) {
        return view.getRight() + ((aoi)view.getLayoutParams()).d.right;
    }

    public static int h(View view) {
        return view.getBottom() + ((aoi)view.getLayoutParams()).d.bottom;
    }

    public int a(int n, aom aom2, aou aou2) {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(aom aom2, aou aou2) {
        if (this.g == null || this.g.h == null || !this.j()) {
            return 1;
        }
        return this.g.h.a();
    }

    public View a(View view, int n, aom aom2, aou aou2) {
        return null;
    }

    public aoi a(Context context, AttributeSet attributeSet) {
        return new aoi(context, attributeSet);
    }

    public aoi a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aoi) {
            return new aoi((aoi)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new aoi((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new aoi(layoutParams);
    }

    public final void a(int n, int n2) {
        this.n = View.MeasureSpec.getSize((int)n);
        this.l = View.MeasureSpec.getMode((int)n);
        if (this.l == 0 && !RecyclerView.b) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize((int)n2);
        this.m = View.MeasureSpec.getMode((int)n2);
        if (this.m == 0 && !RecyclerView.b) {
            this.o = 0;
        }
    }

    public final void a(int n, aom aom2) {
        View view = this.i(n);
        this.g(n);
        aom2.a(view);
    }

    public void a(Rect rect, int n, int n2) {
        int n3 = rect.width() + this.u() + this.w();
        int n4 = rect.height() + this.v() + this.x();
        this.d(aoh.a(n, n3, rw.n((View)this.g)), aoh.a(n2, n4, rw.o((View)this.g)));
    }

    public void a(Parcelable parcelable) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.g = null;
            this.f = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.g = recyclerView;
            this.f = recyclerView.e;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public void a(RecyclerView recyclerView, int n) {
        Log.e((String)"RecyclerView", (String)"You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void a(RecyclerView recyclerView, aom aom2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(View view, int n, boolean bl2) {
        aow aow2 = RecyclerView.a((View)view);
        if (bl2 || aow2.m()) {
            this.g.f.b(aow2);
        } else {
            this.g.f.c(aow2);
        }
        aoi aoi2 = (aoi)view.getLayoutParams();
        if (aow2.g() || aow2.e()) {
            if (aow2.e()) {
                aow2.f();
            } else {
                aow2.h();
            }
            this.f.a(view, n, view.getLayoutParams(), false);
        } else if (view.getParent() == this.g) {
            int n2 = this.f.c(view);
            if (n == -1) {
                n = this.f.a();
            }
            if (n2 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.g.indexOfChild(view));
            }
            if (n2 != n) {
                aoh aoh2 = this.g.i;
                View view2 = aoh2.i(n2);
                if (view2 == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + n2);
                }
                aoh2.h(n2);
                aoi aoi3 = (aoi)view2.getLayoutParams();
                aow aow3 = RecyclerView.a((View)view2);
                if (aow3.m()) {
                    aoh2.g.f.b(aow3);
                } else {
                    aoh2.g.f.c(aow3);
                }
                aoh2.f.a(view2, n, (ViewGroup.LayoutParams)aoi3, aow3.m());
            }
        } else {
            this.f.a(view, n, false);
            aoi2.e = true;
            if (this.h != null && this.h.e) {
                aos aos2 = this.h;
                if (RecyclerView.c((View)view) == aos2.a) {
                    aos2.f = view;
                }
            }
        }
        if (aoi2.f) {
            aow2.a.invalidate();
            aoi2.f = false;
        }
    }

    final void a(View view, ut ut2) {
        aow aow2 = RecyclerView.a((View)view);
        if (aow2 != null && !aow2.m() && !this.f.d(aow2.a)) {
            this.a(this.g.c, this.g.z, view, ut2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(AccessibilityEvent accessibilityEvent) {
        int n = 1;
        vt vt2 = uk.a((AccessibilityEvent)accessibilityEvent);
        if (this.g == null) {
            return;
        }
        if (!(rw.b((View)this.g, (int)n) || rw.b((View)this.g, (int)-1) || rw.a((View)this.g, (int)-1) || rw.a((View)this.g, (int)n))) {
            n = 0;
        }
        vt2.a((boolean)n);
        if (this.g.h == null) return;
        vt2.a(this.g.h.a());
    }

    public final void a(aom aom2) {
        int n = aom2.a.size();
        for (int i = n - 1; i >= 0; --i) {
            View view = ((aow)aom2.a.get((int)i)).a;
            aow aow2 = RecyclerView.a((View)view);
            if (aow2.b()) continue;
            aow2.a(false);
            if (aow2.n()) {
                this.g.removeDetachedView(view, false);
            }
            if (this.g.w != null) {
                this.g.w.c(aow2);
            }
            aow2.a(true);
            aow aow3 = RecyclerView.a((View)view);
            aow3.k = null;
            aow3.l = false;
            aow3.h();
            aom2.a(aow3);
        }
        aom2.a.clear();
        if (aom2.b != null) {
            aom2.b.clear();
        }
        if (n > 0) {
            this.g.invalidate();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(aom aom2, aou aou2, View view, ut ut2) {
        int n = this.j() ? aoh.a(view) : 0;
        int n2 = this.i() ? aoh.a(view) : 0;
        ut2.a((Object)vf.a((int)n, (int)1, (int)n2, (int)1, (boolean)false));
    }

    public final void a(aos aos2) {
        if (this.h != null && aos2 != this.h && this.h.e) {
            this.h.d();
        }
        aos aos3 = this.h = aos2;
        aos3.b = this.g;
        aos3.c = this;
        if (aos3.a == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        aos3.b.z.a = aos3.a;
        aos3.e = true;
        aos3.d = true;
        int n = aos3.a;
        aos3.f = aos3.b.i.c(n);
        aos3.b.y.a();
    }

    public void a(String string) {
        if (this.g != null) {
            this.g.a(string);
        }
    }

    final boolean a(View view, int n, int n2, aoi aoi2) {
        if (view.isLayoutRequested() || !this.k || !aoh.b(view.getWidth(), n, aoi2.width) || !aoh.b(view.getHeight(), n2, aoi2.height)) {
            return true;
        }
        return false;
    }

    public boolean a(aoi aoi2) {
        if (aoi2 != null) {
            return true;
        }
        return false;
    }

    public int b(int n, aom aom2, aou aou2) {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int b(aom aom2, aou aou2) {
        if (this.g == null || this.g.h == null || !this.i()) {
            return 1;
        }
        return this.g.h.a();
    }

    public int b(aou aou2) {
        return 0;
    }

    public void b() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(int n, int n2) {
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MIN_VALUE;
        int n5 = this.t();
        if (n5 == 0) {
            this.g.c(n, n2);
            return;
        }
        int n6 = 0;
        int n7 = n4;
        int n8 = n3;
        do {
            if (n6 >= n5) {
                this.g.g.set(n8, n3, n7, n4);
                this.a(this.g.g, n, n2);
                return;
            }
            View view = this.i(n6);
            aoi aoi2 = (aoi)view.getLayoutParams();
            int n9 = aoh.e(view) - aoi2.leftMargin;
            int n10 = aoh.g(view) + aoi2.rightMargin;
            int n11 = aoh.f(view) - aoi2.topMargin;
            int n12 = aoh.h(view) + aoi2.bottomMargin;
            if (n9 >= n8) {
                n9 = n8;
            }
            if (n10 <= n7) {
                n10 = n7;
            }
            if (n11 >= n3) {
                n11 = n3;
            }
            if (n12 <= n4) {
                n12 = n4;
            }
            ++n6;
            n7 = n10;
            n3 = n11;
            n8 = n9;
            n4 = n12;
        } while (true);
    }

    public void b(RecyclerView recyclerView) {
    }

    public void b(View view) {
        int n;
        aoi aoi2 = (aoi)view.getLayoutParams();
        Rect rect = this.g.d(view);
        int n2 = 0 + (rect.left + rect.right);
        int n3 = 0 + (rect.top + rect.bottom);
        int n4 = aoh.a(this.n, this.l, n2 + (this.u() + this.w() + aoi2.leftMargin + aoi2.rightMargin), aoi2.width, this.i());
        if (this.a(view, n4, n = aoh.a(this.o, this.m, n3 + (this.v() + this.x() + aoi2.topMargin + aoi2.bottomMargin), aoi2.height, this.j()), aoi2)) {
            view.measure(n4, n);
        }
    }

    public final void b(aom aom2) {
        for (int i = -1 + this.t(); i >= 0; --i) {
            if (RecyclerView.a((View)this.i(i)).b()) continue;
            this.a(i, aom2);
        }
    }

    public int c(aou aou2) {
        return 0;
    }

    public View c(int n) {
        int n2 = this.t();
        for (int i = 0; i < n2; ++i) {
            View view = this.i(i);
            aow aow2 = RecyclerView.a((View)view);
            if (aow2 == null || aow2.c() != n || aow2.b() || !this.g.z.g && aow2.m()) continue;
            return view;
        }
        return null;
    }

    public void c() {
    }

    public final void c(int n, int n2) {
        this.g.c(n, n2);
    }

    public final void c(RecyclerView recyclerView) {
        this.a(View.MeasureSpec.makeMeasureSpec((int)recyclerView.getWidth(), (int)1073741824), View.MeasureSpec.makeMeasureSpec((int)recyclerView.getHeight(), (int)1073741824));
    }

    public void c(aom aom2, aou aou2) {
        Log.e((String)"RecyclerView", (String)"You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public int d(aou aou2) {
        return 0;
    }

    public void d() {
    }

    public final void d(int n, int n2) {
        RecyclerView.a((RecyclerView)this.g, (int)n, (int)n2);
    }

    public int e(aou aou2) {
        return 0;
    }

    public void e() {
    }

    public void e(int n) {
    }

    public int f(aou aou2) {
        return 0;
    }

    public abstract aoi f();

    public int g(aou aou2) {
        return 0;
    }

    public final void g(int n) {
        int n2;
        alr alr2;
        View view;
        if (this.i(n) != null && (view = alr2.a.b(n2 = (alr2 = this.f).a(n))) != null) {
            if (alr2.b.d(n2)) {
                alr2.b(view);
            }
            alr2.a.a(n2);
        }
    }

    public boolean g() {
        return false;
    }

    public Parcelable h() {
        return null;
    }

    public final void h(int n) {
        this.i(n);
        this.f.d(n);
    }

    public final View i(int n) {
        if (this.f != null) {
            return this.f.b(n);
        }
        return null;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public final void s() {
        if (this.g != null) {
            this.g.requestLayout();
        }
    }

    public final int t() {
        if (this.f != null) {
            return this.f.a();
        }
        return 0;
    }

    public final int u() {
        if (this.g != null) {
            return this.g.getPaddingLeft();
        }
        return 0;
    }

    public final int v() {
        if (this.g != null) {
            return this.g.getPaddingTop();
        }
        return 0;
    }

    public final int w() {
        if (this.g != null) {
            return this.g.getPaddingRight();
        }
        return 0;
    }

    public final int x() {
        if (this.g != null) {
            return this.g.getPaddingBottom();
        }
        return 0;
    }

    public void x_() {
    }
}

