/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Queue
 */
import java.util.Queue;

abstract class bba {
    private final Queue a = bln.a(20);

    bba() {
    }

    protected abstract bbn a();

    public final void a(bbn bbn2) {
        if (this.a.size() < 20) {
            this.a.offer((Object)bbn2);
        }
    }

    protected final bbn b() {
        bbn bbn2 = (bbn)this.a.poll();
        if (bbn2 == null) {
            bbn2 = this.a();
        }
        return bbn2;
    }
}

