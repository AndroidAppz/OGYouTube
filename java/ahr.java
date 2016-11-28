/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  java.lang.Object
 *  java.util.ArrayList
 *  rw
 *  sj
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

public abstract class ahr
implements ail {
    public Context a;
    public Context b;
    public ahw c;
    public aim d;
    public ain e;
    private LayoutInflater f;
    private int g;
    private int h;

    public ahr(Context context, int n, int n2) {
        this.a = context;
        this.f = LayoutInflater.from((Context)context);
        this.g = n;
        this.h = n2;
    }

    public ain a(ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (ain)this.f.inflate(this.g, viewGroup, false);
            this.e.a(this.c);
            this.b(true);
        }
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    public View a(aia aia2, View view, ViewGroup viewGroup) {
        aio aio2 = view instanceof aio ? (aio)view : (aio)this.f.inflate(this.h, viewGroup, false);
        this.a(aia2, aio2);
        return (View)aio2;
    }

    @Override
    public void a(ahw ahw2, boolean bl2) {
        if (this.d != null) {
            this.d.a(ahw2, bl2);
        }
    }

    public abstract void a(aia var1, aio var2);

    @Override
    public void a(Context context, ahw ahw2) {
        this.b = context;
        LayoutInflater.from((Context)this.b);
        this.c = ahw2;
    }

    @Override
    public boolean a() {
        return false;
    }

    public boolean a(aia aia2) {
        return true;
    }

    @Override
    public boolean a(air air2) {
        if (this.d != null) {
            return this.d.a(air2);
        }
        return false;
    }

    public boolean a(ViewGroup viewGroup, int n) {
        viewGroup.removeViewAt(n);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void b(boolean bl2) {
        int n;
        ViewGroup viewGroup = (ViewGroup)this.e;
        if (viewGroup == null) {
            return;
        }
        if (this.c == null) {
            n = 0;
        } else {
            this.c.i();
            ArrayList arrayList = this.c.h();
            int n2 = arrayList.size();
            n = 0;
            for (int i = 0; i < n2; ++i) {
                int n3;
                aia aia2 = (aia)arrayList.get(i);
                if (this.a(aia2)) {
                    View view = viewGroup.getChildAt(n);
                    aia aia3 = view instanceof aio ? ((aio)view).a() : null;
                    View view2 = this.a(aia2, view, viewGroup);
                    if (aia2 != aia3) {
                        view2.setPressed(false);
                        rw.a.y(view2);
                    }
                    if (view2 != view) {
                        ViewGroup viewGroup2 = (ViewGroup)view2.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view2);
                        }
                        ((ViewGroup)this.e).addView(view2, n);
                    }
                    n3 = n + 1;
                } else {
                    n3 = n;
                }
                n = n3;
            }
        }
        while (n < viewGroup.getChildCount()) {
            if (this.a(viewGroup, n)) continue;
            ++n;
        }
    }

    @Override
    public final boolean b(aia aia2) {
        return false;
    }

    @Override
    public final boolean c(aia aia2) {
        return false;
    }
}

