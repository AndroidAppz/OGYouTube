/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public final class apd {
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n, int n2) {
        this.c = n;
        this.d = n2;
        this.h = true;
        if (this.g) {
            if (n2 != Integer.MIN_VALUE) {
                this.a = n2;
            }
            if (n == Integer.MIN_VALUE) return;
            {
                this.b = n;
                return;
            }
        } else {
            if (n != Integer.MIN_VALUE) {
                this.a = n;
            }
            if (n2 == Integer.MIN_VALUE) return;
            {
                this.b = n2;
                return;
            }
        }
    }
}

