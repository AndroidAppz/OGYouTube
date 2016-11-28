/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 *  rw
 */
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

final class alf
implements ViewTreeObserver.OnGlobalLayoutListener {
    private /* synthetic */ ald a;

    alf(ald ald2) {
        this.a = ald2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onGlobalLayout() {
        ald ald2 = this.a;
        ala ala2 = this.a.d;
        boolean bl2 = rw.x((View)ala2) && ala2.getGlobalVisibleRect(ald2.c);
        if (!bl2) {
            this.a.d();
            return;
        }
        this.a.a();
        ald.a(this.a);
    }
}

