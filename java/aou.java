/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
public final class aou {
    int a = -1;
    public int b = 1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    public final int a() {
        if (this.g) {
            return this.d - this.e;
        }
        return this.c;
    }

    public final void a(int n) {
        if ((n & this.b) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString((int)n) + " but it is " + Integer.toBinaryString((int)this.b));
        }
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.a + ", mData=" + null + ", mItemCount=" + this.c + ", mPreviousLayoutItemCount=" + this.d + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.e + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.h + ", mRunPredictiveAnimations=" + this.i + '}';
    }
}

