/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.Menu
 *  android.view.MenuItem
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 */
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

public final class aip {
    public static Menu a(Context context, kh kh2) {
        if (Build.VERSION.SDK_INT >= 14) {
            return new aiq(context, kh2);
        }
        throw new UnsupportedOperationException();
    }

    public static MenuItem a(Context context, ki ki2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new aih(context, ki2);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return new aic(context, ki2);
        }
        throw new UnsupportedOperationException();
    }
}

