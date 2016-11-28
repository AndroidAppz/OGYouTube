/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  pg
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class ber
implements bel {
    private final List a;
    private final pg b;

    ber(List list, pg pg2) {
        this.a = list;
        this.b = pg2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final bem a(Object object, int n, int n2, axs axs2) {
        int n3 = this.a.size();
        ArrayList arrayList = new ArrayList(n3);
        axo axo2 = null;
        for (int i = 0; i < n3; ++i) {
            bem bem2;
            axo axo3;
            bel bel2 = (bel)this.a.get(i);
            if (bel2.a(object) && (bem2 = bel2.a(object, n, n2, axs2)) != null) {
                axo3 = bem2.a;
                arrayList.add((Object)bem2.c);
            } else {
                axo3 = axo2;
            }
            axo2 = axo3;
        }
        if (!arrayList.isEmpty()) {
            return new bem(axo2, new bes((List)arrayList, this.b));
        }
        return null;
    }

    @Override
    public final boolean a(Object object) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (!((bel)iterator.next()).a(object)) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        String string = String.valueOf((Object)Arrays.toString((Object[])this.a.toArray((Object[])new bel[this.a.size()])));
        return new StringBuilder(31 + String.valueOf((Object)string).length()).append("MultiModelLoader{modelLoaders=").append(string).append("}").toString();
    }
}

