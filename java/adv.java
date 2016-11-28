/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.ComponentName;
import android.content.Context;

public class adv {
    final Context a;
    final ady b;
    final adx c;
    adw d;
    adu e;
    boolean f;
    public aea g;
    boolean h;

    public adv(Context context) {
        super(context, null);
    }

    adv(Context context, ady ady2) {
        this.c = new adx((adv)this);
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.a = context;
        if (ady2 == null) {
            this.b = new ady(new ComponentName(context, this.getClass()));
            return;
        }
        this.b = ady2;
    }

    public adz a(String string) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(adu adu2) {
        aef.d();
        if (this.e == adu2) return;
        if (this.e != null && this.e.equals(adu2)) {
            return;
        }
        this.e = adu2;
        if (this.f) return;
        this.f = true;
        this.c.sendEmptyMessage(2);
    }

    public final void a(adw adw2) {
        aef.d();
        this.d = adw2;
    }

    public final void a(aea aea2) {
        aef.d();
        if (this.g != aea2) {
            this.g = aea2;
            if (!this.h) {
                this.h = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    public void b(adu adu2) {
    }
}

