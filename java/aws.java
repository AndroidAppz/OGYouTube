/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class aws {
    final String a;
    final long[] b;
    File[] c;
    File[] d;
    boolean e;
    awr f;
    long g;
    private /* synthetic */ awo h;

    aws(awo awo2, String string) {
        this.h = awo2;
        this.a = string;
        this.b = new long[awo2.b];
        this.c = new File[awo2.b];
        this.d = new File[awo2.b];
        StringBuilder stringBuilder = new StringBuilder(string).append('.');
        int n = stringBuilder.length();
        for (int i = 0; i < awo2.b; ++i) {
            stringBuilder.append(i);
            this.c[i] = new File(awo2.a, stringBuilder.toString());
            stringBuilder.append(".tmp");
            this.d[i] = new File(awo2.a, stringBuilder.toString());
            stringBuilder.setLength(n);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static IOException b(String[] arrstring) {
        String string;
        String string2 = String.valueOf((Object)Arrays.toString((Object[])arrstring));
        if (string2.length() != 0) {
            string = "unexpected journal line: ".concat(string2);
            do {
                throw new IOException(string);
                break;
            } while (true);
        }
        string = new String("unexpected journal line: ");
        throw new IOException(string);
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long l : this.b) {
            stringBuilder.append(' ').append(l);
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a(String[] arrstring) {
        if (arrstring.length != this.h.b) {
            throw aws.b(arrstring);
        }
        try {
            for (int i = 0; i < arrstring.length; ++i) {
                this.b[i] = Long.parseLong((String)arrstring[i]);
            }
            return;
        }
        catch (NumberFormatException var3_3) {
            throw aws.b(arrstring);
        }
    }
}

