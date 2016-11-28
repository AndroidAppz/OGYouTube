/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  java.lang.Math
 *  java.lang.Object
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public class aij
implements ail,
View.OnKeyListener,
ViewTreeObserver.OnGlobalLayoutListener,
AdapterView.OnItemClickListener,
PopupWindow.OnDismissListener {
    static final int a = acx.m;
    final LayoutInflater b;
    final ahw c;
    final boolean d;
    public View e;
    public ana f;
    public aim g;
    public boolean h;
    public int i;
    private final Context j;
    private final aik k;
    private final int l;
    private final int m;
    private final int n;
    private ViewTreeObserver o;
    private ViewGroup p;
    private boolean q;
    private int r;

    private aij(Context context, ahw ahw2, View view) {
        super(context, ahw2, view, false, acq.C);
    }

    public aij(Context context, ahw ahw2, View view, boolean bl2, int n) {
        this(context, ahw2, view, bl2, n, 0);
    }

    private aij(Context context, ahw ahw2, View view, boolean bl2, int n, byte by2) {
        this.i = 0;
        this.j = context;
        this.b = LayoutInflater.from((Context)context);
        this.c = ahw2;
        this.k = new aik(this, this.c);
        this.d = bl2;
        this.m = n;
        this.n = 0;
        Resources resources = context.getResources();
        this.l = Math.max((int)(resources.getDisplayMetrics().widthPixels / 2), (int)resources.getDimensionPixelSize(act.c));
        this.e = view;
        ahw2.a(this, context);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void a(ahw ahw2, boolean bl2) {
        if (ahw2 != this.c) {
            return;
        }
        this.c();
        if (this.g == null) return;
        this.g.a(ahw2, bl2);
    }

    @Override
    public final void a(Context context, ahw ahw2) {
    }

    @Override
    public final boolean a() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(air var1) {
        if (!var1.hasVisibleItems()) return false;
        var2_2 = new aij(this.j, var1, this.e);
        var2_2.g = this.g;
        var3_3 = var1.size();
        for (var4_4 = 0; var4_4 < var3_3; ++var4_4) {
            var7_5 = var1.getItem(var4_4);
            if (!var7_5.isVisible() || var7_5.getIcon() == null) continue;
            var5_6 = true;
lbl9: // 2 sources:
            var2_2.h = var5_6;
            if (!var2_2.b()) return false;
            if (this.g == null) return true;
            this.g.a(var1);
            return true;
        }
        var5_6 = false;
        ** GOTO lbl9
    }

    @Override
    public final void b(boolean bl2) {
        this.q = false;
        if (this.k != null) {
            this.k.notifyDataSetChanged();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean b() {
        int n = 0;
        this.f = new ana(this.j, null, this.m, 0);
        this.f.a(this);
        this.f.n = this;
        this.f.a((ListAdapter)this.k);
        this.f.c();
        View view = this.e;
        if (view == null) {
            return false;
        }
        boolean bl2 = this.o == null;
        this.o = view.getViewTreeObserver();
        if (bl2) {
            this.o.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }
        this.f.m = view;
        this.f.k = this.i;
        if (!this.q) {
            aik aik2 = this.k;
            int n2 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            int n3 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            int n4 = aik2.getCount();
            int n5 = 0;
            View view2 = null;
            for (int i = 0; i < n4; ++i) {
                View view3;
                int n6 = aik2.getItemViewType(i);
                if (n6 != n5) {
                    n5 = n6;
                    view3 = null;
                } else {
                    view3 = view2;
                }
                if (this.p == null) {
                    this.p = new FrameLayout(this.j);
                }
                view2 = aik2.getView(i, view3, this.p);
                view2.measure(n2, n3);
                int n7 = view2.getMeasuredWidth();
                if (n7 >= this.l) {
                    n = this.l;
                    break;
                }
                if (n7 <= n) {
                    n7 = n;
                }
                n = n7;
            }
            this.r = n;
            this.q = true;
        }
        this.f.a(this.r);
        this.f.e();
        this.f.b();
        this.f.f.setOnKeyListener((View.OnKeyListener)this);
        return true;
    }

    @Override
    public final boolean b(aia aia2) {
        return false;
    }

    public final void c() {
        if (this.d()) {
            this.f.d();
        }
    }

    @Override
    public final boolean c(aia aia2) {
        return false;
    }

    public final boolean d() {
        if (this.f != null && this.f.e.isShowing()) {
            return true;
        }
        return false;
    }

    public void onDismiss() {
        this.f = null;
        this.c.close();
        if (this.o != null) {
            if (!this.o.isAlive()) {
                this.o = this.e.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
            this.o = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onGlobalLayout() {
        if (!this.d()) return;
        {
            View view = this.e;
            if (view == null || !view.isShown()) {
                this.c();
                return;
            } else {
                if (!this.d()) return;
                {
                    this.f.b();
                    return;
                }
            }
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int n, long l) {
        aik aik2 = this.k;
        aik2.a.a((aia)aik2.getItem(n), null, 0);
    }

    public boolean onKey(View view, int n, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.c();
            return true;
        }
        return false;
    }
}

