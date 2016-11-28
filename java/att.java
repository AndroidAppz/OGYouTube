/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
public class att {
    private final int mPeriodFrames;
    private final long mPeriodTime;
    private final int mTotalFrames;

    public att(int n, int n2, long l, int n3) {
        this.mTotalFrames = n;
        this.mPeriodFrames = n2;
        this.mPeriodTime = l;
    }

    public float getFramesPerSecond() {
        return (float)this.mPeriodFrames / ((float)this.mPeriodTime / 1000.0f);
    }

    public String toString() {
        int n = Math.round((float)this.getFramesPerSecond());
        return new StringBuilder(15).append(n).append(" FPS").toString();
    }
}

