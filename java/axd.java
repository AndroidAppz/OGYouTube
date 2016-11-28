/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
import java.io.InputStream;
import java.util.Map;

public final class axd
implements axx {
    public static final axc a = new axe();
    private final aut b;
    private final axc c;
    private final bdy d;
    private volatile auq e;

    public axd(aut aut2, bdy bdy2, axc axc2) {
        this.b = aut2;
        this.d = bdy2;
        this.c = axc2;
    }

    @Override
    public final void a() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(avz avz2, axy axy2) {
        aus aus2;
        axc axc2 = this.c;
        String string = this.d.a();
        switch (axf.a[avz2.ordinal()]) {
            default: {
                aus2 = aus.b;
                break;
            }
            case 1: {
                aus2 = aus.a;
                break;
            }
            case 2: {
                aus2 = aus.c;
                break;
            }
            case 3: {
                aus2 = aus.d;
            }
        }
        this.e = axc2.a(string, axy2, aus2, this.d.b());
        this.b.a(this.e);
    }

    @Override
    public final void b() {
        auq auq2 = this.e;
        if (auq2 != null) {
            auq2.g();
        }
    }

    @Override
    public final Class c() {
        return InputStream.class;
    }

    @Override
    public final axj d() {
        return axj.b;
    }
}

