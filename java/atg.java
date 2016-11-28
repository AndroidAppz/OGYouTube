/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.RuntimeException
 *  java.lang.String
 */
public final class atg
extends arg {
    private ark mFrame = null;

    public atg(asr asr2, String string) {
        super(asr2, string);
    }

    @Override
    protected final boolean canSchedule() {
        if (super.canSchedule() && this.mFrame != null) {
            return true;
        }
        return false;
    }

    @Override
    public final asw getSignature() {
        asw asw2 = new asw().b("frame", 2, arx.a());
        asw2.c = false;
        return asw2;
    }

    @Override
    protected final void onProcess() {
        if (this.mFrame != null) {
            this.getConnectedOutputPort("frame").a(this.mFrame);
            this.mFrame.d();
            this.mFrame = null;
        }
    }

    @Override
    protected final void onTearDown() {
        if (this.mFrame != null) {
            this.mFrame.d();
            this.mFrame = null;
        }
    }

    public final void pushFrame(ark ark2) {
        if (this.mFrame != null) {
            this.mFrame.d();
        }
        if (ark2 == null) {
            throw new RuntimeException("Attempting to assign null-frame!");
        }
        this.mFrame = ark2.e();
    }
}

