/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.Object
 */
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class bas {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), (Handler.Callback)new bat());

    bas() {
    }

    public final void a(bap bap2) {
        bln.a();
        if (this.a) {
            this.b.obtainMessage(1, (Object)bap2).sendToTarget();
            return;
        }
        this.a = true;
        bap2.d();
        this.a = false;
    }
}

