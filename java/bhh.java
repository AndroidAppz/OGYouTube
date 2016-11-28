/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.media.MediaMetadataRetriever
 *  android.os.ParcelFileDescriptor
 *  java.io.FileDescriptor
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;

public final class bhh
implements axt {
    public static final axp a = axp.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1, new bhi());
    private static axp b = axp.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", null, new bhj());
    private static final bhk c = new bhk();
    private final bbb d;

    public bhh(bbb bbb2) {
        super(bbb2, c);
    }

    private bhh(bbb bbb2, bhk bhk2) {
        this.d = bbb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final bap a(ParcelFileDescriptor parcelFileDescriptor, axs axs2) {
        Bitmap bitmap;
        Bitmap bitmap2;
        long l = (Long)axs2.a(a);
        if (l < 0 && l != -1) {
            throw new IllegalArgumentException(new StringBuilder(83).append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ").append(l).toString());
        }
        Integer n = (Integer)axs2.a(b);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        Bitmap bitmap3 = l == -1 ? (bitmap = mediaMetadataRetriever.getFrameAtTime()) : (n == null ? mediaMetadataRetriever.getFrameAtTime(l) : (bitmap2 = mediaMetadataRetriever.getFrameAtTime(l, n.intValue())));
        parcelFileDescriptor.close();
        return bge.a(bitmap3, this.d);
        finally {
            mediaMetadataRetriever.release();
        }
    }

    private static boolean a(ParcelFileDescriptor parcelFileDescriptor) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
            return true;
        }
        catch (RuntimeException var3_2) {
            return false;
        }
        finally {
            mediaMetadataRetriever.release();
        }
    }
}

