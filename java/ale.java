/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  java.lang.Object
 */
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

final class ale
implements AdapterView.OnItemClickListener {
    private /* synthetic */ ald a;

    ale(ald ald2) {
        this.a = ald2;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n, long l) {
        this.a.d.setSelection(n);
        if (this.a.d.getOnItemClickListener() != null) {
            this.a.d.performItemClick(view, n, this.a.b.getItemId(n));
        }
        this.a.d();
    }
}

