/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager
 *  java.lang.Math
 */
import android.media.AudioManager;

final class agj
extends adz {
    private /* synthetic */ agi a;

    agj(agi agi2) {
        this.a = agi2;
    }

    @Override
    public final void b(int n) {
        this.a.i.setStreamVolume(3, n, 0);
        this.a.a();
    }

    @Override
    public final void c(int n) {
        int n2 = this.a.i.getStreamVolume(3);
        if (Math.min((int)this.a.i.getStreamMaxVolume(3), (int)Math.max((int)0, (int)(n2 + n))) != n2) {
            this.a.i.setStreamVolume(3, n2, 0);
        }
        this.a.a();
    }
}

