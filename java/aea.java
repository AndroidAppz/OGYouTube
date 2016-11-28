/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class aea {
    private final Bundle a;
    private List b;

    aea(Bundle bundle, List list) {
        this.a = bundle;
        this.b = list;
    }

    public static aea a(Bundle bundle) {
        if (bundle != null) {
            return new aea(bundle, null);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final void c() {
        if (this.b != null) return;
        ArrayList arrayList = this.a.getParcelableArrayList("routes");
        if (arrayList == null || arrayList.isEmpty()) {
            this.b = Collections.emptyList();
            return;
        }
        int n = arrayList.size();
        this.b = new ArrayList(n);
        int n2 = 0;
        while (n2 < n) {
            List list = this.b;
            Bundle bundle = (Bundle)arrayList.get(n2);
            ads ads2 = bundle != null ? new ads(bundle, null) : null;
            list.add((Object)ads2);
            ++n2;
        }
    }

    public final List a() {
        this.c();
        return this.b;
    }

    public final boolean b() {
        this.c();
        int n = this.b.size();
        for (int i = 0; i < n; ++i) {
            ads ads2 = (ads)this.b.get(i);
            if (ads2 != null && ads2.u()) continue;
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteProviderDescriptor{ ");
        stringBuilder.append("routes=").append(Arrays.toString((Object[])this.a().toArray()));
        stringBuilder.append(", isValid=").append(this.b());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

