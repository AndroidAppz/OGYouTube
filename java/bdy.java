/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URL
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.util.Map
 */
import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Map;

public class bdy
implements axo {
    public URL b;
    private final bdz c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte[] g;

    public bdy(String string) {
        super(string, bdz.a);
    }

    public bdy(String string, bdz bdz2) {
        this.d = null;
        this.e = blm.a(string);
        this.c = (bdz)blm.a(bdz2, "Argument must not be null");
    }

    public bdy(URL uRL) {
        super(uRL, bdz.a);
    }

    private bdy(URL uRL, bdz bdz2) {
        this.d = (URL)blm.a((Object)uRL, "Argument must not be null");
        this.e = null;
        this.c = (bdz)blm.a(bdz2, "Argument must not be null");
    }

    private final String c() {
        if (this.e != null) {
            return this.e;
        }
        return this.d.toString();
    }

    public final String a() {
        if (TextUtils.isEmpty((CharSequence)this.f)) {
            String string = this.e;
            if (TextUtils.isEmpty((CharSequence)string)) {
                string = this.d.toString();
            }
            this.f = Uri.encode((String)string, (String)"@#&=*+-_.,:!?()/~'%");
        }
        return this.f;
    }

    @Override
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = super.c().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final Map b() {
        return this.c.a();
    }

    @Override
    public boolean equals(Object object) {
        boolean bl2 = object instanceof bdy;
        boolean bl3 = false;
        if (bl2) {
            bdy bdy2 = (bdy)object;
            boolean bl4 = super.c().equals((Object)bdy2.c());
            bl3 = false;
            if (bl4) {
                boolean bl5 = this.c.equals((Object)bdy2.c);
                bl3 = false;
                if (bl5) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    @Override
    public int hashCode() {
        return 31 * this.c().hashCode() + this.c.hashCode();
    }

    public String toString() {
        return this.c();
    }
}

