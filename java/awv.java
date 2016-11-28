/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

final class awv
extends ByteArrayOutputStream {
    private /* synthetic */ awu a;

    awv(awu awu2, int n) {
        this.a = awu2;
        super(n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        int n = this.count > 0 && this.buf[-1 + this.count] == 13 ? -1 + this.count : this.count;
        try {
            return new String(this.buf, 0, n, this.a.a.name());
        }
        catch (UnsupportedEncodingException var3_3) {
            throw new AssertionError((Object)var3_3);
        }
    }
}

