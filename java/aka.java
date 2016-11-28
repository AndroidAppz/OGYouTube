/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ResolveInfo
 *  android.os.AsyncTask
 *  android.support.v7.widget.ActivityChooserView
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.widget.Adapter
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  nr
 */
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class aka
implements View.OnClickListener,
View.OnLongClickListener,
AdapterView.OnItemClickListener,
PopupWindow.OnDismissListener {
    private /* synthetic */ ActivityChooserView a;

    public aka(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final void onClick(View view) {
        if (view == this.a.f) {
            this.a.b();
            ResolveInfo resolveInfo = this.a.a.a.c();
            this.a.a.a.a(resolveInfo);
            this.a.a.a.b();
            return;
        }
        if (view == this.a.d) {
            this.a.j = false;
            this.a.a(this.a.k);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void onDismiss() {
        if (this.a.h != null) {
            this.a.h.a(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onItemClick(AdapterView adapterView, View view, int n, long l) {
        Object object;
        switch (((ajz)adapterView.getAdapter()).getItemViewType(n)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 1: {
                this.a.a(Integer.MAX_VALUE);
                return;
            }
            case 0: 
        }
        this.a.b();
        if (!this.a.j) {
            this.a.a.a.b();
            return;
        }
        if (n <= 0) return;
        ajq ajq2 = this.a.a.a;
        Object object2 = object = ajq2.b;
        // MONITORENTER : object2
        ajq2.e();
        ajq2.c.get(n);
        float f = (ajr)ajq2.c.get(0) != null ? 5.0f : 1.0f;
        ajt ajt2 = new ajt(new ComponentName(null.activityInfo.packageName, null.activityInfo.name), System.currentTimeMillis(), f);
        if (ajq2.d.add((Object)ajt2)) {
            ajq2.i = true;
            ajq2.f();
            if (!ajq2.h) {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (ajq2.i) {
                ajq2.i = false;
                if (!TextUtils.isEmpty((CharSequence)ajq2.f)) {
                    aju aju2 = new aju(ajq2);
                    Object[] arrobject = new Object[]{new ArrayList((Collection)ajq2.d), ajq2.f};
                    nr.a((AsyncTask)aju2, (Object[])arrobject);
                }
            }
            ajq2.notifyChanged();
        }
        // MONITOREXIT : object2
    }

    public final boolean onLongClick(View view) {
        if (view == this.a.f) {
            if (this.a.a.getCount() > 0) {
                this.a.j = true;
                this.a.a(this.a.k);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }
}

