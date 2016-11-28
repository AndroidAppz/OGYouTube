/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Bitmap
 *  android.graphics.BitmapShader
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.ClipDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.shapes.RoundRectShape
 *  android.graphics.drawable.shapes.Shape
 *  android.util.AttributeSet
 *  android.widget.ProgressBar
 *  java.lang.Object
 *  js
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class akv {
    private static final int[] b = new int[]{16843067, 16843068};
    Bitmap a;
    private final ProgressBar c;

    akv(ProgressBar progressBar) {
        this.c = progressBar;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final Drawable a(Drawable drawable, boolean bl2) {
        LayerDrawable layerDrawable;
        int n;
        Drawable[] arrdrawable;
        int n2 = 0;
        if (drawable instanceof js) {
            Drawable drawable2 = ((js)drawable).a();
            if (drawable2 == null) return drawable;
            {
                Drawable drawable3 = super.a(drawable2, bl2);
                ((js)drawable).a(drawable3);
            }
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable)drawable;
            n = layerDrawable.getNumberOfLayers();
            arrdrawable = new Drawable[n];
        } else {
            if (!(drawable instanceof BitmapDrawable)) return drawable;
            {
                BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.a == null) {
                    this.a = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                shapeDrawable.getPaint().setShader((Shader)bitmapShader);
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (!bl2) return shapeDrawable;
                return new ClipDrawable((Drawable)shapeDrawable, 3, 1);
            }
        }
        for (int i = 0; i < n; ++i) {
            int n3 = layerDrawable.getId(i);
            Drawable drawable4 = layerDrawable.getDrawable(i);
            boolean bl3 = n3 == 16908301 || n3 == 16908303;
            arrdrawable[i] = super.a(drawable4, bl3);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(arrdrawable);
        while (n2 < n) {
            layerDrawable2.setId(n2, layerDrawable.getId(n2));
            ++n2;
        }
        return layerDrawable2;
    }

    void a(AttributeSet attributeSet, int n) {
        Drawable drawable;
        aqi aqi2 = aqi.a(this.c.getContext(), attributeSet, b, n);
        Drawable drawable2 = aqi2.b(0);
        if (drawable2 != null) {
            ProgressBar progressBar = this.c;
            if (drawable2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable)drawable2;
                int n2 = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i = 0; i < n2; ++i) {
                    Drawable drawable3 = super.a(animationDrawable.getFrame(i), true);
                    drawable3.setLevel(10000);
                    animationDrawable2.addFrame(drawable3, animationDrawable.getDuration(i));
                }
                animationDrawable2.setLevel(10000);
                drawable2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawable2);
        }
        if ((drawable = aqi2.b(1)) != null) {
            this.c.setProgressDrawable(super.a(drawable, false));
        }
        aqi2.a.recycle();
    }
}

