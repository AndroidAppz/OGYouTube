/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
import android.os.Handler;
import java.util.concurrent.Executor;

public class auh
implements aux {
    private final Executor a;

    public auh(Handler handler) {
        this.a = new aui(handler);
    }

    public auh(Executor executor) {
        this.a = executor;
    }

    @Override
    public final void a(auq auq2, auu auu2) {
        this.a(auq2, auu2, null);
    }

    @Override
    public void a(auq auq2, auu auu2, Runnable runnable) {
        auq2.u();
        auq2.a("post-response");
        this.a.execute((Runnable)new auj(auq2, auu2, runnable));
    }

    @Override
    public final void a(auq auq2, avb avb2) {
        auq2.a("post-error");
        auu auu2 = auu.a(avb2);
        this.a.execute((Runnable)new auj(auq2, auu2, null));
    }
}

