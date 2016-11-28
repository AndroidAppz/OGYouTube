/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 *  android.support.v7.widget.ActivityChooserView
 */
import android.database.DataSetObserver;
import android.support.v7.widget.ActivityChooserView;

public final class ajv
extends DataSetObserver {
    private /* synthetic */ ActivityChooserView a;

    public ajv(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        this.a.a.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        super.onInvalidated();
        this.a.a.notifyDataSetInvalidated();
    }
}

