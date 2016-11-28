/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  java.lang.Object
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class aos {
    public int a = -1;
    RecyclerView b;
    aoh c;
    boolean d;
    public boolean e;
    View f;
    final aot g = new aot();

    protected abstract void a();

    protected abstract void a(int var1, int var2, aot var3);

    protected abstract void a(View var1, aot var2);

    public final void d() {
        if (!this.e) {
            return;
        }
        this.a();
        this.b.z.a = -1;
        this.f = null;
        this.a = -1;
        this.d = false;
        this.e = false;
        aoh aoh2 = this.c;
        if (aoh2.h == this) {
            aoh2.h = null;
        }
        this.c = null;
        this.b = null;
    }
}

