/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
final class azi {
    private boolean a;
    private boolean b;
    private boolean c;

    azi() {
    }

    private final boolean b(boolean bl2) {
        if ((this.c || bl2 || this.b) && this.a) {
            return true;
        }
        return false;
    }

    final boolean a() {
        azi azi2 = this;
        synchronized (azi2) {
            this.b = true;
            boolean bl2 = this.b(false);
            return bl2;
        }
    }

    final boolean a(boolean bl2) {
        void var4_2 = this;
        synchronized (var4_2) {
            this.a = true;
            boolean bl3 = super.b(bl2);
            return bl3;
        }
    }

    final boolean b() {
        azi azi2 = this;
        synchronized (azi2) {
            this.c = true;
            boolean bl2 = this.b(false);
            return bl2;
        }
    }

    final void c() {
        azi azi2 = this;
        synchronized (azi2) {
            this.b = false;
            this.a = false;
            this.c = false;
            return;
        }
    }
}

