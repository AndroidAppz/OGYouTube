/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.os.Bundle
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  java.lang.CharSequence
 *  java.lang.String
 *  zk
 */
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class aag
extends Dialog
implements zj {
    private zk a;

    public aag(Context context, int n) {
        if (n == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(acq.v, typedValue, true);
            n = typedValue.resourceId;
        }
        super(context, n);
        this.a().a(null);
        this.a().i();
    }

    public final zk a() {
        if (this.a == null) {
            this.a = zk.a((Context)this.getContext(), (Window)this.getWindow(), (zj)this);
        }
        return this.a;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.a().b(view, layoutParams);
    }

    public View findViewById(int n) {
        return this.a().a(n);
    }

    public void invalidateOptionsMenu() {
        this.a().f();
    }

    public void onCreate(Bundle bundle) {
        this.a().h();
        super.onCreate(bundle);
        this.a().a(bundle);
    }

    protected void onStop() {
        super.onStop();
        this.a().d();
    }

    public void setContentView(int n) {
        this.a().b(n);
    }

    public void setContentView(View view) {
        this.a().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.a().a(view, layoutParams);
    }

    public void setTitle(int n) {
        super.setTitle(n);
        this.a().a((CharSequence)this.getContext().getString(n));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a().a(charSequence);
    }
}

