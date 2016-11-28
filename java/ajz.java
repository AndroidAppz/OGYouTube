/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.graphics.drawable.Drawable
 *  android.support.v7.widget.ActivityChooserView
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  rw
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActivityChooserView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public final class ajz
extends BaseAdapter {
    public ajq a;
    boolean b;
    public final /* synthetic */ ActivityChooserView c;
    private int d;
    private boolean e;
    private boolean f;

    public ajz(ActivityChooserView activityChooserView) {
        this.c = activityChooserView;
        this.d = 4;
    }

    public final int a() {
        int n = this.d;
        this.d = Integer.MAX_VALUE;
        int n2 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n3 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n4 = this.getCount();
        View view = null;
        int n5 = 0;
        for (int i = 0; i < n4; ++i) {
            view = this.getView(i, view, null);
            view.measure(n2, n3);
            n5 = Math.max((int)n5, (int)view.getMeasuredWidth());
        }
        this.d = n;
        return n5;
    }

    public final void a(int n) {
        if (this.d != n) {
            this.d = n;
            this.notifyDataSetChanged();
        }
    }

    public final void a(boolean bl2) {
        if (this.f != bl2) {
            this.f = bl2;
            this.notifyDataSetChanged();
        }
    }

    public final void a(boolean bl2, boolean bl3) {
        if (this.b != bl2 || this.e != bl3) {
            this.b = bl2;
            this.e = bl3;
            this.notifyDataSetChanged();
        }
    }

    public final int getCount() {
        int n = this.a.a();
        if (!this.b && this.a.c() != null) {
            --n;
        }
        int n2 = Math.min((int)n, (int)this.d);
        if (this.f) {
            ++n2;
        }
        return n2;
    }

    public final Object getItem(int n) {
        switch (this.getItemViewType(n)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        if (!this.b && this.a.c() != null) {
            ++n;
        }
        return this.a.a(n);
    }

    public final long getItemId(int n) {
        return n;
    }

    public final int getItemViewType(int n) {
        if (this.f && n == -1 + this.getCount()) {
            return 1;
        }
        return 0;
    }

    public final View getView(int n, View view, ViewGroup viewGroup) {
        switch (this.getItemViewType(n)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 1: {
                if (view == null || view.getId() != 1) {
                    view = LayoutInflater.from((Context)this.c.getContext()).inflate(acx.f, viewGroup, false);
                    view.setId(1);
                    ((TextView)view.findViewById(acv.W)).setText((CharSequence)this.c.getContext().getString(acy.b));
                }
                return view;
            }
            case 0: 
        }
        if (view == null || view.getId() != acv.A) {
            view = LayoutInflater.from((Context)this.c.getContext()).inflate(acx.f, viewGroup, false);
        }
        PackageManager packageManager = this.c.getContext().getPackageManager();
        ImageView imageView = (ImageView)view.findViewById(acv.v);
        ResolveInfo resolveInfo = (ResolveInfo)this.getItem(n);
        imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
        ((TextView)view.findViewById(acv.W)).setText(resolveInfo.loadLabel(packageManager));
        if (this.b && n == 0 && this.e) {
            rw.a((View)view, (boolean)true);
            return view;
        }
        rw.a((View)view, (boolean)false);
        return view;
    }

    public final int getViewTypeCount() {
        return 3;
    }
}

