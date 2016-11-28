/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  rw
 *  tp
 *  uf
 */
import android.view.View;
import java.util.ArrayList;

final class aly
implements Runnable {
    private /* synthetic */ ArrayList a;
    private /* synthetic */ alx b;

    aly(alx alx2, ArrayList arrayList) {
        this.b = alx2;
        this.a = arrayList;
    }

    public final void run() {
        for (amh amh2 : this.a) {
            alx alx2 = this.b;
            aow aow2 = amh2.a;
            int n = amh2.b;
            int n2 = amh2.c;
            int n3 = amh2.d;
            int n4 = amh2.e;
            View view = aow2.a;
            int n5 = n3 - n;
            int n6 = n4 - n2;
            if (n5 != 0) {
                rw.p((View)view).b(0.0f);
            }
            if (n6 != 0) {
                rw.p((View)view).c(0.0f);
            }
            tp tp2 = rw.p((View)view);
            alx2.e.add((Object)aow2);
            tp2.a(alx2.k).a((uf)new amd(alx2, aow2, n5, n6, tp2)).b();
        }
        this.a.clear();
        this.b.b.remove((Object)this.a);
    }
}

