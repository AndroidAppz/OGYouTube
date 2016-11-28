/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 */
import java.io.File;

public final class bdq
implements bel {
    private final bdv a;

    public bdq(bdv bdv2) {
        this.a = bdv2;
    }

    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        File file = (File)object;
        return new bem(new blc((Object)file), new bdu(file, this.a));
    }
}

