/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.AssetManager
 *  android.os.ParcelFileDescriptor
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

public final class ayf
extends axw {
    public ayf(AssetManager assetManager, String string) {
        super(assetManager, string);
    }

    @Override
    protected final /* synthetic */ Object a(AssetManager assetManager, String string) {
        return assetManager.openFd(string).getParcelFileDescriptor();
    }

    @Override
    protected final /* synthetic */ void a(Object object) {
        ((ParcelFileDescriptor)object).close();
    }

    @Override
    public final Class c() {
        return ParcelFileDescriptor.class;
    }
}

