/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
abstract class ara {
    public int[] a = null;
    int b;
    int c;
    public boolean d = false;
    int e = 0;

    ara() {
    }

    public abstract int a();

    public abstract Object a(int var1);

    public abstract void a(ara var1);

    public abstract void a(arx var1);

    public void a(Object object) {
        String string = String.valueOf((Object)this);
        throw new RuntimeException(new StringBuilder(93 + String.valueOf((Object)string).length()).append("Internal error: Setting data on frame backing ").append(string).append(", which does not support setting data directly!").toString());
    }

    public abstract int b();

    protected final void b(arx arx2) {
        if (arx2.a != 301) {
            throw new RuntimeException("Cannot allocate texture with non-RGBA data type!");
        }
        if (this.a == null || this.a.length != 2) {
            throw new RuntimeException("Cannot allocate non 2-dimensional texture!");
        }
    }

    public abstract boolean c();

    public void d() {
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void g();

    public abstract int h();
}

