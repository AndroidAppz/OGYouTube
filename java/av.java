/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  java.lang.Object
 */
import android.view.ViewTreeObserver;

public final class av
implements ViewTreeObserver.OnPreDrawListener {
    private /* synthetic */ au a;

    public av(au au2) {
        this.a = au2;
    }

    public final boolean onPreDraw() {
        this.a.e();
        return true;
    }
}

