/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class bdg
implements bdd {
    bdg() {
    }

    @Override
    public final Class a() {
        return InputStream.class;
    }

    @Override
    public final /* synthetic */ Object a(byte[] arrby) {
        return new ByteArrayInputStream(arrby);
    }
}

