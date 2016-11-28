/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
public class ary
extends ark {
    ary(aqy aqy2) {
        super(aqy2);
    }

    static void a(arx arx2) {
        if (arx2.a != 1) {
            throw new RuntimeException("Cannot access non-object based Frame as FrameValue!");
        }
    }

    public final void a(Object object) {
        this.a.b(2, 8).a(object);
        this.a.a();
    }

    public final Object h() {
        Object object = this.a.a(1, 8);
        this.a.a();
        return object;
    }
}

