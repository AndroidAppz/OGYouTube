/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;

public final class aes {
    final adv a;
    final List b = new ArrayList();
    final ady c;
    aea d;

    aes(adv adv2) {
        this.a = adv2;
        this.c = adv2.b;
    }

    final int a(String string) {
        int n = this.b.size();
        for (int i = 0; i < n; ++i) {
            if (!((aeu)this.b.get((int)i)).c.equals((Object)string)) continue;
            return i;
        }
        return -1;
    }

    public final String a() {
        return this.c.a.getPackageName();
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + this.a() + " }";
    }
}

