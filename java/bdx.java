/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

final class bdx
implements bdv {
    bdx() {
    }

    @Override
    public final Class a() {
        return InputStream.class;
    }

    @Override
    public final /* synthetic */ Object a(File file) {
        return new FileInputStream(file);
    }

    @Override
    public final /* synthetic */ void a(Object object) {
        ((InputStream)object).close();
    }
}

