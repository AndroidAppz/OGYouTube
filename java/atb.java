/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
final class atb
implements asq {
    private /* synthetic */ ata a;

    atb(ata ata2) {
        this.a = ata2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(aso aso2, ark ark2) {
        String string = (String)ark2.b().h();
        if (string.equals((Object)ata.access$000(this.a))) return;
        ata.access$002(this.a, string);
        if (string.equals((Object)"stretch")) {
            this.a.mScaleMode = 1;
            return;
        }
        if (string.equals((Object)"fit")) {
            this.a.mScaleMode = 2;
            return;
        }
        if (!string.equals((Object)"fill")) throw new RuntimeException(new StringBuilder(22 + String.valueOf((Object)string).length()).append("Unknown scale-mode '").append(string).append("'!").toString());
        this.a.mScaleMode = 3;
    }
}

