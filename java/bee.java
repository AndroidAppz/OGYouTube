/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
final class bee
implements beb {
    private final String a;

    bee(String string) {
        this.a = string;
    }

    @Override
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (object instanceof bee) {
            bee bee2 = (bee)object;
            return this.a.equals((Object)bee2.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = this.a;
        return new StringBuilder(29 + String.valueOf((Object)string).length()).append("StringHeaderFactory{value='").append(string).append("'}").toString();
    }
}

