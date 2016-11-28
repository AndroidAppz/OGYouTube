/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.Object
 */
import android.content.Context;
import android.net.Uri;

public final class bef
implements bel {
    private final Context a;

    bef(Context context) {
        this.a = context;
    }

    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        Uri uri = (Uri)object;
        return new bem(new blc((Object)uri), new beh(this.a, uri));
    }

    @Override
    public final /* synthetic */ boolean a(Object object) {
        return ayq.a((Uri)object);
    }
}

