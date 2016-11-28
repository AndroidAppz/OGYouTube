/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
public final class awc
extends awb {
    public awc(Class class_, Class class_2) {
        String string = String.valueOf((Object)class_);
        String string2 = String.valueOf((Object)class_2);
        super(new StringBuilder(54 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append("Failed to find any ModelLoaders for model: ").append(string).append(" and data: ").append(string2).toString());
    }

    public awc(Object object) {
        String string = String.valueOf((Object)object);
        super(new StringBuilder(43 + String.valueOf((Object)string).length()).append("Failed to find any ModelLoaders for model: ").append(string).toString());
    }
}

