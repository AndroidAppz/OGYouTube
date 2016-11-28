/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
final class asx {
    public arx a;
    private int b;

    public asx() {
        this.b = 0;
        this.a = arx.a();
    }

    public asx(int n, arx arx2) {
        this.b = n;
        this.a = arx2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String a(String string, String string2) {
        String string3 = new StringBuilder(1 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append(string).append(" ").append(string2).toString();
        String string4 = this.a() ? "required" : "optional";
        String string5 = String.valueOf((Object)this.a.toString());
        return new StringBuilder(3 + String.valueOf((Object)string4).length() + String.valueOf((Object)string3).length() + String.valueOf((Object)string5).length()).append(string4).append(" ").append(string3).append(": ").append(string5).toString();
    }

    public final boolean a() {
        if ((2 & this.b) != 0) {
            return true;
        }
        return false;
    }
}

