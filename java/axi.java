/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
import android.content.Context;

public class axi
implements ben {
    private static volatile aut a;
    private final axc b;
    private final aut c;

    public axi(Context context) {
        super(axi.a(context));
    }

    private axi(aut aut2) {
        super(aut2, axd.a);
    }

    private axi(aut aut2, axc axc2) {
        this.b = axc2;
        this.c = aut2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static aut a(Context context) {
        if (a != null) return a;
        reference var2_1 = axi.class;
        // MONITORENTER : axi.class
        if (a == null) {
            a = avu.a(context);
        }
        // MONITOREXIT : var2_1
        return a;
    }

    @Override
    public final bel a(bet bet2) {
        return new axh(this.c, this.b);
    }
}

