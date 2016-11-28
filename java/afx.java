/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
import java.lang.ref.WeakReference;

final class afx
implements afc {
    private final WeakReference a;

    public afx(afw afw2) {
        this.a = new WeakReference((Object)afw2);
    }

    @Override
    public final void a(Object object, int n) {
        afw afw2 = (afw)this.a.get();
        if (afw2 != null && afw2.b != null) {
            afw2.b.a(n);
        }
    }

    @Override
    public final void b(Object object, int n) {
        afw afw2 = (afw)this.a.get();
        if (afw2 != null && afw2.b != null) {
            afw2.b.b(n);
        }
    }
}

