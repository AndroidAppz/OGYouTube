/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.List
 */
import android.util.Log;
import java.util.Collections;
import java.util.List;

final class bau
implements axy,
ayz,
aza {
    private final azb a;
    private final aza b;
    private int c;
    private ayw d;
    private Object e;
    private volatile bem f;
    private ayx g;

    public bau(azb azb2, aza aza2) {
        this.a = azb2;
        this.b = aza2;
    }

    @Override
    public final void a(axo axo2, Exception exception, axx axx2, axj axj2) {
        this.b.a(axo2, exception, axx2, this.f.c.d());
    }

    @Override
    public final void a(axo axo2, Object object, axx axx2, axj axj2, axo axo3) {
        this.b.a(axo2, object, axx2, this.f.c.d(), axo2);
    }

    @Override
    public final void a(Exception exception) {
        this.b.a(this.g, exception, this.f.c, this.f.c.d());
    }

    @Override
    public final void a(Object object) {
        azn azn2 = this.a.p;
        if (object != null && azn2.a(this.f.c.d())) {
            this.e = object;
            this.b.c();
            return;
        }
        this.b.a(this.f.a, object, this.f.c, this.f.c.d(), this.g);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a() {
        if (this.e != null) {
            var5_1 = this.e;
            this.e = null;
            var6_2 = bli.a();
            var9_3 = this.a.c.b.a.a(var5_1.getClass());
            if (var9_3 == null) throw new awe(var5_1.getClass());
            var10_4 = new ayy(var9_3, var5_1, this.a.i);
            this.g = new ayx(this.f.a, this.a.n);
            this.a.a().a(this.g, var10_4);
            if (Log.isLoggable((String)"SourceGenerator", (int)2)) {
                var11_5 = String.valueOf((Object)this.g);
                var12_6 = String.valueOf((Object)var5_1);
                var13_7 = String.valueOf((Object)var9_3);
                var14_8 = bli.a(var6_2);
                new StringBuilder(95 + String.valueOf((Object)var11_5).length() + String.valueOf((Object)var12_6).length() + String.valueOf((Object)var13_7).length()).append("Finished encoding source to cache, key: ").append(var11_5).append(", data: ").append(var12_6).append(", encoder: ").append(var13_7).append(", duration: ").append(var14_8);
            }
            this.d = new ayw(Collections.singletonList((Object)this.f.a), this.a, this);
        }
        if (this.d != null && this.d.a()) {
            return true;
        }
        ** GOTO lbl24
        finally {
            this.f.c.a();
        }
lbl24: // 1 sources:
        this.d = null;
        this.f = null;
        var1_10 = false;
        while (var1_10 == false) {
            if (this.c >= this.a.b().size()) return var1_10;
            var2_13 = true;
            if (var2_13 == false) return var1_10;
            var3_11 = this.a.b();
            var4_12 = this.c;
            this.c = var4_12 + 1;
            this.f = (bem)var3_11.get(var4_12);
            if (this.f == null || !this.a.p.a(this.f.c.d()) && !this.a.a(this.f.c.c())) continue;
            this.f.c.a(this.a.o, this);
            var1_10 = true;
        }
        return var1_10;
    }

    @Override
    public final void b() {
        bem bem2 = this.f;
        if (bem2 != null) {
            bem2.c.b();
        }
    }

    @Override
    public final void c() {
        throw new UnsupportedOperationException();
    }
}

