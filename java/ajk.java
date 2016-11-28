/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  java.lang.Object
 */
import android.view.MenuItem;

final class ajk
implements aim {
    private /* synthetic */ ajd a;

    ajk(ajd ajd2) {
        this.a = ajd2;
    }

    @Override
    public final void a(ahw ahw2, boolean bl2) {
        aim aim2;
        if (ahw2 instanceof air) {
            ((air)ahw2).k.a(false);
        }
        if ((aim2 = this.a.d) != null) {
            aim2.a(ahw2, bl2);
        }
    }

    @Override
    public final boolean a(ahw ahw2) {
        if (ahw2 == null) {
            return false;
        }
        ((air)ahw2).getItem().getItemId();
        aim aim2 = this.a.d;
        if (aim2 != null) {
            return aim2.a(ahw2);
        }
        return false;
    }
}

