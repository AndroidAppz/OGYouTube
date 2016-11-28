/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class bfl
implements bel {
    private static final Set a = Collections.unmodifiableSet((Set)new HashSet((Collection)Arrays.asList((Object[])new String[]{"http", "https"})));
    private final bel b;

    public bfl(bel bel2) {
        this.b = bel2;
    }

    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        bdy bdy2 = new bdy(((Uri)object).toString());
        return this.b.a(bdy2, n, n2, axs2);
    }

    @Override
    public final /* synthetic */ boolean a(Object object) {
        Uri uri = (Uri)object;
        return a.contains((Object)uri.getScheme());
    }
}

