/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.util.SparseArray;

final class afm
implements Runnable {
    private /* synthetic */ afl a;

    afm(afl afl2) {
        this.a = afl2;
    }

    public final void run() {
        afl afl2 = this.a;
        for (int i = 0; i < afl2.g.size(); ++i) {
            afl2.g.valueAt(i);
        }
        afl2.g.clear();
    }
}

