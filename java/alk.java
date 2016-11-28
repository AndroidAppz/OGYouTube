/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  java.lang.Math
 *  java.lang.Object
 */
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class alk
implements alo {
    private static float c(all all2) {
        return ((apa)all2.getBackground()).a;
    }

    @Override
    public final float a(all all2) {
        return 2.0f * alk.c(all2);
    }

    @Override
    public final void a() {
    }

    @Override
    public final void a(all all2, Context context, int n, float f2, float f3, float f4) {
        all2.setBackgroundDrawable(new apa(n, f2));
        View view = (View)all2;
        view.setClipToOutline(true);
        view.setElevation(f3);
        apa apa2 = (apa)all2.getBackground();
        boolean bl2 = all2.w_();
        boolean bl3 = all2.b();
        if (f4 != apa2.b || apa2.c != bl2 || apa2.d != bl3) {
            apa2.b = f4;
            apa2.c = bl2;
            apa2.d = bl3;
            apa2.a(null);
            apa2.invalidateSelf();
        }
        if (!all2.w_()) {
            all2.a(0, 0, 0, 0);
            return;
        }
        float f5 = ((apa)all2.getBackground()).b;
        float f6 = alk.c(all2);
        int n2 = (int)Math.ceil((double)apb.b(f5, f6, all2.b()));
        int n3 = (int)Math.ceil((double)apb.a(f5, f6, all2.b()));
        all2.a(n2, n3, n2, n3);
    }

    @Override
    public final float b(all all2) {
        return 2.0f * alk.c(all2);
    }
}

