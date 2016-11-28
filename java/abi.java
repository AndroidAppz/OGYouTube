/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
import android.widget.SeekBar;
import java.util.Map;

final class abi
extends aeg {
    private /* synthetic */ aas a;

    abi(aas aas2) {
        this.a = aas2;
    }

    @Override
    public final void b(aeu aeu2) {
        this.a.a(false);
    }

    @Override
    public final void c(aef aef2, aeu aeu2) {
        this.a.a(true);
    }

    @Override
    public final void c(aeu aeu2) {
        SeekBar seekBar = (SeekBar)this.a.A.get((Object)aeu2);
        int n = aeu2.q;
        if (aas.b) {
            new StringBuilder("onRouteVolumeChanged(), route.getVolume:").append(n);
        }
        if (seekBar != null && this.a.v != aeu2) {
            seekBar.setProgress(n);
        }
    }
}

