/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
public class aht {
    public final Object d;

    aht(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.d = object;
    }
}

