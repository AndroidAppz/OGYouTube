/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.PointF
 *  android.support.v7.widget.RecyclerView
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.String
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public abstract class amz
extends aos {
    private LinearInterpolator h = new LinearInterpolator();
    private DecelerateInterpolator i = new DecelerateInterpolator();
    private PointF j;
    private final float k;
    private int l = 0;
    private int m = 0;

    public amz(Context context) {
        this.k = 25.0f / (float)context.getResources().getDisplayMetrics().densityDpi;
    }

    private static int a(int n, int n2) {
        int n3 = n - n2;
        if (n * n3 <= 0) {
            n3 = 0;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(int n, int n2, int n3, int n4, int n5) {
        switch (n5) {
            default: {
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            case -1: {
                return n3 - n;
            }
            case 1: {
                return n4 - n2;
            }
            case 0: 
        }
        int n6 = n3 - n;
        if (n6 > 0) return n6;
        n6 = n4 - n2;
        if (n6 < 0) return n6;
        return 0;
    }

    private final int b(int n) {
        return (int)Math.ceil((double)((float)Math.abs((int)n) * this.k));
    }

    public abstract PointF a(int var1);

    @Override
    protected final void a() {
        this.m = 0;
        this.l = 0;
        this.j = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void a(int n, int n2, aot aot2) {
        PointF pointF;
        if (this.b.i.t() == 0) {
            this.d();
            return;
        }
        this.l = amz.a(this.l, n);
        this.m = amz.a(this.m, n2);
        if (this.l != 0 || this.m != 0) return;
        {
            pointF = this.a(this.a);
            if (pointF == null || pointF.x == 0.0f && pointF.y == 0.0f) {
                Log.e((String)"LinearSmoothScroller", (String)"To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll");
                aot2.d = this.a;
                this.d();
                return;
            }
        }
        double d2 = Math.sqrt((double)(pointF.x * pointF.x + pointF.y * pointF.y));
        pointF.x = (float)((double)pointF.x / d2);
        pointF.y = (float)((double)pointF.y / d2);
        this.j = pointF;
        this.l = (int)(10000.0f * pointF.x);
        this.m = (int)(10000.0f * pointF.y);
        int n3 = super.b(10000);
        aot2.a((int)(1.2f * (float)this.l), (int)(1.2f * (float)this.m), (int)(1.2f * (float)n3), (Interpolator)this.h);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void a(View view, aot aot2) {
        int n;
        int n2;
        int n3 = this.b();
        aoh aoh2 = this.c;
        if (aoh2 == null || !aoh2.i()) {
            n2 = 0;
        } else {
            aoi aoi2 = (aoi)view.getLayoutParams();
            n2 = amz.a(aoh.e(view) - aoi2.leftMargin, aoh.g(view) + aoi2.rightMargin, aoh2.u(), aoh2.n - aoh2.w(), n3);
        }
        int n4 = this.c();
        aoh aoh3 = this.c;
        int n5 = 0;
        if (aoh3 != null) {
            boolean bl2 = aoh3.j();
            n5 = 0;
            if (bl2) {
                aoi aoi3 = (aoi)view.getLayoutParams();
                n5 = amz.a(aoh.f(view) - aoi3.topMargin, aoh.h(view) + aoi3.bottomMargin, aoh3.v(), aoh3.o - aoh3.x(), n4);
            }
        }
        if ((n = (int)Math.ceil((double)((double)super.b((int)Math.sqrt((double)(n2 * n2 + n5 * n5))) / 0.3356))) > 0) {
            aot2.a(- n2, - n5, n, (Interpolator)this.i);
        }
    }

    public int b() {
        if (this.j == null || this.j.x == 0.0f) {
            return 0;
        }
        if (this.j.x > 0.0f) {
            return 1;
        }
        return -1;
    }

    public int c() {
        if (this.j == null || this.j.y == 0.0f) {
            return 0;
        }
        if (this.j.y > 0.0f) {
            return 1;
        }
        return -1;
    }
}

