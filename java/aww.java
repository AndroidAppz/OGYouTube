/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 */
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

final class aww {
    static final Charset a = Charset.forName((String)"US-ASCII");

    static {
        Charset.forName((String)"UTF-8");
    }

    static void a(Closeable closeable) {
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException var2_1) {
            throw var2_1;
        }
        catch (Exception var1_2) {
            return;
        }
    }

    static void a(File file) {
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            String string = String.valueOf((Object)file);
            throw new IOException(new StringBuilder(26 + String.valueOf((Object)string).length()).append("not a readable directory: ").append(string).toString());
        }
        for (File file2 : arrfile) {
            if (file2.isDirectory()) {
                aww.a(file2);
            }
            if (file2.delete()) continue;
            String string = String.valueOf((Object)file2);
            throw new IOException(new StringBuilder(23 + String.valueOf((Object)string).length()).append("failed to delete file: ").append(string).toString());
        }
    }
}

