/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
import android.content.Context;
import android.os.Build;

final class aer
implements aga {
    final afv a;
    boolean b;
    private /* synthetic */ aej c;

    /*
     * Enabled aggressive block sorting
     */
    public aer(aej aej2, Object object) {
        void var4_5;
        this.c = aej2;
        Context context = aej2.a;
        if (Build.VERSION.SDK_INT >= 16) {
            afw afw2 = new afw(context, object);
        } else {
            afy afy2 = new afy(context, object);
        }
        this.a = var4_5;
        this.a.b = this;
        this.a();
    }

    public final void a() {
        this.a.a(this.c.f);
    }

    @Override
    public final void a(int n) {
        if (!this.b && this.c.j != null) {
            this.c.j.a(n);
        }
    }

    @Override
    public final void b(int n) {
        if (!this.b && this.c.j != null) {
            this.c.j.b(n);
        }
    }
}

