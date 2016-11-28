/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public final class ate {
    public static int a(int n) {
        int n2 = n - 1;
        int n3 = n2 | n2 >> 1;
        int n4 = n3 | n3 >> 2;
        int n5 = n4 | n4 >> 4;
        int n6 = n5 | n5 >> 8;
        return 1 + (n6 | n6 >> 16);
    }
}

