/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.Long
 *  java.lang.Object
 */
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

public final class bfu
implements bel {
    private final Context a;

    bfu(Context context) {
        this.a = context.getApplicationContext();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        Uri uri = (Uri)object;
        if (!ayq.a(n, n2)) return null;
        Long l = (Long)axs2.a(bhh.a);
        if (l == null || l != -1) return null;
        boolean bl2 = true;
        if (!bl2) return null;
        blc blc2 = new blc((Object)uri);
        Context context = this.a;
        return new bem(blc2, ayr.a(context, uri, new ayt(context.getContentResolver())));
    }

    @Override
    public final /* synthetic */ boolean a(Object object) {
        Uri uri = (Uri)object;
        if (ayq.a(uri) && ayq.b(uri)) {
            return true;
        }
        return false;
    }
}

