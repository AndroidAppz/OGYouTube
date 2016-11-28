/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class aed {
    public static final aed c = new aed(new Bundle(), null);
    public final Bundle a;
    List b;

    aed(Bundle bundle, List list) {
        this.a = bundle;
        this.b = list;
    }

    public static aed a(Bundle bundle) {
        if (bundle != null) {
            return new aed(bundle, null);
        }
        return null;
    }

    public final List a() {
        this.b();
        return this.b;
    }

    public final boolean a(List list) {
        if (list != null) {
            this.b();
            int n = this.b.size();
            if (n != 0) {
                int n2 = list.size();
                for (int i = 0; i < n2; ++i) {
                    IntentFilter intentFilter = (IntentFilter)list.get(i);
                    if (intentFilter == null) continue;
                    for (int j = 0; j < n; ++j) {
                        if (!intentFilter.hasCategory((String)this.b.get(j))) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    final void b() {
        if (this.b == null) {
            this.b = this.a.getStringArrayList("controlCategories");
            if (this.b == null || this.b.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final boolean c() {
        this.b();
        return this.b.isEmpty();
    }

    public final boolean equals(Object object) {
        if (object instanceof aed) {
            aed aed2 = (aed)object;
            this.b();
            aed2.b();
            return this.b.equals((Object)aed2.b);
        }
        return false;
    }

    public final int hashCode() {
        this.b();
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteSelector{ ");
        stringBuilder.append("controlCategories=").append(Arrays.toString((Object[])this.a().toArray()));
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

