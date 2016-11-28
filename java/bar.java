/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 */
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

final class bar
implements axo {
    private static final blj b = new blj(50);
    private final axo c;
    private final axo d;
    private final int e;
    private final int f;
    private final Class g;
    private final axs h;
    private final axv i;

    public bar(axo axo2, axo axo3, int n, int n2, axv axv2, Class class_, axs axs2) {
        this.c = axo2;
        this.d = axo3;
        this.e = n;
        this.f = n2;
        this.i = axv2;
        this.g = class_;
        this.h = axs2;
    }

    @Override
    public final void a(MessageDigest messageDigest) {
        byte[] arrby = ByteBuffer.allocate((int)8).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(arrby);
        if (this.i != null) {
            this.i.a(messageDigest);
        }
        this.h.a(messageDigest);
        byte[] arrby2 = (byte[])b.b((Object)this.g);
        if (arrby2 == null) {
            arrby2 = this.g.getName().getBytes(a);
            b.b((Object)this.g, arrby2);
        }
        messageDigest.update(arrby2);
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof bar;
        boolean bl3 = false;
        if (bl2) {
            bar bar2 = (bar)object;
            int n = this.f;
            int n2 = bar2.f;
            bl3 = false;
            if (n == n2) {
                int n3 = this.e;
                int n4 = bar2.e;
                bl3 = false;
                if (n3 == n4) {
                    boolean bl4 = bln.a(this.i, bar2.i);
                    bl3 = false;
                    if (bl4) {
                        boolean bl5 = this.g.equals((Object)bar2.g);
                        bl3 = false;
                        if (bl5) {
                            boolean bl6 = this.c.equals(bar2.c);
                            bl3 = false;
                            if (bl6) {
                                boolean bl7 = this.d.equals(bar2.d);
                                bl3 = false;
                                if (bl7) {
                                    boolean bl8 = this.h.equals(bar2.h);
                                    bl3 = false;
                                    if (bl8) {
                                        bl3 = true;
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
        int n = 31 * (31 * (31 * this.c.hashCode() + this.d.hashCode()) + this.e) + this.f;
        if (this.i != null) {
            n = n * 31 + this.i.hashCode();
        }
        return 31 * (n * 31 + this.g.hashCode()) + this.h.hashCode();
    }

    public final String toString() {
        String string = String.valueOf((Object)this.c);
        String string2 = String.valueOf((Object)this.d);
        int n = this.e;
        int n2 = this.f;
        String string3 = String.valueOf((Object)this.g);
        String string4 = String.valueOf((Object)this.i);
        String string5 = String.valueOf((Object)this.h);
        return new StringBuilder(131 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length() + String.valueOf((Object)string4).length() + String.valueOf((Object)string5).length()).append("ResourceCacheKey{sourceKey=").append(string).append(", signature=").append(string2).append(", width=").append(n).append(", height=").append(n2).append(", decodedResourceClass=").append(string3).append(", transformation='").append(string4).append("', options=").append(string5).append("}").toString();
    }
}

