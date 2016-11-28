/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Set
 */
import java.util.Set;

final class aau
implements abz {
    private /* synthetic */ aeu a;
    private /* synthetic */ aas b;

    aau(aas aas2, aeu aeu2) {
        this.b = aas2;
        this.a = aeu2;
    }

    @Override
    public final void a() {
        this.b.s.remove((Object)this.a);
        this.b.o.notifyDataSetChanged();
    }
}

