/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.opengl.GLES20
 *  android.os.Looper
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 */
import android.opengl.GLES20;
import android.os.Looper;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class asa {
    public static int a() {
        int[] arrn = new int[1];
        GLES20.glGenTextures((int)1, (int[])arrn, (int)0);
        asa.a("glGenTextures");
        return arrn[0];
    }

    public static void a(int n, int n2, ByteBuffer byteBuffer, int n3, int n4) {
        GLES20.glBindTexture((int)n2, (int)n);
        GLES20.glTexImage2D((int)n2, (int)0, (int)6408, (int)n3, (int)n4, (int)0, (int)6408, (int)5121, (Buffer)byteBuffer);
        asa.a("glTexImage2D");
        asa.b();
    }

    public static void a(asv asv2, ByteBuffer byteBuffer, int n, int n2) {
        atz.a("readTarget");
        asv2.c();
        GLES20.glReadPixels((int)0, (int)0, (int)n, (int)n2, (int)6408, (int)5121, (Buffer)byteBuffer);
        asa.a("glReadPixels");
        atz.a();
    }

    public static void a(String string) {
        int n = GLES20.glGetError();
        if (n != 0) {
            String string2 = String.valueOf((Object)Integer.toHexString((int)n));
            throw new RuntimeException(new StringBuilder(30 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append("GL Operation '").append(string).append("' caused error ").append(string2).append("!").toString());
        }
    }

    public static void b() {
        GLES20.glTexParameteri((int)3553, (int)10240, (int)9729);
        GLES20.glTexParameteri((int)3553, (int)10241, (int)9729);
        GLES20.glTexParameteri((int)3553, (int)10242, (int)33071);
        GLES20.glTexParameteri((int)3553, (int)10243, (int)33071);
        asa.a("glTexParameteri");
    }

    static void b(String string) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new RuntimeException(new StringBuilder(51 + String.valueOf((Object)string).length()).append("Attempting to perform GL operation '").append(string).append("' on UI thread!").toString());
        }
    }
}

