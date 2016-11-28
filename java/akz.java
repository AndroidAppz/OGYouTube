/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.SeekBar;

final class akz
extends akv {
    private static final int[] b = new int[]{16843074};
    private final SeekBar c;

    akz(SeekBar seekBar, akj akj2) {
        super((ProgressBar)seekBar);
        this.c = seekBar;
    }

    @Override
    final void a(AttributeSet attributeSet, int n) {
        super.a(attributeSet, n);
        aqi aqi2 = aqi.a(this.c.getContext(), attributeSet, b, n);
        Drawable drawable = aqi2.b(0);
        if (drawable != null) {
            this.c.setThumb(drawable);
        }
        aqi2.a.recycle();
    }
}

