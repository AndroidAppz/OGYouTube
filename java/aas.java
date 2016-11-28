/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.RemoteException
 *  android.support.v7.app.MediaRouteExpandCollapseButton
 *  android.support.v7.app.MediaRouteVolumeSlider
 *  android.support.v7.app.OverlayListView
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  android.view.accessibility.AccessibilityManager
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.AnimationSet
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Interpolator
 *  android.view.animation.TranslateAnimation
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.RelativeLayout
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.TimeUnit
 *  jh
 *  kk
 *  kn
 *  le
 *  lj
 *  lv
 *  mm
 *  ne
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v7.app.MediaRouteExpandCollapseButton;
import android.support.v7.app.MediaRouteVolumeSlider;
import android.support.v7.app.OverlayListView;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class aas
extends zg {
    static final boolean b = Log.isLoggable((String)"MediaRouteCtrlDialog", (int)3);
    static final int c = (int)TimeUnit.SECONDS.toMillis(30);
    Map A;
    le B;
    abh C;
    ne D;
    kk E;
    abg F;
    Bitmap G;
    Uri H;
    boolean I;
    boolean J;
    boolean K;
    int L;
    int M;
    int N;
    Interpolator O;
    final AccessibilityManager P;
    Runnable Q;
    private final abi R;
    private boolean S;
    private boolean T;
    private int U;
    private Button V;
    private Button W;
    private ImageButton X;
    private ImageButton Y;
    private MediaRouteExpandCollapseButton Z;
    private FrameLayout aa;
    private TextView ab;
    private TextView ac;
    private TextView ad;
    private boolean ae;
    private LinearLayout af;
    private View ag;
    private Interpolator ah;
    private Interpolator ai;
    private Interpolator aj;
    final aef d;
    final aeu e;
    Context f;
    View g;
    FrameLayout h;
    LinearLayout i;
    FrameLayout j;
    ImageView k;
    LinearLayout l;
    RelativeLayout m;
    OverlayListView n;
    abl o;
    List p;
    Set q;
    Set r;
    Set s;
    SeekBar t;
    abj u;
    aeu v;
    int w;
    int x;
    int y;
    final int z;

    public aas(Context context) {
        super(context, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public aas(Context context, int n) {
        super(abq.a(context, n), n);
        this.ae = true;
        this.Q = new aat((aas)this);
        this.f = this.getContext();
        this.C = new abh((aas)this);
        this.d = aef.a(this.f);
        this.R = new abi((aas)this);
        this.e = aef.c();
        aej aej2 = aef.b;
        mm mm2 = aej2.m != null ? aej2.m.a.d() : (aej2.o != null ? aej2.o.d() : null);
        super.a(mm2);
        this.z = this.f.getResources().getDimensionPixelSize(ago.d);
        this.P = (AccessibilityManager)this.f.getSystemService("accessibility");
        if (Build.VERSION.SDK_INT >= 21) {
            this.ah = AnimationUtils.loadInterpolator((Context)context, (int)ags.b);
            this.ai = AnimationUtils.loadInterpolator((Context)context, (int)ags.a);
        }
        this.aj = new AccelerateDecelerateInterpolator();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a(mm mm2) {
        if (this.B != null) {
            this.B.a((lf)this.C);
            this.B = null;
        }
        if (mm2 == null || !this.T) {
            return;
        }
        try {
            this.B = new le(this.f, mm2);
        }
        catch (RemoteException var2_4) {
            Log.e((String)"MediaRouteCtrlDialog", (String)"Error creating media controller in setMediaSession.", (Throwable)var2_4);
        }
        if (this.B != null) {
            le le2 = this.B;
            abh abh2 = this.C;
            if (abh2 == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            Handler handler = new Handler();
            le2.a.a((lf)abh2, handler);
        }
        kn kn2 = this.B == null ? null : this.B.b();
        kk kk2 = kn2 == null ? null : kn2.a();
        this.E = kk2;
        le le3 = this.B;
        ne ne2 = null;
        if (le3 != null) {
            ne2 = this.B.a.b();
        }
        this.D = ne2;
        this.a(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean a(Uri uri, Uri uri2) {
        if (uri != null && uri.equals((Object)uri2) || uri == null && uri2 == null) {
            return true;
        }
        return false;
    }

    static void b(View view, int n) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = n;
        view.setLayoutParams(layoutParams);
    }

    final int a(int n, int n2) {
        if (n >= n2) {
            return (int)(0.5f + (float)this.U * (float)n2 / (float)n);
        }
        return (int)(0.5f + 9.0f * (float)this.U / 16.0f);
    }

    final void a(View view, int n) {
        abc abc2 = new abc(view.getLayoutParams().height, n, view);
        abc2.setDuration((long)this.L);
        if (Build.VERSION.SDK_INT >= 21) {
            abc2.setInterpolator(this.O);
        }
        view.startAnimation((Animation)abc2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void a(boolean var1) {
        var2_2 = true;
        if (!this.e.a() || this.e.b()) {
            this.dismiss();
            return;
        }
        if (this.S == false) return;
        this.ad.setText((CharSequence)this.e.e);
        var3_3 = this.V;
        var4_4 = this.e.k != false ? 0 : 8;
        var3_3.setVisibility(var4_4);
        if (this.F != null) {
            this.F.cancel(var2_2);
        }
        this.F = new abg((aas)this);
        this.F.execute((Object[])new Void[0]);
        if (this.a(this.e)) {
            if (this.af.getVisibility() == 8) {
                this.af.setVisibility(0);
                this.t.setMax(this.e.r);
                this.t.setProgress(this.e.q);
                var20_5 = this.Z;
                var21_6 = this.b() == null ? 8 : 0;
                var20_5.setVisibility(var21_6);
            }
        } else {
            this.af.setVisibility(8);
        }
        if (!this.d()) ** GOTO lbl85
        var6_7 = this.E == null ? null : this.E.a;
        var7_8 = TextUtils.isEmpty((CharSequence)var6_7) == false ? var2_2 : false;
        var8_9 = this.E;
        var9_10 = null;
        if (var8_9 != null) {
            var9_10 = this.E.b;
        }
        var10_11 = TextUtils.isEmpty((CharSequence)var9_10) == false ? var2_2 : false;
        if (this.e.s == -1) ** GOTO lbl37
        this.ab.setText(agu.b);
        var11_12 = false;
        var12_13 = var2_2;
        ** GOTO lbl63
lbl37: // 1 sources:
        if (this.D != null && this.D.a != 0) ** GOTO lbl43
        if (this.e.c()) ** GOTO lbl61
        this.ab.setText(agu.g);
        var12_13 = var2_2;
        var11_12 = false;
        ** GOTO lbl63
lbl43: // 1 sources:
        if (!var7_8 && !var10_11) {
            this.ab.setText(agu.f);
            var12_13 = var2_2;
            var11_12 = false;
        } else {
            if (var7_8) {
                this.ab.setText(var6_7);
                var19_20 = var2_2;
            } else {
                var19_20 = false;
            }
            if (var10_11) {
                this.ac.setText(var9_10);
                var12_13 = var19_20;
                var11_12 = var2_2;
            } else {
                var12_13 = var19_20;
                var11_12 = false;
            }
        }
        ** GOTO lbl63
lbl61: // 1 sources:
        var11_12 = false;
        var12_13 = false;
lbl63: // 6 sources:
        var13_14 = this.ab;
        var14_15 = var12_13 != false ? 0 : 8;
        var13_14.setVisibility(var14_15);
        var15_16 = this.ac;
        var16_17 = var11_12 != false ? 0 : 8;
        var15_16.setVisibility(var16_17);
        if (this.D != null) {
            var17_18 = this.D.a == 6 || this.D.a == 3 ? var2_2 : false;
            var18_19 = (516 & this.D.e) != 0 ? var2_2 : false;
            if ((514 & this.D.e) == 0) {
                var2_2 = false;
            }
            if (var17_18 && var2_2) {
                this.X.setVisibility(0);
                this.X.setImageResource(abq.b(this.f, agn.h));
                this.X.setContentDescription(this.f.getResources().getText(agu.h));
            } else if (!var17_18 && var18_19) {
                this.X.setVisibility(0);
                this.X.setImageResource(abq.b(this.f, agn.i));
                this.X.setContentDescription(this.f.getResources().getText(agu.i));
            } else {
                this.X.setVisibility(8);
            }
        }
lbl85: // 6 sources:
        this.d(var1);
    }

    final boolean a(aeu aeu2) {
        if (this.ae && aeu2.p == 1) {
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final int b(boolean bl2) {
        int n;
        if (!bl2) {
            int n2 = this.af.getVisibility();
            n = 0;
            if (n2 != 0) return n;
        }
        n = 0 + (this.l.getPaddingTop() + this.l.getPaddingBottom());
        if (bl2) {
            n += this.m.getMeasuredHeight();
        }
        if (this.af.getVisibility() == 0) {
            n += this.af.getMeasuredHeight();
        }
        if (!bl2 || this.af.getVisibility() != 0) return n;
        n += this.ag.getMeasuredHeight();
        return n;
    }

    final aet b() {
        if (this.e instanceof aet) {
            return (aet)this.e;
        }
        return null;
    }

    final void c() {
        int n = abo.a(this.f);
        this.getWindow().setLayout(n, -2);
        View view = this.getWindow().getDecorView();
        this.U = n - view.getPaddingLeft() - view.getPaddingRight();
        Resources resources = this.f.getResources();
        this.w = resources.getDimensionPixelSize(ago.b);
        this.x = resources.getDimensionPixelSize(ago.a);
        this.y = resources.getDimensionPixelSize(ago.c);
        this.G = null;
        this.H = null;
        this.a(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    final void c(boolean bl2) {
        int n = 8;
        View view = this.ag;
        int n2 = this.af.getVisibility() == 0 && bl2 ? 0 : n;
        view.setVisibility(n2);
        LinearLayout linearLayout = this.l;
        if (this.af.getVisibility() != n || bl2) {
            n = 0;
        }
        linearLayout.setVisibility(n);
    }

    final void d(boolean bl2) {
        this.j.requestLayout();
        this.j.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new abb((aas)this, bl2));
    }

    final boolean d() {
        if (this.E != null || this.D != null) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void e() {
        if (Build.VERSION.SDK_INT < 21) {
            this.O = this.aj;
            return;
        }
        Interpolator interpolator = this.I ? this.ah : this.ai;
        this.O = interpolator;
    }

    final void e(boolean bl2) {
        this.q = null;
        this.r = null;
        this.J = false;
        if (this.K) {
            this.K = false;
            this.d(bl2);
        }
        this.n.setEnabled(true);
    }

    final void f(boolean bl2) {
        int n = this.n.getFirstVisiblePosition();
        for (int i = 0; i < this.n.getChildCount(); ++i) {
            View view = this.n.getChildAt(i);
            int n2 = n + i;
            aeu aeu2 = (aeu)this.o.getItem(n2);
            if (bl2 && this.q != null && this.q.contains((Object)aeu2)) continue;
            ((LinearLayout)view.findViewById(agq.x)).setVisibility(0);
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
            alphaAnimation.setDuration(0);
            animationSet.addAnimation((Animation)alphaAnimation);
            new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            view.clearAnimation();
            view.startAnimation((Animation)animationSet);
        }
        this.n.a();
        if (!bl2) {
            this.e(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        this.d.a(aed.c, this.R, 2);
        aej aej2 = aef.b;
        mm mm2 = aej2.m != null ? aej2.m.a.d() : (aej2.o != null ? aej2.o.d() : null);
        this.a(mm2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onCreate(Bundle bundle) {
        int n;
        super.onCreate(bundle);
        this.getWindow().setBackgroundDrawableResource(17170445);
        this.setContentView(agt.c);
        this.findViewById(16908315).setVisibility(8);
        abf abf2 = new abf((aas)this);
        this.h = (FrameLayout)this.findViewById(agq.o);
        this.h.setOnClickListener((View.OnClickListener)new aax((aas)this));
        this.i = (LinearLayout)this.findViewById(agq.n);
        this.i.setOnClickListener((View.OnClickListener)new aay());
        Context context = this.f;
        int n2 = abq.a(context, 0, agn.b);
        int n3 = jh.b((int)n2, (int)abq.a(context, 0, 16842801)) < 3.0 ? abq.a(context, 0, agn.a) : n2;
        this.V = (Button)this.findViewById(16908314);
        this.V.setText(agu.d);
        this.V.setTextColor(n3);
        this.V.setOnClickListener((View.OnClickListener)abf2);
        this.W = (Button)this.findViewById(16908313);
        this.W.setText(agu.j);
        this.W.setTextColor(n3);
        this.W.setOnClickListener((View.OnClickListener)abf2);
        this.ad = (TextView)this.findViewById(agq.r);
        this.Y = (ImageButton)this.findViewById(agq.f);
        this.Y.setOnClickListener((View.OnClickListener)abf2);
        this.aa = (FrameLayout)this.findViewById(agq.l);
        this.j = (FrameLayout)this.findViewById(agq.m);
        aaz aaz2 = new aaz((aas)this);
        this.k = (ImageView)this.findViewById(agq.a);
        this.k.setOnClickListener((View.OnClickListener)aaz2);
        this.findViewById(agq.k).setOnClickListener((View.OnClickListener)aaz2);
        this.l = (LinearLayout)this.findViewById(agq.q);
        this.ag = this.findViewById(agq.g);
        this.m = (RelativeLayout)this.findViewById(agq.s);
        this.ab = (TextView)this.findViewById(agq.j);
        this.ac = (TextView)this.findViewById(agq.i);
        this.X = (ImageButton)this.findViewById(agq.h);
        this.X.setOnClickListener((View.OnClickListener)abf2);
        this.af = (LinearLayout)this.findViewById(agq.t);
        this.af.setVisibility(8);
        this.t = (SeekBar)this.findViewById(agq.w);
        this.t.setTag((Object)this.e);
        this.u = new abj((aas)this);
        this.t.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this.u);
        this.n = (OverlayListView)this.findViewById(agq.u);
        this.p = new ArrayList();
        this.o = new abl((aas)this, this.f, this.p);
        this.n.setAdapter((ListAdapter)this.o);
        this.s = new HashSet();
        Context context2 = this.f;
        LinearLayout linearLayout = this.l;
        OverlayListView overlayListView = this.n;
        boolean bl2 = this.b() != null;
        int n4 = abq.a(context2, 0, agn.b);
        int n5 = abq.a(context2, 0, agn.c);
        if (bl2 && abq.c(context2, 0) == -570425344) {
            int n6 = n4;
            n4 = -1;
            n = n6;
        } else {
            n = n5;
        }
        linearLayout.setBackgroundColor(n4);
        overlayListView.setBackgroundColor(n);
        linearLayout.setTag((Object)n4);
        overlayListView.setTag((Object)n);
        abq.a(this.f, (MediaRouteVolumeSlider)this.t, (View)this.l);
        this.A = new HashMap();
        this.A.put((Object)this.e, (Object)this.t);
        this.Z = (MediaRouteExpandCollapseButton)this.findViewById(agq.p);
        this.Z.setOnClickListener((View.OnClickListener)new aba((aas)this));
        this.e();
        this.L = this.f.getResources().getInteger(agr.a);
        this.M = this.f.getResources().getInteger(agr.b);
        this.N = this.f.getResources().getInteger(agr.c);
        this.g = null;
        this.S = true;
        this.c();
    }

    public void onDetachedFromWindow() {
        this.d.a(this.R);
        this.a((mm)null);
        this.T = false;
        super.onDetachedFromWindow();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean onKeyDown(int n, KeyEvent keyEvent) {
        if (n != 25 && n != 24) {
            return super.onKeyDown(n, keyEvent);
        }
        aeu aeu2 = this.e;
        int n2 = n == 25 ? -1 : 1;
        aeu2.b(n2);
        return true;
    }

    @Override
    public boolean onKeyUp(int n, KeyEvent keyEvent) {
        if (n == 25 || n == 24) {
            return true;
        }
        return super.onKeyUp(n, keyEvent);
    }
}

