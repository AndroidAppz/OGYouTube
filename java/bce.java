/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public final class bce
extends blj
implements bcf {
    private bcg a;

    public bce(int n) {
        super(n);
    }

    @Override
    protected final /* synthetic */ int a(Object object) {
        return ((bap)object).c();
    }

    @Override
    public final /* synthetic */ bap a(axo axo2) {
        return (bap)super.c(axo2);
    }

    @Override
    public final /* synthetic */ bap a(axo axo2, bap bap2) {
        return (bap)super.b(axo2, bap2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(int n) {
        if (n >= 40) {
            this.b(0);
            return;
        } else {
            if (n < 20) return;
            {
                this.b(this.b() / 2);
                return;
            }
        }
    }

    @Override
    public final void a(bcg bcg2) {
        this.a = bcg2;
    }

    @Override
    protected final /* synthetic */ void a(Object object, Object object2) {
        bap bap2 = (bap)object2;
        if (this.a != null) {
            this.a.a(bap2);
        }
    }
}

