/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  ox
 */
import android.graphics.PorterDuff;

final class akl
extends ox {
    public akl() {
        super(6);
    }

    static int a(int n, PorterDuff.Mode mode) {
        return 31 * (n + 31) + mode.hashCode();
    }
}

