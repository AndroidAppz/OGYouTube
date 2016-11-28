/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.media.VolumeProvider
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Message
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  ke
 *  ku
 *  lv
 *  lz
 *  pe
 */
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.media.VolumeProvider;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class aej
implements afu,
agl {
    final Context a;
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    final Map d = new HashMap();
    final ArrayList e = new ArrayList();
    final afz f = new afz();
    final ael g;
    final agb h;
    afr i;
    aeu j;
    adz k;
    Map l;
    public aem m;
    lv n;
    public lv o;
    mh p;
    private final ArrayList q = new ArrayList();
    private final aeq r;
    private final boolean s;
    private aeu t;
    private adu u;

    /*
     * Enabled aggressive block sorting
     */
    aej(Context context) {
        void var5_5;
        this.r = new aeq((aej)this);
        this.g = new ael((aej)this);
        this.p = new aek((aej)this);
        this.a = context;
        ke.a((Context)context);
        ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
        boolean bl2 = Build.VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : false;
        this.s = bl2;
        if (Build.VERSION.SDK_INT >= 18) {
            agh agh2 = new agh(context, (agl)this);
        } else if (Build.VERSION.SDK_INT >= 17) {
            agg agg2 = new agg(context, (agl)this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            agc agc2 = new agc(context, (agl)this);
        } else {
            agi agi2 = new agi(context);
        }
        this.h = var5_5;
        this.a(this.h);
    }

    private final int a(aeu aeu2, ads ads2) {
        int n = aeu2.a(ads2);
        if (n != 0) {
            if ((n & 1) != 0) {
                if (aef.a) {
                    new StringBuilder("Route changed: ").append((Object)aeu2);
                }
                this.g.a(259, aeu2);
            }
            if ((n & 2) != 0) {
                if (aef.a) {
                    new StringBuilder("Route volume changed: ").append((Object)aeu2);
                }
                this.g.a(260, aeu2);
            }
            if ((n & 4) != 0) {
                if (aef.a) {
                    new StringBuilder("Route presentation display changed: ").append((Object)aeu2);
                }
                this.g.a(261, aeu2);
            }
        }
        return n;
    }

    private final String a(aes aes2, String string) {
        String string2 = aes2.c.a.flattenToShortString();
        String string3 = string2 + ":" + string;
        if (super.c(string3) < 0) {
            this.d.put((Object)new pe((Object)string2, (Object)string), (Object)string3);
            return string3;
        }
        Log.w((String)"MediaRouter", (String)("Either " + string + " isn't unique in " + string2 + " or we're trying to assign a unique ID for an already added route"));
        int n = 2;
        do {
            String string4;
            Locale locale;
            Object[] arrobject;
            if (super.c(string4 = String.format((Locale)(locale = Locale.US), (String)"%s_%d", (Object[])(arrobject = new Object[]{string3, n}))) < 0) {
                this.d.put((Object)new pe((Object)string2, (Object)string), (Object)string4);
                return string4;
            }
            ++n;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(boolean bl2) {
        if (this.t != null && !aej.a(this.t)) {
            new StringBuilder("Clearing the default route because it is no longer selectable: ").append((Object)this.t);
            this.t = null;
        }
        if (this.t == null && !this.c.isEmpty()) {
            for (aeu aeu2 : this.c) {
                aes aes2 = aeu2.b;
                aef.d();
                boolean bl3 = aes2.a == this.h && aeu2.c.equals((Object)"DEFAULT_ROUTE");
                if (!bl3 || !aej.a(aeu2)) continue;
                this.t = aeu2;
                new StringBuilder("Found default route: ").append((Object)this.t);
                break;
            }
        }
        if (this.j != null && !aej.a(this.j)) {
            new StringBuilder("Unselecting the current route because it is no longer selectable: ").append((Object)this.j);
            super.b(null, 0);
        }
        if (this.j == null) {
            super.b(this.d(), 0);
            return;
        } else {
            if (!bl2) return;
            {
                this.e();
                return;
            }
        }
    }

    private static boolean a(aeu aeu2) {
        if (aeu2.u != null && aeu2.h) {
            return true;
        }
        return false;
    }

    private final void b(aeu aeu2, int n) {
        if (this.j != aeu2) {
            if (this.j != null) {
                if (aef.a) {
                    new StringBuilder("Route unselected: ").append((Object)this.j).append(" reason: ").append(n);
                }
                Message message = this.g.obtainMessage(263, (Object)this.j);
                message.arg1 = n;
                message.sendToTarget();
                if (this.k != null) {
                    this.k.a(n);
                    this.k.a();
                    this.k = null;
                }
                if (this.l != null) {
                    for (adz adz2 : this.l.values()) {
                        adz2.a(n);
                        adz2.a();
                    }
                    this.l = null;
                }
            }
            this.j = aeu2;
            if (this.j != null) {
                aes aes2 = aeu2.b;
                aef.d();
                this.k = aes2.a.a(aeu2.c);
                if (this.k != null) {
                    this.k.b();
                }
                if (aef.a) {
                    new StringBuilder("Route selected: ").append((Object)this.j);
                }
                this.g.a(262, this.j);
                if (this.j instanceof aet) {
                    this.l = new HashMap();
                    for (aeu aeu3 : ((aet)this.j).a) {
                        aes aes3 = aeu3.b;
                        aef.d();
                        adz adz3 = aes3.a.a(aeu3.c);
                        adz3.b();
                        this.l.put((Object)aeu3.c, (Object)adz3);
                    }
                }
            }
            this.e();
        }
    }

    private final int c(Object object) {
        int n = this.q.size();
        for (int i = 0; i < n; ++i) {
            if (((aer)this.q.get((int)i)).a.a != object) continue;
            return i;
        }
        return -1;
    }

    private final int c(String string) {
        int n = this.c.size();
        for (int i = 0; i < n; ++i) {
            if (!((aeu)this.c.get((int)i)).d.equals((Object)string)) continue;
            return i;
        }
        return -1;
    }

    public final aef a(Context context) {
        int n = this.b.size();
        do {
            int n2;
            if ((n2 = n - 1) >= 0) {
                aef aef2 = (aef)((WeakReference)this.b.get(n2)).get();
                if (aef2 == null) {
                    this.b.remove(n2);
                    n = n2;
                    continue;
                }
                if (aef2.c == context) {
                    return aef2;
                }
            } else {
                aef aef3 = new aef(context);
                this.b.add((Object)new WeakReference((Object)aef3));
                return aef3;
            }
            n = n2;
        } while (true);
    }

    public final aeu a() {
        if (this.t == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        return this.t;
    }

    public final aeu a(String string) {
        for (aeu aeu2 : this.c) {
            if (!aeu2.d.equals((Object)string)) continue;
            return aeu2;
        }
        return null;
    }

    @Override
    public final void a(adv adv2) {
        if (this.c(adv2) < 0) {
            aes aes2 = new aes(adv2);
            this.e.add((Object)aes2);
            if (aef.a) {
                new StringBuilder("Provider added: ").append((Object)aes2);
            }
            this.g.a(513, aes2);
            this.a(aes2, adv2.g);
            adv2.a(this.r);
            adv2.a(this.u);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void a(aes var1, aea var2_2) {
        if (var1.d == var2_2) return;
        var1.d = var2_2;
        var3_3 = true;
        if (var3_3 == false) return;
        var4_4 = false;
        var5_5 = 0;
        if (var2_2 == null) ** GOTO lbl71
        if (var2_2.b()) ** GOTO lbl11
        Log.w((String)"MediaRouter", (String)("Ignoring invalid provider descriptor: " + var2_2));
        ** GOTO lbl71
lbl11: // 1 sources:
        var15_6 = var2_2.a();
        var16_7 = var15_6.size();
        var17_8 = new ArrayList();
        var18_9 = new ArrayList();
        var19_10 = 0;
        do {
            if (var19_10 >= var16_7) ** GOTO lbl59
            var28_14 = (ads)var15_6.get(var19_10);
            var29_12 = var28_14.a();
            var30_13 = var1.a(var29_12);
            if (var30_13 >= 0) ** GOTO lbl41
            var38_19 = super.a(var1, var29_12);
            var39_18 = var28_14.b() != null;
            var40_20 = var39_18 != false ? new aet(var1, var29_12, var38_19) : new aeu(var1, var29_12, var38_19);
            var41_16 = var1.b;
            var42_22 = var5_5 + 1;
            var41_16.add(var5_5, (Object)var40_20);
            this.c.add((Object)var40_20);
            if (var39_18) {
                var17_8.add((Object)new pe((Object)var40_20, (Object)var28_14));
                var34_15 = var4_4;
                var35_21 = var42_22;
            } else {
                var40_20.a(var28_14);
                if (aef.a) {
                    new StringBuilder("Route added: ").append((Object)var40_20);
                }
                this.g.a(257, var40_20);
                var34_15 = var4_4;
                var35_21 = var42_22;
            }
            ** GOTO lbl89
lbl41: // 1 sources:
            if (var30_13 >= var5_5) ** GOTO lbl46
            Log.w((String)"MediaRouter", (String)("Ignoring route descriptor with duplicate id: " + var28_14));
            var34_15 = var4_4;
            var35_21 = var5_5;
            ** GOTO lbl89
lbl46: // 1 sources:
            var31_23 = (aeu)var1.b.get(var30_13);
            var32_17 = var1.b;
            var33_11 = var5_5 + 1;
            Collections.swap((List)var32_17, (int)var30_13, (int)var5_5);
            if (!(var31_23 instanceof aet)) ** GOTO lbl55
            var18_9.add((Object)new pe((Object)var31_23, (Object)var28_14));
            var34_15 = var4_4;
            var35_21 = var33_11;
            ** GOTO lbl89
lbl55: // 1 sources:
            if (super.a(var31_23, var28_14) == 0 || var31_23 != this.j) ** GOTO lbl87
            var34_15 = true;
            var35_21 = var33_11;
            ** GOTO lbl89
lbl59: // 2 sources:
            for (pe var24_26 : var17_8) {
                var25_25 = (aeu)var24_26.a;
                var25_25.a((ads)var24_26.b);
                if (aef.a) {
                    new StringBuilder("Route added: ").append((Object)var25_25);
                }
                this.g.a(257, var25_25);
            }
            for (pe var22_29 : var18_9) {
                var23_28 = (aeu)var22_29.a;
                if (super.a(var23_28, (ads)var22_29.b) == 0 || var23_28 != this.j) continue;
                var4_4 = true;
            }
lbl71: // 4 sources:
            for (var6_30 = -1 + var1.b.size(); var6_30 >= var5_5; --var6_30) {
                var11_31 = (aeu)var1.b.get(var6_30);
                var11_31.a((ads)null);
                this.c.remove((Object)var11_31);
            }
            super.a(var4_4);
            for (var7_32 = -1 + var1.b.size(); var7_32 >= var5_5; --var7_32) {
                var9_33 = (aeu)var1.b.remove(var7_32);
                if (aef.a) {
                    new StringBuilder("Route removed: ").append((Object)var9_33);
                }
                this.g.a(258, var9_33);
            }
            if (aef.a) {
                new StringBuilder("Provider changed: ").append((Object)var1);
            }
            this.g.a(515, var1);
            return;
lbl87: // 1 sources:
            var34_15 = var4_4;
            var35_21 = var33_11;
lbl89: // 6 sources:
            ++var19_10;
            var5_5 = var35_21;
            var4_4 = var34_15;
        } while (true);
    }

    public final void a(aeu aeu2, int n) {
        if (!this.c.contains((Object)aeu2)) {
            Log.w((String)"MediaRouter", (String)("Ignoring attempt to select removed route: " + aeu2));
            return;
        }
        if (!aeu2.h) {
            Log.w((String)"MediaRouter", (String)("Ignoring attempt to select disabled route: " + aeu2));
            return;
        }
        super.b(aeu2, n);
    }

    public final void a(Object object) {
        if (super.c(object) < 0) {
            aer aer2 = new aer((aej)this, object);
            this.q.add((Object)aer2);
        }
    }

    public final boolean a(aed aed2, int n) {
        if (aed2.c()) {
            return false;
        }
        if ((n & 2) == 0 && this.s) {
            return true;
        }
        int n2 = this.c.size();
        for (int i = 0; i < n2; ++i) {
            aeu aeu2 = (aeu)this.c.get(i);
            if ((n & 1) != 0 && aeu2.b() || !aeu2.a(aed2)) continue;
            return true;
        }
        return false;
    }

    public final aeu b() {
        if (this.j == null) {
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }
        return this.j;
    }

    @Override
    public final aeu b(String string) {
        int n;
        aes aes2;
        int n2 = this.c(this.h);
        if (n2 >= 0 && (n = (aes2 = (aes)this.e.get(n2)).a(string)) >= 0) {
            return (aeu)aes2.b.get(n);
        }
        return null;
    }

    @Override
    public final void b(adv adv2) {
        int n = this.c(adv2);
        if (n >= 0) {
            adv2.a((adw)null);
            adv2.a((adu)null);
            aes aes2 = (aes)this.e.get(n);
            this.a(aes2, (aea)null);
            if (aef.a) {
                new StringBuilder("Provider removed: ").append((Object)aes2);
            }
            this.g.a(514, aes2);
            this.e.remove(n);
        }
    }

    public final void b(Object object) {
        int n = super.c(object);
        if (n >= 0) {
            aer aer2 = (aer)this.q.remove(n);
            aer2.b = true;
            aer2.a.b = null;
        }
    }

    final int c(adv adv2) {
        int n = this.e.size();
        for (int i = 0; i < n; ++i) {
            if (((aes)this.e.get((int)i)).a != adv2) continue;
            return i;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void c() {
        int n;
        aee aee2 = new aee();
        int n2 = this.b.size();
        boolean bl2 = false;
        boolean bl3 = false;
        while ((n = n2 - 1) >= 0) {
            aef aef2 = (aef)((WeakReference)this.b.get(n)).get();
            if (aef2 == null) {
                this.b.remove(n);
                n2 = n;
                continue;
            }
            int n3 = aef2.d.size();
            for (int i = 0; i < n3; ++i) {
                aeh aeh2 = (aeh)aef2.d.get(i);
                aee2.a(aeh2.c);
                if ((1 & aeh2.d) != 0) {
                    bl2 = true;
                    bl3 = true;
                }
                if ((4 & aeh2.d) != 0 && !this.s) {
                    bl3 = true;
                }
                if ((8 & aeh2.d) == 0) continue;
                bl3 = true;
            }
            n2 = n;
        }
        aed aed2 = aed.c;
        if (this.u != null && this.u.a().equals(aed2) && this.u.b() == bl2) {
            return;
        }
        if (aed2.c() && !bl2) {
            if (this.u == null) return;
            this.u = null;
        } else {
            this.u = new adu(aed2, bl2);
        }
        if (aef.a) {
            new StringBuilder("Updated discovery request: ").append((Object)this.u);
        }
        int n4 = this.e.size();
        int n5 = 0;
        while (n5 < n4) {
            ((aes)this.e.get((int)n5)).a.a(this.u);
            ++n5;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final aeu d() {
        var1_1 = this.c.iterator();
        do lbl-1000: // 3 sources:
        {
            if (var1_1.hasNext() == false) return this.t;
            var2_4 = (aeu)var1_1.next();
            if (var2_4 == this.t) ** GOTO lbl-1000
            var3_3 = var2_4.b;
            aef.d();
        } while (!(var4_2 = var3_3.a == this.h && var2_4.a("android.media.intent.category.LIVE_AUDIO") != false && var2_4.a("android.media.intent.category.LIVE_VIDEO") == false) || !aej.a(var2_4));
        return var2_4;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void e() {
        if (this.j == null) {
            if (this.m == null) return;
            this.m.a();
            return;
        }
        this.f.a = this.j.q;
        this.f.b = this.j.r;
        this.f.c = this.j.p;
        this.f.d = this.j.n;
        this.f.e = this.j.m;
        int n = this.q.size();
        for (int i = 0; i < n; ++i) {
            ((aer)this.q.get(i)).a();
        }
        if (this.m == null) return;
        if (this.j == this.a()) {
            this.m.a();
            return;
        }
        int n2 = this.f.c == 1 ? 2 : 0;
        aem aem2 = this.m;
        int n3 = this.f.b;
        int n4 = this.f.a;
        if (aem2.b != null && n2 == 0 && n3 == 0) {
            ks ks2 = aem2.b;
            ks2.c = n4;
            Object object = ks2.a();
            if (object != null) {
                ((VolumeProvider)object).setCurrentVolume(n4);
            }
            if (ks2.d == null) return;
            ks2.d.a(ks2);
            return;
        }
        aem2.b = new aen(aem2, n2, n3, n4);
        lv lv2 = aem2.a;
        ks ks3 = aem2.b;
        if (ks3 == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        lv2.a.a(ks3);
    }
}

