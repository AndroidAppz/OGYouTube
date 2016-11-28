/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  pg
 */
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class azl {
    final bil a;
    private final Class b;
    private final List c;
    private final pg d;
    private final String e;

    public azl(Class class_, Class class_2, Class class_3, List list, bil bil2, pg pg2) {
        this.b = class_;
        this.c = list;
        this.a = bil2;
        this.d = pg2;
        String string = String.valueOf((Object)class_.getSimpleName());
        String string2 = String.valueOf((Object)class_2.getSimpleName());
        String string3 = String.valueOf((Object)class_3.getSimpleName());
        this.e = new StringBuilder(23 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append("Failed DecodePath{").append(string).append("->").append(string2).append("->").append(string3).append("}").toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final bap a(axz axz2, int n, int n2, axs axs2, List list) {
        bap bap2 = null;
        int n3 = this.c.size();
        for (int i = 0; i < n3; ++i) {
            bap bap3;
            axt axt2 = (axt)this.c.get(i);
            try {
                bap bap4;
                bap3 = axt2.a(axz2.a(), axs2) ? (bap4 = axt2.a(axz2.a(), n, n2, axs2)) : bap2;
            }
            catch (IOException var10_12) {
                if (Log.isLoggable((String)"DecodePath", (int)2)) {
                    String string = String.valueOf((Object)axt2);
                    new StringBuilder(26 + String.valueOf((Object)string).length()).append("Failed to decode data for ").append(string);
                }
                list.add((Object)var10_12);
            }
            bap2 = bap3;
            if (bap2 != null) break;
        }
        if (bap2 == null) {
            throw new bak(this.e, (List)new ArrayList((Collection)list));
        }
        return bap2;
    }

    final bap a(axz axz2, int n, int n2, axs axs2) {
        List list = (List)this.d.a();
        try {
            bap bap2 = super.a(axz2, n, n2, axs2, list);
            return bap2;
        }
        finally {
            this.d.a((Object)list);
        }
    }

    public final String toString() {
        String string = String.valueOf((Object)this.b);
        String string2 = String.valueOf((Object)this.c);
        String string3 = String.valueOf((Object)this.a);
        return new StringBuilder(47 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append("DecodePath{ dataClass=").append(string).append(", decoders=").append(string2).append(", transcoder=").append(string3).append("}").toString();
    }
}

