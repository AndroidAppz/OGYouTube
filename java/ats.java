/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  androidx.media.filterfw.ColorSpace
 *  java.lang.String
 *  java.nio.ByteBuffer
 */
import androidx.media.filterfw.ColorSpace;
import java.nio.ByteBuffer;

public final class ats
extends arg {
    private asl mShader;

    public ats(asr asr2, String string) {
        super(asr2, string);
    }

    @Override
    public final asw getSignature() {
        arx arx2 = arx.a(2);
        arx arx3 = arx.a(16);
        return new asw().a("image", 2, arx2).b("image", 2, arx3).a();
    }

    @Override
    protected final void onPrepare() {
        if (this.isOpenGLSupported()) {
            this.mShader = new asl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float y = dot(color, vec4(0.299, 0.587, 0.114, 0));\n  gl_FragColor = vec4(y, y, y, color.a);\n}\n");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void onProcess() {
        asu asu2 = this.getConnectedOutputPort("image");
        arn arn2 = this.getConnectedInputPort("image").a().c();
        arn arn3 = asu2.a(arn2.g()).c();
        if (this.isOpenGLSupported()) {
            this.mShader.a(arn2, arn3);
        } else {
            ByteBuffer byteBuffer = arn3.a(2);
            ColorSpace.a((ByteBuffer)arn2.a(1), (ByteBuffer)byteBuffer, (int)arn2.h(), (int)arn2.i());
            arn2.f();
            arn3.f();
        }
        asu2.a(arn3);
    }
}

