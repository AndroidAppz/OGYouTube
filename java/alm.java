/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  java.lang.Math
 *  java.lang.Object
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class alm
implements alo {
    final RectF a = new RectF();

    private static apb c(all all2) {
        return (apb)all2.getBackground();
    }

    @Override
    public final float a(all all2) {
        apb apb2 = alm.c(all2);
        return 2.0f * Math.max((float)apb2.d, (float)(apb2.c + (float)apb2.a + apb2.d / 2.0f)) + 2.0f * (apb2.d + (float)apb2.a);
    }

    @Override
    public void a() {
        apb.b = new aln(this);
    }

    @Override
    public final void a(all all2, Context context, int n, float f2, float f3, float f4) {
        apb apb2 = new apb(context.getResources(), n, f2, f3, f4);
        apb2.e = all2.b();
        apb2.invalidateSelf();
        all2.setBackgroundDrawable(apb2);
        Rect rect = new Rect();
        alm.c(all2).getPadding(rect);
        apb apb3 = alm.c(all2);
        int n2 = (int)Math.ceil((double)(2.0f * Math.max((float)apb3.d, (float)(apb3.c + (float)apb3.a + apb3.d / 2.0f)) + 2.0f * (apb3.d + (float)apb3.a)));
        apb apb4 = alm.c(all2);
        all2.a(n2, (int)Math.ceil((double)(2.0f * Math.max((float)apb4.d, (float)(apb4.c + (float)apb4.a + 1.5f * apb4.d / 2.0f)) + 2.0f * (1.5f * apb4.d + (float)apb4.a))));
        all2.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public final float b(all all2) {
        apb apb2 = alm.c(all2);
        return 2.0f * Math.max((float)apb2.d, (float)(apb2.c + (float)apb2.a + 1.5f * apb2.d / 2.0f)) + 2.0f * (1.5f * apb2.d + (float)apb2.a);
    }
}

