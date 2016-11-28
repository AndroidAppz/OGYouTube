/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.util.AttributeSet
 *  android.widget.ProgressBar
 *  android.widget.RatingBar
 *  rw
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RatingBar;

public final class akx
extends RatingBar {
    private akv a;
    private akj b;

    public akx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, acq.E);
    }

    private akx(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.b = akj.a();
        this.a = new akv((ProgressBar)this);
        this.a.a(attributeSet, n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void onMeasure(int n, int n2) {
        void var5_3 = this;
        synchronized (var5_3) {
            super.onMeasure(n, n2);
            Bitmap bitmap = this.a.a;
            if (bitmap != null) {
                this.setMeasuredDimension(rw.a((int)(bitmap.getWidth() * this.getNumStars()), (int)n, (int)0), this.getMeasuredHeight());
            }
            return;
        }
    }
}

