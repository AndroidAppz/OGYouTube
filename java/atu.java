/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
import android.os.SystemClock;

public final class atu
extends arg {
    private long mLastTime = 0;
    private int mPeriod = 3;
    private int mPeriodFrameCount = 0;
    private int mTotalFrameCount = 0;

    public atu(asr asr2, String string) {
        super(asr2, string);
    }

    @Override
    public final asw getSignature() {
        arx arx2 = arx.a(att.class);
        return new asw().a("frame", 2, arx.a()).b("throughput", 2, arx2).b("frame", 2, arx.a()).a("period", 1, arx.a(Integer.TYPE)).a();
    }

    @Override
    public final void onInputPortOpen(aso aso2) {
        if (aso2.b.equals((Object)"period")) {
            aso2.a("mPeriod");
            aso2.h = true;
            return;
        }
        aso2.a(this.getConnectedOutputPort("frame"));
    }

    @Override
    protected final void onOpen() {
        this.mTotalFrameCount = 0;
        this.mPeriodFrameCount = 0;
        this.mLastTime = 0;
    }

    @Override
    protected final void onProcess() {
        atu atu2 = this;
        synchronized (atu2) {
            long l;
            ark ark2 = this.getConnectedInputPort("frame").a();
            this.mTotalFrameCount = 1 + this.mTotalFrameCount;
            this.mPeriodFrameCount = 1 + this.mPeriodFrameCount;
            if (this.mLastTime == 0) {
                this.mLastTime = SystemClock.elapsedRealtime();
            }
            if ((l = SystemClock.elapsedRealtime()) - this.mLastTime >= (long)(1000 * this.mPeriod)) {
                asu asu2 = this.getConnectedOutputPort("throughput");
                att att2 = new att(this.mTotalFrameCount, this.mPeriodFrameCount, l - this.mLastTime, ark2.a());
                ary ary2 = asu2.a((int[])null).b();
                ary2.a(att2);
                asu2.a(ary2);
                this.mLastTime = l;
                this.mPeriodFrameCount = 0;
            }
            this.getConnectedOutputPort("frame").a(ark2);
            return;
        }
    }
}

