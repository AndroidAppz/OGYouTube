/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.security.MessageDigest
 *  java.util.Map
 */
import java.security.MessageDigest;
import java.util.Map;

public final class bag
implements axo {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final axo g;
    private final Map h;
    private final axs i;
    private int j;

    public bag(Object object, axo axo2, int n, int n2, Map map, Class class_, Class class_2, axs axs2) {
        this.b = blm.a(object, "Argument must not be null");
        this.g = (axo)blm.a(axo2, "Signature must not be null");
        this.c = n;
        this.d = n2;
        this.h = (Map)blm.a((Object)map, "Argument must not be null");
        this.e = (Class)blm.a((Object)class_, "Resource class must not be null");
        this.f = (Class)blm.a((Object)class_2, "Transcode class must not be null");
        this.i = (axs)blm.a(axs2, "Argument must not be null");
    }

    @Override
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof bag;
        boolean bl3 = false;
        if (bl2) {
            bag bag2 = (bag)object;
            boolean bl4 = this.b.equals(bag2.b);
            bl3 = false;
            if (bl4) {
                boolean bl5 = this.g.equals(bag2.g);
                bl3 = false;
                if (bl5) {
                    int n = this.d;
                    int n2 = bag2.d;
                    bl3 = false;
                    if (n == n2) {
                        int n3 = this.c;
                        int n4 = bag2.c;
                        bl3 = false;
                        if (n3 == n4) {
                            boolean bl6 = this.h.equals((Object)bag2.h);
                            bl3 = false;
                            if (bl6) {
                                boolean bl7 = this.e.equals((Object)bag2.e);
                                bl3 = false;
                                if (bl7) {
                                    boolean bl8 = this.f.equals((Object)bag2.f);
                                    bl3 = false;
                                    if (bl8) {
                                        boolean bl9 = this.i.equals(bag2.i);
                                        bl3 = false;
                                        if (bl9) {
                                            bl3 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return bl3;
    }

    @Override
    public final int hashCode() {
        if (this.j == 0) {
            this.j = this.b.hashCode();
            this.j = 31 * this.j + this.g.hashCode();
            this.j = 31 * this.j + this.c;
            this.j = 31 * this.j + this.d;
            this.j = 31 * this.j + this.h.hashCode();
            this.j = 31 * this.j + this.e.hashCode();
            this.j = 31 * this.j + this.f.hashCode();
            this.j = 31 * this.j + this.i.hashCode();
        }
        return this.j;
    }

    public final String toString() {
        String string = String.valueOf((Object)this.b);
        int n = this.c;
        int n2 = this.d;
        String string2 = String.valueOf((Object)this.e);
        String string3 = String.valueOf((Object)this.f);
        String string4 = String.valueOf((Object)this.g);
        int n3 = this.j;
        String string5 = String.valueOf((Object)this.h);
        String string6 = String.valueOf((Object)this.i);
        return new StringBuilder(151 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length() + String.valueOf((Object)string4).length() + String.valueOf((Object)string5).length() + String.valueOf((Object)string6).length()).append("EngineKey{model=").append(string).append(", width=").append(n).append(", height=").append(n2).append(", resourceClass=").append(string2).append(", transcodeClass=").append(string3).append(", signature=").append(string4).append(", hashCode=").append(n3).append(", transformations=").append(string5).append(", options=").append(string6).append("}").toString();
    }
}

