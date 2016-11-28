/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 */
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

final class aae {
    int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    ahw h;
    ahu i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    public boolean n;
    boolean o;
    boolean p;
    Bundle q;

    aae(int n) {
        this.a = n;
        this.o = false;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void a(ahw ahw2) {
        if (ahw2 == this.h) {
            return;
        }
        if (this.h != null) {
            this.h.b(this.i);
        }
        this.h = ahw2;
        if (ahw2 == null) return;
        if (this.i == null) return;
        ahw2.a(this.i);
    }
}

