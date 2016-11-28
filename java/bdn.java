/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
import java.io.IOException;

final class bdn
implements axx {
    private final String a;
    private final bdm b;
    private Object c;

    public bdn(String string, bdm bdm2) {
        this.a = string;
        this.b = bdm2;
    }

    @Override
    public final void a() {
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
            axy2.a(this.c);
            return;
        }
        catch (IllegalArgumentException var3_3) {
            axy2.a((Exception)var3_3);
            return;
        }
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

