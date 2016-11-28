/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.support.v7.widget.ActionMenuView
 *  android.support.v7.widget.Toolbar
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  rw
 *  tp
 *  uf
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;

public final class aqr
implements alw {
    Toolbar a;
    CharSequence b;
    Window.Callback c;
    boolean d;
    private int e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private ajd n;
    private final akj o;
    private int p;
    private Drawable q;

    public aqr(Toolbar toolbar, boolean bl2) {
        super(toolbar, bl2, acy.a, acu.k);
    }

    /*
     * Enabled aggressive block sorting
     */
    private aqr(Toolbar toolbar, boolean bl2, int n, int n2) {
        this.p = 0;
        this.a = toolbar;
        this.b = toolbar.i;
        this.l = toolbar.j;
        boolean bl3 = this.b != null;
        this.k = bl3;
        this.j = toolbar.e();
        if (bl2) {
            CharSequence charSequence;
            int n3;
            Drawable drawable;
            int n4;
            int n5;
            Drawable drawable2;
            int n6;
            aqi aqi2 = aqi.a(toolbar.getContext(), null, ada.a, acq.c);
            CharSequence charSequence2 = aqi2.c(ada.r);
            if (!TextUtils.isEmpty((CharSequence)charSequence2)) {
                this.b(charSequence2);
            }
            if (!TextUtils.isEmpty((CharSequence)(charSequence = aqi2.c(ada.p)))) {
                this.l = charSequence;
                if ((8 & this.e) != 0) {
                    this.a.b(charSequence);
                }
            }
            if ((drawable = aqi2.a(ada.n)) != null) {
                this.a(drawable);
            }
            Drawable drawable3 = aqi2.a(ada.m);
            if (this.j == null && drawable3 != null) {
                this.h = drawable3;
                super.o();
            }
            if ((drawable2 = aqi2.a(ada.l)) != null) {
                this.b(drawable2);
            }
            this.a(aqi2.a(ada.h, 0));
            int n7 = aqi2.e(ada.g, 0);
            if (n7 != 0) {
                this.a(LayoutInflater.from((Context)this.a.getContext()).inflate(n7, (ViewGroup)this.a, false));
                this.a(16 | this.e);
            }
            if ((n5 = aqi2.d(ada.j, 0)) > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = n5;
                this.a.setLayoutParams(layoutParams);
            }
            int n8 = aqi2.b(ada.f, -1);
            int n9 = aqi2.b(ada.e, -1);
            if (n8 >= 0 || n9 >= 0) {
                this.a.a(Math.max((int)n8, (int)0), Math.max((int)n9, (int)0));
            }
            if ((n3 = aqi2.e(ada.s, 0)) != 0) {
                this.a.a(this.a.getContext(), n3);
            }
            if ((n4 = aqi2.e(ada.q, 0)) != 0) {
                this.a.b(this.a.getContext(), n4);
            }
            if ((n6 = aqi2.e(ada.o, 0)) != 0) {
                this.a.a(n6);
            }
            aqi2.a.recycle();
        } else {
            int n10 = 11;
            if (this.a.e() != null) {
                n10 = 15;
            }
            this.e = n10;
        }
        this.o = akj.a();
        if (n != this.p) {
            this.p = n;
            if (TextUtils.isEmpty((CharSequence)this.a.d())) {
                this.b(this.p);
            }
        }
        this.m = this.a.d();
        Drawable drawable = this.o.a(this.a.getContext(), n2, false);
        if (this.q != drawable) {
            this.q = drawable;
            super.q();
        }
        this.a.a((View.OnClickListener)new aqs((aqr)this));
    }

    private final void c(CharSequence charSequence) {
        this.b = charSequence;
        if ((8 & this.e) != 0) {
            this.a.a(charSequence);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void o() {
        int n = 2 & this.e;
        Drawable drawable = null;
        if (n != 0) {
            drawable = (1 & this.e) != 0 ? (this.i != null ? this.i : this.h) : this.h;
        }
        this.a.a(drawable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void p() {
        if ((4 & this.e) == 0) return;
        if (TextUtils.isEmpty((CharSequence)this.m)) {
            this.a.d(this.p);
            return;
        }
        this.a.c(this.m);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void q() {
        if ((4 & this.e) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.j != null ? this.j : this.q;
            toolbar.b(drawable);
        }
    }

    @Override
    public final ViewGroup a() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final tp a(int n, long l) {
        float f2;
        tp tp2 = rw.p((View)this.a);
        if (n == 0) {
            f2 = 1.0f;
            do {
                return tp2.a(f2).a(l).a((uf)new aqt((aqr)this, n));
                break;
            } while (true);
        }
        f2 = 0.0f;
        return tp2.a(f2).a(l).a((uf)new aqt((aqr)this, n));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(int n) {
        int n2 = n ^ this.e;
        this.e = n;
        if (n2 != 0) {
            if ((n2 & 4) != 0) {
                if ((n & 4) != 0) {
                    super.q();
                    super.p();
                } else {
                    this.a.b(null);
                }
            }
            if ((n2 & 3) != 0) {
                super.o();
            }
            if ((n2 & 8) != 0) {
                if ((n & 8) != 0) {
                    this.a.a(this.b);
                    this.a.b(this.l);
                } else {
                    this.a.a(null);
                    this.a.b(null);
                }
            }
            if ((n2 & 16) != 0 && this.g != null) {
                if ((n & 16) == 0) {
                    this.a.removeView(this.g);
                    return;
                }
                this.a.addView(this.g);
            }
        }
    }

    @Override
    public final void a(aim aim2, ahx ahx2) {
        Toolbar toolbar = this.a;
        toolbar.o = aim2;
        toolbar.p = ahx2;
        if (toolbar.a != null) {
            toolbar.a.a(aim2, ahx2);
        }
    }

    @Override
    public final void a(Drawable drawable) {
        this.i = drawable;
        super.o();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(Menu menu, aim aim2) {
        if (this.n == null) {
            this.n = new ajd(this.a.getContext());
        }
        this.n.d = aim2;
        Toolbar toolbar = this.a;
        ahw ahw2 = (ahw)menu;
        ajd ajd2 = this.n;
        if (ahw2 != null || toolbar.a != null) {
            toolbar.h();
            ahw ahw3 = toolbar.a.a;
            if (ahw3 != ahw2) {
                if (ahw3 != null) {
                    ahw3.b(toolbar.m);
                    ahw3.b(toolbar.n);
                }
                if (toolbar.n == null) {
                    toolbar.n = new aqm(toolbar);
                }
                ajd2.j = true;
                if (ahw2 != null) {
                    ahw2.a(ajd2, toolbar.f);
                    ahw2.a(toolbar.n, toolbar.f);
                } else {
                    ajd2.a(toolbar.f, null);
                    toolbar.n.a(toolbar.f, null);
                    ajd2.b(true);
                    toolbar.n.b(true);
                }
                toolbar.a.a(toolbar.g);
                toolbar.a.a(ajd2);
                toolbar.m = ajd2;
            }
        }
    }

    @Override
    public final void a(View view) {
        if (this.g != null && (16 & this.e) != 0) {
            this.a.removeView(this.g);
        }
        this.g = view;
        if (view != null && (16 & this.e) != 0) {
            this.a.addView(this.g);
        }
    }

    @Override
    public final void a(Window.Callback callback) {
        this.c = callback;
    }

    @Override
    public final void a(ape ape2) {
        if (this.f != null && this.f.getParent() == this.a) {
            this.a.removeView(this.f);
        }
        this.f = null;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (!this.k) {
            super.c(charSequence);
        }
    }

    @Override
    public final void a(boolean bl2) {
        Toolbar toolbar = this.a;
        toolbar.q = bl2;
        toolbar.requestLayout();
    }

    @Override
    public final Context b() {
        return this.a.getContext();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b(int n) {
        String string = n == 0 ? null : this.a.getContext().getString(n);
        this.m = string;
        super.p();
    }

    @Override
    public final void b(Drawable drawable) {
        this.j = drawable;
        super.q();
    }

    @Override
    public final void b(CharSequence charSequence) {
        this.k = true;
        super.c(charSequence);
    }

    @Override
    public final boolean c() {
        Toolbar toolbar = this.a;
        if (toolbar.n != null && toolbar.n.a != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.a.c();
    }

    @Override
    public final boolean e() {
        Toolbar toolbar = this.a;
        if (toolbar.getVisibility() == 0 && toolbar.a != null && toolbar.a.b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return this.a.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean g() {
        Toolbar toolbar = this.a;
        if (toolbar.a == null) return false;
        ActionMenuView actionMenuView = toolbar.a;
        if (actionMenuView.c == null) return false;
        ajd ajd2 = actionMenuView.c;
        if (ajd2.m == null && !ajd2.g()) return false;
        return true;
    }

    @Override
    public final boolean h() {
        return this.a.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean i() {
        Toolbar toolbar = this.a;
        if (toolbar.a == null) return false;
        ActionMenuView actionMenuView = toolbar.a;
        if (actionMenuView.c == null || !actionMenuView.c.d()) return false;
        return true;
    }

    @Override
    public final void j() {
        this.d = true;
    }

    @Override
    public final void k() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            toolbar.a.c();
        }
    }

    @Override
    public final int l() {
        return this.e;
    }

    @Override
    public final int m() {
        return this.a.getVisibility();
    }

    @Override
    public final Menu n() {
        return this.a.f();
    }
}

