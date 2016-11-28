/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.ActionBarContainer
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.Object
 *  uh
 */
import android.support.v7.widget.ActionBarContainer;
import android.view.View;
import android.view.ViewParent;

final class acn
implements uh {
    private /* synthetic */ ack a;

    acn(ack ack2) {
        this.a = ack2;
    }

    public final void a() {
        ((View)this.a.c.getParent()).invalidate();
    }
}

