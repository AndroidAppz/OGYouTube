/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.PointF
 *  android.opengl.GLES20
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.opengl.GLES20;
import java.util.Arrays;

public final class aty
extends arg {
    private atc mCropRect = atc.a(0.0f, 0.0f, 1.0f, 1.0f);
    private atd mImageCropper = null;
    private int mOutputHeight = 0;
    private int mOutputWidth = 0;
    private boolean mUseMipmaps = false;

    public aty(asr asr2, String string) {
        super(asr2, string);
    }

    protected final int getOutputHeight(int n, int n2) {
        if (this.mOutputHeight <= 0) {
            return n2;
        }
        return this.mOutputHeight;
    }

    protected final int getOutputWidth(int n, int n2) {
        if (this.mOutputWidth <= 0) {
            return n;
        }
        return this.mOutputWidth;
    }

    @Override
    public final asw getSignature() {
        arx arx2 = arx.a(2);
        arx arx3 = arx.a(16);
        return new asw().a("image", 2, arx2).a("cropRect", 2, arx.a(atc.class)).a("outputWidth", 1, arx.a(Integer.TYPE)).a("outputHeight", 1, arx.a(Integer.TYPE)).a("useMipmaps", 1, arx.a(Boolean.TYPE)).b("image", 2, arx3).a();
    }

    @Override
    protected final void onClose() {
        if (this.mImageCropper != null) {
            atd atd2 = this.mImageCropper;
            if (atd2.a != null) {
                atd2.a.d();
                atd2.a = null;
                atd2.b = null;
            }
            this.mImageCropper = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void onInputPortOpen(aso aso2) {
        if (aso2.b.equals((Object)"cropRect")) {
            aso2.a("mCropRect");
            aso2.h = true;
            return;
        } else {
            if (aso2.b.equals((Object)"outputWidth")) {
                aso2.a("mOutputWidth");
                aso2.h = true;
                return;
            }
            if (aso2.b.equals((Object)"outputHeight")) {
                aso2.a("mOutputHeight");
                aso2.h = true;
                return;
            }
            if (!aso2.b.equals((Object)"useMipmaps")) return;
            {
                aso2.a("mUseMipmaps");
                aso2.h = true;
                return;
            }
        }
    }

    @Override
    protected final void onOpen() {
        this.mImageCropper = new atd(this.isOpenGLSupported());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void onProcess() {
        asu asu2 = this.getConnectedOutputPort("image");
        arn arn2 = this.getConnectedInputPort("image").a().c();
        int[] arrn = atd.a(arn2.g(), this.mCropRect);
        int[] arrn2 = new int[]{this.getOutputWidth(arrn[0], arrn[1]), this.getOutputHeight(arrn[0], arrn[1])};
        arn arn3 = asu2.a(arrn2).c();
        atd atd2 = this.mImageCropper;
        atc atc2 = this.mCropRect;
        boolean bl2 = this.mUseMipmaps;
        int[] arrn3 = arn2.g();
        int[] arrn4 = atd.a(arrn3, atc2);
        int n = arn3.h();
        int n2 = arn3.i();
        if (atd2.c) {
            arn arn4;
            atc atc3;
            boolean bl3 = n < arrn4[0] || n2 < arrn4[1];
            if (bl3 && bl2) {
                arn arn5 = atd2.a;
                int[] arrn5 = new int[]{ate.a(arrn4[0]), ate.a(arrn4[1])};
                if (arn5 == null) {
                    arn5 = ark.a(arx.a(18), arrn5).c();
                } else if (!Arrays.equals((int[])arrn4, (int[])arn5.g())) {
                    arn5.a(arrn5);
                }
                atd2.a = arn5;
                int[] arrn6 = atd2.a.g();
                atc3 = atc.a(0.0f, 0.0f, (float)arrn4[0] / (float)arrn6[0], (float)arrn4[1] / (float)arrn6[1]);
                atd2.b.a(atc2);
                asl asl2 = atd2.b;
                float[] arrf = new float[]{atc3.a.x, atc3.a.y, atc3.b.x, atc3.b.y, atc3.c.x, atc3.c.y, atc3.d.x, atc3.d.y};
                asl2.b(arrf);
                atd2.b.a(arn2, atd2.a);
                arn arn6 = atd2.a;
                asz asz2 = arn6.j();
                GLES20.glBindTexture((int)asz2.b, (int)asz2.a);
                GLES20.glTexParameteri((int)asz2.b, (int)10241, (int)9987);
                GLES20.glGenerateMipmap((int)asz2.b);
                GLES20.glBindTexture((int)asz2.b, (int)0);
                arn6.f();
                arn4 = atd2.a;
            } else {
                atc3 = atc2;
                arn4 = arn2;
            }
            atd2.b.a(atc3);
            atd2.b.b(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
            atd2.b.a(arn4, arn3);
        } else {
            float f2 = arrn3[0];
            float f3 = arrn3[1];
            Matrix matrix = atc.a(new atc(f2 * atc2.a.x, f3 * atc2.a.y, f2 * atc2.b.x, f3 * atc2.b.y, f2 * atc2.c.x, f3 * atc2.c.y, f2 * atc2.d.x, f3 * atc2.d.y), atc.a(0.0f, 0.0f, arrn3[0], arrn3[1]));
            matrix.postScale((float)n / (float)arrn3[0], (float)n2 / (float)arrn3[1]);
            Bitmap bitmap = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            paint.setFilterBitmap(bl2);
            Bitmap bitmap2 = (Bitmap)arn2.a.a(1, 16);
            arn2.a.a();
            canvas.drawBitmap(bitmap2, matrix, paint);
            arn3.a(bitmap);
        }
        asu2.a(arn3);
    }
}

