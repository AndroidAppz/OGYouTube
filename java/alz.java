/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  rw
 *  tp
 *  uf
 */
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class alz
implements Runnable {
    private /* synthetic */ ArrayList a;
    private /* synthetic */ alx b;

    alz(alx alx2, ArrayList arrayList) {
        this.b = alx2;
        this.a = arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        Iterator iterator = this.a.iterator();
        do {
            if (!iterator.hasNext()) {
                this.a.clear();
                this.b.c.remove((Object)this.a);
                return;
            }
            amg amg2 = (amg)iterator.next();
            alx alx2 = this.b;
            aow aow2 = amg2.a;
            View view = aow2 == null ? null : aow2.a;
            aow aow3 = amg2.b;
            View view2 = aow3 != null ? aow3.a : null;
            if (view == null) continue;
            tp tp2 = rw.p((View)view).a(alx2.l);
            alx2.g.add((Object)amg2.a);
            tp2.b((float)(amg2.e - amg2.c));
            tp2.c((float)(amg2.f - amg2.d));
            tp2.a(0.0f).a((uf)new ame(alx2, amg2, tp2)).b();
            if (view2 == null) continue;
            tp tp3 = rw.p((View)view2);
            alx2.g.add((Object)amg2.b);
            tp3.b(0.0f).c(0.0f).a(alx2.l).a(1.0f).a((uf)new amf(alx2, amg2, tp3, view2)).b();
        } while (true);
    }
}

