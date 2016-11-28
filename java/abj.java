/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.widget.SeekBar;

final class abj
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ aas a;
    private final Runnable b;

    abj(aas aas2) {
        this.a = aas2;
        this.b = new abk((abj)this);
    }

    public final void onProgressChanged(SeekBar seekBar, int n, boolean bl2) {
        if (bl2) {
            aeu aeu2 = (aeu)seekBar.getTag();
            if (aas.b) {
                new StringBuilder("onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(").append(n).append(")");
            }
            aeu2.a(n);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.a.v != null) {
            this.a.t.removeCallbacks(this.b);
        }
        this.a.v = (aeu)seekBar.getTag();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.t.postDelayed(this.b, 500);
    }
}

