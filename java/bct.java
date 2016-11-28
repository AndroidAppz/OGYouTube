/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.String
 *  java.lang.Throwable
 */
import android.util.Log;

final class bct
extends bcs {
    bct(String string2) {
    }

    @Override
    protected final void a(Throwable throwable) {
        if (throwable != null && Log.isLoggable((String)"GlideExecutor", (int)6)) {
            Log.e((String)"GlideExecutor", (String)"Request threw uncaught throwable", (Throwable)throwable);
        }
    }
}

