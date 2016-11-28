/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.security.MessageDigest
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class bhj
implements axr {
    private final ByteBuffer a = ByteBuffer.allocate((int)4);

    bhj() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void a(byte[] arrby, Object object, MessageDigest messageDigest) {
        Integer n = (Integer)object;
        if (n != null) {
            ByteBuffer byteBuffer;
            messageDigest.update(arrby);
            ByteBuffer byteBuffer2 = byteBuffer = this.a;
            synchronized (byteBuffer2) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(n.intValue()).array());
                return;
            }
        }
    }
}

