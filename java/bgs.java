/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  com.bumptech.glide.load.resource.bitmap.ImageHeaderParser
 *  com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$ImageType
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.EnumSet
 *  java.util.HashSet
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.locks.Lock
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class bgs {
    public static final axp a = axp.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", (Object)axk.b);
    public static final axp b = axp.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bgk.c);
    static final bgu c;
    private static final Set d;
    private static final Set e;
    private static final Queue f;
    private final bbb g;
    private final DisplayMetrics h;
    private final baw i;

    static {
        d = Collections.unmodifiableSet((Set)new HashSet((Collection)Arrays.asList((Object[])new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        c = new bgt();
        e = Collections.unmodifiableSet((Set)EnumSet.of((Enum)ImageHeaderParser.ImageType.JPEG, (Enum)ImageHeaderParser.ImageType.PNG_A, (Enum)ImageHeaderParser.ImageType.PNG));
        f = bln.a(0);
    }

    public bgs(DisplayMetrics displayMetrics, bbb bbb2, baw baw2) {
        this.h = (DisplayMetrics)blm.a((Object)displayMetrics, "Argument must not be null");
        this.g = (bbb)blm.a(bbb2, "Argument must not be null");
        this.i = (baw)blm.a(baw2, "Argument must not be null");
    }

    private final int a(InputStream inputStream) {
        inputStream.mark(5242880);
        try {
            int n = new ImageHeaderParser(inputStream, this.i).b();
            return n;
        }
        catch (IOException var3_3) {
            return -1;
        }
        finally {
            inputStream.reset();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private final Bitmap.Config a(InputStream var1, axk var2_2) {
        if (var2_2 == axk.a) return Bitmap.Config.ARGB_8888;
        if (Build.VERSION.SDK_INT == 16) {
            return Bitmap.Config.ARGB_8888;
        }
        var1.mark(5242880);
        try {
            var5_4 = var8_3 = new ImageHeaderParser(var1, this.i).a().hasAlpha();
        }
        catch (IOException var4_5) {
            if (Log.isLoggable((String)"Downsampler", (int)3)) {
                var6_6 = String.valueOf((Object)var2_2);
                new StringBuilder(72 + String.valueOf((Object)var6_6).length()).append("Cannot determine whether the image has alpha or not from header, format ").append(var6_6);
            }
            var5_4 = false;
lbl17: // 2 sources:
            if (var5_4 == false) return Bitmap.Config.RGB_565;
            return Bitmap.Config.ARGB_8888;
        }
        finally {
            var1.reset();
        }
        var1.reset();
        ** GOTO lbl17
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static Bitmap a(InputStream inputStream, BitmapFactory.Options options, bgu bgu2) {
        Bitmap bitmap;
        if (options.inJustDecodeBounds) {
            inputStream.mark(5242880);
        } else {
            bgu2.a();
        }
        int n = options.outWidth;
        int n2 = options.outHeight;
        String string = options.outMimeType;
        bhf.a.lock();
        try {
            bitmap = BitmapFactory.decodeStream((InputStream)inputStream, (Rect)null, (BitmapFactory.Options)options);
            if (!options.inJustDecodeBounds) return bitmap;
        }
        catch (IllegalArgumentException var7_7) {
            String string2 = String.valueOf((Object)bgs.b(options));
            throw new IOException(new StringBuilder(99 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append("Exception decoding bitmap, outWidth: ").append(n).append(", outHeight: ").append(n2).append(", outMimeType: ").append(string).append(", inBitmap: ").append(string2).toString(), (Throwable)var7_7);
        }
        finally {
            bhf.a.unlock();
        }
        inputStream.reset();
        return bitmap;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String a(Bitmap bitmap) {
        String string;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            int n = bitmap.getAllocationByteCount();
            string = new StringBuilder(14).append(" (").append(n).append(")").toString();
        } else {
            string = "";
        }
        int n = bitmap.getWidth();
        int n2 = bitmap.getHeight();
        String string2 = String.valueOf((Object)bitmap.getConfig());
        return new StringBuilder(26 + String.valueOf((Object)string2).length() + String.valueOf((Object)string).length()).append("[").append(n).append("x").append(n2).append("] ").append(string2).append(string).toString();
    }

    public static boolean a() {
        return true;
    }

    private static boolean a(BitmapFactory.Options options) {
        if (options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity) {
            return true;
        }
        return false;
    }

    private static String b(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT >= 11) {
            return bgs.a(options.inBitmap);
        }
        return null;
    }

    public static boolean b() {
        return true;
    }

    private final boolean b(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        inputStream.mark(5242880);
        try {
            ImageHeaderParser.ImageType imageType = new ImageHeaderParser(inputStream, this.i).a();
            boolean bl2 = e.contains((Object)imageType);
            return bl2;
        }
        catch (IOException var3_4) {
            return false;
        }
        finally {
            inputStream.reset();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static BitmapFactory.Options c() {
        Queue queue;
        reference var4 = bgs.class;
        // MONITORENTER : bgs.class
        Queue queue2 = queue = f;
        // MONITORENTER : queue2
        BitmapFactory.Options options = (BitmapFactory.Options)f.poll();
        // MONITOREXIT : queue2
        if (options == null) {
            options = new BitmapFactory.Options();
            bgs.d(options);
        }
        // MONITOREXIT : var4
        return options;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(BitmapFactory.Options options) {
        Queue queue;
        bgs.d(options);
        Queue queue2 = queue = f;
        synchronized (queue2) {
            f.offer((Object)options);
            return;
        }
    }

    private static void d(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }

    /*
     * Exception decompiling
     */
    public final bap a(InputStream var1_4, int var2_5, int var3_2, axs var4_3, bgu var5_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 5[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:394)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:446)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2859)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:805)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:220)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:165)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:91)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:354)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:751)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:683)
        // org.benf.cfr.reader.Main.doJar(Main.java:128)
        // com.njlabs.showjava.processor.JavaExtractor$1.run(JavaExtractor.java:100)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }
}

