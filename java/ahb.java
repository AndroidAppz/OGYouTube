/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 */
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public abstract class ahb {
    Object a;
    boolean b;

    public abstract MenuInflater a();

    public abstract void a(int var1);

    public abstract void a(View var1);

    public abstract void a(CharSequence var1);

    public void a(boolean bl2) {
        this.b = bl2;
    }

    public abstract Menu b();

    public abstract void b(int var1);

    public abstract void b(CharSequence var1);

    public abstract void c();

    public abstract void d();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public boolean h() {
        return false;
    }

    public abstract View i();
}

