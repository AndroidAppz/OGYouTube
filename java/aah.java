/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.TypedArray
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.Map
 *  or
 *  rw
 *  sj
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

final class aah {
    private static final Class[] a = new Class[]{Context.class, AttributeSet.class};
    private static final int[] b = new int[]{16843375};
    private static final String[] c = new String[]{"android.widget.", "android.view.", "android.webkit."};
    private static final Map d = new or();
    private final Object[] e = new Object[2];

    aah() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static Context a(Context object, AttributeSet attributeSet, boolean bl2, boolean bl3) {
        TypedArray typedArray = object.obtainStyledAttributes(attributeSet, ada.cu, 0, 0);
        int n = bl2 ? typedArray.getResourceId(ada.cv, 0) : 0;
        int n2 = n == 0 ? typedArray.getResourceId(ada.cw, 0) : n;
        typedArray.recycle();
        if (n2 == 0) return object;
        if (!(object instanceof ahe)) return new ahe((Context)object, n2);
        if (((ahe)object).a == n2) return object;
        return new ahe((Context)object, n2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private final View a(Context var1, String var2_3, String var3_2) {
        var4_4 = (Constructor)aah.d.get((Object)var2_3);
        if (var4_4 != null) ** GOTO lbl8
        try {
            var7_5 = var1.getClassLoader();
            var8_6 = var3_2 != null ? var3_2 + var2_3 : var2_3;
            var4_4 = var7_5.loadClass(var8_6).asSubclass((Class)View.class).getConstructor(aah.a);
            aah.d.put((Object)var2_3, (Object)var4_4);
lbl8: // 2 sources:
            var4_4.setAccessible(true);
            return (View)var4_4.newInstance(this.e);
        }
        catch (Exception var5_8) {
            return null;
        }
    }

    static void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper) || Build.VERSION.SDK_INT >= 15 && !rw.a.H(view)) {
            return;
        }
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, b);
        String string = typedArray.getString(0);
        if (string != null) {
            view.setOnClickListener((View.OnClickListener)new aai(view, string));
        }
        typedArray.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final View a(Context context, String string, AttributeSet attributeSet) {
        if (string.equals((Object)"view")) {
            string = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.e[0] = context;
            this.e[1] = attributeSet;
            if (-1 != string.indexOf(46)) return super.a(context, string, (String)null);
        }
        catch (Exception var5_7) {
            return null;
        }
        catch (Throwable var4_8) {
            throw var4_8;
        }
        for (int i = 0; i < c.length; ++i) {
            View view = super.a(context, string, c[i]);
            if (view == null) continue;
            this.e[0] = null;
            this.e[1] = null;
            return view;
        }
        this.e[0] = null;
        this.e[1] = null;
        return null;
    }
}

