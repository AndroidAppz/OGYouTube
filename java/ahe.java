/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.view.LayoutInflater
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class ahe
extends ContextWrapper {
    public int a;
    private Resources.Theme b;
    private LayoutInflater c;

    public ahe(Context context, int n) {
        super(context);
        this.a = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a() {
        boolean bl2 = this.b == null;
        if (bl2) {
            this.b = this.getResources().newTheme();
            Resources.Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final Object getSystemService(String string) {
        if ("layout_inflater".equals((Object)string)) {
            if (this.c == null) {
                this.c = LayoutInflater.from((Context)this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(string);
    }

    public final Resources.Theme getTheme() {
        if (this.b != null) {
            return this.b;
        }
        if (this.a == 0) {
            this.a = acz.b;
        }
        this.a();
        return this.b;
    }

    public final void setTheme(int n) {
        if (this.a != n) {
            this.a = n;
            super.a();
        }
    }
}

