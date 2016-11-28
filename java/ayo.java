/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 *  java.io.FileNotFoundException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class ayo
extends aym {
    public ayo(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override
    protected final /* synthetic */ Object a(Uri uri, ContentResolver contentResolver) {
        InputStream inputStream = contentResolver.openInputStream(uri);
        if (inputStream == null) {
            String string = String.valueOf((Object)uri);
            throw new FileNotFoundException(new StringBuilder(25 + String.valueOf((Object)string).length()).append("InputStream is null for :").append(string).toString());
        }
        return inputStream;
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

