/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class bdh
implements axm {
    private static boolean a(ByteBuffer byteBuffer, File file) {
        try {
            bld.a(byteBuffer, file);
            return true;
        }
        catch (IOException var2_2) {
            return false;
        }
    }
}

