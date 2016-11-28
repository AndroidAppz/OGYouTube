/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.res.AssetManager;
import java.io.InputStream;

public final class ayn
extends axw {
    public ayn(AssetManager assetManager, String string) {
        super(assetManager, string);
    }

    @Override
    protected final /* synthetic */ Object a(AssetManager assetManager, String string) {
        return assetManager.open(string);
    }

    @Override
    protected final /* synthetic */ void a(Object object) {
        ((InputStream)object).close();
    }

    @Override
    public final Class c() {
        return InputStream.class;
    }
}

