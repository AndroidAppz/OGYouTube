/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  rw
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public final class anx
implements alt {
    private /* synthetic */ RecyclerView a;

    public anx(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override
    public final int a() {
        return this.a.getChildCount();
    }

    @Override
    public final int a(View view) {
        return this.a.indexOfChild(view);
    }

    @Override
    public final void a(int n) {
        View view = this.a.getChildAt(n);
        if (view != null) {
            RecyclerView.a((View)view);
        }
        this.a.removeViewAt(n);
    }

    @Override
    public final void a(View view, int n) {
        this.a.addView(view, n);
        RecyclerView.a((View)view);
    }

    @Override
    public final void a(View view, int n, ViewGroup.LayoutParams layoutParams) {
        aow aow2 = RecyclerView.a((View)view);
        if (aow2 != null) {
            if (!aow2.n() && !aow2.b()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + aow2);
            }
            aow2.i();
        }
        RecyclerView.a((RecyclerView)this.a, (View)view, (int)n, (ViewGroup.LayoutParams)layoutParams);
    }

    @Override
    public final View b(int n) {
        return this.a.getChildAt(n);
    }

    @Override
    public final aow b(View view) {
        return RecyclerView.a((View)view);
    }

    @Override
    public final void b() {
        int n = this.a.getChildCount();
        for (int i = 0; i < n; ++i) {
            RecyclerView.a((View)this.b(i));
        }
        this.a.removeAllViews();
    }

    @Override
    public final void c(int n) {
        aow aow2;
        View view = this.b(n);
        if (view != null && (aow2 = RecyclerView.a((View)view)) != null) {
            if (aow2.n() && !aow2.b()) {
                throw new IllegalArgumentException("called detach on an already detached child " + aow2);
            }
            aow2.b(256);
        }
        RecyclerView.a((RecyclerView)this.a, (int)n);
    }

    @Override
    public final void c(View view) {
        aow aow2 = RecyclerView.a((View)view);
        if (aow2 != null) {
            aow2.m = rw.d((View)aow2.a);
            rw.c((View)aow2.a, (int)4);
        }
    }

    @Override
    public final void d(View view) {
        aow aow2 = RecyclerView.a((View)view);
        if (aow2 != null) {
            rw.c((View)aow2.a, (int)aow2.m);
            aow2.m = 0;
        }
    }
}

