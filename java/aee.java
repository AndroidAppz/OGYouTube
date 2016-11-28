/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class aee {
    private ArrayList a;

    public aee() {
    }

    public aee(aed aed2) {
        if (aed2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        aed2.b();
        if (!aed2.b.isEmpty()) {
            this.a = new ArrayList((Collection)aed2.b);
        }
    }

    private final aee a(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("categories must not be null");
        }
        if (!collection.isEmpty()) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                this.a((String)iterator.next());
            }
        }
        return this;
    }

    public final aed a() {
        if (this.a == null) {
            return aed.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new aed(bundle, (List)this.a);
    }

    public final aee a(aed aed2) {
        if (aed2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        super.a((Collection)aed2.a());
        return this;
    }

    public final aee a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("category must not be null");
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (!this.a.contains((Object)string)) {
            this.a.add((Object)string);
        }
        return this;
    }
}

