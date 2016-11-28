/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public final class atx
extends arg {
    public atx(asr asr2, String string) {
        super(asr2, string);
    }

    @Override
    public final asw getSignature() {
        return new asw().a("object", 2, arx.b()).b("string", 2, arx.a(String.class)).a();
    }

    @Override
    protected final void onProcess() {
        String string = this.getConnectedInputPort("object").a().b().h().toString();
        asu asu2 = this.getConnectedOutputPort("string");
        ary ary2 = asu2.a((int[])null).b();
        ary2.a(string);
        asu2.a(ary2);
    }
}

