/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.ComponentCallbacks2
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.ParcelFileDescriptor
 *  android.util.DisplayMetrics
 *  java.io.File
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URL
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.SynchronousQueue
 */
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class avw
implements ComponentCallbacks2 {
    private static volatile avw f;
    public final bbb a;
    public final avy b;
    public final baw c;
    final bit d;
    final List e = new ArrayList();
    private final bcf g;
    private final awa h;

    private avw(Context context, azt azt2, bcf bcf2, bbb bbb2, baw baw2, bit bit2, int n, bka bka2) {
        this.a = bbb2;
        this.c = baw2;
        this.g = bcf2;
        this.d = bit2;
        bka2.q.a(bgs.a);
        new bcv();
        Resources resources = context.getResources();
        bgs bgs2 = new bgs(resources.getDisplayMetrics(), bbb2, baw2);
        bhs bhs2 = new bhs(context, bbb2, baw2);
        this.h = new awa(context).a((Class)ByteBuffer.class, new bdh()).a((Class)InputStream.class, new bfa(baw2)).a((Class)ByteBuffer.class, (Class)Bitmap.class, new bgh(bgs2)).a((Class)InputStream.class, (Class)Bitmap.class, new bhd(bgs2, baw2)).a((Class)ParcelFileDescriptor.class, (Class)Bitmap.class, new bhh(bbb2)).a((Class)Bitmap.class, new bgd()).a((Class)ByteBuffer.class, (Class)BitmapDrawable.class, new bga(resources, bbb2, new bgh(bgs2))).a((Class)InputStream.class, (Class)BitmapDrawable.class, new bga(resources, bbb2, new bhd(bgs2, baw2))).a((Class)ParcelFileDescriptor.class, (Class)BitmapDrawable.class, new bga(resources, bbb2, new bhh(bbb2))).a((Class)BitmapDrawable.class, new bgb(bbb2, new bgd())).b((Class)InputStream.class, (Class)bhw.class, new bih(bhs2, baw2)).b((Class)ByteBuffer.class, (Class)bhw.class, bhs2).a((Class)bhw.class, new bhy()).a((Class)awx.class, (Class)awx.class, new bff()).a((Class)awx.class, (Class)Bitmap.class, new big(bbb2)).a(new bhm()).a((Class)File.class, (Class)ByteBuffer.class, new bdk()).a((Class)File.class, (Class)InputStream.class, new bdw()).a((Class)File.class, (Class)File.class, new bhq()).a((Class)File.class, (Class)ParcelFileDescriptor.class, new bds()).a((Class)File.class, (Class)File.class, new bff()).a(new ayl(baw2)).a(Integer.TYPE, (Class)InputStream.class, new bez(resources)).a(Integer.TYPE, (Class)ParcelFileDescriptor.class, new bey(resources)).a((Class)Integer.class, (Class)InputStream.class, new bez(resources)).a((Class)Integer.class, (Class)ParcelFileDescriptor.class, new bey(resources)).a((Class)String.class, (Class)InputStream.class, new bdo()).a((Class)String.class, (Class)InputStream.class, new bfd()).a((Class)String.class, (Class)ParcelFileDescriptor.class, new bfc()).a((Class)Uri.class, (Class)InputStream.class, new bfr()).a((Class)Uri.class, (Class)InputStream.class, new bcz(context.getAssets())).a((Class)Uri.class, (Class)ParcelFileDescriptor.class, new bcy(context.getAssets())).a((Class)Uri.class, (Class)InputStream.class, new bft(context)).a((Class)Uri.class, (Class)InputStream.class, new bfv(context)).a((Class)Uri.class, (Class)InputStream.class, new bfk(context.getContentResolver())).a((Class)Uri.class, (Class)ParcelFileDescriptor.class, new bfi(context.getContentResolver())).a((Class)Uri.class, (Class)InputStream.class, new bfm()).a((Class)URL.class, (Class)InputStream.class, new bfx()).a((Class)Uri.class, (Class)File.class, new beg(context)).a((Class)bdy.class, (Class)InputStream.class, new bfp()).a((Class)byte[].class, (Class)ByteBuffer.class, new bdb()).a((Class)byte[].class, (Class)InputStream.class, new bdf()).a((Class)Bitmap.class, (Class)BitmapDrawable.class, new bij(resources, bbb2)).a((Class)Bitmap.class, (Class)byte[].class, new bii()).a((Class)bhw.class, (Class)byte[].class, new bik());
        bkj bkj2 = new bkj();
        this.b = new avy(context, this.h, bkj2, bka2, azt2, (ComponentCallbacks2)this, n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static avw a(Context context) {
        if (f != null) return f;
        reference var16_1 = avw.class;
        // MONITORENTER : avw.class
        if (f == null) {
            Context context2 = context.getApplicationContext();
            List list = new bjk(context2).a();
            avx avx2 = new avx(context2);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((bjj)iterator.next()).a(context2, avx2);
            }
            if (avx2.f == null) {
                avx2.f = new bco(bco.b(), "source", bcs.a, false);
            }
            avx2.g = new bco(0, Integer.MAX_VALUE, bco.a, "source-unlimited", bcs.a, false, false, (BlockingQueue)new SynchronousQueue());
            if (avx2.h == null) {
                avx2.h = bco.a();
            }
            if (avx2.j == null) {
                bci bci2 = new bci(avx2.a);
                avx2.j = new bch(bci2.a, bci2.b, bci2.c, bci2.d, bci2.e, bci2.h, bci2.f, bci2.g);
            }
            if (avx2.k == null) {
                avx2.k = new biw();
            }
            if (avx2.c == null) {
                avx2.c = Build.VERSION.SDK_INT >= 11 ? new bbk(avx2.j.a) : new bbc();
            }
            if (avx2.d == null) {
                avx2.d = new bbh(avx2.j.c);
            }
            if (avx2.e == null) {
                avx2.e = new bce(avx2.j.b);
            }
            if (avx2.i == null) {
                avx2.i = new bcc(avx2.a);
            }
            if (avx2.b == null) {
                avx2.b = new azt(avx2.e, avx2.i, avx2.h, avx2.f, avx2.g);
            }
            Context context3 = avx2.a;
            azt azt2 = avx2.b;
            bcf bcf2 = avx2.e;
            bbb bbb2 = avx2.c;
            baw baw2 = avx2.d;
            bit bit2 = avx2.k;
            int n = avx2.l;
            bka bka2 = avx2.m;
            bka2.t = true;
            f = new avw(context3, azt2, bcf2, bbb2, baw2, bit2, n, bka2);
            Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                ((bjj)iterator2.next()).a(context2, avw.f.h);
            }
        }
        // MONITOREXIT : var16_1
        return f;
    }

    public static awi b(Context context) {
        return bjd.a.a(context);
    }

    public final void a() {
        bln.a();
        this.g.a();
        this.a.a();
        this.c.a();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        this.a();
    }

    public void onTrimMemory(int n) {
        bln.a();
        this.g.a(n);
        this.a.a(n);
        this.c.a(n);
    }
}

