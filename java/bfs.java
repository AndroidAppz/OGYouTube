/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.Object
 */
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

public final class bfs
implements bel {
    private Context a;

    public bfs(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        Uri uri = (Uri)object;
        if (ayq.a(n, n2)) {
            blc blc2 = new blc((Object)uri);
            Context context = this.a;
            return new bem(blc2, ayr.a(context, uri, new ays(context.getContentResolver())));
        }
        return null;
    }

    @Override
    public final /* synthetic */ boolean a(Object object) {
        Uri uri = (Uri)object;
        if (ayq.a(uri) && !ayq.b(uri)) {
            return true;
        }
        return false;
    }
}

