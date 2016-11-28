/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Resources
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class aai
implements View.OnClickListener {
    private final View a;
    private final String b;
    private Method c;
    private Context d;

    public aai(View view, String string) {
        this.a = view;
        this.b = string;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onClick(View var1) {
        if (this.c != null) ** GOTO lbl10
        var5_2 = this.a.getContext();
        while (var5_2 != null) {
            try {
                ** if (var5_2.isRestricted() || (var9_4 = var5_2.getClass().getMethod((String)this.b, (Class[])new Class[]{View.class})) == null) goto lbl-1000
            }
            catch (NoSuchMethodException var8_3) {
                // empty catch block
            }
lbl-1000: // 1 sources:
            {
                this.c = var9_4;
                this.d = var5_2;
lbl10: // 3 sources:
                this.c.invoke((Object)this.d, new Object[]{var1});
                return;
            }
lbl-1000: // 1 sources:
            {
            }
            if (var5_2 instanceof ContextWrapper) {
                var5_2 = ((ContextWrapper)var5_2).getBaseContext();
                continue;
            }
            var5_2 = null;
        }
        var6_5 = this.a.getId();
        if (var6_5 == -1) {
            var7_6 = "";
            do {
                throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + (Object)this.a.getClass() + var7_6);
                break;
            } while (true);
        }
        var7_6 = " with id '" + this.a.getContext().getResources().getResourceEntryName(var6_5) + "'";
        throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + (Object)this.a.getClass() + var7_6);
        catch (IllegalAccessException var3_7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", (Throwable)var3_7);
        }
        catch (InvocationTargetException var2_8) {
            throw new IllegalStateException("Could not execute method for android:onClick", (Throwable)var2_8);
        }
    }
}

