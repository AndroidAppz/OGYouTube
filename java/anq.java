/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 */
import android.view.View;

public abstract class anq {
    public final aoh a;
    int b;

    private anq(aoh aoh2) {
        this.b = Integer.MIN_VALUE;
        this.a = aoh2;
    }

    /* synthetic */ anq(aoh aoh2, byte by2) {
        super(aoh2);
    }

    public final int a() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return this.e() - this.b;
    }

    public abstract int a(View var1);

    public abstract void a(int var1);

    public abstract int b();

    public abstract int b(View var1);

    public abstract int c();

    public abstract int c(View var1);

    public abstract int d();

    public abstract int d(View var1);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();
}

