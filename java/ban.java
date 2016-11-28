/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  pg
 */
final class ban
implements bap,
blv {
    private static final pg a = blp.a(20, (blt)new bao());
    private final blx b = new bly();
    private bap c;
    private boolean d;
    private boolean e;

    ban() {
    }

    static ban a(bap bap2) {
        ban ban2 = (ban)a.a();
        ban2.e = false;
        ban2.d = true;
        ban2.c = bap2;
        return ban2;
    }

    @Override
    public final Class a() {
        return this.c.a();
    }

    @Override
    public final Object b() {
        return this.c.b();
    }

    @Override
    public final blx b_() {
        return this.b;
    }

    @Override
    public final int c() {
        return this.c.c();
    }

    @Override
    public final void d() {
        ban ban2 = this;
        synchronized (ban2) {
            this.b.a();
            this.e = true;
            if (!this.d) {
                this.c.d();
                this.c = null;
                a.a((Object)this);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        ban ban2 = this;
        synchronized (ban2) {
            this.b.a();
            if (!this.d) {
                throw new IllegalStateException("Already unlocked");
            }
            this.d = false;
            if (this.e) {
                this.d();
            }
            return;
        }
    }
}

