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

final class ama
implements Runnable {
    private /* synthetic */ ArrayList a;
    private /* synthetic */ alx b;

    ama(alx alx2, ArrayList arrayList) {
        this.b = alx2;
        this.a = arrayList;
    }

    public final void run() {
        for (aow aow2 : this.a) {
            alx alx2 = this.b;
            tp tp2 = rw.p((View)aow2.a);
            alx2.d.add((Object)aow2);
            tp2.a(1.0f).a(alx2.i).a((uf)new amc(alx2, aow2, tp2)).b();
        }
        this.a.clear();
        this.b.a.remove((Object)this.a);
    }
}

