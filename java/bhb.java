/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.FilterInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class bhb
extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final baw f;

    public bhb(InputStream inputStream, baw baw2) {
        super(inputStream, baw2, 0);
    }

    private bhb(InputStream inputStream, baw baw2, byte by2) {
        super(inputStream);
        this.d = -1;
        this.f = baw2;
        this.a = (byte[])baw2.a(65536, (Class)byte[].class);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final int a(InputStream inputStream, byte[] arrby) {
        if (this.d == -1 || this.e - this.d >= this.c) {
            int n = inputStream.read(arrby);
            if (n > 0) {
                this.d = -1;
                this.e = 0;
                this.b = n;
            }
            return n;
        }
        if (this.d == 0 && this.c > arrby.length && this.b == arrby.length) {
            int n = arrby.length << 1;
            if (n > this.c) {
                n = this.c;
            }
            byte[] arrby2 = (byte[])this.f.a(n, (Class)byte[].class);
            System.arraycopy((Object)arrby, (int)0, (Object)arrby2, (int)0, (int)arrby.length);
            this.a = arrby2;
            this.f.a(arrby, (Class)byte[].class);
            arrby = arrby2;
        } else if (this.d > 0) {
            System.arraycopy((Object)arrby, (int)this.d, (Object)arrby, (int)0, (int)(arrby.length - this.d));
        }
        this.e -= this.d;
        this.d = 0;
        this.b = 0;
        int n = inputStream.read(arrby, this.e, arrby.length - this.e);
        int n2 = n <= 0 ? this.e : n + this.e;
        this.b = n2;
        return n;
    }

    private static IOException c() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final void a() {
        bhb bhb2 = this;
        synchronized (bhb2) {
            this.c = this.a.length;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int available() {
        bhb bhb2 = this;
        synchronized (bhb2) {
            InputStream inputStream = this.in;
            if (this.a == null) throw bhb.c();
            if (inputStream == null) throw bhb.c();
            int n = this.b - this.e;
            int n2 = inputStream.available();
            return n2 + n;
        }
    }

    public final void b() {
        bhb bhb2 = this;
        synchronized (bhb2) {
            if (this.a != null) {
                this.f.a(this.a, (Class)byte[].class);
                this.a = null;
            }
            return;
        }
    }

    public final void close() {
        if (this.a != null) {
            this.f.a(this.a, (Class)byte[].class);
            this.a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void mark(int n) {
        void var3_2 = this;
        synchronized (var3_2) {
            this.c = Math.max((int)this.c, (int)n);
            this.d = this.e;
            return;
        }
    }

    public final boolean markSupported() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int read() {
        int n = -1;
        bhb bhb2 = this;
        synchronized (bhb2) {
            byte[] arrby = this.a;
            InputStream inputStream = this.in;
            if (arrby == null) throw bhb.c();
            if (inputStream == null) {
                throw bhb.c();
            }
            if (this.e >= this.b) {
                int n2 = this.a(inputStream, arrby);
                if (n2 == n) return n;
            }
            if (arrby != this.a && (arrby = this.a) == null) {
                throw bhb.c();
            }
            if (this.b - this.e <= 0) return n;
            int n3 = this.e;
            this.e = n3 + 1;
            byte by2 = arrby[n3];
            return by2 & 255;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final int read(byte[] var1, int var2_3, int var3_2) {
        var12_4 = this;
        // MONITORENTER : var12_4
        var5_5 = this.a;
        if (var5_5 == null) {
            throw bhb.c();
        }
        if (var3_2 != 0) {
            var6_6 = this.in;
            if (var6_6 == null) {
                throw bhb.c();
            }
            if (this.e < this.b) {
                var11_7 = this.b - this.e >= var3_2 ? var3_2 : this.b - this.e;
                System.arraycopy((Object)var5_5, (int)this.e, (Object)var1, (int)var2_3, (int)var11_7);
                this.e = var11_7 + this.e;
                if (var11_7 == var3_2) return var11_7;
                if (var6_6.available() == 0) {
                    return var11_7;
                }
                var2_3 += var11_7;
                var7_11 = var3_2 - var11_7;
            } else {
                var7_11 = var3_2;
            }
        } else {
            var3_2 = 0;
            do {
                // MONITOREXIT : var12_4
                return var3_2;
                break;
            } while (true);
        }
        do {
            if (this.d == -1 && var7_11 >= var5_5.length) {
                var8_8 = var6_6.read(var1, var2_3, var7_11);
                if (var8_8 == -1) {
                    if (var7_11 != var3_2) return var3_2 -= var7_11;
                    return -1;
                }
            } else {
                if (super.a(var6_6, var5_5) == -1) {
                    if (var7_11 != var3_2) return var3_2 -= var7_11;
                    return -1;
                }
                if (var5_5 != this.a && (var5_5 = this.a) == null) {
                    throw bhb.c();
                }
                if (this.b - this.e >= var7_11) {
                    var8_8 = var7_11;
                } else {
                    var9_9 = this.b;
                    var10_10 = this.e;
                    var8_8 = var9_9 - var10_10;
                }
                System.arraycopy((Object)var5_5, (int)this.e, (Object)var1, (int)var2_3, (int)var8_8);
                this.e = var8_8 + this.e;
            }
            if ((var7_11 -= var8_8) == 0) ** continue;
            if (var6_6.available() == 0) {
                return var3_2 -= var7_11;
            }
            var2_3 += var8_8;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void reset() {
        bhb bhb2 = this;
        synchronized (bhb2) {
            if (this.a == null) {
                throw new IOException("Stream is closed");
            }
            if (-1 == this.d) {
                int n = this.e;
                int n2 = this.c;
                throw new bhc(new StringBuilder(66).append("Mark has been invalidated, pos: ").append(n).append(" markLimit: ").append(n2).toString());
            }
            this.e = this.d;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long skip(long l) {
        void var10_2 = this;
        synchronized (var10_2) {
            byte[] arrby = this.a;
            InputStream inputStream = this.in;
            if (arrby == null) {
                throw bhb.c();
            }
            if (l < 1) {
                return 0;
            }
            if (inputStream == null) {
                throw bhb.c();
            }
            if ((long)(this.b - this.e) >= l) {
                this.e = (int)(l + (long)this.e);
            } else {
                long l2 = this.b - this.e;
                this.e = this.b;
                if (this.d != -1 && l <= (long)this.c) {
                    if (super.a(inputStream, arrby) == -1) {
                        return l2;
                    }
                    if ((long)(this.b - this.e) >= l - l2) {
                        this.e = (int)((long)this.e + (l - l2));
                    } else {
                        l = l2 + (long)this.b - (long)this.e;
                        this.e = this.b;
                    }
                } else {
                    long l3 = inputStream.skip(l - l2);
                    return l2 + l3;
                }
            }
            return l;
        }
    }
}

