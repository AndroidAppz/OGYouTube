/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

public abstract class apz
extends aoc {
    private boolean a = true;

    public abstract boolean a(aow var1);

    public abstract boolean a(aow var1, int var2, int var3, int var4, int var5);

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(aow aow2, aoe aoe2, aoe aoe3) {
        int n = aoe2.a;
        int n2 = aoe2.b;
        View view = aow2.a;
        int n3 = aoe3 == null ? view.getLeft() : aoe3.a;
        int n4 = aoe3 == null ? view.getTop() : aoe3.b;
        if (!(aow2.m() || n == n3 && n2 == n4)) {
            view.layout(n3, n4, n3 + view.getWidth(), n4 + view.getHeight());
            return this.a(aow2, n, n2, n3, n4);
        }
        return this.a(aow2);
    }

    public abstract boolean a(aow var1, aow var2, int var3, int var4, int var5, int var6);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(aow aow2, aow aow3, aoe aoe2, aoe aoe3) {
        int n;
        int n2;
        int n3 = aoe2.a;
        int n4 = aoe2.b;
        if (aow3.b()) {
            n = aoe2.a;
            n2 = aoe2.b;
            do {
                return this.a(aow2, aow3, n3, n4, n, n2);
                break;
            } while (true);
        }
        n = aoe3.a;
        n2 = aoe3.b;
        return this.a(aow2, aow3, n3, n4, n, n2);
    }

    public abstract boolean b(aow var1);

    @Override
    public final boolean b(aow aow2, aoe aoe2, aoe aoe3) {
        if (aoe2 != null && (aoe2.a != aoe3.a || aoe2.b != aoe3.b)) {
            return this.a(aow2, aoe2.a, aoe2.b, aoe3.a, aoe3.b);
        }
        return this.b(aow2);
    }

    @Override
    public final boolean c(aow aow2, aoe aoe2, aoe aoe3) {
        if (aoe2.a != aoe3.a || aoe2.b != aoe3.b) {
            return this.a(aow2, aoe2.a, aoe2.b, aoe3.a, aoe3.b);
        }
        this.e(aow2);
        return false;
    }

    @Override
    public final boolean f(aow aow2) {
        if (!this.a || aow2.j()) {
            return true;
        }
        return false;
    }
}

