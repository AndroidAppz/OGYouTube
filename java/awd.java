/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
public final class awd
extends awb {
    public awd(Class class_) {
        String string = String.valueOf((Object)class_);
        super(new StringBuilder(50 + String.valueOf((Object)string).length()).append("Failed to find result encoder for resource class: ").append(string).toString());
    }
}

