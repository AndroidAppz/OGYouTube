/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.opengl.GLES20
 *  java.lang.Object
 *  java.lang.String
 */
import android.opengl.GLES20;

public final class asm {
    String a;
    public int b;
    int c;
    int d;

    public asm(int n, int n2) {
        int[] arrn = new int[1];
        GLES20.glGetProgramiv((int)n, (int)35719, (int[])arrn, (int)0);
        int[] arrn2 = new int[1];
        int[] arrn3 = new int[1];
        byte[] arrby = new byte[arrn[0]];
        int[] arrn4 = new int[1];
        GLES20.glGetActiveUniform((int)n, (int)n2, (int)arrn[0], (int[])arrn4, (int)0, (int[])arrn3, (int)0, (int[])arrn2, (int)0, (byte[])arrby, (int)0);
        this.a = new String(arrby, 0, asl.a(arrby));
        this.b = GLES20.glGetUniformLocation((int)n, (String)this.a);
        this.c = arrn2[0];
        this.d = arrn3[0];
        asa.a("Initializing uniform");
    }
}

