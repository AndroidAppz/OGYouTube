/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
public final class awe
extends awb {
    public awe(Class class_) {
        String string = String.valueOf((Object)class_);
        super(new StringBuilder(46 + String.valueOf((Object)string).length()).append("Failed to find source encoder for data class: ").append(string).toString());
    }
}

