/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 */
public class awn
implements Cloneable {
    public bkx a = bkt.b;

    protected final awn a() {
        try {
            awn awn2 = (awn)super.clone();
            return awn2;
        }
        catch (CloneNotSupportedException var1_2) {
            throw new RuntimeException((Throwable)var1_2);
        }
    }

    protected /* synthetic */ Object clone() {
        return this.a();
    }
}

