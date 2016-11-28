/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.List
 *  java.util.Set
 */
import java.util.Collection;
import java.util.List;
import java.util.Set;

final class awm
implements bis {
    private final bjf a;

    public awm(bjf bjf2) {
        this.a = bjf2;
    }

    @Override
    public final void a(boolean bl2) {
        if (bl2) {
            bjf bjf2 = this.a;
            for (bjv bjv2 : bln.a((Collection)bjf2.a)) {
                if (bjv2.f() || bjv2.g()) continue;
                bjv2.c();
                if (!bjf2.c) {
                    bjv2.a();
                    continue;
                }
                bjf2.b.add((Object)bjv2);
            }
        }
    }
}

