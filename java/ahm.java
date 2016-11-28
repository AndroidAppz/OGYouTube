/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.util.ArrayList
 *  uf
 *  ug
 */
import android.view.View;
import java.util.ArrayList;

final class ahm
extends ug {
    private boolean a;
    private int b;
    private /* synthetic */ ahl c;

    ahm(ahl ahl2) {
        this.c = ahl2;
        this.a = false;
        this.b = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(View view) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (this.c.b == null) return;
        this.c.b.a(null);
    }

    public final void b(View view) {
        int n;
        this.b = n = 1 + this.b;
        if (n == this.c.a.size()) {
            if (this.c.b != null) {
                this.c.b.b(null);
            }
            this.b = 0;
            this.a = false;
            this.c.c = false;
        }
    }
}

