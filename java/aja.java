/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.ActionBarContainer
 *  android.support.v7.widget.ActionBarOverlayLayout
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 *  rw
 *  tp
 *  uf
 */
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

public final class aja
implements Runnable {
    private /* synthetic */ ActionBarOverlayLayout a;

    public aja(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.c();
        this.a.h = rw.p((View)this.a.b).c((float)(- this.a.b.getHeight())).a(this.a.i);
    }
}

