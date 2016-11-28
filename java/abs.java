/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;

public final class abs
extends he {
    public abs(Context context) {
        super(context);
    }

    @Override
    protected final hf b() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new abv();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return new abu();
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return new abt();
        }
        return super.b();
    }
}

