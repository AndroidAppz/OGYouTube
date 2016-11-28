/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  or
 *  ow
 */
public final class aqu {
    public final or a = new or();
    public final ow b = new ow();

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final aoe a(aow aow2, int n) {
        int n2 = this.a.a((Object)aow2);
        aoe aoe2 = null;
        if (n2 < 0) {
            return aoe2;
        }
        aqv aqv2 = (aqv)this.a.c(n2);
        aoe2 = null;
        if (aqv2 == null) return aoe2;
        int n3 = n & aqv2.a;
        aoe2 = null;
        if (n3 == 0) return aoe2;
        aqv2.a &= ~ n;
        if (n == 4) {
            aoe2 = aqv2.b;
        } else {
            if (n != 8) throw new IllegalArgumentException("Must provide flag PRE or POST");
            aoe2 = aqv2.c;
        }
        if ((12 & aqv2.a) != 0) return aoe2;
        this.a.d(n2);
        aqv.a(aqv2);
        return aoe2;
    }

    public final void a() {
        this.a.clear();
        ow ow2 = this.b;
        int n = ow2.e;
        Object[] arrobject = ow2.d;
        for (int i = 0; i < n; ++i) {
            arrobject[i] = null;
        }
        ow2.e = 0;
        ow2.b = false;
    }

    public final void a(long l, aow aow2) {
        this.b.a(l, (Object)aow2);
    }

    public final void a(aow aow2, aoe aoe2) {
        aqv aqv2 = (aqv)this.a.get((Object)aow2);
        if (aqv2 == null) {
            aqv2 = aqv.a();
            this.a.put((Object)aow2, (Object)aqv2);
        }
        aqv2.b = aoe2;
        aqv2.a = 4 | aqv2.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(aqw aqw2) {
        int n = -1 + this.a.size();
        while (n >= 0) {
            aow aow2 = (aow)this.a.b(n);
            aqv aqv2 = (aqv)this.a.d(n);
            if ((3 & aqv2.a) == 3) {
                aqw2.a(aow2);
            } else if ((1 & aqv2.a) != 0) {
                if (aqv2.b == null) {
                    aqw2.a(aow2);
                } else {
                    aqw2.a(aow2, aqv2.b, aqv2.c);
                }
            } else if ((14 & aqv2.a) == 14) {
                aqw2.b(aow2, aqv2.b, aqv2.c);
            } else if ((12 & aqv2.a) == 12) {
                aqw2.c(aow2, aqv2.b, aqv2.c);
            } else if ((4 & aqv2.a) != 0) {
                aqw2.a(aow2, aqv2.b, null);
            } else if ((8 & aqv2.a) != 0) {
                aqw2.b(aow2, aqv2.b, aqv2.c);
            }
            aqv.a(aqv2);
            --n;
        }
        return;
    }

    public final boolean a(aow aow2) {
        aqv aqv2 = (aqv)this.a.get((Object)aow2);
        if (aqv2 != null && (1 & aqv2.a) != 0) {
            return true;
        }
        return false;
    }

    final void b(aow aow2) {
        aqv aqv2 = (aqv)this.a.get((Object)aow2);
        if (aqv2 == null) {
            aqv2 = aqv.a();
            this.a.put((Object)aow2, (Object)aqv2);
        }
        aqv2.a = 1 | aqv2.a;
    }

    public final void b(aow aow2, aoe aoe2) {
        aqv aqv2 = (aqv)this.a.get((Object)aow2);
        if (aqv2 == null) {
            aqv2 = aqv.a();
            this.a.put((Object)aow2, (Object)aqv2);
        }
        aqv2.c = aoe2;
        aqv2.a = 8 | aqv2.a;
    }

    final void c(aow aow2) {
        aqv aqv2 = (aqv)this.a.get((Object)aow2);
        if (aqv2 == null) {
            return;
        }
        aqv2.a = -2 & aqv2.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void d(aow var1) {
        var2_2 = -1 + this.b.a();
        do {
            if (var2_2 < 0) ** GOTO lbl9
            if (var1 == this.b.a(var2_2)) {
                var4_3 = this.b;
                if (var4_3.d[var2_2] != ow.a) {
                    var4_3.d[var2_2] = ow.a;
                    var4_3.b = true;
                }
lbl9: // 4 sources:
                if ((var3_4 = (aqv)this.a.remove((Object)var1)) == null) return;
                aqv.a(var3_4);
                return;
            }
            --var2_2;
        } while (true);
    }
}

