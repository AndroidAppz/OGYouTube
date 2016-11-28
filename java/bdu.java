/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

final class bdu
implements axx {
    private final File a;
    private final bdv b;
    private Object c;

    public bdu(File file, bdv bdv2) {
        this.a = file;
        this.b = bdv2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        if (this.c == null) return;
        try {
            this.b.a(this.c);
            return;
        }
        catch (IOException var1_1) {
            return;
        }
    }

    @Override
    public final void a(avz avz2, axy axy2) {
        try {
            this.c = this.b.a(this.a);
        }
        catch (FileNotFoundException var3_3) {
            axy2.a((Exception)var3_3);
            return;
        }
        axy2.a(this.c);
    }

    @Override
    public final void b() {
    }

    @Override
    public final Class c() {
        return this.b.a();
    }

    @Override
    public final axj d() {
        return axj.a;
    }
}

