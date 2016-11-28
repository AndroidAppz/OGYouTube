/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
import java.util.Arrays;

public final class bbg
implements bav {
    @Override
    public final /* synthetic */ int a(Object object) {
        return ((int[])object).length;
    }

    @Override
    public final /* synthetic */ Object a(int n) {
        return new int[n];
    }

    @Override
    public final String a() {
        return "IntegerArrayPool";
    }

    @Override
    public final int b() {
        return 4;
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        Arrays.fill((int[])((int[])object), (int)0);
    }
}

