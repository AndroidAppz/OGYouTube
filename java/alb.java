/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.PopupWindow
 */
import android.view.View;
import android.widget.PopupWindow;

final class alb
extends ane {
    private /* synthetic */ ald d;
    private /* synthetic */ ala e;

    alb(ala ala2, View view, ald ald2) {
        this.e = ala2;
        this.d = ald2;
        super(view);
    }

    @Override
    public final ana a() {
        return this.d;
    }

    @Override
    public final boolean b() {
        if (!this.e.b.e.isShowing()) {
            this.e.b.b();
        }
        return true;
    }
}

