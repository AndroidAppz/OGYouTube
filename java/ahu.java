/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.graphics.drawable.Drawable
 *  android.support.v7.view.menu.ExpandedMenuView
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  java.lang.CharSequence
 *  java.lang.Object
 *  zc
 *  zh
 */
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

public final class ahu
implements ail,
AdapterView.OnItemClickListener {
    LayoutInflater a;
    ahw b;
    int c;
    public aim d;
    private Context e;
    private ExpandedMenuView f;
    private int g;
    private ahv h;

    private ahu(int n) {
        this.c = n;
        this.g = 0;
    }

    public ahu(Context context, int n) {
        super(n);
        this.e = context;
        this.a = LayoutInflater.from((Context)this.e);
    }

    public final ain a(ViewGroup viewGroup) {
        if (this.f == null) {
            this.f = (ExpandedMenuView)this.a.inflate(acx.h, viewGroup, false);
            if (this.h == null) {
                this.h = new ahv((ahu)this);
            }
            this.f.setAdapter((ListAdapter)this.h);
            this.f.setOnItemClickListener((AdapterView.OnItemClickListener)this);
        }
        return this.f;
    }

    @Override
    public final void a(ahw ahw2, boolean bl2) {
        if (this.d != null) {
            this.d.a(ahw2, bl2);
        }
    }

    @Override
    public final void a(Context context, ahw ahw2) {
        if (this.e != null) {
            this.e = context;
            if (this.a == null) {
                this.a = LayoutInflater.from((Context)this.e);
            }
        }
        this.b = ahw2;
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean a() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(air air2) {
        ListAdapter listAdapter;
        if (!air2.hasVisibleItems()) {
            return false;
        }
        ahz ahz2 = new ahz(air2);
        ahw ahw2 = ahz2.a;
        zh zh2 = new zh(ahw2.a);
        ahz2.c = new ahu(zh2.a.a, acx.k);
        ahz2.c.d = ahz2;
        ahz2.a.a(ahz2.c);
        zh2.a.n = listAdapter = ahz2.c.b();
        zh2.a.o = ahz2;
        View view = ahw2.h;
        if (view != null) {
            zh2.a.e = view;
        } else {
            CharSequence charSequence;
            Drawable drawable;
            zh2.a.c = drawable = ahw2.g;
            zh2.a.d = charSequence = ahw2.f;
        }
        zh2.a.m = ahz2;
        ahz2.b = zh2.a();
        ahz2.b.setOnDismissListener((DialogInterface.OnDismissListener)ahz2);
        WindowManager.LayoutParams layoutParams = ahz2.b.getWindow().getAttributes();
        layoutParams.type = 1003;
        layoutParams.flags = 131072 | layoutParams.flags;
        ahz2.b.show();
        if (this.d != null) {
            this.d.a(air2);
        }
        return true;
    }

    public final ListAdapter b() {
        if (this.h == null) {
            this.h = new ahv(this);
        }
        return this.h;
    }

    @Override
    public final void b(boolean bl2) {
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean b(aia aia2) {
        return false;
    }

    @Override
    public final boolean c(aia aia2) {
        return false;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n, long l) {
        this.b.a((aia)this.h.getItem(n), (ail)this, 0);
    }
}

