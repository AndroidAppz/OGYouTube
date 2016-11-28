/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  ff
 *  fg
 *  fh
 *  fn
 *  fp
 *  fq
 *  fr
 *  gn
 *  gp
 *  im
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  ou
 *  pj
 *  qk
 *  qt
 */
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class fe
implements ComponentCallbacks,
View.OnCreateContextMenuListener {
    private static final pj a = new pj();
    static final Object c = new Object();
    public String A;
    public boolean B;
    boolean C;
    public boolean D;
    boolean E;
    public boolean F;
    boolean G = true;
    boolean H;
    int I;
    ViewGroup J;
    View K;
    View L;
    boolean M;
    boolean N = true;
    gp O;
    boolean P;
    boolean Q;
    Object R = c;
    Object S = c;
    Object T = c;
    im U = null;
    im V = null;
    SparseArray a_;
    int d = 0;
    View e;
    int f;
    Bundle g;
    int i = -1;
    String j;
    public Bundle k;
    public fe l;
    int m = -1;
    public int n;
    boolean o;
    public boolean p;
    boolean q;
    boolean r;
    boolean s;
    int t;
    public fr u;
    public fp v;
    fr w;
    public fe x;
    int y;
    int z;

    public static fe a(Context context, String string) {
        return fe.a(context, string, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static fe a(Context context, String string, Bundle bundle) {
        try {
            Class class_ = (Class)a.get((Object)string);
            if (class_ == null) {
                class_ = context.getClassLoader().loadClass(string);
                a.put((Object)string, (Object)class_);
            }
            fe fe2 = (fe)class_.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fe2.getClass().getClassLoader());
                fe2.k = bundle;
            }
            return fe2;
        }
        catch (ClassNotFoundException var5_5) {
            throw new fg("Unable to instantiate fragment " + string + ": make sure class name exists, is public, and has an empty constructor that is public", (Exception)var5_5);
        }
        catch (InstantiationException var4_6) {
            throw new fg("Unable to instantiate fragment " + string + ": make sure class name exists, is public, and has an empty constructor that is public", (Exception)var4_6);
        }
        catch (IllegalAccessException var3_7) {
            throw new fg("Unable to instantiate fragment " + string + ": make sure class name exists, is public, and has an empty constructor that is public", (Exception)var3_7);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean b(Context context, String string) {
        Class class_;
        try {
            class_ = (Class)a.get((Object)string);
            if (class_ != null) return fe.class.isAssignableFrom(class_);
        }
        catch (ClassNotFoundException var2_4) {
            return false;
        }
        class_ = context.getClassLoader().loadClass(string);
        a.put((Object)string, (Object)class_);
        return fe.class.isAssignableFrom(class_);
    }

    public static Animation o() {
        return null;
    }

    public static void t() {
    }

    public void N_() {
        this.H = true;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public final String a(int n) {
        return this.g().getString(n);
    }

    public final /* varargs */ String a(int n, Object ... arrobject) {
        return this.g().getString(n, arrobject);
    }

    public void a(int n, int n2, Intent intent) {
    }

    final void a(int n, fe fe2) {
        this.i = n;
        if (fe2 != null) {
            this.j = fe2.j + ":" + this.i;
            return;
        }
        this.j = "android:fragment:" + this.i;
    }

    public void a(int n, int[] arrn) {
    }

    @Deprecated
    public void a(Activity activity) {
        this.H = true;
    }

    public final void a(Intent intent, int n) {
        if (this.v == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.v.a((fe)this, intent, n, null);
    }

    public void a(Bundle bundle) {
        this.H = true;
    }

    public void a(View view, Bundle bundle) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(fh fh2) {
        if (this.i >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        Bundle bundle = fh2 != null && fh2.a != null ? fh2.a : null;
        this.g = bundle;
    }

    public void a(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        printWriter.print(string);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString((int)this.y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString((int)this.z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(string);
        printWriter.print("mState=");
        printWriter.print(this.d);
        printWriter.print(" mIndex=");
        printWriter.print(this.i);
        printWriter.print(" mWho=");
        printWriter.print(this.j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.t);
        printWriter.print(string);
        printWriter.print("mAdded=");
        printWriter.print(this.o);
        printWriter.print(" mRemoving=");
        printWriter.print(this.p);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.q);
        printWriter.print(" mInLayout=");
        printWriter.println(this.r);
        printWriter.print(string);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.F);
        printWriter.print(string);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.u != null) {
            printWriter.print(string);
            printWriter.print("mFragmentManager=");
            printWriter.println((Object)this.u);
        }
        if (this.v != null) {
            printWriter.print(string);
            printWriter.print("mHost=");
            printWriter.println((Object)this.v);
        }
        if (this.x != null) {
            printWriter.print(string);
            printWriter.print("mParentFragment=");
            printWriter.println((Object)this.x);
        }
        if (this.k != null) {
            printWriter.print(string);
            printWriter.print("mArguments=");
            printWriter.println((Object)this.k);
        }
        if (this.g != null) {
            printWriter.print(string);
            printWriter.print("mSavedFragmentState=");
            printWriter.println((Object)this.g);
        }
        if (this.a_ != null) {
            printWriter.print(string);
            printWriter.print("mSavedViewState=");
            printWriter.println((Object)this.a_);
        }
        if (this.l != null) {
            printWriter.print(string);
            printWriter.print("mTarget=");
            printWriter.print((Object)this.l);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.n);
        }
        if (this.I != 0) {
            printWriter.print(string);
            printWriter.print("mNextAnim=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(string);
            printWriter.print("mContainer=");
            printWriter.println((Object)this.J);
        }
        if (this.K != null) {
            printWriter.print(string);
            printWriter.print("mView=");
            printWriter.println((Object)this.K);
        }
        if (this.L != null) {
            printWriter.print(string);
            printWriter.print("mInnerView=");
            printWriter.println((Object)this.K);
        }
        if (this.e != null) {
            printWriter.print(string);
            printWriter.print("mAnimatingAway=");
            printWriter.println((Object)this.e);
            printWriter.print(string);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.f);
        }
        if (this.O != null) {
            printWriter.print(string);
            printWriter.println("Loader Manager:");
            this.O.a(string + "  ", fileDescriptor, printWriter, arrstring);
        }
        if (this.w != null) {
            printWriter.print(string);
            printWriter.println("Child " + (Object)this.w + ":");
            this.w.a(string + "  ", fileDescriptor, printWriter, arrstring);
        }
    }

    public final void a(String[] arrstring, int n) {
        if (this.v == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.v.a((fe)this, arrstring, n);
    }

    public LayoutInflater b(Bundle bundle) {
        LayoutInflater layoutInflater = this.v.c();
        this.h();
        qk.a((LayoutInflater)layoutInflater, (qt)this.w);
        return layoutInflater;
    }

    final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.w != null) {
            this.w.noteStateNotSaved();
        }
        return this.a(layoutInflater, viewGroup, bundle);
    }

    public void c(boolean bl2) {
    }

    public void d(Bundle bundle) {
        this.H = true;
    }

    public final void d(boolean bl2) {
        if (this.G != bl2) {
            this.G = bl2;
            if (this.F && this.i() && !this.B) {
                this.v.d();
            }
        }
    }

    public final Context e() {
        if (this.v == null) {
            return null;
        }
        return this.v.b;
    }

    public void e(Bundle bundle) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e(boolean bl2) {
        if (!this.N && bl2 && this.d < 4) {
            this.u.b((fe)this);
        }
        this.N = bl2;
        boolean bl3 = !bl2;
        this.M = bl3;
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    public final fj f() {
        if (this.v == null) {
            return null;
        }
        return (fj)this.v.a;
    }

    public final void f(Bundle bundle) {
        if (this.i >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.k = bundle;
    }

    public void f_() {
        this.H = true;
    }

    public final Resources g() {
        if (this.v == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.v.b.getResources();
    }

    final void g(Bundle bundle) {
        Parcelable parcelable;
        this.e(bundle);
        if (this.w != null && (parcelable = this.w.i()) != null) {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    public void g_() {
        this.H = true;
        if (!this.P) {
            this.P = true;
            if (!this.Q) {
                this.Q = true;
                this.O = this.v.a(this.j, this.P, false);
            }
            if (this.O != null) {
                this.O.b();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final fq h() {
        if (this.w != null) return this.w;
        this.u();
        if (this.d >= 5) {
            this.w.m();
            return this.w;
        }
        if (this.d >= 4) {
            this.w.l();
            return this.w;
        }
        if (this.d >= 2) {
            this.w.k();
            return this.w;
        }
        if (this.d <= 0) return this.w;
        this.w.j();
        return this.w;
    }

    public void h_() {
        this.H = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean i() {
        if (this.v != null && this.o) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.d >= 5) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.i() && !this.B && this.K != null && this.K.getWindowToken() != null && this.K.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void l() {
        if (this.x != null) {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        }
        this.D = true;
    }

    public final gn m() {
        if (this.O != null) {
            return this.O;
        }
        if (this.v == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.Q = true;
        this.O = this.v.a(this.j, this.P, true);
        return this.O;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n() {
        this.H = true;
        if (this.v == null) {
            return;
        }
        Activity activity = this.v.a;
        if (activity != null) {
            this.H = false;
            this.H = true;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.H = true;
    }

    public View p() {
        return this.K;
    }

    public void q() {
        this.H = true;
    }

    public void r() {
        this.H = true;
    }

    public void s() {
        this.H = true;
        if (!this.Q) {
            this.Q = true;
            this.O = this.v.a(this.j, this.P, false);
        }
        if (this.O != null) {
            this.O.g();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        ou.a((Object)this, (StringBuilder)stringBuilder);
        if (this.i >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.i);
        }
        if (this.y != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString((int)this.y));
        }
        if (this.A != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.A);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    final void u() {
        this.w = new fr();
        this.w.a(this.v, (fn)new ff(this), this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void v() {
        if (this.w != null) {
            this.w.c(2);
        }
        this.d = 2;
        if (!this.P) return;
        this.P = false;
        if (!this.Q) {
            this.Q = true;
            this.O = this.v.a(this.j, this.P, false);
        }
        if (this.O == null) return;
        if (this.v.f) {
            this.O.d();
            return;
        }
        this.O.c();
    }
}

