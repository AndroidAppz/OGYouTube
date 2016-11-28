/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.Toolbar
 *  android.view.View
 *  ug
 */
import android.support.v7.widget.Toolbar;
import android.view.View;

final class aqt
extends ug {
    private boolean a;
    private /* synthetic */ int b;
    private /* synthetic */ aqr c;

    aqt(aqr aqr2, int n) {
        this.c = aqr2;
        this.b = n;
        this.a = false;
    }

    public final void a(View view) {
        this.c.a.setVisibility(0);
    }

    public final void b(View view) {
        if (!this.a) {
            this.c.a.setVisibility(this.b);
        }
    }

    public final void c(View view) {
        this.a = true;
    }
}

