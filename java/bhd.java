/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 */
import java.io.InputStream;

public final class bhd
implements axt {
    private final bgs a;
    private final baw b;

    public bhd(bgs bgs2, baw baw2) {
        this.a = bgs2;
        this.b = baw2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final bap a(InputStream inputStream, int n, int n2, axs axs2) {
        bhb bhb2;
        boolean bl2;
        if (inputStream instanceof bhb) {
            bhb2 = (bhb)inputStream;
            bl2 = false;
        } else {
            bhb bhb3 = new bhb(inputStream, this.b);
            bl2 = true;
            bhb2 = bhb3;
        }
        blh blh2 = blh.a((InputStream)bhb2);
        blk blk2 = new blk(blh2);
        bhe bhe2 = new bhe(bhb2, blh2);
        try {
            bap bap2 = this.a.a((InputStream)blk2, n, n2, axs2, bhe2);
            return bap2;
        }
        finally {
            blh2.a();
            if (bl2) {
                bhb2.b();
            }
        }
    }

    @Override
    public final /* synthetic */ boolean a(Object object, axs axs2) {
        return bgs.a();
    }
}

