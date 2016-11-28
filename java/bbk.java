/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class bbk
implements bbb {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final bbm b;
    private final Set c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    /*
     * Enabled aggressive block sorting
     */
    public bbk(int n) {
        void var2_3;
        if (Build.VERSION.SDK_INT >= 19) {
            bbo bbo2 = new bbo();
        } else {
            bax bax2 = new bax();
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll((Collection)Arrays.asList((Object[])Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add((Object)null);
        }
        super(n, (bbm)var2_3, Collections.unmodifiableSet((Set)hashSet));
    }

    private bbk(int n, bbm bbm2, Set set) {
        this.d = n;
        this.b = bbm2;
        this.c = set;
        new bbl();
    }

    private final void b() {
        if (Log.isLoggable((String)"LruBitmapPool", (int)2)) {
            this.c();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final void b(int var1) {
        var8_2 = this;
        // MONITORENTER : var8_2
        do {
            if (this.e <= var1) ** GOTO lbl11
            var3_4 = this.b.a();
            if (var3_4 == null) {
                if (Log.isLoggable((String)"LruBitmapPool", (int)5)) {
                    Log.w((String)"LruBitmapPool", (String)"Size mismatch, resetting");
                    super.c();
                }
                this.e = 0;
lbl11: // 2 sources:
                // MONITOREXIT : var8_2
                return;
            }
            this.e -= this.b.c(var3_4);
            this.i = 1 + this.i;
            if (Log.isLoggable((String)"LruBitmapPool", (int)3)) {
                var5_3 = String.valueOf((Object)this.b.b(var3_4));
                if (var5_3.length() != 0) {
                    "Evicting bitmap=".concat(var5_3);
                } else {
                    new String("Evicting bitmap=");
                }
            }
            super.b();
            var3_4.recycle();
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Bitmap c(int n, int n2, Bitmap.Config config) {
        void var14_4 = this;
        synchronized (var14_4) {
            bbm bbm2 = this.b;
            Bitmap.Config config2 = config != null ? config : a;
            Bitmap bitmap = bbm2.a(n, n2, config2);
            if (bitmap == null) {
                if (Log.isLoggable((String)"LruBitmapPool", (int)3)) {
                    String string = String.valueOf((Object)this.b.b(n, n2, config));
                    if (string.length() != 0) {
                        "Missing bitmap=".concat(string);
                    } else {
                        new String("Missing bitmap=");
                    }
                }
                this.g = 1 + this.g;
            } else {
                this.f = 1 + this.f;
                this.e -= this.b.c(bitmap);
                if (Build.VERSION.SDK_INT >= 12) {
                    bitmap.setHasAlpha(true);
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    bitmap.setPremultiplied(true);
                }
            }
            if (Log.isLoggable((String)"LruBitmapPool", (int)2)) {
                String string = String.valueOf((Object)this.b.b(n, n2, config));
                if (string.length() != 0) {
                    "Get bitmap=".concat(string);
                } else {
                    new String("Get bitmap=");
                }
            }
            super.b();
            return bitmap;
        }
    }

    private final void c() {
        int n = this.f;
        int n2 = this.g;
        int n3 = this.h;
        int n4 = this.i;
        int n5 = this.e;
        int n6 = this.d;
        String string = String.valueOf((Object)this.b);
        new StringBuilder(133 + String.valueOf((Object)string).length()).append("Hits=").append(n).append(", misses=").append(n2).append(", puts=").append(n3).append(", evictions=").append(n4).append(", currentSize=").append(n5).append(", maxSize=").append(n6).append("\nStrategy=").append(string);
    }

    @Override
    public final Bitmap a(int n, int n2, Bitmap.Config config) {
        Bitmap bitmap = super.c(n, n2, config);
        if (bitmap != null) {
            bitmap.eraseColor(0);
            return bitmap;
        }
        return Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
    }

    @Override
    public final void a() {
        this.b(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(int n) {
        if (Log.isLoggable((String)"LruBitmapPool", (int)3)) {
            new StringBuilder(29).append("trimMemory, level=").append(n);
        }
        if (n >= 40) {
            super.b(0);
            return;
        } else {
            if (n < 20) return;
            {
                super.b(this.d / 2);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(Bitmap bitmap) {
        void var11_2 = this;
        synchronized (var11_2) {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (!bitmap.isMutable() || this.b.c(bitmap) > this.d || !this.c.contains((Object)bitmap.getConfig())) {
                if (Log.isLoggable((String)"LruBitmapPool", (int)2)) {
                    String string = String.valueOf((Object)this.b.b(bitmap));
                    boolean bl2 = bitmap.isMutable();
                    boolean bl3 = this.c.contains((Object)bitmap.getConfig());
                    new StringBuilder(78 + String.valueOf((Object)string).length()).append("Reject bitmap from pool, bitmap: ").append(string).append(", is mutable: ").append(bl2).append(", is allowed config: ").append(bl3);
                }
                bitmap.recycle();
            } else {
                int n = this.b.c(bitmap);
                this.b.a(bitmap);
                this.h = 1 + this.h;
                this.e = n + this.e;
                if (Log.isLoggable((String)"LruBitmapPool", (int)2)) {
                    String string = String.valueOf((Object)this.b.b(bitmap));
                    if (string.length() != 0) {
                        "Put bitmap in pool=".concat(string);
                    } else {
                        new String("Put bitmap in pool=");
                    }
                }
                super.b();
                super.b(this.d);
            }
            return;
        }
    }

    @Override
    public final Bitmap b(int n, int n2, Bitmap.Config config) {
        Bitmap bitmap = super.c(n, n2, config);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config);
        }
        return bitmap;
    }
}

