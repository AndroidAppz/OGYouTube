/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class adt {
    public final Bundle a;
    private ArrayList b;

    public adt(ads ads2) {
        if (ads2 == null) {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        this.a = new Bundle(ads2.a);
        ads2.l();
        if (!ads2.b.isEmpty()) {
            this.b = new ArrayList((Collection)ads2.b);
        }
    }

    public adt(String string, String string2) {
        this.a = new Bundle();
        this.a.putString("id", string);
        this.a.putString("name", string2);
    }

    public final ads a() {
        if (this.b != null) {
            this.a.putParcelableArrayList("controlFilters", this.b);
        }
        return new ads(this.a, (List)this.b);
    }

    public final adt a(int n) {
        this.a.putInt("playbackType", n);
        return this;
    }

    public final adt a(IntentFilter intentFilter) {
        if (intentFilter == null) {
            throw new IllegalArgumentException("filter must not be null");
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.b.contains((Object)intentFilter)) {
            this.b.add((Object)intentFilter);
        }
        return this;
    }

    public final adt a(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (!collection.isEmpty()) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                this.a((IntentFilter)iterator.next());
            }
        }
        return this;
    }

    public final adt a(boolean bl2) {
        this.a.putBoolean("enabled", bl2);
        return this;
    }

    public final adt b(int n) {
        this.a.putInt("playbackStream", n);
        return this;
    }

    public final adt c(int n) {
        this.a.putInt("volume", n);
        return this;
    }

    public final adt d(int n) {
        this.a.putInt("volumeMax", n);
        return this;
    }

    public final adt e(int n) {
        this.a.putInt("volumeHandling", n);
        return this;
    }

    public final adt f(int n) {
        this.a.putInt("presentationDisplayId", n);
        return this;
    }
}

