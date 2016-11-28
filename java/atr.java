/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  java.lang.Object
 */
import android.graphics.SurfaceTexture;
import android.view.TextureView;

final class atr
implements TextureView.SurfaceTextureListener {
    final /* synthetic */ atp this$0;

    private atr(atp atp2) {
        this.this$0 = atp2;
    }

    /* synthetic */ atr(atp atp2, atq atq2) {
        super(atp2);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n, int n2) {
        this.this$0.setSurfaceTexture(surfaceTexture, n, n2);
        atp.access$000(this.this$0).open();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        atp.access$100(this.this$0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n, int n2) {
        this.this$0.updateSurfaceTexture(n, n2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

