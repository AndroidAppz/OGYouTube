/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
public final class asu {
    arg a;
    public String b;
    asx c;
    aru d = null;
    art e = null;
    public boolean f = true;
    aso g = null;

    asu(arg arg2, String string, asx asx2) {
        this.a = arg2;
        this.b = string;
        this.c = asx2;
    }

    public final ark a(int[] arrn) {
        ark ark2 = this.e.a.a(arrn);
        this.a.addAutoReleaseFrame(ark2);
        return ark2;
    }

    public final void a(ark ark2) {
        if (ark2.a.c == -1) {
            ark2.a(this.a.getCurrentTimestamp());
        }
        this.e.a.a(ark2);
    }

    public final boolean a() {
        if (this.e == null || this.e.a.b()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String string = String.valueOf((Object)this.a.getName());
        String string2 = this.b;
        return new StringBuilder(1 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append(string).append(":").append(string2).toString();
    }
}

