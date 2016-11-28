/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
import android.graphics.Bitmap;

public final class atn
extends arg {
    private boolean mAlwaysRead = false;
    private arn mImageFrame = null;
    private arx mImageType = null;
    private Bitmap mLastBitmap = null;
    private long mTimestamp = -1;

    public atn(asr asr2, String string) {
        super(asr2, string);
    }

    @Override
    public final asw getSignature() {
        this.mImageType = arx.a(8);
        return new asw().a("bitmap", 2, arx.a(Bitmap.class)).a("alwaysRead", 1, arx.a(Boolean.TYPE)).a("timestamp", 1, arx.a(Long.TYPE)).b("image", 2, this.mImageType).a();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void onInputPortOpen(aso aso2) {
        if (aso2.b.equals((Object)"alwaysRead")) {
            aso2.a("mAlwaysRead");
            aso2.h = true;
            return;
        } else {
            if (!aso2.b.equals((Object)"timestamp")) return;
            {
                aso2.a("mTimestamp");
                aso2.h = true;
                return;
            }
        }
    }

    @Override
    protected final void onProcess() {
        Bitmap bitmap = (Bitmap)this.getConnectedInputPort("bitmap").a().b().h();
        asu asu2 = this.getConnectedOutputPort("image");
        if (this.mLastBitmap != bitmap || this.mAlwaysRead) {
            if (this.mImageFrame != null) {
                this.mImageFrame.d();
            }
            int[] arrn = new int[]{bitmap.getWidth(), bitmap.getHeight()};
            this.mImageFrame = ark.a(this.mImageType, arrn).c();
            this.mImageFrame.a(bitmap);
            this.mLastBitmap = bitmap;
        }
        if (this.mImageFrame == null) {
            throw new RuntimeException("BitmapSource trying to push out an undefined frame! Most likely, graph.getVariable(<BitmapSource filter>).setValue(<Bitmap>) has not been called.");
        }
        if (this.mTimestamp >= 0) {
            this.mImageFrame.a(this.mTimestamp);
        }
        asu2.a(this.mImageFrame);
    }

    @Override
    protected final void onTearDown() {
        if (this.mImageFrame != null) {
            this.mImageFrame.d();
            this.mImageFrame = null;
        }
    }
}

