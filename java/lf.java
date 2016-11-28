/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.os.IBinder$DeathRecipient
 *  java.lang.Object
 *  kn
 *  lg
 *  lh
 *  li
 *  lt
 *  lu
 *  ne
 */
import android.os.Build;
import android.os.IBinder;

public class lf
implements IBinder.DeathRecipient {
    final Object a;
    lg b;
    boolean c = false;

    public lf() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = new lu((lt)new lh(this));
            return;
        }
        this.a = new li(this);
    }

    public void a() {
    }

    public void a(kn kn2) {
    }

    public void a(ne ne2) {
    }

    public void binderDied() {
        this.a();
    }
}

