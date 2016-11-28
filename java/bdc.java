/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
import java.nio.ByteBuffer;

final class bdc
implements bdd {
    bdc() {
    }

    @Override
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override
    public final /* synthetic */ Object a(byte[] arrby) {
        return ByteBuffer.wrap((byte[])arrby);
    }
}

