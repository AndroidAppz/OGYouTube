/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.res.AssetManager;
import java.io.IOException;

public abstract class axw
implements axx {
    private final String a;
    private final AssetManager b;
    private Object c;

    public axw(AssetManager assetManager, String string) {
        this.b = assetManager;
        this.a = string;
    }

    protected abstract Object a(AssetManager var1, String var2);

    @Override
    public final void a() {
        if (this.c == null) {
            return;
        }
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
            this.c = this.a(this.b, this.a);
        }
        catch (IOException var3_3) {
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

