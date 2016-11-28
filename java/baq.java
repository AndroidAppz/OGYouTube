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

final class baq
implements axy,
ayz {
    private final aza a;
    private final azb b;
    private int c = 0;
    private int d = -1;
    private axo e;
    private List f;
    private int g;
    private volatile bem h;
    private File i;
    private bar j;

    public baq(azb azb2, aza aza2) {
        this.b = azb2;
        this.a = aza2;
    }

    private final boolean c() {
        if (this.g < this.f.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(Exception exception) {
        this.a.a(this.j, exception, this.h.c, axj.d);
    }

    @Override
    public final void a(Object object) {
        this.a.a(this.e, object, this.h.c, axj.d, this.j);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a() {
        List list = this.b.c();
        if (list.isEmpty()) {
            return false;
        }
        azb azb2 = this.b;
        List list2 = azb2.c.b.b(azb2.d.getClass(), azb2.g, azb2.k);
        while (this.f == null || !this.c()) {
            this.d = 1 + this.d;
            if (this.d >= list2.size()) {
                this.c = 1 + this.c;
                if (this.c >= list.size()) {
                    return false;
                }
                this.d = 0;
            }
            axo axo2 = (axo)list.get(this.c);
            Class class_ = (Class)list2.get(this.d);
            axv axv2 = this.b.c(class_);
            this.j = new bar(axo2, this.b.n, this.b.e, this.b.f, axv2, class_, this.b.i);
            this.i = this.b.a().a(this.j);
            if (this.i == null) continue;
            this.e = axo2;
            this.f = this.b.a(this.i);
            this.g = 0;
        }
        this.h = null;
        boolean bl2 = false;
        while (!bl2) {
            boolean bl3;
            if (!this.c()) return bl2;
            List list3 = this.f;
            int n = this.g;
            this.g = n + 1;
            this.h = ((bel)list3.get(n)).a((Object)this.i, this.b.e, this.b.f, this.b.i);
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

