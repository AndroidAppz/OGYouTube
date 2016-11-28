/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class bfn
implements bel {
    private final bel a;
    private final bei b;

    public bfn(bel bel2) {
        super(bel2, 0);
    }

    private bfn(bel bel2, byte by2) {
        this.a = bel2;
        this.b = null;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)new bdy((String)iterator.next()));
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final bem a(Object object, int n, int n2, axs axs2) {
        String string = this.a(object, n, n2);
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        bdy bdy2 = new bdy(string, bdz.a);
        List list = this.b(object, n, n2);
        bem bem2 = this.a.a(bdy2, n, n2, axs2);
        if (list.isEmpty()) return bem2;
        return new bem(bem2.a, bfn.a(list), bem2.c);
    }

    public abstract String a(Object var1, int var2, int var3);

    public List b(Object object, int n, int n2) {
        return Collections.emptyList();
    }
}

