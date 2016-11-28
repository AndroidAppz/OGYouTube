/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuItem
 *  java.lang.Object
 *  java.util.ArrayList
 *  pj
 */
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class ahh
implements ahc {
    private ActionMode.Callback a;
    private Context b;
    private ArrayList c;
    private pj d;

    public ahh(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
        this.c = new ArrayList();
        this.d = new pj();
    }

    private final Menu a(Menu menu) {
        Menu menu2 = (Menu)this.d.get((Object)menu);
        if (menu2 == null) {
            menu2 = aip.a(this.b, (kh)menu);
            this.d.put((Object)menu, (Object)menu2);
        }
        return menu2;
    }

    @Override
    public final void a(ahb ahb2) {
        this.a.onDestroyActionMode(this.b(ahb2));
    }

    @Override
    public final boolean a(ahb ahb2, Menu menu) {
        return this.a.onCreateActionMode(this.b(ahb2), super.a(menu));
    }

    @Override
    public final boolean a(ahb ahb2, MenuItem menuItem) {
        return this.a.onActionItemClicked(this.b(ahb2), aip.a(this.b, (ki)menuItem));
    }

    public final ActionMode b(ahb ahb2) {
        int n = this.c.size();
        for (int i = 0; i < n; ++i) {
            ahg ahg2 = (ahg)((Object)this.c.get(i));
            if (ahg2 == null || ahg2.a != ahb2) continue;
            return ahg2;
        }
        ahg ahg3 = new ahg(this.b, ahb2);
        this.c.add((Object)ahg3);
        return ahg3;
    }

    @Override
    public final boolean b(ahb ahb2, Menu menu) {
        return this.a.onPrepareActionMode(this.b(ahb2), super.a(menu));
    }
}

