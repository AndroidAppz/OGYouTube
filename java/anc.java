/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  java.lang.Object
 */
import android.view.View;
import android.widget.AdapterView;

final class anc
implements AdapterView.OnItemSelectedListener {
    private /* synthetic */ ana a;

    anc(ana ana2) {
        this.a = ana2;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int n, long l) {
        and and2;
        if (n != -1 && (and2 = this.a.f) != null) {
            and2.a = false;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}

