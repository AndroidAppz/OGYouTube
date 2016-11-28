/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.res.AssetFileDescriptor
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 *  java.io.FileNotFoundException
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

public final class ayg
extends aym {
    public ayg(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override
    protected final /* synthetic */ Object a(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor assetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptor == null) {
            String string = String.valueOf((Object)uri);
            throw new FileNotFoundException(new StringBuilder(28 + String.valueOf((Object)string).length()).append("FileDescriptor is null for: ").append(string).toString());
        }
        return assetFileDescriptor.getParcelFileDescriptor();
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

