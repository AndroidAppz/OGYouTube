/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.AsyncTask
 *  android.util.SparseBooleanArray
 *  java.lang.Deprecated
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.List
 *  java.util.Map
 *  nr
 *  or
 */
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import java.util.List;
import java.util.Map;

public final class adj {
    static final adn f = new adk();
    public final List a;
    final List b;
    final Map c;
    final SparseBooleanArray d;
    final int e;

    adj(List list, List list2) {
        this.a = list;
        this.b = list2;
        this.d = new SparseBooleanArray();
        this.c = new or();
        this.e = super.a();
    }

    private final int a() {
        int n = this.a.size();
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            n2 = Math.max((int)((adp)this.a.get((int)i)).b, (int)n2);
        }
        return n2;
    }

    @Deprecated
    public static AsyncTask a(Bitmap bitmap, ado ado2) {
        adl adl2 = new adl(bitmap);
        adm adm2 = new adm(adl2, ado2);
        Object[] arrobject = new Bitmap[]{adl2.a};
        return nr.a((AsyncTask)adm2, (Object[])arrobject);
    }

    public final adp a(adq adq2) {
        return (adp)this.c.get((Object)adq2);
    }
}

