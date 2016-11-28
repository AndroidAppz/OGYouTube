/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public final class bdl
implements bel {
    private final bdm a;

    public bdl(bdm bdm2) {
        this.a = bdm2;
    }

    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        String string = (String)object;
        return new bem(new blc(string), new bdn(string, this.a));
    }

    @Override
    public final /* synthetic */ boolean a(Object object) {
        return ((String)object).startsWith("data:image");
    }
}

