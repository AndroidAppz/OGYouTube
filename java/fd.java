/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.Window
 *  fp
 *  fq
 *  fr
 *  gf
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  net.ogmods.youtube.OG
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import net.ogmods.youtube.OG;

public class fd
extends fe
implements DialogInterface.OnCancelListener,
DialogInterface.OnDismissListener {
    private int W = 0;
    private int X = 0;
    private boolean Y = true;
    private int Z = -1;
    public boolean a = true;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    public Dialog b;

    @Override
    public void N_() {
        super.N_();
        if (this.b != null) {
            this.aa = true;
            this.b.dismiss();
            this.b = null;
        }
    }

    public final int a(gf gf2, String string) {
        this.ab = false;
        this.ac = true;
        gf2.a((fe)this, string);
        this.aa = false;
        this.Z = gf2.b();
        return this.Z;
    }

    public final void a(int n, int n2) {
        this.W = n;
        if (this.W == 2 || this.W == 3) {
            this.X = 16973913;
        }
        if (n2 != 0) {
            this.X = n2;
        }
    }

    @Override
    public void a(Activity activity) {
        super.a(activity);
        if (!this.ac) {
            this.ab = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Bundle bundle) {
        super.a(bundle);
        boolean bl2 = this.z == 0;
        this.a = bl2;
        if (bundle != null) {
            this.W = bundle.getInt("android:style", 0);
            this.X = bundle.getInt("android:theme", 0);
            this.Y = bundle.getBoolean("android:cancelable", true);
            this.a = bundle.getBoolean("android:showsDialog", this.a);
            this.Z = bundle.getInt("android:backStackId", -1);
        }
    }

    public void a(fq fq2, String string) {
        this.ab = false;
        this.ac = true;
        gf gf2 = fq2.a();
        gf2.a((fe)this, string);
        gf2.b();
    }

    public final void a(boolean bl2) {
        if (this.ab) {
            return;
        }
        this.ab = true;
        this.ac = false;
        if (this.b != null) {
            this.b.dismiss();
            this.b = null;
        }
        this.aa = true;
        if (this.Z >= 0) {
            this.u.b(this.Z);
            this.Z = -1;
            return;
        }
        gf gf2 = this.u.a();
        gf2.a((fe)this);
        if (bl2) {
            gf2.c();
            return;
        }
        gf2.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final LayoutInflater b(Bundle bundle) {
        if (!this.a) {
            return super.b(bundle);
        }
        this.b = this.c(bundle);
        if (this.b == null) return (LayoutInflater)this.v.b.getSystemService("layout_inflater");
        Dialog dialog = this.b;
        switch (this.W) {
            default: {
                do {
                    return (LayoutInflater)this.b.getContext().getSystemService("layout_inflater");
                    break;
                } while (true);
            }
            case 3: {
                dialog.getWindow().addFlags(24);
            }
            case 1: 
            case 2: 
        }
        dialog.requestWindowFeature(1);
        return (LayoutInflater)this.b.getContext().getSystemService("layout_inflater");
    }

    public Dialog c(Bundle bundle) {
        return new Dialog((Context)this.f(), this.X);
    }

    public final void c_(boolean bl2) {
        this.Y = bl2;
        if (this.b != null) {
            this.b.setCancelable(bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void d(Bundle bundle) {
        super.d(bundle);
        if (!this.a) {
            return;
        }
        View view = this.p();
        if (view != null) {
            if (view.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            this.b.setContentView(view);
        }
        this.b.setOwnerActivity((Activity)this.f());
        this.b.setCancelable(this.Y);
        this.b.setOnCancelListener((DialogInterface.OnCancelListener)this);
        this.b.setOnDismissListener((DialogInterface.OnDismissListener)this);
        if (bundle == null) return;
        Bundle bundle2 = bundle.getBundle("android:savedDialogState");
        if (bundle2 == null) return;
        this.b.onRestoreInstanceState(bundle2);
    }

    public void dismiss() {
        this.a(false);
    }

    @Override
    public void e(Bundle bundle) {
        Bundle bundle2;
        super.e(bundle);
        if (this.b != null && (bundle2 = this.b.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundle2);
        }
        if (this.W != 0) {
            bundle.putInt("android:style", this.W);
        }
        if (this.X != 0) {
            bundle.putInt("android:theme", this.X);
        }
        if (!this.Y) {
            bundle.putBoolean("android:cancelable", this.Y);
        }
        if (!this.a) {
            bundle.putBoolean("android:showsDialog", this.a);
        }
        if (this.Z != -1) {
            bundle.putInt("android:backStackId", this.Z);
        }
    }

    @Override
    public void f_() {
        super.f_();
        if (!this.ac && !this.ab) {
            this.ab = true;
        }
    }

    @Override
    public void g_() {
        super.g_();
        if (this.b != null) {
            this.aa = false;
            OG.ShowDialog((Dialog)this.b);
        }
    }

    @Override
    public void h_() {
        super.h_();
        if (this.b != null) {
            this.b.hide();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.aa) {
            this.a(true);
        }
    }
}

