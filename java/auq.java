/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Comparable
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.URLEncoder
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.PriorityBlockingQueue
 */
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

public abstract class auq
implements Comparable {
    final avd a;
    Integer b;
    public boolean c;
    private final int d;
    private final String e;
    private final int f;
    private final auv g;
    private aut h;
    private boolean i;
    private boolean j;
    private auy k;
    private aud l;

    /*
     * Enabled aggressive block sorting
     */
    public auq(int n, String string) {
        String string2;
        Uri uri;
        avd avd2 = avd.a ? new avd() : null;
        this.a = avd2;
        this.c = true;
        this.i = false;
        this.j = false;
        this.l = null;
        this.d = n;
        this.e = string;
        this.g = null;
        this.a(new aug());
        int n2 = !TextUtils.isEmpty((CharSequence)string) && (uri = Uri.parse((String)string)) != null && (string2 = uri.getHost()) != null ? string2.hashCode() : 0;
        this.f = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] a(Map map, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                stringBuilder.append(URLEncoder.encode((String)((String)entry.getKey()), (String)string));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String)((String)entry.getValue()), (String)string));
                stringBuilder.append('&');
            }
            return stringBuilder.toString().getBytes(string);
        }
        catch (UnsupportedEncodingException var3_5) {
            throw new RuntimeException("Encoding not supported: " + string, (Throwable)var3_5);
        }
    }

    public int a() {
        return this.d;
    }

    public auq a(aud aud2) {
        this.l = aud2;
        return this;
    }

    public auq a(aut aut2) {
        this.h = aut2;
        return this;
    }

    public auq a(auy auy2) {
        this.k = auy2;
        return this;
    }

    public abstract auu a(aun var1);

    public avb a(avb avb2) {
        return avb2;
    }

    public abstract void a(Object var1);

    public void a(String string) {
        if (avd.a) {
            this.a.a(string, Thread.currentThread().getId());
        }
    }

    public Object b() {
        return null;
    }

    public void b(avb avb2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    final void b(String string) {
        if (this.h != null) {
            List list;
            Set set;
            aut aut2 = this.h;
            Set set2 = set = aut2.b;
            // MONITORENTER : set2
            aut2.b.remove((Object)this);
            // MONITOREXIT : set2
            List list2 = list = aut2.e;
            // MONITORENTER : list2
            Iterator iterator = aut2.e.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
            // MONITOREXIT : list2
            if (this.c) {
                Map map;
                Map map2 = map = aut2.a;
                // MONITORENTER : map2
                String string2 = this.e();
                Queue queue = (Queue)aut2.a.remove((Object)string2);
                if (queue != null) {
                    if (avc.b) {
                        Object[] arrobject = new Object[]{queue.size(), string2};
                        avc.a("Releasing %d waiting requests for cacheKey=%s.", arrobject);
                    }
                    aut2.c.addAll((Collection)queue);
                }
                // MONITOREXIT : map2
            }
        }
        if (!avd.a) return;
        long l = Thread.currentThread().getId();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post((Runnable)new aur((auq)this, string, l));
            return;
        }
        this.a.a(string, l);
        this.a.a(this.toString());
    }

    public int c() {
        return this.f;
    }

    public /* synthetic */ int compareTo(Object object) {
        aus aus2;
        auq auq2 = (auq)object;
        aus aus3 = this.r();
        if (aus3 == (aus2 = auq2.r())) {
            return this.b - auq2.b;
        }
        return aus2.ordinal() - aus3.ordinal();
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.d();
    }

    public aud f() {
        return this.l;
    }

    public void g() {
        this.i = true;
    }

    public boolean h() {
        return this.i;
    }

    public Map i() {
        return Collections.emptyMap();
    }

    @Deprecated
    public Map j() {
        return this.n();
    }

    @Deprecated
    public String k() {
        return this.o();
    }

    @Deprecated
    public String l() {
        return this.p();
    }

    @Deprecated
    public byte[] m() {
        Map map = this.j();
        if (map != null && map.size() > 0) {
            return auq.a(map, this.k());
        }
        return null;
    }

    public Map n() {
        return null;
    }

    public String o() {
        return "UTF-8";
    }

    public String p() {
        return "application/x-www-form-urlencoded; charset=" + this.o();
    }

    public byte[] q() {
        this.n();
        return null;
    }

    public aus r() {
        return aus.b;
    }

    public final int s() {
        return this.k.V_();
    }

    public auy t() {
        return this.k;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        String string;
        String string2 = "0x" + Integer.toHexString((int)this.c());
        StringBuilder stringBuilder = new StringBuilder();
        if (this.i) {
            string = "[X] ";
            do {
                return stringBuilder.append(string).append(this.d()).append(" ").append(string2).append(" ").append((Object)((Object)this.r())).append(" ").append((Object)this.b).toString();
                break;
            } while (true);
        }
        string = "[ ] ";
        return stringBuilder.append(string).append(this.d()).append(" ").append(string2).append(" ").append((Object)((Object)this.r())).append(" ").append((Object)this.b).toString();
    }

    public void u() {
        this.j = true;
    }

    public boolean v() {
        return this.j;
    }
}

