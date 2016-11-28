/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
final class bev {
    final Class a;
    final ben b;
    private final Class c;

    public bev(Class class_, Class class_2, ben ben2) {
        this.c = class_;
        this.a = class_2;
        this.b = ben2;
    }

    public final boolean a(Class class_) {
        return this.c.isAssignableFrom(class_);
    }

    public final boolean a(Class class_, Class class_2) {
        if (this.a(class_) && this.a.isAssignableFrom(class_2)) {
            return true;
        }
        return false;
    }
}

