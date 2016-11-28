/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  androidx.media.filterfw.imageutils.SobelOperator
 *  java.lang.String
 */
import androidx.media.filterfw.imageutils.SobelOperator;

public final class ato
extends arg {
    private SobelOperator mSobelOperator;

    public ato(asr asr2, String string) {
        super(asr2, string);
    }

    @Override
    public final asw getSignature() {
        arx arx2 = arx.a(2);
        arx arx3 = arx.a(16);
        return new asw().a("image", 2, arx2).b("gradientX", 1, arx3).b("gradientY", 1, arx3).b("direction", 1, arx3).b("magnitude", 1, arx3).a();
    }

    @Override
    protected final void onPrepare() {
        this.mSobelOperator = new SobelOperator(this.isOpenGLSupported());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void onProcess() {
        asu asu2 = this.getConnectedOutputPort("gradientX");
        asu asu3 = this.getConnectedOutputPort("gradientY");
        asu asu4 = this.getConnectedOutputPort("magnitude");
        asu asu5 = this.getConnectedOutputPort("direction");
        arn arn2 = this.getConnectedInputPort("image").a().c();
        int[] arrn = arn2.g();
        arn arn3 = asu4 != null ? asu4.a(arrn).c() : null;
        arn arn4 = asu5 != null ? asu5.a(arrn).c() : null;
        arn arn5 = asu2 != null ? asu2.a(arrn).c() : null;
        arn arn6 = null;
        if (asu3 != null) {
            arn6 = asu3.a(arrn).c();
        }
        this.mSobelOperator.a(arn2, arn5, arn6, arn3, arn4);
        if (arn3 != null) {
            asu4.a(arn3);
        }
        if (arn4 != null) {
            asu5.a(arn4);
        }
        if (asu2 != null) {
            asu2.a(arn5);
        }
        if (asu3 != null) {
            asu3.a(arn6);
        }
    }
}

