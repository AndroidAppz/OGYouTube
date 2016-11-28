/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.text.method.TransformationMethod
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class agz
implements TransformationMethod {
    private Locale a;

    public agz(Context context) {
        this.a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.a);
        }
        return null;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean bl2, int n, Rect rect) {
    }
}

