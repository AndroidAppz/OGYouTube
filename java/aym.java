/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 */
import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class aym
implements axx {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public aym(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    protected abstract Object a(Uri var1, ContentResolver var2);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        if (this.c == null) return;
        try {
            this.a(this.c);
            return;
        }
        catch (IOException var1_1) {
            return;
        }
    }

    @Override
    public final void a(avz avz2, axy axy2) {
        try {
            this.c = this.a(this.a, this.b);
        }
        catch (FileNotFoundException var3_3) {
            axy2.a((Exception)var3_3);
            return;
        }
        axy2.a(this.c);
    }

    protected abstract void a(Object var1);

    @Override
    public final void b() {
    }

    @Override
    public final axj d() {
        return axj.a;
    }
}

