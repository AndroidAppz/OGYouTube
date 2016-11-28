/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Resources
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class aqf
extends ContextWrapper {
    private static final ArrayList a = new ArrayList();
    private Resources b;

    private aqf(Context context) {
        super(context);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Context a(Context object) {
        if (object instanceof aqf) return object;
        int n = a.size();
        int n2 = 0;
        do {
            if (n2 >= n) {
                aqf aqf2 = new aqf((Context)object);
                a.add((Object)new WeakReference((Object)aqf2));
                return aqf2;
            }
            WeakReference weakReference = (WeakReference)a.get(n2);
            aqf aqf3 = weakReference != null ? (aqf)((Object)weakReference.get()) : null;
            if (aqf3 != null && aqf3.getBaseContext() == object) {
                return aqf3;
            }
            ++n2;
        } while (true);
    }

    public final Resources getResources() {
        if (this.b == null) {
            this.b = new aqh((Context)this, super.getResources());
        }
        return this.b;
    }
}

