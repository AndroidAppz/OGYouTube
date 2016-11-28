/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.view.View;
import android.view.ViewParent;

final class anf
implements Runnable {
    private /* synthetic */ ane a;

    anf(ane ane2) {
        this.a = ane2;
    }

    public final void run() {
        this.a.a.getParent().requestDisallowInterceptTouchEvent(true);
    }
}

