/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class alr {
    public final alt a;
    public final als b;
    public final List c;

    public alr(alt alt2) {
        this.a = alt2;
        this.b = new als();
        this.c = new ArrayList();
    }

    public final int a() {
        return this.a.a() - this.c.size();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final int a(int n) {
        if (n < 0) {
            return -1;
        }
        int n2 = this.a.a();
        int n3 = n;
        while (n3 < n2) {
            int n4 = n - (n3 - this.b.e(n3));
            if (n4 == 0) {
                while (this.b.c(n3)) {
                    ++n3;
                }
                return n3;
            }
            n3 += n4;
        }
        return -1;
    }

    public final void a(View view) {
        this.c.add((Object)view);
        this.a.c(view);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(View view, int n, ViewGroup.LayoutParams layoutParams, boolean bl2) {
        int n2 = n < 0 ? this.a.a() : this.a(n);
        this.b.a(n2, bl2);
        if (bl2) {
            this.a(view);
        }
        this.a.a(view, n2, layoutParams);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(View view, int n, boolean bl2) {
        int n2 = n < 0 ? this.a.a() : this.a(n);
        this.b.a(n2, bl2);
        if (bl2) {
            this.a(view);
        }
        this.a.a(view, n2);
    }

    public final int b() {
        return this.a.a();
    }

    public final View b(int n) {
        int n2 = this.a(n);
        return this.a.b(n2);
    }

    final boolean b(View view) {
        if (this.c.remove((Object)view)) {
            this.a.d(view);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    final int c(View view) {
        int n = this.a.a(view);
        if (n == -1 || this.b.c(n)) {
            return -1;
        }
        return n - this.b.e(n);
    }

    public final View c(int n) {
        return this.a.b(n);
    }

    final void d(int n) {
        int n2 = this.a(n);
        this.b.d(n2);
        this.a.c(n2);
    }

    final boolean d(View view) {
        return this.c.contains((Object)view);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}

