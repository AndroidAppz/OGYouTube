/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.DrawableContainer
 *  android.graphics.drawable.DrawableContainer$DrawableContainerState
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 */
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class ai {
    private static Method a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(DrawableContainer drawableContainer, Drawable.ConstantState constantState) {
        if (!b) {
            try {
                Method method;
                a = method = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainer.DrawableContainerState.class});
                method.setAccessible(true);
            }
            catch (NoSuchMethodException var5_3) {
                Log.e((String)"DrawableUtils", (String)"Could not fetch setConstantState(). Oh well.");
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke((Object)drawableContainer, new Object[]{constantState});
                return true;
            }
            catch (Exception var2_4) {
                Log.e((String)"DrawableUtils", (String)"Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(DrawableContainer drawableContainer, Drawable.ConstantState constantState) {
        if (!d) {
            try {
                Field field;
                c = field = DrawableContainer.class.getDeclaredField("mDrawableContainerStateField");
                field.setAccessible(true);
            }
            catch (NoSuchFieldException var4_3) {
                Log.e((String)"DrawableUtils", (String)"Could not fetch mDrawableContainerStateField. Oh well.");
            }
            d = true;
        }
        if (c != null) {
            try {
                c.set((Object)drawableContainer, (Object)constantState);
                return true;
            }
            catch (Exception var2_4) {
                Log.e((String)"DrawableUtils", (String)"Could not set mDrawableContainerStateField. Oh well.");
            }
        }
        return false;
    }
}

