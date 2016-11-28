/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
final class bcu
extends bcs {
    bcu(String string2) {
    }

    @Override
    protected final void a(Throwable throwable) {
        super.a(throwable);
        if (throwable != null) {
            throw new RuntimeException("Request threw uncaught throwable", throwable);
        }
    }
}

