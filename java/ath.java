/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
public final class ath
extends arg {
    private ark mFrame = null;
    private arx mType = arx.a();

    public ath(asr asr2, String string) {
        super(asr2, string);
    }

    @Override
    protected final boolean canSchedule() {
        if (super.canSchedule() && this.mFrame == null) {
            return true;
        }
        return false;
    }

    @Override
    public final asw getSignature() {
        asw asw2 = new asw().a("frame", 2, this.mType);
        asw2.c = false;
        return asw2;
    }

    @Override
    protected final void onProcess() {
        ark ark2 = this.getConnectedInputPort("frame").a();
        if (this.mFrame != null) {
            this.mFrame.d();
        }
        this.mFrame = ark2.e();
    }

    public final ark pullFrame() {
        if (this.mFrame != null) {
            ark ark2 = this.mFrame;
            this.mFrame = null;
            return ark2;
        }
        return null;
    }
}

