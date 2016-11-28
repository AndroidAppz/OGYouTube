/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 *  android.widget.PopupWindow
 */
import android.database.DataSetObserver;
import android.widget.PopupWindow;

final class ani
extends DataSetObserver {
    private /* synthetic */ ana a;

    ani(ana ana2) {
        this.a = ana2;
    }

    public final void onChanged() {
        if (this.a.e.isShowing()) {
            this.a.b();
        }
    }

    public final void onInvalidated() {
        this.a.d();
    }
}

