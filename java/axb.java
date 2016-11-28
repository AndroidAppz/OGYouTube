/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.Buffer
 *  java.nio.BufferUnderflowException
 *  java.nio.ByteBuffer
 *  java.util.List
 */
import android.util.Log;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.List;

public final class axb {
    public final byte[] a = new byte[256];
    public ByteBuffer b;
    public axa c;
    public int d = 0;

    private final int[] a(int n) {
        int n2 = 0;
        int n3 = n * 3;
        Object object = null;
        byte[] arrby = new byte[n3];
        this.b.get(arrby);
        object = new int[256];
        int n4 = 0;
        while (n4 < n) {
            int n5 = n2 + 1;
            int n6 = 255 & arrby[n2];
            int n7 = n5 + 1;
            int n8 = 255 & arrby[n5];
            n2 = n7 + 1;
            int n9 = 255 & arrby[n7];
            int n10 = n4 + 1;
            try {
                object[n4] = n9 | (-16777216 | n6 << 16 | n8 << 8);
                n4 = n10;
                continue;
            }
            catch (BufferUnderflowException var6_13) {
                this.c.b = 1;
                break;
            }
        }
        return object;
    }

    private final void d() {
        do {
            this.f();
        } while (this.d > 0 && !this.c());
    }

    private final void e() {
        int n;
        do {
            n = this.g();
            this.b.position(n + this.b.position());
        } while (n > 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int f() {
        int n2;
        int n = this.d = this.g();
        if (n <= 0) return n2;
        {
            int n3 = 0;
            try {
                for (n2 = 0; n2 < this.d; n2 += n3) {
                    n3 = this.d - n2;
                    this.b.get(this.a, n2, n3);
                }
                return n2;
            }
            catch (Exception exception) {
                if (Log.isLoggable((String)"GifHeaderParser", (int)3)) {
                    int n4 = this.d;
                    new StringBuilder(76).append("Error Reading Block n: ").append(n2).append(" count: ").append(n3).append(" blockSize: ").append(n4);
                }
                this.c.b = 1;
            }
        }
        return n2;
    }

    private final int g() {
        byte by2;
        try {
            by2 = this.b.get();
        }
        catch (Exception var1_2) {
            this.c.b = 1;
            return 0;
        }
        return by2 & 255;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a() {
        boolean bl2 = false;
        block11 : while (!bl2) {
            if (this.c()) return;
            if (this.c.c > Integer.MAX_VALUE) break;
            switch (this.g()) {
                default: {
                    this.c.b = 1;
                    continue block11;
                }
                case 44: {
                    if (this.c.d == null) {
                        this.c.d = new awz();
                    }
                    this.c.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int n = this.g();
                    boolean bl3 = (n & 128) != 0;
                    int n2 = (int)Math.pow((double)2.0, (double)(1 + (n & 7)));
                    awz awz2 = this.c.d;
                    boolean bl4 = (n & 64) != 0;
                    awz2.e = bl4;
                    this.c.d.k = bl3 ? this.a(n2) : (Object)null;
                    this.c.d.j = this.b.position();
                    this.g();
                    this.e();
                    if (this.c()) continue block11;
                    axa axa2 = this.c;
                    axa2.c = 1 + axa2.c;
                    this.c.e.add((Object)this.c.d);
                    continue block11;
                }
                case 33: {
                    switch (this.g()) {
                        default: {
                            this.e();
                            continue block11;
                        }
                        case 249: {
                            this.c.d = new awz();
                            this.g();
                            int n = this.g();
                            this.c.d.g = (n & 28) >> 2;
                            if (this.c.d.g == 0) {
                                this.c.d.g = 1;
                            }
                            awz awz3 = this.c.d;
                            boolean bl5 = (n & 1) != 0;
                            awz3.f = bl5;
                            int n3 = this.b.getShort();
                            if (n3 < 2) {
                                n3 = 10;
                            }
                            this.c.d.i = n3 * 10;
                            this.c.d.h = this.g();
                            this.g();
                            continue block11;
                        }
                        case 255: {
                            this.f();
                            String string = "";
                            for (int i = 0; i < 11; ++i) {
                                String string2 = String.valueOf((Object)string);
                                char c2 = this.a[i];
                                string = new StringBuilder(1 + String.valueOf((Object)string2).length()).append(string2).append(c2).toString();
                            }
                            if (string.equals((Object)"NETSCAPE2.0")) {
                                this.d();
                                continue block11;
                            }
                            this.e();
                            continue block11;
                        }
                        case 254: {
                            this.e();
                            continue block11;
                        }
                        case 1: 
                    }
                    this.e();
                    continue block11;
                }
                case 59: 
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b() {
        int n = 1;
        String string = "";
        for (int i = 0; i < 6; ++i) {
            String string2 = String.valueOf((Object)string);
            char c2 = (char)this.g();
            string = new StringBuilder(1 + String.valueOf((Object)string2).length()).append(string2).append(c2).toString();
        }
        if (!string.startsWith("GIF")) {
            this.c.b = n;
            return;
        } else {
            this.c.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int n2 = this.g();
            axa axa2 = this.c;
            if ((n2 & 128) == 0) {
                n = 0;
            }
            axa2.h = n;
            this.c.i = 2 << (n2 & 7);
            this.c.j = this.g();
            this.g();
            if (!this.c.h || this.c()) return;
            {
                this.c.a = this.a(this.c.i);
                this.c.k = this.c.a[this.c.j];
                return;
            }
        }
    }

    public final boolean c() {
        if (this.c.b != 0) {
            return true;
        }
        return false;
    }
}

