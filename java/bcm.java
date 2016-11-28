/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class bcm
implements blt {
    bcm() {
    }

    private static bcn b() {
        try {
            bcn bcn2 = new bcn(MessageDigest.getInstance((String)"SHA-256"));
            return bcn2;
        }
        catch (NoSuchAlgorithmException var1_1) {
            throw new RuntimeException((Throwable)var1_1);
        }
    }

    @Override
    public final /* synthetic */ Object a() {
        return bcm.b();
    }
}

