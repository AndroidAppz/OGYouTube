/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.MessageQueue
 *  android.os.MessageQueue$IdleHandler
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.ReferenceQueue
 *  java.util.HashMap
 *  java.util.Map
 */
import android.os.Looper;
import android.os.MessageQueue;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

public final class azt
implements baf,
baj,
bcg {
    public final Map a;
    public final bcf b;
    public final azw c;
    public final Map d;
    public final azu e;
    private final bas f;
    private final azy g;
    private ReferenceQueue h;

    public azt(bcf bcf2, bbt bbt2, bco bco2, bco bco3, bco bco4) {
        this(bcf2, bbt2, bco2, bco3, bco4, 0);
    }

    private azt(bcf bcf2, bbt bbt2, bco bco2, bco bco3, bco bco4, byte by2) {
        this.b = bcf2;
        this.g = new azy(bbt2);
        this.d = new HashMap();
        new bah();
        this.a = new HashMap();
        this.c = new azw(bco2, bco3, bco4, this);
        this.e = new azu(this.g);
        this.f = new bas();
        bcf2.a(this);
    }

    public static void a(String string, long l, axo axo2) {
        double d2 = bli.a(l);
        String string2 = String.valueOf((Object)axo2);
        new StringBuilder(37 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append(string).append(" in ").append(d2).append("ms, key: ").append(string2);
    }

    public final ReferenceQueue a() {
        if (this.h == null) {
            this.h = new ReferenceQueue();
            Looper.myQueue().addIdleHandler((MessageQueue.IdleHandler)new baa(this.d, this.h));
        }
        return this.h;
    }

    @Override
    public final void a(axo axo2, bai bai2) {
        bln.a();
        if (bai2 != null) {
            bai2.c = axo2;
            bai2.b = this;
            if (bai2.a) {
                this.d.put((Object)axo2, (Object)new bab(axo2, bai2, this.a()));
            }
        }
        this.a.remove((Object)axo2);
    }

    @Override
    public final void a(bac bac2, axo axo2) {
        bln.a();
        if (bac2.equals((Object)((bac)this.a.get((Object)axo2)))) {
            this.a.remove((Object)axo2);
        }
    }

    @Override
    public final void a(bap bap2) {
        bln.a();
        this.f.a(bap2);
    }

    @Override
    public final void b(axo axo2, bai bai2) {
        bln.a();
        this.d.remove((Object)axo2);
        if (bai2.a) {
            this.b.a(axo2, bai2);
            return;
        }
        this.f.a(bai2);
    }
}

