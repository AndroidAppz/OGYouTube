/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.opengl.GLES20
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.Buffer
 *  java.nio.FloatBuffer
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 */
import android.graphics.PointF;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class asl {
    boolean a = false;
    float[] b = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    public boolean c = false;
    private int d = 0;
    private int e = 770;
    private int f = 771;
    private int g = 5;
    private int h = 4;
    private int i = 33984;
    private int j = 16384;
    private float[] k = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private float[] l = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private HashMap m;
    private HashMap n = new HashMap();

    public asl(String string) {
        this.d = asl.a("attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n", string);
        super.d();
    }

    public asl(String string, String string2) {
        this.d = asl.a(string, string2);
        super.d();
    }

    private static int a(int n, String string) {
        int n2 = GLES20.glCreateShader((int)n);
        if (n2 != 0) {
            GLES20.glShaderSource((int)n2, (String)string);
            GLES20.glCompileShader((int)n2);
            int[] arrn = new int[1];
            GLES20.glGetShaderiv((int)n2, (int)35713, (int[])arrn, (int)0);
            if (arrn[0] == 0) {
                String string2 = GLES20.glGetShaderInfoLog((int)n2);
                GLES20.glDeleteShader((int)n2);
                throw new RuntimeException(new StringBuilder(37 + String.valueOf((Object)string2).length()).append("Could not compile shader ").append(n).append(":").append(string2).toString());
            }
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(String string, String string2) {
        int n = asl.a(35633, string);
        if (n == 0) {
            throw new RuntimeException("Could not create shader-program as vertex shader could not be compiled!");
        }
        int n2 = asl.a(35632, string2);
        if (n2 == 0) {
            throw new RuntimeException("Could not create shader-program as fragment shader could not be compiled!");
        }
        int n3 = GLES20.glCreateProgram();
        if (n3 != 0) {
            GLES20.glAttachShader((int)n3, (int)n);
            asa.a("glAttachShader");
            GLES20.glAttachShader((int)n3, (int)n2);
            asa.a("glAttachShader");
            GLES20.glLinkProgram((int)n3);
            int[] arrn = new int[1];
            GLES20.glGetProgramiv((int)n3, (int)35714, (int[])arrn, (int)0);
            if (arrn[0] != 1) {
                String string3;
                String string4 = GLES20.glGetProgramInfoLog((int)n3);
                GLES20.glDeleteProgram((int)n3);
                String string5 = String.valueOf((Object)string4);
                if (string5.length() != 0) {
                    string3 = "Could not link program: ".concat(string5);
                    do {
                        throw new RuntimeException(string3);
                        break;
                    } while (true);
                }
                string3 = new String("Could not link program: ");
                throw new RuntimeException(string3);
            }
        }
        GLES20.glDeleteShader((int)n);
        GLES20.glDeleteShader((int)n2);
        return n3;
    }

    static int a(byte[] arrby) {
        for (int i = 0; i < arrby.length; ++i) {
            if (arrby[i] != 0) continue;
            return i;
        }
        return arrby.length;
    }

    public static asl a() {
        return new asl("precision lowp float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
    }

    private static String a(int n) {
        return new StringBuilder(23).append("tex_sampler_").append(n).toString();
    }

    private static void a(asm asm2, int n, int n2) {
        if (n % n2 != 0) {
            String string = String.valueOf((Object)asm2.a);
            throw new RuntimeException(new StringBuilder(111 + String.valueOf((Object)string).length()).append("Size mismatch: Attempting to assign values of size ").append(n).append(" to uniform '").append(string).append("' (must be multiple of ").append(n2).append(")!").toString());
        }
        if (asm2.d != n / n2) {
            String string = String.valueOf((Object)asm2.a);
            throw new RuntimeException(new StringBuilder(62 + String.valueOf((Object)string).length()).append("Size mismatch: Cannot assign ").append(n).append(" values to uniform '").append(string).append("'!").toString());
        }
    }

    private final void a(asz[] arrasz) {
        for (int i = 0; i < arrasz.length; ++i) {
            GLES20.glActiveTexture((int)(i + this.i));
            asz asz2 = arrasz[i];
            GLES20.glBindTexture((int)asz2.b, (int)asz2.a);
            asa.a("glBindTexture");
            int n = GLES20.glGetUniformLocation((int)this.d, (String)asl.a(i));
            if (n >= 0) {
                GLES20.glUniform1i((int)n, (int)i);
                asa.a(new StringBuilder(33).append("Binding input texture ").append(i).toString());
                continue;
            }
            int n2 = arrasz.length;
            String string = String.valueOf((Object)asl.a(i));
            throw new RuntimeException(new StringBuilder(87 + String.valueOf((Object)string).length()).append("Shader does not seem to support ").append(n2).append(" number of input textures! Missing uniform ").append(string).append("!").toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(asz[] arrasz, asv asv2, int n, int n2) {
        asa.a("Unknown Operation");
        if (this.d == 0) {
            throw new RuntimeException("Attempting to execute invalid shader-program!");
        }
        int n3 = arrasz.length;
        if (n3 > 35661) {
            throw new RuntimeException(new StringBuilder(106).append("Number of textures passed (").append(n3).append(") exceeds the maximum number of allowed texture units (35661").append(")!").toString());
        }
        asv2.c();
        GLES20.glViewport((int)0, (int)0, (int)n, (int)n2);
        asa.a("glViewport");
        this.b();
        asn asn2 = super.b("a_texcoord");
        if (this.k != null && asn2 != null) {
            asn2.a(this.k);
        }
        this.k = null;
        asn asn3 = super.b("a_position");
        if (this.l != null && asn3 != null) {
            asn3.a(this.l);
        }
        this.l = null;
        super.c();
        if (this.a) {
            GLES20.glClearColor((float)this.b[0], (float)this.b[1], (float)this.b[2], (float)this.b[3]);
            GLES20.glClear((int)this.j);
        }
        if (this.c) {
            GLES20.glEnable((int)3042);
            GLES20.glBlendFunc((int)this.e, (int)this.f);
        } else {
            GLES20.glDisable((int)3042);
        }
        asa.a("Set render variables");
        super.a(arrasz);
        atz.a("glDrawArrays");
        GLES20.glDrawArrays((int)this.g, (int)0, (int)this.h);
        asa.a("glDrawArrays");
        atz.a();
    }

    private final asn b(String string) {
        int n;
        asn asn2 = (asn)this.n.get((Object)string);
        if (asn2 == null && (n = GLES20.glGetAttribLocation((int)this.d, (String)string)) >= 0) {
            asn2 = new asn(string, n);
            this.n.put((Object)string, (Object)asn2);
        }
        return asn2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void c() {
        Iterator iterator = this.n.values().iterator();
        do {
            if (!iterator.hasNext()) {
                asa.a("Push Attributes");
                return;
            }
            asn asn2 = (asn)iterator.next();
            if (asn2.f != null) {
                GLES20.glBindBuffer((int)34962, (int)0);
                GLES20.glVertexAttribPointer((int)asn2.a, (int)asn2.d, (int)asn2.e, (boolean)false, (int)asn2.c, (Buffer)asn2.f);
            } else {
                GLES20.glBindBuffer((int)34962, (int)0);
                GLES20.glVertexAttribPointer((int)asn2.a, (int)asn2.d, (int)asn2.e, (boolean)false, (int)asn2.c, (int)0);
            }
            GLES20.glEnableVertexAttribArray((int)asn2.a);
            asa.a("Set vertex-attribute values");
        } while (true);
    }

    private final void d() {
        int[] arrn = new int[1];
        GLES20.glGetProgramiv((int)this.d, (int)35718, (int[])arrn, (int)0);
        if (arrn[0] > 0) {
            this.m = new HashMap(arrn[0]);
            for (int i = 0; i < arrn[0]; ++i) {
                asm asm2 = new asm(this.d, i);
                this.m.put((Object)asm2.a, (Object)asm2);
            }
        }
    }

    public final asm a(String string) {
        asm asm2 = (asm)this.m.get((Object)string);
        if (asm2 == null) {
            throw new IllegalArgumentException(new StringBuilder(19 + String.valueOf((Object)string).length()).append("Unknown uniform '").append(string).append("'!").toString());
        }
        return asm2;
    }

    public final void a(int n, int n2) {
        this.e = n;
        this.f = n2;
    }

    public final void a(arn arn2, arn arn3) {
        asz asz2 = arn2.j();
        asv asv2 = arn3.k();
        super.a(new asz[]{asz2}, asv2, arn3.h(), arn3.i());
        arn2.f();
        arn3.f();
    }

    public final void a(asz asz2, asv asv2, int n, int n2) {
        super.a(new asz[]{asz2}, asv2, n, n2);
    }

    public final void a(atc atc2) {
        float[] arrf = new float[]{atc2.a.x, atc2.a.y, atc2.b.x, atc2.b.y, atc2.c.x, atc2.c.y, atc2.d.x, atc2.d.y};
        this.a(arrf);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(String string, float[] arrf) {
        asm asm2 = this.a(string);
        this.b();
        int n = arrf.length;
        switch (asm2.c) {
            default: {
                throw new RuntimeException(new StringBuilder(70 + String.valueOf((Object)string).length()).append("Cannot assign float-array to incompatible uniform type for uniform '").append(string).append("'!").toString());
            }
            case 5126: {
                asl.a(asm2, n, 1);
                GLES20.glUniform1fv((int)asm2.b, (int)n, (float[])arrf, (int)0);
                break;
            }
            case 35664: {
                asl.a(asm2, n, 2);
                GLES20.glUniform2fv((int)asm2.b, (int)(n / 2), (float[])arrf, (int)0);
                break;
            }
            case 35665: {
                asl.a(asm2, n, 3);
                GLES20.glUniform3fv((int)asm2.b, (int)(n / 3), (float[])arrf, (int)0);
                break;
            }
            case 35666: {
                asl.a(asm2, n, 4);
                GLES20.glUniform4fv((int)asm2.b, (int)(n / 4), (float[])arrf, (int)0);
                break;
            }
            case 35674: {
                asl.a(asm2, n, 4);
                GLES20.glUniformMatrix2fv((int)asm2.b, (int)(n / 4), (boolean)false, (float[])arrf, (int)0);
                break;
            }
            case 35675: {
                asl.a(asm2, n, 9);
                GLES20.glUniformMatrix3fv((int)asm2.b, (int)(n / 9), (boolean)false, (float[])arrf, (int)0);
                break;
            }
            case 35676: {
                asl.a(asm2, n, 16);
                GLES20.glUniformMatrix4fv((int)asm2.b, (int)(n / 16), (boolean)false, (float[])arrf, (int)0);
            }
        }
        asa.a(new StringBuilder(20 + String.valueOf((Object)string).length()).append("Set uniform value (").append(string).append(")").toString());
    }

    public final void a(float[] arrf) {
        if (arrf.length != 8) {
            int n = arrf.length;
            throw new IllegalArgumentException(new StringBuilder(77).append("Expected 8 coordinates as source coordinates but got ").append(n).append(" coordinates!").toString());
        }
        this.k = Arrays.copyOf((float[])arrf, (int)8);
    }

    public final void a(arn[] arrarn, arn arn2) {
        int n = 0;
        asz[] arrasz = new asz[arrarn.length];
        for (int i = 0; i < arrarn.length; ++i) {
            arrasz[i] = arrarn[i].j();
        }
        super.a(arrasz, arn2.k(), arn2.h(), arn2.i());
        int n2 = arrarn.length;
        while (n < n2) {
            arrarn[n].f();
            ++n;
        }
        arn2.f();
    }

    public final void b() {
        GLES20.glUseProgram((int)this.d);
        asa.a("glUseProgram");
    }

    public final void b(float[] arrf) {
        if (arrf.length != 8) {
            int n = arrf.length;
            throw new IllegalArgumentException(new StringBuilder(77).append("Expected 8 coordinates as target coordinates but got ").append(n).append(" coordinates!").toString());
        }
        this.l = new float[8];
        for (int i = 0; i < 8; ++i) {
            this.l[i] = 2.0f * arrf[i] - 1.0f;
        }
    }

    protected final void finalize() {
        GLES20.glDeleteProgram((int)this.d);
    }
}

