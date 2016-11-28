/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 */
import java.io.File;

final class ayy
implements bbu {
    private final axm a;
    private final Object b;
    private final axs c;

    ayy(axm axm2, Object object, axs axs2) {
        this.a = axm2;
        this.b = object;
        this.c = axs2;
    }

    @Override
    public final boolean a(File file) {
        return this.a.a(this.b, file, this.c);
    }
}

