/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.SeekBar
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class aky
extends SeekBar {
    private akz a;
    private akj b;

    public aky(Context context) {
        super(context, null);
    }

    public aky(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, acq.G);
    }

    public aky(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.b = akj.a();
        this.a = new akz((SeekBar)this, this.b);
        this.a.a(attributeSet, n);
    }
}

