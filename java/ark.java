/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
import java.util.Arrays;

public class ark {
    public aqy a;
    boolean b = false;

    ark(aqy aqy2) {
        this.a = aqy2;
    }

    ark(arx arx2, int[] arrn, aro aro2) {
        this.a = new aqy(arx2, arrn, aro2);
    }

    public static ark a(arx arx2, int[] arrn) {
        aro aro2 = aro.a();
        if (aro2 == null) {
            throw new IllegalStateException("Attempting to create new Frame outside of FrameManager context!");
        }
        return new ark(arx2, arrn, aro2);
    }

    public final int a() {
        aqy aqy2 = this.a;
        int n = 1;
        if (aqy2.b != null) {
            int[] arrn = aqy2.b;
            int n2 = arrn.length;
            for (int i = 0; i < n2; ++i) {
                int n3 = n * arrn[i];
                n = n3;
            }
        }
        return n;
    }

    public final void a(long l) {
        this.a.c = l;
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(int[] arrn) {
        int[] arrn2 = this.a.b;
        int n = arrn2 == null ? 0 : arrn2.length;
        int n2 = 0;
        if (arrn != null) {
            n2 = arrn.length;
        }
        if (n != n2) {
            throw new IllegalArgumentException(new StringBuilder(77).append("Cannot resize ").append(n).append("-dimensional Frame to ").append(n2).append("-dimensional Frame!").toString());
        }
        if (arrn != null && !Arrays.equals((int[])arrn2, (int[])arrn)) {
            this.a.a(arrn);
        }
    }

    public final ary b() {
        aqy aqy2 = this.a;
        ary.a(aqy2.a);
        return new ary(aqy2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final arn c() {
        aqy aqy2 = this.a;
        arx arx2 = aqy2.a;
        if (arx2.c() == 0) {
            String string = String.valueOf((Object)arx2);
            throw new RuntimeException(new StringBuilder(55 + String.valueOf((Object)string).length()).append("Cannot access Frame of type ").append(string).append(" as a FrameBuffer instance!").toString());
        }
        int[] arrn = aqy2.b;
        if (arrn == null || arrn.length == 0) {
            throw new RuntimeException("Cannot access Frame with no dimensions as a FrameBuffer instance!");
        }
        int[] arrn2 = aqy2.b;
        int n = arrn2 != null ? arrn2.length : 0;
        if (n != 2) {
            throw new RuntimeException(new StringBuilder(72).append("Cannot access ").append(n).append("-dimensional Frame as a FrameBuffer2D instance!").toString());
        }
        return new arn(aqy2);
    }

    public final ark d() {
        aqy aqy2 = this.a;
        if (aqy2.d <= 0) {
            throw new RuntimeException("DOUBLE-RELEASE");
        }
        aqy2.d = -1 + aqy2.d;
        if (aqy2.d == 0) {
            aqy2.b();
            aqy2 = null;
        }
        this.a = aqy2;
        if (this.a != null) {
            return this;
        }
        return null;
    }

    public final ark e() {
        aqy aqy2 = this.a;
        if (aqy2.d <= 0) {
            throw new RuntimeException("RETAINING RELEASED");
        }
        aqy2.d = 1 + aqy2.d;
        this.a = aqy2;
        return this;
    }

    public boolean equals(Object object) {
        if (object instanceof ark && ((ark)object).a == this.a) {
            return true;
        }
        return false;
    }

    public final void f() {
        if (!this.a.a()) {
            throw new RuntimeException("Attempting to unlock frame that is not locked!");
        }
    }

    public int[] g() {
        int[] arrn = this.a.b;
        if (arrn != null) {
            return Arrays.copyOf((int[])arrn, (int)arrn.length);
        }
        return null;
    }

    public String toString() {
        String string = String.valueOf((Object)this.a.a.toString());
        String string2 = String.valueOf((Object)this.a);
        return new StringBuilder(9 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append("Frame[").append(string).append("]: ").append(string2).toString();
    }
}

