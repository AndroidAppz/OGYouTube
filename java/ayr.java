/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 */
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class ayr
implements axx {
    private final Uri a;
    private final ayv b;
    private InputStream c;

    private ayr(Uri uri, ayv ayv2) {
        this.a = uri;
        this.b = ayv2;
    }

    public static ayr a(Context context, Uri uri, ayu ayu2) {
        return new ayr(uri, new ayv(ayu2, avw.a((Context)context).c, context.getContentResolver()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        if (this.c == null) return;
        try {
            this.c.close();
            return;
        }
        catch (IOException var1_1) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(avz avz2, axy axy2) {
        try {
            InputStream inputStream = this.b.b(this.a);
            int n = inputStream != null ? this.b.a(this.a) : -1;
            aye aye2 = n != -1 ? new aye(inputStream, n) : inputStream;
            this.c = aye2;
        }
        catch (FileNotFoundException var3_6) {
            axy2.a((Exception)var3_6);
            return;
        }
        axy2.a((Object)this.c);
    }

    @Override
    public final void b() {
    }

    @Override
    public final Class c() {
        return InputStream.class;
    }

    @Override
    public final axj d() {
        return axj.a;
    }
}

