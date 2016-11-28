/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.security.MessageDigest
 *  pg
 */
import java.security.MessageDigest;

public final class bcl {
    private final blj a = new blj(1000);
    private final pg b = blp.a(10, (blt)new bcm());

    private final String b(axo axo2) {
        bcn bcn2 = (bcn)this.b.a();
        try {
            axo2.a(bcn2.a);
            String string = bln.a(bcn2.a.digest());
            return string;
        }
        finally {
            this.b.a((Object)bcn2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final String a(axo axo2) {
        blj blj2;
        blj blj3;
        blj blj4 = blj2 = this.a;
        // MONITORENTER : blj4
        String string = (String)this.a.b(axo2);
        // MONITOREXIT : blj4
        if (string == null) {
            string = super.b(axo2);
        }
        blj blj5 = blj3 = this.a;
        // MONITORENTER : blj5
        this.a.b(axo2, string);
        // MONITOREXIT : blj5
        return string;
    }
}

