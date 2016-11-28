/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.support.v7.widget.ActionBarContainer
 *  android.support.v7.widget.ActionBarContextView
 *  android.support.v7.widget.ActionBarOverlayLayout
 *  android.support.v7.widget.Toolbar
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  rw
 *  tp
 *  ty
 *  uf
 *  uh
 *  yu
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class ack
extends yt
implements ajb {
    private static final Interpolator n = new AccelerateInterpolator();
    private static final Interpolator o = new DecelerateInterpolator();
    private static final boolean p;
    private uf A;
    private uh B;
    Context a;
    ActionBarOverlayLayout b;
    ActionBarContainer c;
    alw d;
    ActionBarContextView e;
    View f;
    aco g;
    ahb h;
    ahc i;
    boolean j;
    boolean k;
    ahl l;
    boolean m;
    private Context q;
    private boolean r;
    private boolean s;
    private ArrayList t;
    private boolean u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private uf z;

    /*
     * Enabled aggressive block sorting
     */
    static {
        boolean bl2 = Build.VERSION.SDK_INT >= 14;
        p = bl2;
    }

    public ack(Activity activity, boolean bl2) {
        new ArrayList();
        this.t = new ArrayList();
        this.v = 0;
        this.j = true;
        this.x = true;
        this.z = new acl((ack)this);
        this.A = new acm((ack)this);
        this.B = new acn((ack)this);
        View view = activity.getWindow().getDecorView();
        super.a(view);
        if (!bl2) {
            this.f = view.findViewById(16908290);
        }
    }

    public ack(Dialog dialog) {
        new ArrayList();
        this.t = new ArrayList();
        this.v = 0;
        this.j = true;
        this.x = true;
        this.z = new acl((ack)this);
        this.A = new acm((ack)this);
        this.B = new acn((ack)this);
        super.a(dialog.getWindow().getDecorView());
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(View view) {
        int n;
        alw alw2;
        View view2;
        this.b = (ActionBarOverlayLayout)view.findViewById(acv.q);
        if (this.b != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.b;
            actionBarOverlayLayout.g = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                actionBarOverlayLayout.g.c(actionBarOverlayLayout.a);
                if (actionBarOverlayLayout.f != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(actionBarOverlayLayout.f);
                    rw.r((View)actionBarOverlayLayout);
                }
            }
        }
        if ((view2 = view.findViewById(acv.b)) instanceof alw) {
            alw2 = (alw)view2;
        } else {
            if (!(view2 instanceof Toolbar)) {
                String string;
                if ("Can't make a decor toolbar out of " + (Object)view2 != null) {
                    string = view2.getClass().getSimpleName();
                    throw new IllegalStateException(string);
                }
                string = "null";
                throw new IllegalStateException(string);
            }
            alw2 = ((Toolbar)view2).i();
        }
        this.d = alw2;
        this.e = (ActionBarContextView)view.findViewById(acv.g);
        this.c = (ActionBarContainer)view.findViewById(acv.d);
        if (this.d == null) throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        if (this.e == null) throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        if (this.c == null) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = this.d.b();
        boolean bl2 = (4 & this.d.l()) != 0;
        if (bl2) {
            this.r = true;
        }
        aha aha2 = aha.a(this.a);
        super.h(aha2.a());
        TypedArray typedArray = this.a.obtainStyledAttributes(null, ada.a, acq.c, 0);
        if (typedArray.getBoolean(ada.k, false)) {
            if (!this.b.c) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            this.b.a(true);
        }
        if ((n = typedArray.getDimensionPixelSize(ada.i, 0)) != 0) {
            float f = n;
            rw.f((View)this.c, (float)f);
        }
        typedArray.recycle();
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean a(boolean bl2, boolean bl3, boolean bl4) {
        if (bl4 || !bl3) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void h(boolean bl2) {
        this.u = bl2;
        if (!this.u) {
            this.d.a((ape)null);
            this.c.a(null);
        } else {
            this.c.a(null);
            this.d.a((ape)null);
        }
        this.d.a(false);
        this.b.d = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void i(boolean bl2) {
        if (ack.a(false, this.k, this.w)) {
            if (this.x) return;
            this.x = true;
            if (this.l != null) {
                this.l.b();
            }
            this.c.setVisibility(0);
            if (this.v == 0 && p && (this.y || bl2)) {
                rw.b((View)this.c, (float)0.0f);
                float f = - this.c.getHeight();
                if (bl2) {
                    int[] arrn = new int[]{0, 0};
                    this.c.getLocationInWindow(arrn);
                    f -= (float)arrn[1];
                }
                rw.b((View)this.c, (float)f);
                ahl ahl2 = new ahl();
                tp tp2 = rw.p((View)this.c).c(0.0f);
                tp2.a(this.B);
                ahl2.a(tp2);
                if (this.j && this.f != null) {
                    rw.b((View)this.f, (float)f);
                    ahl2.a(rw.p((View)this.f).c(0.0f));
                }
                ahl2.a(o);
                ahl2.c();
                ahl2.a(this.A);
                this.l = ahl2;
                ahl2.a();
            } else {
                rw.c((View)this.c, (float)1.0f);
                rw.b((View)this.c, (float)0.0f);
                if (this.j && this.f != null) {
                    rw.b((View)this.f, (float)0.0f);
                }
                this.A.b(null);
            }
            if (this.b == null) return;
            rw.r((View)this.b);
            return;
        }
        if (!this.x) return;
        {
            this.x = false;
            if (this.l != null) {
                this.l.b();
            }
            if (this.v == 0 && p && (this.y || bl2)) {
                rw.c((View)this.c, (float)1.0f);
                this.c.a(true);
                ahl ahl3 = new ahl();
                float f = - this.c.getHeight();
                if (bl2) {
                    int[] arrn = new int[]{0, 0};
                    this.c.getLocationInWindow(arrn);
                    f -= (float)arrn[1];
                }
                tp tp3 = rw.p((View)this.c).c(f);
                tp3.a(this.B);
                ahl3.a(tp3);
                if (this.j && this.f != null) {
                    ahl3.a(rw.p((View)this.f).c(f));
                }
                ahl3.a(n);
                ahl3.c();
                ahl3.a(this.z);
                this.l = ahl3;
                ahl3.a();
                return;
            }
        }
        this.z.b(null);
    }

    @Override
    public final ahb a(ahc ahc2) {
        if (this.g != null) {
            this.g.c();
        }
        this.b.a(false);
        this.e.b();
        aco aco2 = new aco((ack)this, this.e.getContext(), ahc2);
        if (aco2.e()) {
            aco2.d();
            this.e.a((ahb)aco2);
            this.g(true);
            this.e.sendAccessibilityEvent(32);
            this.g = aco2;
            return aco2;
        }
        return null;
    }

    @Override
    public final void a() {
        this.d.a((Drawable)null);
    }

    @Override
    public final void a(int n) {
        this.a(this.a.getString(n));
    }

    @Override
    public final void a(int n, int n2) {
        int n3 = this.d.l();
        if ((n2 & 4) != 0) {
            this.r = true;
        }
        this.d.a(n & n2 | n3 & ~ n2);
    }

    @Override
    public final void a(Configuration configuration) {
        super.h(aha.a(this.a).a());
    }

    @Override
    public final void a(Drawable drawable) {
        this.d.b(drawable);
    }

    @Override
    public final void a(View view, yu yu2) {
        view.setLayoutParams((ViewGroup.LayoutParams)yu2);
        this.d.a(view);
    }

    @Override
    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(boolean bl2) {
        int n = bl2 ? 2 : 0;
        this.a(n, 2);
    }

    @Override
    public final void b() {
        this.a(0, 8);
    }

    @Override
    public final void b(int n) {
        this.d.b(n);
    }

    @Override
    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b(boolean bl2) {
        int n = bl2 ? 4 : 0;
        this.a(n, 4);
    }

    @Override
    public final int c() {
        return this.d.l();
    }

    @Override
    public final void c(int n) {
        this.v = n;
    }

    @Override
    public final void c(boolean bl2) {
        if (!this.r) {
            this.b(bl2);
        }
    }

    @Override
    public final void d(boolean bl2) {
        this.y = bl2;
        if (!bl2 && this.l != null) {
            this.l.b();
        }
    }

    @Override
    public final boolean d() {
        int n = this.c.getHeight();
        if (this.x && (n == 0 || this.b.b() < n)) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final Context e() {
        if (this.q != null) return this.q;
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(acq.e, typedValue, true);
        int n = typedValue.resourceId;
        if (n != 0) {
            this.q = new ContextThemeWrapper(this.a, n);
            return this.q;
        }
        this.q = this.a;
        return this.q;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void e(boolean bl2) {
        if (bl2 == this.s) {
            return;
        }
        this.s = bl2;
        int n = this.t.size();
        int n2 = 0;
        while (n2 < n) {
            this.t.get(n2);
            ++n2;
        }
    }

    @Override
    public final void f(boolean bl2) {
        this.j = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g(boolean bl2) {
        tp tp2;
        tp tp3;
        if (bl2) {
            if (!this.w) {
                this.w = true;
                if (this.b != null) {
                    ActionBarOverlayLayout.a();
                }
                super.i(false);
            }
        } else if (this.w) {
            this.w = false;
            if (this.b != null) {
                ActionBarOverlayLayout.a();
            }
            super.i(false);
        }
        if (bl2) {
            tp3 = this.d.a(4, 100);
            tp2 = this.e.a(0, 200);
        } else {
            tp2 = this.d.a(0, 200);
            tp3 = this.e.a(8, 100);
        }
        ahl ahl2 = new ahl();
        ahl2.a.add((Object)tp3);
        View view = (View)tp3.a.get();
        long l = view != null ? tp.e.a(view) : 0;
        tp2.b(l);
        ahl2.a.add((Object)tp2);
        ahl2.a();
    }

    @Override
    public final boolean g() {
        if (this.d != null && this.d.c()) {
            this.d.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean h() {
        ViewGroup viewGroup = this.d.a();
        if (viewGroup != null && !viewGroup.hasFocus()) {
            viewGroup.requestFocus();
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        if (this.k) {
            this.k = false;
            this.i(true);
        }
    }

    @Override
    public final void k() {
        if (!this.k) {
            this.k = true;
            this.i(true);
        }
    }

    @Override
    public final void l() {
        if (this.l != null) {
            this.l.b();
            this.l = null;
        }
    }
}

