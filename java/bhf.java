/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.locks.Lock
 *  java.util.concurrent.locks.ReentrantLock
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class bhf {
    static final Lock a;
    private static final Paint b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = new Paint(6);
        new Paint(7);
        bhg bhg2 = "XT1097".equals((Object)Build.MODEL) && Build.VERSION.SDK_INT == 22 ? new ReentrantLock() : new bhg();
        a = bhg2;
        new Paint(7).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static int a(int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 5: 
            case 6: {
                return 90;
            }
            case 3: 
            case 4: {
                return 180;
            }
            case 7: 
            case 8: 
        }
        return 270;
    }

    private static Bitmap.Config a(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Bitmap a(bbb bbb2, Bitmap bitmap, int n) {
        Matrix matrix = new Matrix();
        switch (n) {
            case 2: {
                matrix.setScale(-1.0f, 1.0f);
                break;
            }
            case 3: {
                matrix.setRotate(180.0f);
                break;
            }
            case 4: {
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            }
            case 5: {
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            }
            case 6: {
                matrix.setRotate(90.0f);
                break;
            }
            case 7: {
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            }
            case 8: {
                matrix.setRotate(-90.0f);
            }
        }
        if (matrix.isIdentity()) {
            return bitmap;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float)bitmap.getWidth(), (float)bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmap2 = bbb2.a(Math.round((float)rectF.width()), Math.round((float)rectF.height()), bhf.a(bitmap));
        matrix.postTranslate(- rectF.left, - rectF.top);
        bhf.a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Bitmap a(bbb bbb2, Bitmap bitmap, int n, int n2) {
        float f2;
        float f3;
        float f4 = 0.0f;
        if (bitmap.getWidth() == n && bitmap.getHeight() == n2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        if (n2 * bitmap.getWidth() > n * bitmap.getHeight()) {
            f2 = (float)n2 / (float)bitmap.getHeight();
            f3 = 0.5f * ((float)n - f2 * (float)bitmap.getWidth());
        } else {
            f2 = (float)n / (float)bitmap.getWidth();
            f4 = 0.5f * ((float)n2 - f2 * (float)bitmap.getHeight());
            f3 = 0.0f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float)((int)(f3 + 0.5f)), (float)((int)(f4 + 0.5f)));
        Bitmap bitmap2 = bbb2.a(n, n2, bhf.a(bitmap));
        bhf.a(bitmap, bitmap2);
        bhf.a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2) {
        boolean bl2 = bitmap.hasAlpha();
        if (Build.VERSION.SDK_INT >= 12 && bitmap2 != null) {
            bitmap2.setHasAlpha(bl2);
        }
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        a.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, b);
            canvas.setBitmap(null);
            return;
        }
        finally {
            a.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Bitmap b(bbb bbb2, Bitmap bitmap, int n, int n2) {
        if (bitmap.getWidth() == n && bitmap.getHeight() == n2) {
            return bitmap;
        }
        float f2 = Math.min((float)((float)n / (float)bitmap.getWidth()), (float)((float)n2 / (float)bitmap.getHeight()));
        int n3 = (int)(f2 * (float)bitmap.getWidth());
        int n4 = (int)(f2 * (float)bitmap.getHeight());
        if (bitmap.getWidth() == n3) {
            if (bitmap.getHeight() == n4) return bitmap;
        }
        Bitmap bitmap2 = bbb2.a(n3, n4, bhf.a(bitmap));
        bhf.a(bitmap, bitmap2);
        if (Log.isLoggable((String)"TransformationUtils", (int)2)) {
            new StringBuilder(32).append("request: ").append(n).append("x").append(n2);
            int n5 = bitmap.getWidth();
            int n6 = bitmap.getHeight();
            new StringBuilder(32).append("toFit:   ").append(n5).append("x").append(n6);
            int n7 = bitmap2.getWidth();
            int n8 = bitmap2.getHeight();
            new StringBuilder(32).append("toReuse: ").append(n7).append("x").append(n8);
            new StringBuilder(25).append("minPct:   ").append(f2);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f2);
        bhf.a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    public static Bitmap c(bbb bbb2, Bitmap bitmap, int n, int n2) {
        if (bitmap.getWidth() <= n && bitmap.getHeight() <= n2) {
            return bitmap;
        }
        return bhf.b(bbb2, bitmap, n, n2);
    }
}

