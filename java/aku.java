/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.PopupWindow
 *  java.lang.IllegalAccessException
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.Field
 */
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class aku
implements ViewTreeObserver.OnScrollChangedListener {
    private /* synthetic */ Field a;
    private /* synthetic */ PopupWindow b;
    private /* synthetic */ ViewTreeObserver.OnScrollChangedListener c;

    aku(Field field, PopupWindow popupWindow, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.a = field;
        this.b = popupWindow;
        this.c = onScrollChangedListener;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onScrollChanged() {
        WeakReference weakReference = (WeakReference)this.a.get((Object)this.b);
        if (weakReference == null) return;
        try {
            if (weakReference.get() == null) {
                return;
            }
            this.c.onScrollChanged();
            return;
        }
        catch (IllegalAccessException var1_2) {
            // empty catch block
        }
    }
}

