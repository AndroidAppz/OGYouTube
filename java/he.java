/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.graphics.Bitmap
 *  gz
 *  hh
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;

public class he {
    public Context a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    public Bitmap e;
    public CharSequence f;
    public int g;
    public boolean h = true;
    public hq i;
    public CharSequence j;
    int k;
    int l;
    boolean m;
    public String n;
    public boolean o;
    public ArrayList p = new ArrayList();
    public String q;
    public int r = 0;
    public int s = 0;
    public Notification t = new Notification();
    public ArrayList u;

    public he(Context context) {
        this.a = context;
        this.t.when = System.currentTimeMillis();
        this.t.audioStreamType = -1;
        this.g = 0;
        this.u = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static CharSequence e(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 5120) {
            return charSequence;
        }
        return charSequence.subSequence(0, 5120);
    }

    public final Notification a() {
        return gy.a.a(this, this.b());
    }

    public final he a(int n) {
        this.t.icon = n;
        return this;
    }

    public final he a(int n, int n2, boolean bl2) {
        this.k = n;
        this.l = n2;
        this.m = bl2;
        return this;
    }

    public final he a(int n, CharSequence charSequence, PendingIntent pendingIntent) {
        this.p.add((Object)new gz(n, charSequence, pendingIntent));
        return this;
    }

    public final he a(long l) {
        this.t.when = l;
        return this;
    }

    public final he a(PendingIntent pendingIntent) {
        this.t.deleteIntent = pendingIntent;
        return this;
    }

    public final he a(gz gz2) {
        this.p.add((Object)gz2);
        return this;
    }

    public final he a(hq hq2) {
        if (this.i != hq2) {
            this.i = hq2;
            if (this.i != null) {
                hq hq3 = this.i;
                if (hq3.b != this) {
                    hq3.b = this;
                    if (hq3.b != null) {
                        hq3.b.a(hq3);
                    }
                }
            }
        }
        return this;
    }

    public final he a(CharSequence charSequence) {
        this.b = he.e(charSequence);
        return this;
    }

    public final he a(boolean bl2) {
        this.a(16, bl2);
        return this;
    }

    public final he a(long[] arrl) {
        this.t.vibrate = arrl;
        return this;
    }

    public final void a(int n, boolean bl2) {
        if (bl2) {
            Notification notification = this.t;
            notification.flags = n | notification.flags;
            return;
        }
        Notification notification = this.t;
        notification.flags &= ~ n;
    }

    public final he b(CharSequence charSequence) {
        this.c = he.e(charSequence);
        return this;
    }

    public hf b() {
        return new hf();
    }

    public final he c(CharSequence charSequence) {
        this.f = he.e(charSequence);
        return this;
    }

    public final he d(CharSequence charSequence) {
        this.t.tickerText = he.e(charSequence);
        return this;
    }
}

