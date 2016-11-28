/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Arrays
 */
import java.util.Arrays;

final class adi {
    int a;
    final /* synthetic */ adg b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    adi(adg adg2, int n, int n2) {
        this.b = adg2;
        this.c = n;
        this.a = n2;
        this.c();
    }

    final int a() {
        return (1 + (this.f - this.e)) * (1 + (this.h - this.g)) * (1 + (this.j - this.i));
    }

    final boolean b() {
        if (1 + this.a - this.c > 1) {
            return true;
        }
        return false;
    }

    final void c() {
        int[] arrn = this.b.a;
        int[] arrn2 = this.b.b;
        int n = Integer.MIN_VALUE;
        int n2 = 0;
        int n3 = n;
        int n4 = Integer.MAX_VALUE;
        int n5 = Integer.MAX_VALUE;
        int n6 = Integer.MAX_VALUE;
        int n7 = n;
        for (int i = this.c; i <= this.a; ++i) {
            int n8 = arrn[i];
            n2 += arrn2[n8];
            int n9 = adg.a(n8);
            int n10 = adg.b(n8);
            int n11 = adg.c(n8);
            if (n9 > n3) {
                n3 = n9;
            }
            if (n9 < n6) {
                n6 = n9;
            }
            if (n10 > n7) {
                n7 = n10;
            }
            if (n10 < n5) {
                n5 = n10;
            }
            if (n11 > n) {
                n = n11;
            }
            if (n11 >= n4) continue;
            n4 = n11;
        }
        this.e = n6;
        this.f = n3;
        this.g = n5;
        this.h = n7;
        this.i = n4;
        this.j = n;
        this.d = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    final int d() {
        int n = this.f - this.e;
        int n2 = this.h - this.g;
        int n3 = this.j - this.i;
        int n4 = n >= n2 && n >= n3 ? -3 : (n2 >= n && n2 >= n3 ? -2 : -1);
        int[] arrn = this.b.a;
        int[] arrn2 = this.b.b;
        adg.a(arrn, n4, this.c, this.a);
        Arrays.sort((int[])arrn, (int)this.c, (int)(1 + this.a));
        adg.a(arrn, n4, this.c, this.a);
        int n5 = this.d / 2;
        int n6 = this.c;
        int n7 = 0;
        while (n6 <= this.a) {
            if ((n7 += arrn2[arrn[n6]]) >= n5) {
                return n6;
            }
            ++n6;
        }
        return this.c;
    }

    final adp e() {
        int n = 0;
        int[] arrn = this.b.a;
        int[] arrn2 = this.b.b;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = this.c; i <= this.a; ++i) {
            int n5 = arrn[i];
            int n6 = arrn2[n5];
            n += n6;
            n4 += n6 * adg.a(n5);
            n3 += n6 * adg.b(n5);
            n2 += n6 * adg.c(n5);
        }
        return new adp(adg.a(Math.round((float)((float)n4 / (float)n)), Math.round((float)((float)n3 / (float)n)), Math.round((float)((float)n2 / (float)n))), n);
    }
}

