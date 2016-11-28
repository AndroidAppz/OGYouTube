/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  java.lang.String
 */
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

public class aar
extends fd {
    public aed W;
    private aal X;

    public aar() {
        this.c_(true);
    }

    public aal a(Context context) {
        return new aal(context);
    }

    @Override
    public final Dialog c(Bundle bundle) {
        aal aal2 = this.X = this.a((Context)this.f());
        this.w();
        aal2.a(this.W);
        return this.X;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.X != null) {
            this.X.a();
        }
    }

    public final void w() {
        if (this.W == null) {
            Bundle bundle = this.k;
            if (bundle != null) {
                this.W = aed.a(bundle.getBundle("selector"));
            }
            if (this.W == null) {
                this.W = aed.c;
            }
        }
    }
}

