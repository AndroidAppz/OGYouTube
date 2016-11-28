/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 */
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface axo {
    public static final Charset a = Charset.forName((String)"UTF-8");

    public void a(MessageDigest var1);

    public boolean equals(Object var1);

    public int hashCode();
}

