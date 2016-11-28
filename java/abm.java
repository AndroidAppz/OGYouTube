/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 */
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

public class abm
extends fd {
    private aas W;

    public abm() {
        this.c_(true);
    }

    public aas a(Context context) {
        return new aas(context);
    }

    @Override
    public final Dialog c(Bundle bundle) {
        this.W = this.a((Context)this.f());
        return this.W;
    }

    @Override
    public final void h_() {
        super.h_();
        if (this.W != null) {
            this.W.f(false);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.W != null) {
            this.W.c();
        }
    }
}

