/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  ed
 *  ee
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  rw
 *  tp
 *  uf
 */
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class alx
extends apz {
    ArrayList a = new ArrayList();
    ArrayList b = new ArrayList();
    ArrayList c = new ArrayList();
    ArrayList d = new ArrayList();
    ArrayList e = new ArrayList();
    ArrayList f = new ArrayList();
    ArrayList g = new ArrayList();
    private ArrayList m = new ArrayList();
    private ArrayList n = new ArrayList();
    private ArrayList o = new ArrayList();
    private ArrayList p = new ArrayList();

    private final void a(amg amg2) {
        if (amg2.a != null) {
            super.a(amg2, amg2.a);
        }
        if (amg2.b != null) {
            super.a(amg2, amg2.b);
        }
    }

    private static void a(List list) {
        for (int i = -1 + list.size(); i >= 0; --i) {
            rw.p((View)((aow)list.get((int)i)).a).a();
        }
    }

    private final void a(List list, aow aow2) {
        for (int i = -1 + list.size(); i >= 0; --i) {
            amg amg2 = (amg)list.get(i);
            if (!super.a(amg2, aow2) || amg2.a != null || amg2.b != null) continue;
            list.remove((Object)amg2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean a(amg amg2, aow aow2) {
        if (amg2.b == aow2) {
            amg2.b = null;
        } else {
            if (amg2.a != aow2) {
                return false;
            }
            amg2.a = null;
        }
        rw.c((View)aow2.a, (float)1.0f);
        rw.a((View)aow2.a, (float)0.0f);
        rw.b((View)aow2.a, (float)0.0f);
        this.e(aow2);
        return true;
    }

    private final void g(aow aow2) {
        View view = aow2.a;
        ed.a.a(view);
        this.c(aow2);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        boolean bl2 = !this.m.isEmpty();
        boolean bl3 = !this.o.isEmpty();
        boolean bl4 = !this.p.isEmpty();
        boolean bl5 = !this.n.isEmpty();
        if (!(bl2 || bl3 || bl5 || bl4)) {
            return;
        }
        for (aow aow2 : this.m) {
            tp tp2 = rw.p((View)aow2.a);
            this.f.add((Object)aow2);
            tp2.a(this.j).a(0.0f).a((uf)new amb(this, aow2, tp2)).b();
        }
        this.m.clear();
        if (bl3) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)this.o);
            this.b.add((Object)arrayList);
            this.o.clear();
            aly aly2 = new aly(this, arrayList);
            if (bl2) {
                rw.a((View)((amh)arrayList.get((int)0)).a.a, (Runnable)aly2, (long)this.j);
            } else {
                aly2.run();
            }
        }
        if (bl4) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)this.p);
            this.c.add((Object)arrayList);
            this.p.clear();
            alz alz2 = new alz(this, arrayList);
            if (bl2) {
                rw.a((View)((amg)arrayList.get((int)0)).a.a, (Runnable)alz2, (long)this.j);
            } else {
                alz2.run();
            }
        }
        if (!bl5) return;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection)this.n);
        this.a.add((Object)arrayList);
        this.n.clear();
        ama ama2 = new ama(this, arrayList);
        if (!(bl2 || bl3 || bl4)) {
            ama2.run();
            return;
        }
        long l = bl2 ? this.j : 0;
        long l2 = bl3 ? this.k : 0;
        long l3 = bl4 ? this.l : 0;
        long l4 = l + Math.max((long)l2, (long)l3);
        rw.a((View)((aow)arrayList.get((int)0)).a, (Runnable)ama2, (long)l4);
    }

    @Override
    public final boolean a(aow aow2) {
        super.g(aow2);
        this.m.add((Object)aow2);
        return true;
    }

    @Override
    public final boolean a(aow aow2, int n, int n2, int n3, int n4) {
        View view = aow2.a;
        int n5 = (int)((float)n + rw.l((View)aow2.a));
        int n6 = (int)((float)n2 + rw.m((View)aow2.a));
        this.g(aow2);
        int n7 = n3 - n5;
        int n8 = n4 - n6;
        if (n7 == 0 && n8 == 0) {
            this.e(aow2);
            return false;
        }
        if (n7 != 0) {
            rw.a((View)view, (float)(- n7));
        }
        if (n8 != 0) {
            rw.b((View)view, (float)(- n8));
        }
        this.o.add((Object)new amh(aow2, n5, n6, n3, n4));
        return true;
    }

    @Override
    public final boolean a(aow aow2, aow aow3, int n, int n2, int n3, int n4) {
        if (aow2 == aow3) {
            return this.a(aow2, n, n2, n3, n4);
        }
        float f2 = rw.l((View)aow2.a);
        float f3 = rw.m((View)aow2.a);
        float f4 = rw.e((View)aow2.a);
        this.g(aow2);
        int n5 = (int)((float)(n3 - n) - f2);
        int n6 = (int)((float)(n4 - n2) - f3);
        rw.a((View)aow2.a, (float)f2);
        rw.b((View)aow2.a, (float)f3);
        rw.c((View)aow2.a, (float)f4);
        if (aow3 != null) {
            this.g(aow3);
            rw.a((View)aow3.a, (float)(- n5));
            rw.b((View)aow3.a, (float)(- n6));
            rw.c((View)aow3.a, (float)0.0f);
        }
        this.p.add((Object)new amg(aow2, aow3, n, n2, n3, n4));
        return true;
    }

    @Override
    public final boolean a(aow aow2, List list) {
        if (!list.isEmpty() || super.a(aow2, list)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        if (!(this.n.isEmpty() && this.p.isEmpty() && this.o.isEmpty() && this.m.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(aow aow2) {
        super.g(aow2);
        rw.c((View)aow2.a, (float)0.0f);
        this.n.add((Object)aow2);
        return true;
    }

    final void c() {
        if (!this.b()) {
            this.e();
        }
    }

    @Override
    public final void c(aow aow2) {
        View view = aow2.a;
        rw.p((View)view).a();
        for (int i = -1 + this.o.size(); i >= 0; --i) {
            if (((amh)this.o.get((int)i)).a != aow2) continue;
            rw.b((View)view, (float)0.0f);
            rw.a((View)view, (float)0.0f);
            this.e(aow2);
            this.o.remove(i);
        }
        super.a((List)this.p, aow2);
        if (this.m.remove((Object)aow2)) {
            rw.c((View)view, (float)1.0f);
            this.e(aow2);
        }
        if (this.n.remove((Object)aow2)) {
            rw.c((View)view, (float)1.0f);
            this.e(aow2);
        }
        for (int j = -1 + this.c.size(); j >= 0; --j) {
            ArrayList arrayList = (ArrayList)this.c.get(j);
            super.a((List)arrayList, aow2);
            if (!arrayList.isEmpty()) continue;
            this.c.remove(j);
        }
        block2 : for (int k = -1 + this.b.size(); k >= 0; --k) {
            ArrayList arrayList = (ArrayList)this.b.get(k);
            int n = -1 + arrayList.size();
            do {
                if (n < 0) continue block2;
                if (((amh)arrayList.get((int)n)).a == aow2) {
                    rw.b((View)view, (float)0.0f);
                    rw.a((View)view, (float)0.0f);
                    this.e(aow2);
                    arrayList.remove(n);
                    if (!arrayList.isEmpty()) continue block2;
                    this.b.remove(k);
                    continue block2;
                }
                --n;
            } while (true);
        }
        for (int i2 = -1 + this.a.size(); i2 >= 0; --i2) {
            ArrayList arrayList = (ArrayList)this.a.get(i2);
            if (!arrayList.remove((Object)aow2)) continue;
            rw.c((View)view, (float)1.0f);
            this.e(aow2);
            if (!arrayList.isEmpty()) continue;
            this.a.remove(i2);
        }
        this.f.remove((Object)aow2);
        this.d.remove((Object)aow2);
        this.g.remove((Object)aow2);
        this.e.remove((Object)aow2);
        this.c();
    }

    @Override
    public final void d() {
        for (int i = -1 + this.o.size(); i >= 0; --i) {
            amh amh2 = (amh)this.o.get(i);
            View view = amh2.a.a;
            rw.b((View)view, (float)0.0f);
            rw.a((View)view, (float)0.0f);
            this.e(amh2.a);
            this.o.remove(i);
        }
        for (int j = -1 + this.m.size(); j >= 0; --j) {
            this.e((aow)this.m.get(j));
            this.m.remove(j);
        }
        for (int k = -1 + this.n.size(); k >= 0; --k) {
            aow aow2 = (aow)this.n.get(k);
            rw.c((View)aow2.a, (float)1.0f);
            this.e(aow2);
            this.n.remove(k);
        }
        for (int i2 = -1 + this.p.size(); i2 >= 0; --i2) {
            this.a((amg)this.p.get(i2));
        }
        this.p.clear();
        if (!this.b()) {
            return;
        }
        for (int i3 = -1 + this.b.size(); i3 >= 0; --i3) {
            ArrayList arrayList = (ArrayList)this.b.get(i3);
            for (int i4 = -1 + arrayList.size(); i4 >= 0; --i4) {
                amh amh3 = (amh)arrayList.get(i4);
                View view = amh3.a.a;
                rw.b((View)view, (float)0.0f);
                rw.a((View)view, (float)0.0f);
                this.e(amh3.a);
                arrayList.remove(i4);
                if (!arrayList.isEmpty()) continue;
                this.b.remove((Object)arrayList);
            }
        }
        for (int i5 = -1 + this.a.size(); i5 >= 0; --i5) {
            ArrayList arrayList = (ArrayList)this.a.get(i5);
            for (int i6 = -1 + arrayList.size(); i6 >= 0; --i6) {
                aow aow3 = (aow)arrayList.get(i6);
                rw.c((View)aow3.a, (float)1.0f);
                this.e(aow3);
                arrayList.remove(i6);
                if (!arrayList.isEmpty()) continue;
                this.a.remove((Object)arrayList);
            }
        }
        for (int i7 = -1 + this.c.size(); i7 >= 0; --i7) {
            ArrayList arrayList = (ArrayList)this.c.get(i7);
            for (int i8 = -1 + arrayList.size(); i8 >= 0; --i8) {
                this.a((amg)arrayList.get(i8));
                if (!arrayList.isEmpty()) continue;
                this.c.remove((Object)arrayList);
            }
        }
        alx.a((List)this.f);
        alx.a((List)this.e);
        alx.a((List)this.d);
        alx.a((List)this.g);
        this.e();
    }
}

