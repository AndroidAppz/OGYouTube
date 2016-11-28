/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.ActionBarContainer
 *  android.support.v7.widget.ActionBarOverlayLayout
 *  android.view.View
 *  rw
 *  ug
 */
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

final class acl
extends ug {
    private /* synthetic */ ack a;

    acl(ack ack2) {
        this.a = ack2;
    }

    public final void b(View view) {
        if (this.a.j && this.a.f != null) {
            rw.b((View)this.a.f, (float)0.0f);
            rw.b((View)this.a.c, (float)0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        this.a.l = null;
        ack ack2 = this.a;
        if (ack2.i != null) {
            ack2.i.a(ack2.h);
            ack2.h = null;
            ack2.i = null;
        }
        if (this.a.b != null) {
            rw.r((View)this.a.b);
        }
    }
}

