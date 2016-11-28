/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.Throwable
 */
public class avb
extends Exception {
    public final aun b;

    public avb() {
        this.b = null;
    }

    public avb(aun aun2) {
        this.b = aun2;
    }

    public avb(String string) {
        super(string);
        this.b = null;
    }

    public avb(String string, Throwable throwable) {
        super(string, throwable);
        this.b = null;
    }

    public avb(Throwable throwable) {
        super(throwable);
        this.b = null;
    }
}

