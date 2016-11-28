/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  rw
 *  ut
 *  uy
 *  ve
 */
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class aox
extends pl {
    final RecyclerView d;
    final pl e;

    public aox(RecyclerView recyclerView) {
        this.e = new aoy((aox)this);
        this.d = recyclerView;
    }

    @Override
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)RecyclerView.class.getName());
        if (view instanceof RecyclerView && !this.a()) {
            RecyclerView recyclerView = (RecyclerView)view;
            if (recyclerView.i != null) {
                recyclerView.i.a(accessibilityEvent);
            }
        }
    }

    @Override
    public final void a(View view, ut ut2) {
        super.a(view, ut2);
        ut2.a((CharSequence)RecyclerView.class.getName());
        if (!this.a() && this.d.i != null) {
            aoh aoh2 = this.d.i;
            aom aom2 = aoh2.g.c;
            aou aou2 = aoh2.g.z;
            if (rw.b((View)aoh2.g, (int)-1) || rw.a((View)aoh2.g, (int)-1)) {
                ut2.a(8192);
                ut2.d(true);
            }
            if (rw.b((View)aoh2.g, (int)1) || rw.a((View)aoh2.g, (int)1)) {
                ut2.a(4096);
                ut2.d(true);
            }
            int n = aoh2.a(aom2, aou2);
            int n2 = aoh2.b(aom2, aou2);
            ve ve2 = new ve(ut.a.a(n, n2, false, 0));
            ut.a.b(ut2.b, ve2.a);
        }
    }

    final boolean a() {
        RecyclerView recyclerView = this.d;
        if (!recyclerView.m || recyclerView.r || recyclerView.d.d()) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(View var1, int var2_3, Bundle var3_2) {
        if (super.a(var1, var2_3, var3_2)) {
            return true;
        }
        var4_5 = this.a();
        var5_4 = false;
        if (var4_5 != false) return var5_4;
        var6_6 = this.d.i;
        var5_4 = false;
        if (var6_6 == null) return var5_4;
        var7_7 = this.d.i;
        var10_8 = var7_7.g;
        var5_4 = false;
        if (var10_8 == null) return var5_4;
        switch (var2_3) {
            default: {
                var13_9 = 0;
                var12_10 = 0;
                ** GOTO lbl34
            }
            case 8192: {
                var11_11 = rw.b((View)var7_7.g, (int)-1) != false ? - var7_7.o - var7_7.v() - var7_7.x() : 0;
            }
            case 4096: {
                var11_11 = rw.b((View)var7_7.g, (int)1) != false ? var7_7.o - var7_7.v() - var7_7.x() : 0;
                if (!rw.a((View)var7_7.g, (int)1)) ** GOTO lbl-1000
                var14_13 = var7_7.n - var7_7.u() - var7_7.w();
                var12_10 = var11_11;
                var13_9 = var14_13;
                ** GOTO lbl34
            }
        }
        if (rw.a((View)var7_7.g, (int)-1)) {
            var15_12 = - var7_7.n - var7_7.u() - var7_7.w();
            var12_10 = var11_11;
            var13_9 = var15_12;
        } else lbl-1000: // 2 sources:
        {
            var12_10 = var11_11;
            var13_9 = 0;
        }
lbl34: // 4 sources:
        if (var12_10 == 0) {
            var5_4 = false;
            if (var13_9 == 0) return var5_4;
        }
        var7_7.g.scrollBy(var13_9, var12_10);
        return true;
    }
}

