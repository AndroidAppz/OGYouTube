/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.content.res.Resources
 *  android.media.MediaRouter
 *  android.media.MediaRouter$Callback
 *  android.media.MediaRouter$RouteInfo
 *  android.media.MediaRouter$UserRouteInfo
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.IllegalAccessException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.MediaRouter;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class agc
extends agb
implements aew,
afc {
    private static final ArrayList o;
    private static final ArrayList p;
    public final Object i;
    public final Object j;
    public int k;
    public boolean l;
    public boolean m;
    public final ArrayList n = new ArrayList();
    private final agl q;
    private Object r;
    private Object s;
    private ArrayList t = new ArrayList();
    private afa u;
    private aey v;

    static {
        ArrayList arrayList;
        ArrayList arrayList2;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        o = arrayList = new ArrayList();
        arrayList.add((Object)intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        p = arrayList2 = new ArrayList();
        arrayList2.add((Object)intentFilter2);
    }

    public agc(Context context, agl agl2) {
        super(context);
        this.q = agl2;
        this.i = context.getSystemService("media_router");
        this.j = this.c();
        this.r = aev.a((afc)this);
        Resources resources = context.getResources();
        this.s = aev.a(this.i, resources.getString(agu.l));
        super.e();
    }

    private final void a(age age2) {
        adt adt2 = new adt(age2.b, super.j(age2.a));
        this.a(age2, adt2);
        age2.c = adt2.a();
    }

    private final int b(String string) {
        int n = this.n.size();
        for (int i = 0; i < n; ++i) {
            if (!((age)this.n.get((int)i)).b.equals((Object)string)) continue;
            return i;
        }
        return -1;
    }

    private final int e(aeu aeu2) {
        int n = this.t.size();
        for (int i = 0; i < n; ++i) {
            if (((agf)this.t.get((int)i)).a != aeu2) continue;
            return i;
        }
        return -1;
    }

    private final void e() {
        MediaRouter mediaRouter = (MediaRouter)this.i;
        int n = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(n);
        for (int i = 0; i < n; ++i) {
            arrayList.add((Object)mediaRouter.getRouteAt(i));
        }
        Iterator iterator = arrayList.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= this.f(iterator.next());
        }
        if (bl2) {
            this.a();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final boolean f(Object var1) {
        if (agc.i(var1) != null) return false;
        if (this.g(var1) >= 0) return false;
        var2_2 = this.d() == var1;
        if (var2_2) {
            var5_3 = "DEFAULT_ROUTE";
        } else {
            var3_5 = Locale.US;
            var4_4 = new Object[]{super.j(var1).hashCode()};
            var5_3 = String.format((Locale)var3_5, (String)"ROUTE_%08x", (Object[])var4_4);
        }
        if (super.b(var5_3) < 0) ** GOTO lbl15
        var6_7 = 2;
        do {
            if (super.b(var9_9 = String.format((Locale)(var7_10 = Locale.US), (String)"%s_%d", (Object[])(var8_8 = new Object[]{var5_3, var6_7}))) < 0) {
                var5_3 = var9_9;
lbl15: // 2 sources:
                var10_6 = new age(var1, var5_3);
                super.a(var10_6);
                this.n.add((Object)var10_6);
                return true;
            }
            ++var6_7;
        } while (true);
    }

    private static agf i(Object object) {
        Object object2 = ((MediaRouter.RouteInfo)object).getTag();
        if (object2 instanceof agf) {
            return (agf)object2;
        }
        return null;
    }

    private final String j(Object object) {
        Context context = this.a;
        CharSequence charSequence = ((MediaRouter.RouteInfo)object).getName(context);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return "";
    }

    @Override
    public final adz a(String string) {
        int n = super.b(string);
        if (n >= 0) {
            return new agd(((age)this.n.get((int)n)).a);
        }
        return null;
    }

    protected final void a() {
        aeb aeb2 = new aeb();
        int n = this.n.size();
        for (int i = 0; i < n; ++i) {
            aeb2.a(((age)this.n.get((int)i)).c);
        }
        this.a(aeb2.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(aeu aeu2) {
        if (aeu2.e() != this) {
            Object object = aev.b(this.i, this.s);
            agf agf2 = new agf(aeu2, object);
            aez.a(object, agf2);
            afb.a(object, this.r);
            this.a(agf2);
            this.t.add((Object)agf2);
            ((MediaRouter)this.i).addUserRoute((MediaRouter.UserRouteInfo)object);
            return;
        } else {
            int n = this.g(aev.a(this.i));
            if (n < 0 || !((age)this.n.get((int)n)).b.equals((Object)aeu2.c)) return;
            {
                aeu2.d();
                return;
            }
        }
    }

    protected void a(age age2, adt adt2) {
        int n = ((MediaRouter.RouteInfo)age2.a).getSupportedTypes();
        if ((n & 1) != 0) {
            adt2.a((Collection)o);
        }
        if ((n & 2) != 0) {
            adt2.a((Collection)p);
        }
        adt2.a(((MediaRouter.RouteInfo)age2.a).getPlaybackType());
        adt2.b(((MediaRouter.RouteInfo)age2.a).getPlaybackStream());
        adt2.c(((MediaRouter.RouteInfo)age2.a).getVolume());
        adt2.d(((MediaRouter.RouteInfo)age2.a).getVolumeMax());
        adt2.e(((MediaRouter.RouteInfo)age2.a).getVolumeHandling());
    }

    protected void a(agf agf2) {
        Object object = agf2.b;
        String string = agf2.a.e;
        ((MediaRouter.UserRouteInfo)object).setName((CharSequence)string);
        afb.a(agf2.b, agf2.a.m);
        afb.b(agf2.b, agf2.a.n);
        afb.c(agf2.b, agf2.a.q);
        afb.d(agf2.b, agf2.a.r);
        afb.e(agf2.b, agf2.a.p);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void a(Object object) {
        if (object != aev.a(this.i)) {
            return;
        }
        agf agf2 = agc.i(object);
        if (agf2 != null) {
            agf2.a.d();
            return;
        }
        int n = this.g(object);
        if (n < 0) return;
        age age2 = (age)this.n.get(n);
        aeu aeu2 = this.q.b(age2.b);
        if (aeu2 == null) return;
        aeu2.d();
    }

    @Override
    public final void a(Object object, int n) {
        agf agf2 = agc.i(object);
        if (agf2 != null) {
            agf2.a.a(n);
        }
    }

    protected void b() {
        if (this.m) {
            this.m = false;
            aev.a(this.i, this.j);
        }
        if (this.k != 0) {
            this.m = true;
            Object object = this.i;
            int n = this.k;
            Object object2 = this.j;
            ((MediaRouter)object).addCallback(n, (MediaRouter.Callback)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b(adu adu2) {
        boolean bl2;
        int n;
        if (adu2 == null) {
            bl2 = false;
            n = 0;
        } else {
            List list = adu2.a().a();
            int n2 = list.size();
            n = 0;
            for (int i = 0; i < n2; ++i) {
                String string = (String)list.get(i);
                int n3 = string.equals((Object)"android.media.intent.category.LIVE_AUDIO") ? n | 1 : (string.equals((Object)"android.media.intent.category.LIVE_VIDEO") ? n | 2 : 8388608 | n);
                n = n3;
            }
            bl2 = adu2.b();
        }
        if (this.k != n || this.l != bl2) {
            this.k = n;
            this.l = bl2;
            this.b();
            super.e();
        }
    }

    @Override
    public final void b(aeu aeu2) {
        int n;
        if (aeu2.e() != this && (n = super.e(aeu2)) >= 0) {
            agf agf2 = (agf)this.t.remove(n);
            aez.a(agf2.b, null);
            afb.a(agf2.b, null);
            Object object = this.i;
            Object object2 = agf2.b;
            ((MediaRouter)object).removeUserRoute((MediaRouter.UserRouteInfo)object2);
        }
    }

    @Override
    public final void b(Object object) {
        if (super.f(object)) {
            this.a();
        }
    }

    @Override
    public final void b(Object object, int n) {
        agf agf2 = agc.i(object);
        if (agf2 != null) {
            agf2.a.b(n);
        }
    }

    protected Object c() {
        return new aex(this);
    }

    @Override
    public final void c(aeu aeu2) {
        int n;
        if (aeu2.e() != this && (n = super.e(aeu2)) >= 0) {
            this.a((agf)this.t.get(n));
        }
    }

    @Override
    public final void c(Object object) {
        int n;
        if (agc.i(object) == null && (n = this.g(object)) >= 0) {
            this.n.remove(n);
            this.a();
        }
    }

    protected Object d() {
        if (this.v == null) {
            this.v = new aey();
        }
        return this.v.a(this.i);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void d(aeu aeu2) {
        if (!aeu2.a()) return;
        if (aeu2.e() != this) {
            int n = super.e(aeu2);
            if (n < 0) return;
            {
                this.h(((agf)this.t.get((int)n)).b);
                return;
            }
        }
        int n = super.b(aeu2.c);
        if (n < 0) {
            return;
        }
        this.h(((age)this.n.get((int)n)).a);
    }

    @Override
    public final void d(Object object) {
        int n;
        if (agc.i(object) == null && (n = this.g(object)) >= 0) {
            super.a((age)this.n.get(n));
            this.a();
        }
    }

    @Override
    public final void e(Object object) {
        int n;
        if (agc.i(object) == null && (n = this.g(object)) >= 0) {
            age age2 = (age)this.n.get(n);
            int n2 = ((MediaRouter.RouteInfo)object).getVolume();
            if (n2 != age2.c.p()) {
                age2.c = new adt(age2.c).c(n2).a();
                this.a();
            }
        }
    }

    protected final int g(Object object) {
        int n = this.n.size();
        for (int i = 0; i < n; ++i) {
            if (((age)this.n.get((int)i)).a != object) continue;
            return i;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void h(Object object) {
        if (this.u == null) {
            this.u = new afa();
        }
        afa afa2 = this.u;
        MediaRouter mediaRouter = (MediaRouter)this.i;
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo)object;
        if ((8388608 & routeInfo.getSupportedTypes()) == 0) {
            if (afa2.a != null) {
                try {
                    Method method = afa2.a;
                    Object[] arrobject = new Object[]{8388611, routeInfo};
                    method.invoke((Object)mediaRouter, arrobject);
                    return;
                }
                catch (IllegalAccessException var8_7) {
                    Log.w((String)"MediaRouterJellybean", (String)"Cannot programmatically select non-user route.  Media routing may not work.", (Throwable)var8_7);
                }
                catch (InvocationTargetException var6_8) {
                    Log.w((String)"MediaRouterJellybean", (String)"Cannot programmatically select non-user route.  Media routing may not work.", (Throwable)var6_8);
                }
            } else {
                Log.w((String)"MediaRouterJellybean", (String)"Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
            }
        }
        mediaRouter.selectRoute(8388611, routeInfo);
    }
}

