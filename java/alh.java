/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.widget.TextView
 *  java.lang.Object
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

public class alh {
    private static final int[] b = new int[]{16842804, 16843119, 16843117, 16843120, 16843118};
    private static final int[] c;
    final TextView a;
    private aqg d;
    private aqg e;
    private aqg f;
    private aqg g;

    static {
        int[] arrn = new int[]{acq.J};
        c = arrn;
    }

    alh(TextView textView) {
        this.a = textView;
    }

    public static alh a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 17) {
            return new ali(textView);
        }
        return new alh(textView);
    }

    protected static aqg a(Context context, akj akj2, int n) {
        ColorStateList colorStateList = akj2.a(context, n);
        if (colorStateList != null) {
            aqg aqg2 = new aqg();
            aqg2.d = true;
            aqg2.a = colorStateList;
            return aqg2;
        }
        return null;
    }

    public void a() {
        if (this.d != null || this.e != null || this.f != null || this.g != null) {
            Drawable[] arrdrawable = this.a.getCompoundDrawables();
            this.a(arrdrawable[0], this.d);
            this.a(arrdrawable[1], this.e);
            this.a(arrdrawable[2], this.f);
            this.a(arrdrawable[3], this.g);
        }
    }

    public final void a(Context context, int n) {
        TypedArray typedArray = context.obtainStyledAttributes(n, c);
        if (typedArray.hasValue(0)) {
            this.a(typedArray.getBoolean(0, false));
        }
        typedArray.recycle();
    }

    final void a(Drawable drawable, aqg aqg2) {
        if (drawable != null && aqg2 != null) {
            akj.a(drawable, aqg2, this.a.getDrawableState());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(AttributeSet attributeSet, int n) {
        int n2 = 1;
        Context context = this.a.getContext();
        akj akj2 = akj.a();
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, b, n, 0);
        int n3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(n2)) {
            this.d = alh.a(context, akj2, typedArray.getResourceId(n2, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = alh.a(context, akj2, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(3)) {
            this.f = alh.a(context, akj2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(4)) {
            this.g = alh.a(context, akj2, typedArray.getResourceId(4, 0));
        }
        typedArray.recycle();
        if (!(this.a.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            int n4;
            boolean bl2;
            TypedArray typedArray2;
            if (n3 != -1) {
                TypedArray typedArray3 = context.obtainStyledAttributes(n3, ada.bP);
                if (typedArray3.hasValue(ada.bU)) {
                    bl2 = typedArray3.getBoolean(ada.bU, false);
                    n4 = n2;
                } else {
                    n4 = 0;
                    bl2 = false;
                }
                typedArray3.recycle();
            } else {
                n4 = 0;
                bl2 = false;
            }
            if ((typedArray2 = context.obtainStyledAttributes(attributeSet, c, n, 0)).hasValue(0)) {
                bl2 = typedArray2.getBoolean(0, false);
            } else {
                n2 = n4;
            }
            typedArray2.recycle();
            if (n2 != 0) {
                this.a(bl2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(boolean bl2) {
        TextView textView = this.a;
        agz agz2 = bl2 ? new agz(this.a.getContext()) : null;
        textView.setTransformationMethod((TransformationMethod)agz2);
    }
}

