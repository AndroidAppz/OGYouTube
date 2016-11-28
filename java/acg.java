/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.Menu
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.widget.ListAdapter
 */
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;

final class acg
extends ahn {
    private /* synthetic */ aca a;

    public acg(aca aca2, Window.Callback callback) {
        this.a = aca2;
        super(callback);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final View onCreatePanelView(int n) {
        switch (n) {
            default: {
                return super.onCreatePanelView(n);
            }
            case 0: 
        }
        Menu menu = this.a.a.n();
        if (!this.onPreparePanel(n, null, menu)) return super.onCreatePanelView(n);
        if (!this.onMenuOpened(n, menu)) return super.onCreatePanelView(n);
        aca aca2 = this.a;
        if (aca2.d == null && menu instanceof ahw) {
            ahw ahw2 = (ahw)menu;
            Context context = aca2.a.b();
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getResources().newTheme();
            theme.setTo(context.getTheme());
            theme.resolveAttribute(acq.a, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme.applyStyle(typedValue.resourceId, true);
            }
            theme.resolveAttribute(acq.B, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme.applyStyle(typedValue.resourceId, true);
            } else {
                theme.applyStyle(acz.a, true);
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(theme);
            aca2.d = new ahu((Context)contextThemeWrapper, acx.k);
            aca2.d.d = new acf(aca2);
            ahw2.a(aca2.d);
        }
        if (menu == null) return null;
        if (aca2.d == null) {
            return null;
        }
        if (aca2.d.b().getCount() <= 0) return null;
        return (View)aca2.d.a(aca2.a.a());
    }

    @Override
    public final boolean onPreparePanel(int n, View view, Menu menu) {
        boolean bl2 = super.onPreparePanel(n, view, menu);
        if (bl2 && !this.a.b) {
            this.a.a.j();
            this.a.b = true;
        }
        return bl2;
    }
}

