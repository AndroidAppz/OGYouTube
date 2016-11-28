/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
public final class atf
extends arg {
    private boolean mSynchronized = true;

    public atf(asr asr2, String string) {
        super(asr2, string);
    }

    private final void updateSynchronization() {
        if (this.mSynchronized) {
            asu[] arrasu = this.getConnectedOutputPorts();
            int n = arrasu.length;
            for (int i = 0; i < n; ++i) {
                arrasu[i].f = true;
            }
        } else {
            asu[] arrasu = this.getConnectedOutputPorts();
            int n = arrasu.length;
            for (int i = 0; i < n; ++i) {
                arrasu[i].f = false;
            }
        }
    }

    @Override
    public final asw getSignature() {
        asw asw2 = new asw().a("input", 2, arx.a()).a("synchronized", 1, arx.a(Boolean.TYPE));
        asw2.c = false;
        return asw2;
    }

    @Override
    public final void onInputPortOpen(aso aso2) {
        if (aso2.b.equals((Object)"input")) {
            asu[] arrasu = this.getConnectedOutputPorts();
            int n = arrasu.length;
            for (int i = 0; i < n; ++i) {
                aso2.a(arrasu[i]);
            }
        } else if (aso2.b.equals((Object)"synchronized")) {
            aso2.a("mSynchronized");
            aso2.h = true;
        }
    }

    @Override
    protected final void onOpen() {
        this.updateSynchronization();
    }

    @Override
    protected final void onProcess() {
        ark ark2 = this.getConnectedInputPort("input").a();
        for (asu asu2 : this.getConnectedOutputPorts()) {
            if (!asu2.a()) continue;
            asu2.a(ark2);
        }
    }
}

