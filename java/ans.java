/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

final class ans
extends anq {
    ans(aoh aoh2) {
        super(aoh2, 0);
    }

    @Override
    public final int a(View view) {
        aoi aoi2 = (aoi)view.getLayoutParams();
        return aoh.f(view) - aoi2.topMargin;
    }

    @Override
    public final void a(int n) {
        aoh aoh2 = this.a;
        if (aoh2.g != null) {
            RecyclerView recyclerView = aoh2.g;
            int n2 = recyclerView.e.a();
            for (int i = 0; i < n2; ++i) {
                recyclerView.e.b(i).offsetTopAndBottom(n);
            }
        }
    }

    @Override
    public final int b() {
        return this.a.v();
    }

    @Override
    public final int b(View view) {
        aoi aoi2 = (aoi)view.getLayoutParams();
        return aoh.h(view) + aoi2.bottomMargin;
    }

    @Override
    public final int c() {
        return this.a.o - this.a.x();
    }

    @Override
    public final int c(View view) {
        aoi aoi2 = (aoi)view.getLayoutParams();
        return aoh.d(view) + aoi2.topMargin + aoi2.bottomMargin;
    }

    @Override
    public final int d() {
        return this.a.o;
    }

    @Override
    public final int d(View view) {
        aoi aoi2 = (aoi)view.getLayoutParams();
        return aoh.c(view) + aoi2.leftMargin + aoi2.rightMargin;
    }

    @Override
    public final int e() {
        return this.a.o - this.a.v() - this.a.x();
    }

    @Override
    public final int f() {
        return this.a.x();
    }

    @Override
    public final int g() {
        return this.a.m;
    }

    @Override
    public final int h() {
        return this.a.l;
    }
}

