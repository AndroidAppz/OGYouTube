/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.List
 */
import java.io.File;
import java.util.List;

final class ayw
implements axy,
ayz {
    private List a;
    private final azb b;
    private final aza c;
    private int d;
    private axo e;
    private List f;
    private int g;
    private volatile bem h;
    private File i;

    ayw(azb azb2, aza aza2) {
        super(azb2.c(), azb2, aza2);
    }

    ayw(List list, azb azb2, aza aza2) {
        this.d = -1;
        this.a = list;
        this.b = azb2;
        this.c = aza2;
    }

    private final boolean c() {
        if (this.g < this.f.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(Exception exception) {
        this.c.a(this.e, exception, this.h.c, axj.c);
    }

    @Override
    public final void a(Object object) {
        this.c.a(this.e, object, this.h.c, axj.c, this.e);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a() {
        boolean bl2 = false;
        while (this.f == null || !this.c()) {
            int n = this.d = 1 + this.d;
            int n2 = this.a.size();
            bl2 = false;
            if (n >= n2) return bl2;
            {
                axo axo2 = (axo)this.a.get(this.d);
                ayx ayx2 = new ayx(axo2, this.b.n);
                this.i = this.b.a().a(ayx2);
                if (this.i == null) continue;
                this.e = axo2;
                this.f = this.b.a(this.i);
                this.g = 0;
                continue;
            }
        }
        this.h = null;
        while (!bl2 && this.c()) {
            boolean bl3;
            List list = this.f;
            int n = this.g;
            this.g = n + 1;
            this.h = ((bel)list.get(n)).a((Object)this.i, this.b.e, this.b.f, this.b.i);
            if (this.h != null && this.b.a(this.h.c.c())) {
                bl3 = true;
                this.h.c.a(this.b.o, this);
            } else {
                bl3 = bl2;
            }
            bl2 = bl3;
        }
        return bl2;
    }

    @Override
    public final void b() {
        bem bem2 = this.h;
        if (bem2 != null) {
            bem2.c.b();
        }
    }
}

