/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
import android.content.res.AssetManager;
import android.net.Uri;
import java.util.List;

public final class bcw
implements bel {
    private static final int a = 22;
    private final AssetManager b;
    private final bcx c;

    public bcw(AssetManager assetManager, bcx bcx2) {
        this.b = assetManager;
        this.c = bcx2;
    }

    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        Uri uri = (Uri)object;
        String string = uri.toString().substring(a);
        return new bem(new blc((Object)uri), this.c.a(this.b, string));
    }

    @Override
    public final /* synthetic */ boolean a(Object object) {
        Uri uri = (Uri)object;
        boolean bl2 = "file".equals((Object)uri.getScheme());
        boolean bl3 = false;
        if (bl2) {
            boolean bl4 = uri.getPathSegments().isEmpty();
            bl3 = false;
            if (!bl4) {
                boolean bl5 = "android_asset".equals(uri.getPathSegments().get(0));
                bl3 = false;
                if (bl5) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }
}

