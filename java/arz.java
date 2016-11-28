/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Array
 */
import java.lang.reflect.Array;

public final class arz
extends ary {
    arz(aqy aqy2) {
        super(aqy2);
    }

    public final Object i() {
        Object object = super.h();
        if (object == null || object.getClass().isArray()) {
            return super.h();
        }
        Object[] arrobject = (Object[])Array.newInstance((Class)object.getClass(), (int)1);
        arrobject[0] = object;
        return arrobject;
    }
}

