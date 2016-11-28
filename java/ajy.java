/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.database.DataSetObserver
 *  android.graphics.drawable.Drawable
 *  android.support.v7.widget.ActivityChooserView
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActivityChooserView;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class ajy
extends DataSetObserver {
    private /* synthetic */ ActivityChooserView a;

    public ajy(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged() {
        super.onChanged();
        ActivityChooserView activityChooserView = this.a;
        if (activityChooserView.a.getCount() > 0) {
            activityChooserView.d.setEnabled(true);
        } else {
            activityChooserView.d.setEnabled(false);
        }
        int n = activityChooserView.a.a.a();
        int n2 = activityChooserView.a.a.d();
        if (n == 1 || n > 1 && n2 > 0) {
            activityChooserView.f.setVisibility(0);
            ResolveInfo resolveInfo = activityChooserView.a.a.c();
            PackageManager packageManager = activityChooserView.getContext().getPackageManager();
            activityChooserView.g.setImageDrawable(resolveInfo.loadIcon(packageManager));
            if (activityChooserView.l != 0) {
                CharSequence charSequence = resolveInfo.loadLabel(packageManager);
                String string = activityChooserView.getContext().getString(activityChooserView.l, new Object[]{charSequence});
                activityChooserView.f.setContentDescription((CharSequence)string);
            }
        } else {
            activityChooserView.f.setVisibility(8);
        }
        if (activityChooserView.f.getVisibility() == 0) {
            activityChooserView.b.setBackgroundDrawable(activityChooserView.c);
            return;
        }
        activityChooserView.b.setBackgroundDrawable(null);
    }
}

