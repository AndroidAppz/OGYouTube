/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.view.menu.ListMenuItemView
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  java.lang.Object
 *  java.util.ArrayList
 */
import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class aik
extends BaseAdapter {
    ahw a;
    private int b;
    private /* synthetic */ aij c;

    public aik(aij aij2, ahw ahw2) {
        this.c = aij2;
        this.b = -1;
        this.a = ahw2;
        super.a();
    }

    private final void a() {
        aia aia2 = this.c.c.i;
        if (aia2 != null) {
            ArrayList arrayList = this.c.c.j();
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                if ((aia)arrayList.get(i) != aia2) continue;
                this.b = i;
                return;
            }
        }
        this.b = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int getCount() {
        ArrayList arrayList = this.c.d ? this.a.j() : this.a.h();
        if (this.b < 0) {
            return arrayList.size();
        }
        return -1 + arrayList.size();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ Object getItem(int n) {
        ArrayList arrayList = this.c.d ? this.a.j() : this.a.h();
        if (this.b >= 0 && n >= this.b) {
            ++n;
        }
        return (aia)arrayList.get(n);
    }

    public final long getItemId(int n) {
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final View getView(int n, View view, ViewGroup viewGroup) {
        View view2 = view == null ? this.c.b.inflate(aij.a, viewGroup, false) : view;
        aio aio2 = (aio)view2;
        if (this.c.h) {
            ListMenuItemView listMenuItemView = (ListMenuItemView)view2;
            listMenuItemView.b = true;
            listMenuItemView.a = true;
        }
        aio2.a((aia)this.getItem(n));
        return view2;
    }

    public final void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

