/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.SurfaceTexture
 *  android.os.ConditionVariable
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  android.view.View
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.RuntimeException
 *  java.lang.String
 */
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.ConditionVariable;
import android.view.TextureView;
import android.view.View;

public final class atp
extends ata {
    private asv mRenderTarget = null;
    private asl mShader = null;
    private SurfaceTexture mSurfaceTexture = null;
    private Rect mSurfaceTextureRect;
    private TextureView mView = null;
    private ConditionVariable mWaitForST = new ConditionVariable(true);

    public atp(asr asr2, String string) {
        super(asr2, string);
    }

    static /* synthetic */ ConditionVariable access$000(atp atp2) {
        return atp2.mWaitForST;
    }

    static /* synthetic */ void access$100(atp atp2) {
        atp2.killSurfaceTexture();
    }

    private final void closeView() {
        this.mView.setSurfaceTextureListener(null);
    }

    private final void killSurfaceTexture() {
        this.mSurfaceTexture = null;
        if (this.mView != null) {
            this.closeView();
            this.mView = null;
        }
    }

    private final void openView() {
        if (this.mView.getSurfaceTextureListener() != null) {
            throw new RuntimeException("TextureView is already hooked up to another listener!");
        }
        this.mWaitForST.close();
        this.mView.setSurfaceTextureListener((TextureView.SurfaceTextureListener)new atr(this, null));
        if (this.mView.isAvailable()) {
            this.setSurfaceTexture(this.mView.getSurfaceTexture(), this.mView.getWidth(), this.mView.getHeight());
            this.mWaitForST.open();
        }
        if (!this.mWaitForST.block(1000)) {
            throw new RuntimeException("Timed out waiting for TextureView to become available!");
        }
    }

    @Override
    public final asw getSignature() {
        arx arx2 = arx.a(2);
        return super.getSignature().a("image", 2, arx2).a();
    }

    @Override
    public final void onBindToView(View view) {
        void var3_2 = this;
        synchronized (var3_2) {
            if (view instanceof TextureView) {
                this.mView = (TextureView)view;
                return;
            }
            throw new IllegalArgumentException("View must be a TextureView!");
        }
    }

    @Override
    protected final void onClose() {
        if (this.mRenderTarget != null) {
            this.mRenderTarget.e();
            this.mRenderTarget = null;
        }
        if (this.mView != null) {
            this.closeView();
            this.mView = null;
        }
    }

    @Override
    protected final void onInputPortOpen(aso aso2) {
        super.connectViewInputs(aso2);
    }

    @Override
    protected final void onOpen() {
        if (this.mView != null) {
            this.openView();
        }
        if (this.mSurfaceTexture == null) {
            throw new NullPointerException("SurfaceTextureTarget has no SurfaceTexture!");
        }
        this.mRenderTarget = asv.b().a(this.mSurfaceTexture);
        this.mShader = asl.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final void onProcess() {
        atp atp2 = this;
        synchronized (atp2) {
            arn arn2 = this.getConnectedInputPort("image").a().c();
            if (this.mSurfaceTexture != null) {
                SurfaceTexture surfaceTexture;
                SurfaceTexture surfaceTexture2 = surfaceTexture = this.mSurfaceTexture;
                synchronized (surfaceTexture2) {
                    Rect rect = new Rect(0, 0, arn2.h(), arn2.i());
                    this.setupShader(this.mShader, rect, this.mSurfaceTextureRect);
                    this.mShader.a(arn2.j(), this.mRenderTarget, this.mSurfaceTextureRect.width(), this.mSurfaceTextureRect.height());
                    arn2.f();
                    this.mRenderTarget.d();
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setSurfaceTexture(SurfaceTexture surfaceTexture, int n, int n2) {
        void var5_4 = this;
        synchronized (var5_4) {
            if (this.isRunning()) {
                throw new IllegalStateException("Cannot set SurfaceTexture while running!");
            }
            this.mSurfaceTexture = surfaceTexture;
            this.updateSurfaceTexture(n, n2);
            return;
        }
    }

    public final void updateSurfaceTexture(int n, int n2) {
        void var4_3 = this;
        synchronized (var4_3) {
            this.mSurfaceTextureRect = new Rect(0, 0, n, n2);
            return;
        }
    }
}

