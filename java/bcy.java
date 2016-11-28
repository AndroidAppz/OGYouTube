/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.res.AssetManager;

public final class bcy
implements bcx,
ben {
    private final AssetManager a;

    public bcy(AssetManager assetManager) {
        this.a = assetManager;
    }

    @Override
    public final axx a(AssetManager assetManager, String string) {
        return new ayf(assetManager, string);
    }

    @Override
    public final bel a(bet bet2) {
        return new bcw(this.a, (bcx)this);
    }
}

