/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Color
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.ThreadLocal
 *  jh
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

final class aqe {
    static final int[] a;
    static final int[] b;
    static final int[] c;
    static final int[] d;
    static final int[] e;
    static final int[] f;
    static final int[] g;
    static final int[] h;
    private static final ThreadLocal i;
    private static final int[] j;

    static {
        i = new ThreadLocal();
        a = new int[]{-16842910};
        b = new int[]{16842908};
        c = new int[]{16843518};
        d = new int[]{16842919};
        e = new int[]{16842912};
        f = new int[]{16842913};
        g = new int[]{-16842919, -16842908};
        h = new int[0];
        j = new int[1];
    }

    public static int a(Context context, int n) {
        aqe.j[0] = n;
        TypedArray typedArray = context.obtainStyledAttributes(null, j);
        try {
            int n2 = typedArray.getColor(0, 0);
            return n2;
        }
        finally {
            typedArray.recycle();
        }
    }

    static int a(Context context, int n, float f2) {
        int n2 = aqe.a(context, n);
        return jh.c((int)n2, (int)Math.round((float)(f2 * (float)Color.alpha((int)n2))));
    }

    public static ColorStateList b(Context context, int n) {
        aqe.j[0] = n;
        TypedArray typedArray = context.obtainStyledAttributes(null, j);
        try {
            ColorStateList colorStateList = typedArray.getColorStateList(0);
            return colorStateList;
        }
        finally {
            typedArray.recycle();
        }
    }

    public static int c(Context context, int n) {
        ColorStateList colorStateList = aqe.b(context, n);
        if (colorStateList != null && colorStateList.isStateful()) {
            return colorStateList.getColorForState(a, colorStateList.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue)i.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            i.set((Object)typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        return aqe.a(context, n, typedValue.getFloat());
    }
}

