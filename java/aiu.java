/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  tp
 *  uf
 */
import android.view.View;

public final class aiu
implements uf {
    private boolean a;
    private int b;
    private /* synthetic */ ait c;

    protected aiu(ait ait2) {
        this.c = ait2;
        this.a = false;
    }

    public final aiu a(tp tp2, int n) {
        this.c.e = tp2;
        this.b = n;
        return this;
    }

    public final void a(View view) {
        ait.a(this.c);
        this.a = false;
    }

    public final void b(View view) {
        if (this.a) {
            return;
        }
        this.c.e = null;
        ait.a(this.c, this.b);
    }

    public final void c(View view) {
        this.a = true;
    }
}

