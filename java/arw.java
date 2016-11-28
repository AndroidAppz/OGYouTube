/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
final class arw
implements arv {
    private ark a;
    private /* synthetic */ art b;

    arw(art art2) {
        this.b = art2;
        this.a = null;
    }

    @Override
    public final ark a(int[] arrn) {
        aro aro2 = aro.a();
        return new ark(this.b.b, arrn, aro2);
    }

    @Override
    public final void a(ark ark2) {
        this.a = ark2.e();
        this.a.b = true;
    }

    @Override
    public final boolean a() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    @Override
    public final ark c() {
        ark ark2 = this.a;
        this.a = null;
        return ark2;
    }

    @Override
    public final void d() {
        if (this.a != null) {
            this.a.d();
            this.a = null;
        }
    }
}

