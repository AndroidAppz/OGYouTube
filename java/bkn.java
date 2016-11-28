/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

public abstract class bkn
extends bkf {
    public static boolean a = false;
    public static Integer b = null;
    public final View c;
    private final bko d;

    public bkn(View view) {
        this.c = (View)blm.a((Object)view, "Argument must not be null");
        this.d = new bko(view);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final bjv a() {
        Object object = b == null ? this.c.getTag() : this.c.getTag(b.intValue());
        if (object == null) {
            return null;
        }
        if (object instanceof bjv) {
            return (bjv)object;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override
    public void a(Drawable drawable) {
        super.a(drawable);
        this.d.b();
    }

    @Override
    public final void a(bjv bjv2) {
        if (b == null) {
            a = true;
            this.c.setTag((Object)bjv2);
            return;
        }
        this.c.setTag(b.intValue(), (Object)bjv2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(bkl bkl2) {
        bko bko2 = this.d;
        int n = bko2.d();
        int n2 = bko2.c();
        if (bko.a(n) && bko.a(n2)) {
            bkl2.a(n, n2);
            return;
        } else {
            if (!bko2.b.contains((Object)bkl2)) {
                bko2.b.add((Object)bkl2);
            }
            if (bko2.c != null) return;
            {
                ViewTreeObserver viewTreeObserver = bko2.a.getViewTreeObserver();
                bko2.c = new bkp(bko2);
                viewTreeObserver.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)bko2.c);
                return;
            }
        }
    }

    public final View f() {
        return this.c;
    }

    public String toString() {
        String string = String.valueOf((Object)this.c);
        return new StringBuilder(12 + String.valueOf((Object)string).length()).append("Target for: ").append(string).toString();
    }
}

