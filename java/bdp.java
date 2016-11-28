/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class bdp
implements bdm {
    bdp() {
    }

    @Override
    public final Class a() {
        return InputStream.class;
    }

    @Override
    public final /* synthetic */ Object a(String string) {
        if (!string.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int n = string.indexOf(44);
        if (n == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (!string.substring(0, n).endsWith(";base64")) {
            throw new IllegalArgumentException("Not a base64 image data URL.");
        }
        return new ByteArrayInputStream(Base64.decode((String)string.substring(n + 1), (int)0));
    }

    @Override
    public final /* synthetic */ void a(Object object) {
        ((InputStream)object).close();
    }
}

