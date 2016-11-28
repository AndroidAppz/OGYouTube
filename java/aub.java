/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.Throwable
 */
import android.content.Intent;

public final class aub
extends avb {
    public Intent a;

    public aub() {
    }

    public aub(Intent intent) {
        this.a = intent;
    }

    public aub(aun aun2) {
        super(aun2);
    }

    public aub(String string) {
        super(string);
    }

    public aub(String string, Exception exception) {
        super(string, (Throwable)exception);
    }

    public final String getMessage() {
        if (this.a != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}

