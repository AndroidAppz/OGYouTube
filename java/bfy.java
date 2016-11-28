/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
public class bfy
implements bap {
    private Object a;

    public bfy(Object object) {
        this.a = blm.a(object, "Argument must not be null");
    }

    @Override
    public final Class a() {
        return this.a.getClass();
    }

    @Override
    public final Object b() {
        return this.a;
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final void d() {
    }
}

