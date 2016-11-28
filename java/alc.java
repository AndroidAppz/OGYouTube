/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.database.DataSetObserver
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ListAdapter
 *  android.widget.SpinnerAdapter
 *  android.widget.ThemedSpinnerAdapter
 *  java.lang.Object
 */
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

final class alc
implements ListAdapter,
SpinnerAdapter {
    private SpinnerAdapter a;
    private ListAdapter b;

    public alc(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        ThemedSpinnerAdapter themedSpinnerAdapter;
        this.a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.b = (ListAdapter)spinnerAdapter;
        }
        if (theme != null && ala.a && spinnerAdapter instanceof ThemedSpinnerAdapter && (themedSpinnerAdapter = (ThemedSpinnerAdapter)spinnerAdapter).getDropDownViewTheme() != theme) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final int getCount() {
        if (this.a == null) {
            return 0;
        }
        return this.a.getCount();
    }

    public final View getDropDownView(int n, View view, ViewGroup viewGroup) {
        if (this.a == null) {
            return null;
        }
        return this.a.getDropDownView(n, view, viewGroup);
    }

    public final Object getItem(int n) {
        if (this.a == null) {
            return null;
        }
        return this.a.getItem(n);
    }

    public final long getItemId(int n) {
        if (this.a == null) {
            return -1;
        }
        return this.a.getItemId(n);
    }

    public final int getItemViewType(int n) {
        return 0;
    }

    public final View getView(int n, View view, ViewGroup viewGroup) {
        return this.getDropDownView(n, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        if (this.a != null && this.a.hasStableIds()) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (this.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled(int n) {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(n);
        }
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.a != null) {
            this.a.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.a != null) {
            this.a.unregisterDataSetObserver(dataSetObserver);
        }
    }
}

