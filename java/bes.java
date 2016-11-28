/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  pg
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class bes
implements axx,
axy {
    private final List a;
    private final pg b;
    private int c;
    private avz d;
    private axy e;
    private List f;

    bes(List list, pg pg2) {
        this.b = pg2;
        blm.a((Collection)list);
        this.a = list;
        this.c = 0;
    }

    private final void e() {
        if (this.c < -1 + this.a.size()) {
            this.c = 1 + this.c;
            this.a(this.d, this.e);
            return;
        }
        this.e.a(new bak("Fetch failed", (List)new ArrayList((Collection)this.f)));
    }

    @Override
    public final void a() {
        this.b.a((Object)this.f);
        this.f = null;
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((axx)iterator.next()).a();
        }
    }

    @Override
    public final void a(avz avz2, axy axy2) {
        this.d = avz2;
        this.e = axy2;
        this.f = (List)this.b.a();
        ((axx)this.a.get(this.c)).a(avz2, (axy)this);
    }

    @Override
    public final void a(Exception exception) {
        this.f.add((Object)exception);
        super.e();
    }

    @Override
    public final void a(Object object) {
        if (object != null) {
            this.e.a(object);
            return;
        }
        super.e();
    }

    @Override
    public final void b() {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((axx)iterator.next()).b();
        }
    }

    @Override
    public final Class c() {
        return ((axx)this.a.get(0)).c();
    }

    @Override
    public final axj d() {
        return ((axx)this.a.get(0)).d();
    }
}

