/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class aeb {
    private final Bundle a = new Bundle();
    private ArrayList b;

    public final aea a() {
        if (this.b != null) {
            int n = this.b.size();
            ArrayList arrayList = new ArrayList(n);
            for (int i = 0; i < n; ++i) {
                arrayList.add((Object)((ads)this.b.get((int)i)).a);
            }
            this.a.putParcelableArrayList("routes", arrayList);
        }
        return new aea(this.a, (List)this.b);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final aeb a(ads ads2) {
        if (ads2 == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        if (this.b == null) {
            this.b = new ArrayList();
        } else if (this.b.contains((Object)ads2)) {
            throw new IllegalArgumentException("route descriptor already added");
        }
        this.b.add((Object)ads2);
        return this;
    }
}

