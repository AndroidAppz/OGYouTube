/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Object
 */
final class bal
implements Appendable {
    private final Appendable a;
    private boolean b = true;

    bal(Appendable appendable) {
        this.a = appendable;
    }

    private static CharSequence a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        return charSequence;
    }

    public final Appendable append(char c2) {
        if (this.b) {
            this.b = false;
            this.a.append((CharSequence)"  ");
        }
        boolean bl2 = false;
        if (c2 == '\n') {
            bl2 = true;
        }
        this.b = bl2;
        this.a.append(c2);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        CharSequence charSequence2 = bal.a(charSequence);
        return this.append(charSequence2, 0, charSequence2.length());
    }

    public final Appendable append(CharSequence charSequence, int n, int n2) {
        CharSequence charSequence2 = bal.a(charSequence);
        if (this.b) {
            this.b = false;
            this.a.append((CharSequence)"  ");
        }
        int n3 = charSequence2.length();
        boolean bl2 = false;
        if (n3 > 0) {
            char c2 = charSequence2.charAt(n2 - 1);
            bl2 = false;
            if (c2 == '\n') {
                bl2 = true;
            }
        }
        this.b = bl2;
        this.a.append(charSequence2, n, n2);
        return this;
    }
}

