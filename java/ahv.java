/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  java.lang.Object
 *  java.util.ArrayList
 */
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class ahv
extends BaseAdapter {
    private int a;
    private /* synthetic */ ahu b;

    public ahv(ahu ahu2) {
        this.b = ahu2;
        this.a = -1;
        super.a();
    }

    private final void a() {
        aia aia2 = this.b.b.i;
        if (aia2 != null) {
            ArrayList arrayList = this.b.b.j();
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                if ((aia)arrayList.get(i) != aia2) continue;
                this.a = i;
                return;
            }
        }
        this.a = -1;
    }

    public final int getCount() {
        int n = this.b.b.j().size();
        if (this.a < 0) {
            return n;
        }
        return n - 1;
    }

    public final /* synthetic */ Object getItem(int n) {
        ArrayList arrayList = this.b.b.j();
        if (this.a >= 0 && n >= this.a) {
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
        View view2 = view == null ? this.b.a.inflate(this.b.c, viewGroup, false) : view;
        ((aio)view2).a((aia)this.getItem(n));
        return view2;
    }

    public final void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

