/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
final class ard
extends ara {
    private Object f = null;

    ard() {
    }

    @Override
    public final int a() {
        return 8;
    }

    @Override
    public final Object a(int n) {
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(ara ara2) {
        switch (ara2.e()) {
            default: {
                this.f = null;
                break;
            }
            case 3: {
                this.f = ara2.a(8);
                ara2.d();
                break;
            }
            case 4: {
                this.f = ara2.a(16);
                ara2.d();
            }
        }
        this.d = false;
    }

    @Override
    public final void a(arx arx2) {
        this.f = null;
    }

    @Override
    public final void a(Object object) {
        this.f = object;
    }

    @Override
    public final int b() {
        return 8;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int e() {
        return 3;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g() {
        this.f = null;
    }

    @Override
    public final int h() {
        return 0;
    }
}

