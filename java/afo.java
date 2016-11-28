/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
import android.os.Bundle;
import java.util.ArrayList;

final class afo
extends adz {
    private final String a;
    private boolean b;
    private int c;
    private int d;
    private afl e;
    private int f;
    private /* synthetic */ afk g;

    public afo(afk afk2, String string) {
        this.g = afk2;
        this.c = -1;
        this.a = string;
    }

    @Override
    public final void a() {
        afk afk2 = this.g;
        afk2.l.remove((Object)this);
        this.d();
        afk2.b();
    }

    @Override
    public final void a(int n) {
        this.b = false;
        if (this.e != null) {
            afl afl2 = this.e;
            int n2 = this.f;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", n);
            int n3 = afl2.c;
            afl2.c = n3 + 1;
            afl2.a(6, n3, n2, null, bundle);
        }
    }

    public final void a(afl afl2) {
        this.e = afl2;
        String string = this.a;
        int n = afl2.d;
        afl2.d = n + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", string);
        int n2 = afl2.c;
        afl2.c = n2 + 1;
        afl2.a(3, n2, n, null, bundle);
        this.f = n;
        if (this.b) {
            afl2.a(this.f);
            if (this.c >= 0) {
                afl2.a(this.f, this.c);
                this.c = -1;
            }
            if (this.d != 0) {
                afl2.b(this.f, this.d);
                this.d = 0;
            }
        }
    }

    @Override
    public final void b() {
        this.b = true;
        if (this.e != null) {
            this.e.a(this.f);
        }
    }

    @Override
    public final void b(int n) {
        if (this.e != null) {
            this.e.a(this.f, n);
            return;
        }
        this.c = n;
        this.d = 0;
    }

    @Override
    public final void c() {
        this.a(0);
    }

    @Override
    public final void c(int n) {
        if (this.e != null) {
            this.e.b(this.f, n);
            return;
        }
        this.d = n + this.d;
    }

    public final void d() {
        if (this.e != null) {
            afl afl2 = this.e;
            int n = this.f;
            int n2 = afl2.c;
            afl2.c = n2 + 1;
            afl2.a(4, n2, n, null, null);
            this.e = null;
            this.f = 0;
        }
    }
}

