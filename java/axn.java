/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
import java.io.IOException;

public final class axn
extends IOException {
    public axn(int n) {
        super(new StringBuilder(49).append("Http request failed with status code: ").append(n).toString(), n);
    }

    public axn(String string) {
        super(string, -1);
    }

    private axn(String string, byte by2) {
        super(string, null);
    }

    public axn(String string, int n) {
        super(string, 0);
    }
}

