/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 */
import java.util.concurrent.ThreadFactory;

final class bcq
implements ThreadFactory {
    final bcs a;
    final boolean b;
    private final String c;
    private int d;

    bcq(String string, bcs bcs2, boolean bl2) {
        this.c = string;
        this.a = bcs2;
        this.b = bl2;
    }

    public final Thread newThread(Runnable runnable) {
        void var6_2 = this;
        synchronized (var6_2) {
            String string = this.c;
            int n = this.d;
            bcr bcr2 = new bcr((bcq)this, runnable, new StringBuilder(25 + String.valueOf((Object)string).length()).append("glide-").append(string).append("-thread-").append(n).toString());
            this.d = 1 + this.d;
            return bcr2;
        }
    }
}

