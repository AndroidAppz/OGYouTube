/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.IntentFilter
 *  android.content.IntentSender
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 */
import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class aeu {
    private IntentSender a;
    final aes b;
    final String c;
    public final String d;
    public String e;
    public String f;
    public Uri g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public final ArrayList l = new ArrayList();
    int m;
    int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s = -1;
    public Bundle t;
    ads u;

    aeu(aes aes2, String string, String string2) {
        this.b = aes2;
        this.c = string;
        this.d = string2;
    }

    int a(ads ads2) {
        ads ads3 = this.u;
        int n = 0;
        if (ads3 != ads2) {
            n = this.b(ads2);
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n) {
        aef.d();
        aej aej2 = aef.b;
        int n2 = Math.min((int)this.r, (int)Math.max((int)0, (int)n));
        if (this == aej2.j && aej2.k != null) {
            aej2.k.b(n2);
            return;
        } else {
            adz adz2;
            if (aej2.l == null || (adz2 = (adz)aej2.l.get((Object)this.c)) == null) return;
            {
                adz2.b(n2);
                return;
            }
        }
    }

    public final boolean a() {
        aef.d();
        if (aef.b.b() == this) {
            return true;
        }
        return false;
    }

    public final boolean a(aed aed2) {
        if (aed2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        aef.d();
        return aed2.a((List)this.l);
    }

    public final boolean a(String string) {
        aef.d();
        int n = this.l.size();
        for (int i = 0; i < n; ++i) {
            if (!((IntentFilter)this.l.get(i)).hasCategory(string)) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    final int b(ads ads2) {
        int n = 1;
        this.u = ads2;
        if (ads2 == null) {
            return 0;
        }
        boolean bl2 = aef.a(this.e, ads2.c());
        int n2 = 0;
        if (!bl2) {
            this.e = ads2.c();
            n2 = n;
        }
        if (!aef.a(this.f, ads2.d())) {
            this.f = ads2.d();
            n2 = n;
        }
        if (!aef.a((Object)this.g, (Object)ads2.e())) {
            this.g = ads2.e();
        } else {
            n = n2;
        }
        if (this.h != ads2.f()) {
            this.h = ads2.f();
            n |= true;
        }
        if (this.i != ads2.g()) {
            this.i = ads2.g();
            n |= true;
        }
        if (this.j != ads2.h()) {
            this.j = ads2.h();
            n |= true;
        }
        if (!this.l.equals((Object)ads2.k())) {
            this.l.clear();
            this.l.addAll((Collection)ads2.k());
            n |= true;
        }
        if (this.m != ads2.m()) {
            this.m = ads2.m();
            n |= true;
        }
        if (this.n != ads2.n()) {
            this.n = ads2.n();
            n |= true;
        }
        if (this.o != ads2.o()) {
            this.o = ads2.o();
            n |= true;
        }
        if (this.p != ads2.r()) {
            this.p = ads2.r();
            n |= 3;
        }
        if (this.q != ads2.p()) {
            this.q = ads2.p();
            n |= 3;
        }
        if (this.r != ads2.q()) {
            this.r = ads2.q();
            n |= 3;
        }
        if (this.s != ads2.s()) {
            this.s = ads2.s();
            n |= 5;
        }
        if (!aef.a((Object)this.t, (Object)ads2.t())) {
            this.t = ads2.t();
            n |= 1;
        }
        if (!aef.a((Object)this.a, (Object)ads2.j())) {
            this.a = ads2.j();
            n |= 1;
        }
        if (this.k != ads2.i()) {
            this.k = ads2.i();
            n |= 5;
        }
        return n;
    }

    public final void b(int n) {
        aef.d();
        if (n != 0) {
            aej aej2 = aef.b;
            if (this == aej2.j && aej2.k != null) {
                aej2.k.c(n);
            }
        }
    }

    public final boolean b() {
        aef.d();
        if (aef.b.a() == this) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean c() {
        if (this.o == 3) {
            return true;
        }
        aes aes2 = this.b;
        aef.d();
        if (!TextUtils.equals((CharSequence)aes2.a.b.a.getPackageName(), (CharSequence)"android")) return false;
        if (!this.a("android.media.intent.category.LIVE_AUDIO")) return false;
        if (!this.a("android.media.intent.category.LIVE_VIDEO")) return true;
        return false;
    }

    public final void d() {
        aef.d();
        aef.b.a(this, 3);
    }

    public final adv e() {
        aes aes2 = this.b;
        aef.d();
        return aes2.a;
    }

    public String toString() {
        return "MediaRouter.RouteInfo{ uniqueId=" + this.d + ", name=" + this.e + ", description=" + this.f + ", iconUri=" + (Object)this.g + ", enabled=" + this.h + ", connecting=" + this.i + ", connectionState=" + this.j + ", canDisconnect=" + this.k + ", playbackType=" + this.m + ", playbackStream=" + this.n + ", deviceType=" + this.o + ", volumeHandling=" + this.p + ", volume=" + this.q + ", volumeMax=" + this.r + ", presentationDisplayId=" + this.s + ", extras=" + (Object)this.t + ", settingsIntent=" + (Object)this.a + ", providerPackageName=" + this.b.a() + " }";
    }
}

