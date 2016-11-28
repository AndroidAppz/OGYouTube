/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class aug
implements auy {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public aug() {
        this(2500, 1, 1.0f);
    }

    public aug(int n, int n2, float f2) {
        this.a = n;
        this.c = n2;
        this.d = f2;
    }

    @Override
    public final int V_() {
        return this.a;
    }

    @Override
    public final int W_() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(avb avb2) {
        this.b = 1 + this.b;
        this.a = (int)((float)this.a + (float)this.a * this.d);
        if (this.b <= this.c) {
            return;
        }
        boolean bl2 = false;
        if (!bl2) {
            throw avb2;
        }
    }
}

