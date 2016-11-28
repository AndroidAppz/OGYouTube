/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.Cursor
 *  android.net.Uri
 *  android.provider.MediaStore
 *  android.provider.MediaStore$Images
 *  android.provider.MediaStore$Images$Thumbnails
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

public final class ays
implements ayu {
    private static final String[] b = new String[]{"_data"};
    private final ContentResolver a;

    public ays(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override
    public final Cursor a(Uri uri) {
        String string = uri.getLastPathSegment();
        return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{string}, null);
    }
}

