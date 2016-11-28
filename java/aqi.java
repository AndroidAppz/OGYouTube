/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  java.lang.CharSequence
 *  java.lang.Object
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class aqi {
    public final TypedArray a;
    private final Context b;

    public aqi(Context context, TypedArray typedArray) {
        this.b = context;
        this.a = typedArray;
    }

    public static aqi a(Context context, AttributeSet attributeSet, int[] arrn, int n) {
        return new aqi(context, context.obtainStyledAttributes(attributeSet, arrn, n, 0));
    }

    public final int a(int n, int n2) {
        return this.a.getInt(n, n2);
    }

    public final Drawable a(int n) {
        int n2;
        if (this.a.hasValue(n) && (n2 = this.a.getResourceId(n, 0)) != 0) {
            return akj.a().a(this.b, n2, false);
        }
        return this.a.getDrawable(n);
    }

    public final boolean a(int n, boolean bl2) {
        return this.a.getBoolean(n, bl2);
    }

    public final int b(int n, int n2) {
        return this.a.getDimensionPixelOffset(n, n2);
    }

    public final Drawable b(int n) {
        int n2;
        if (this.a.hasValue(n) && (n2 = this.a.getResourceId(n, 0)) != 0) {
            return akj.a().a(this.b, n2, true);
        }
        return null;
    }

    public final int c(int n, int n2) {
        return this.a.getDimensionPixelSize(n, n2);
    }

    public final CharSequence c(int n) {
        return this.a.getText(n);
    }

    public final int d(int n) {
        return this.a.getColor(n, -1);
    }

    public final int d(int n, int n2) {
        return this.a.getLayoutDimension(n, n2);
    }

    public final int e(int n, int n2) {
        return this.a.getResourceId(n, n2);
    }

    public final boolean e(int n) {
        return this.a.hasValue(n);
    }
}

