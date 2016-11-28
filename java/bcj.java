/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.DisplayMetrics
 *  java.lang.Object
 */
import android.util.DisplayMetrics;

final class bcj
implements bck {
    private final DisplayMetrics a;

    public bcj(DisplayMetrics displayMetrics) {
        this.a = displayMetrics;
    }

    @Override
    public final int a() {
        return this.a.widthPixels;
    }

    @Override
    public final int b() {
        return this.a.heightPixels;
    }
}

