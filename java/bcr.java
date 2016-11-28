/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 */
import android.os.Process;
import android.os.StrictMode;

final class bcr
extends Thread {
    private /* synthetic */ bcq a;

    bcr(bcq bcq2, Runnable runnable, String string) {
        this.a = bcq2;
        super(runnable, string);
    }

    public final void run() {
        Process.setThreadPriority((int)9);
        if (this.a.b) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
            return;
        }
        catch (Throwable var1_1) {
            this.a.a.a(var1_1);
            return;
        }
    }
}

