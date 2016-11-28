/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.ResultReceiver
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.AutoCompleteTextView
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

public final class aps {
    public Method a;
    public Method b;
    Method c;
    private Method d;

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public aps() {
        super();
        try {
            this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.a.setAccessible(true);
        }
        catch (NoSuchMethodException var1_6) {
            ** continue;
        }
lbl7: // 2 sources:
        do {
            try {
                this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b.setAccessible(true);
            }
            catch (NoSuchMethodException var2_5) {
                ** continue;
            }
lbl13: // 2 sources:
            do {
                try {
                    var6_1 = new Class[]{Boolean.TYPE};
                    this.d = AutoCompleteTextView.class.getMethod("ensureImeVisible", var6_1);
                    this.d.setAccessible(true);
                }
                catch (NoSuchMethodException var3_4) {
                    ** continue;
                }
lbl20: // 2 sources:
                do {
                    try {
                        var5_2 = new Class[]{Integer.TYPE, ResultReceiver.class};
                        this.c = InputMethodManager.class.getMethod("showSoftInputUnchecked", var5_2);
                        this.c.setAccessible(true);
                        return;
                    }
                    catch (NoSuchMethodException var4_3) {
                        return;
                    }
                    break;
                } while (true);
                break;
            } while (true);
            break;
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(AutoCompleteTextView autoCompleteTextView) {
        if (this.d == null) return;
        try {
            Method method = this.d;
            Object[] arrobject = new Object[]{true};
            method.invoke((Object)autoCompleteTextView, arrobject);
            return;
        }
        catch (Exception var2_4) {
            return;
        }
    }
}

