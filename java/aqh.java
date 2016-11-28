/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

final class aqh
extends aoz {
    private final WeakReference a;

    public aqh(Context context, Resources resources) {
        super(resources);
        this.a = new WeakReference((Object)context);
    }

    @Override
    public final Drawable getDrawable(int n) {
        Drawable drawable = super.getDrawable(n);
        Context context = (Context)this.a.get();
        if (drawable != null && context != null) {
            akj.a();
            akj.a(context, n, drawable);
        }
        return drawable;
    }
}

