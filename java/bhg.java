/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.locks.Condition
 *  java.util.concurrent.locks.Lock
 */
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class bhg
implements Lock {
    bhg() {
    }

    public final void lock() {
    }

    public final void lockInterruptibly() {
    }

    public final Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean tryLock() {
        return true;
    }

    public final boolean tryLock(long l, TimeUnit timeUnit) {
        return true;
    }

    public final void unlock() {
    }
}

