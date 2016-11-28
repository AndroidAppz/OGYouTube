/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
public final class bhn
implements bap {
    private final byte[] a;

    public bhn(byte[] arrby) {
        this.a = (byte[])blm.a(arrby, "Argument must not be null");
    }

    @Override
    public final Class a() {
        return byte[].class;
    }

    @Override
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override
    public final int c() {
        return this.a.length;
    }

    @Override
    public final void d() {
    }
}

