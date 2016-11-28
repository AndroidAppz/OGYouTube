/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 */
import java.io.InputStream;

public final class ayl
implements aya {
    private final baw a;

    public ayl(baw baw2) {
        this.a = baw2;
    }

    @Override
    public final /* synthetic */ axz a(Object object) {
        return new ayk((InputStream)object, this.a);
    }

    @Override
    public final Class a() {
        return InputStream.class;
    }
}

