/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 */
import android.view.View;

final class amu {
    int a;
    int b;
    boolean c;
    final /* synthetic */ ams d;

    amu(ams ams2) {
        this.d = ams2;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a() {
        int n = this.c ? this.d.c.c() : this.d.c.b();
        this.b = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(View view) {
        this.b = this.c ? this.d.c.b(view) + this.d.c.a() : this.d.c.a(view);
        this.a = ams.a(view);
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + '}';
    }
}

