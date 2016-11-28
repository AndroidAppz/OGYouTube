/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
import java.util.Arrays;

public final class bbd
implements bav {
    @Override
    public final /* synthetic */ int a(Object object) {
        return ((byte[])object).length;
    }

    @Override
    public final /* synthetic */ Object a(int n) {
        return new byte[n];
    }

    @Override
    public final String a() {
        return "ByteArrayPool";
    }

    @Override
    public final int b() {
        return 1;
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        Arrays.fill((byte[])((byte[])object), (byte)0);
    }
}

