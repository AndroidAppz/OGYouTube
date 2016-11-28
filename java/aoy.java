/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  ut
 */
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class aoy
extends pl {
    private /* synthetic */ aox d;

    aoy(aox aox2) {
        this.d = aox2;
    }

    @Override
    public final void a(View view, ut ut2) {
        super.a(view, ut2);
        if (!this.d.a() && this.d.d.i != null) {
            this.d.d.i.a(view, ut2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(View view, int n, Bundle bundle) {
        if (super.a(view, n, bundle)) {
            return true;
        }
        boolean bl2 = this.d.a();
        boolean bl3 = false;
        if (bl2) return bl3;
        aoh aoh2 = this.d.d.i;
        bl3 = false;
        if (aoh2 == null) return bl3;
        aoh aoh3 = this.d.d.i;
        return false;
    }
}

