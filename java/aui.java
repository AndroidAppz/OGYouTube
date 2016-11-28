/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
import android.os.Handler;
import java.util.concurrent.Executor;

final class aui
implements Executor {
    private /* synthetic */ Handler a;

    aui(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}

