/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public final class atm
extends arg {
    private asu mOutputPort = null;
    private Object mValue = null;

    public atm(asr asr2, String string) {
        super(asr2, string);
    }

    @Override
    public final asw getSignature() {
        return new asw().b("value", 2, arx.b()).a();
    }

    @Override
    protected final void onPrepare() {
        this.mOutputPort = this.getConnectedOutputPort("value");
    }

    @Override
    protected final void onProcess() {
        atm atm2 = this;
        synchronized (atm2) {
            ary ary2 = this.mOutputPort.a((int[])null).b();
            ary2.a(this.mValue);
            this.mOutputPort.a(ary2);
            return;
        }
    }

    public final void setValue(Object object) {
        void var3_2 = this;
        synchronized (var3_2) {
            this.mValue = object;
            return;
        }
    }
}

