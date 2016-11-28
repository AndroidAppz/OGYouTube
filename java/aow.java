/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  rw
 */
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class aow {
    private static final List p = Collections.EMPTY_LIST;
    public final View a;
    public int b = -1;
    public int c = -1;
    int d = -1;
    public int e = -1;
    public aow f = null;
    public aow g = null;
    int h;
    List i = null;
    List j = null;
    aom k = null;
    boolean l = false;
    int m = 0;
    RecyclerView n;
    private long o = -1;
    private int q = 0;

    public aow(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void a() {
        this.c = -1;
        this.e = -1;
    }

    public final void a(int n, int n2) {
        this.h = this.h & ~ n2 | n & n2;
    }

    public final void a(int n, boolean bl2) {
        if (this.c == -1) {
            this.c = this.b;
        }
        if (this.e == -1) {
            this.e = this.b;
        }
        if (bl2) {
            this.e = n + this.e;
        }
        this.b = n + this.b;
        if (this.a.getLayoutParams() != null) {
            ((aoi)this.a.getLayoutParams()).e = true;
        }
    }

    final void a(aom aom2, boolean bl2) {
        this.k = aom2;
        this.l = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(boolean bl2) {
        int n = bl2 ? -1 + this.q : 1 + this.q;
        this.q = n;
        if (this.q < 0) {
            this.q = 0;
            Log.e((String)"View", (String)("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this));
            return;
        } else {
            if (!bl2 && this.q == 1) {
                this.h = 16 | this.h;
                return;
            }
            if (!bl2 || this.q != 0) return;
            {
                this.h = -17 & this.h;
                return;
            }
        }
    }

    public final boolean a(int n) {
        if ((n & this.h) != 0) {
            return true;
        }
        return false;
    }

    public final void b(int n) {
        this.h = n | this.h;
    }

    public final boolean b() {
        if ((128 & this.h) != 0) {
            return true;
        }
        return false;
    }

    public final int c() {
        if (this.e == -1) {
            return this.b;
        }
        return this.e;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int d() {
        if (this.n == null) {
            return -1;
        }
        var1_2 = this.n;
        if (this.a(524) != false) return -1;
        if (!this.l()) {
            return -1;
        }
        var2_3 = var1_2.d;
        var3_1 = this.b;
        var4_4 = var2_3.a.size();
        var5_5 = 0;
        while (var5_5 < var4_4) {
            var6_6 = (akd)var2_3.a.get(var5_5);
            switch (var6_6.a) {
                case 1: {
                    if (var6_6.b <= var3_1) {
                        var3_1 += var6_6.d;
                        ** break;
                    }
                    ** GOTO lbl24
                }
                case 2: {
                    if (var6_6.b <= var3_1) {
                        if (var6_6.b + var6_6.d > var3_1) {
                            return -1;
                        }
                        var3_1 -= var6_6.d;
                    }
                }
lbl24: // 6 sources:
                default: {
                    ** GOTO lbl34
                }
                case 8: 
            }
            if (var6_6.b == var3_1) {
                var3_1 = var6_6.d;
            } else {
                if (var6_6.b < var3_1) {
                    --var3_1;
                }
                if (var6_6.d <= var3_1) {
                    ++var3_1;
                }
            }
lbl34: // 5 sources:
            ++var5_5;
        }
        return var3_1;
    }

    final boolean e() {
        if (this.k != null) {
            return true;
        }
        return false;
    }

    final void f() {
        this.k.b(this);
    }

    final boolean g() {
        if ((32 & this.h) != 0) {
            return true;
        }
        return false;
    }

    final void h() {
        this.h = -33 & this.h;
    }

    public final void i() {
        this.h = -257 & this.h;
    }

    public final boolean j() {
        if ((4 & this.h) != 0) {
            return true;
        }
        return false;
    }

    final boolean k() {
        if ((2 & this.h) != 0) {
            return true;
        }
        return false;
    }

    final boolean l() {
        if ((1 & this.h) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((8 & this.h) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if ((256 & this.h) != 0) {
            return true;
        }
        return false;
    }

    final void o() {
        if (this.i != null) {
            this.i.clear();
        }
        this.h = -1025 & this.h;
    }

    public final List p() {
        if ((1024 & this.h) == 0) {
            if (this.i == null || this.i.size() == 0) {
                return p;
            }
            return this.j;
        }
        return p;
    }

    final void q() {
        this.h = 0;
        this.b = -1;
        this.c = -1;
        this.o = -1;
        this.e = -1;
        this.q = 0;
        this.f = null;
        this.g = null;
        this.o();
        this.m = 0;
    }

    public final boolean r() {
        if ((16 & this.h) == 0 && !rw.b((View)this.a)) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((2 & this.h) != 0) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString((int)this.hashCode()) + " position=" + this.b + " id=" + this.o + ", oldPos=" + this.c + ", pLpos:" + this.e);
        if (this.e()) {
            StringBuilder stringBuilder2 = stringBuilder.append(" scrap ");
            String string = this.l ? "[changeScrap]" : "[attachedScrap]";
            stringBuilder2.append(string);
        }
        if (this.j()) {
            stringBuilder.append(" invalid");
        }
        if (!this.l()) {
            stringBuilder.append(" unbound");
        }
        if (this.k()) {
            stringBuilder.append(" update");
        }
        if (this.m()) {
            stringBuilder.append(" removed");
        }
        if (this.b()) {
            stringBuilder.append(" ignored");
        }
        if (this.n()) {
            stringBuilder.append(" tmpDetached");
        }
        if (!this.r()) {
            stringBuilder.append(" not recyclable(" + this.q + ")");
        }
        boolean bl2 = (512 & this.h) != 0 || this.j();
        if (bl2) {
            stringBuilder.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            stringBuilder.append(" no parent");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

