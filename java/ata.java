/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.view.View
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public abstract class ata
extends arg {
    public float[] mClearColor = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
    public boolean mFlipVertically = true;
    private String mRequestedScaleMode = null;
    public int mScaleMode = 2;
    private asq mScaleModeListener;

    public ata(asr asr2, String string) {
        super(asr2, string);
        this.mScaleModeListener = new atb((ata)this);
    }

    static /* synthetic */ String access$000(ata ata2) {
        return ata2.mRequestedScaleMode;
    }

    static /* synthetic */ String access$002(ata ata2, String string) {
        ata2.mRequestedScaleMode = string;
        return string;
    }

    public void bindToView(View view) {
        if (this.isRunning()) {
            throw new IllegalStateException("Attempting to bind filter to view while it is running!");
        }
        this.onBindToView(view);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void connectViewInputs(aso aso2) {
        if (aso2.b.equals((Object)"scaleMode")) {
            asq asq2 = this.mScaleModeListener;
            aso2.c();
            aso2.d = asq2;
            aso2.h = true;
            return;
        } else {
            if (!aso2.b.equals((Object)"flip")) return;
            {
                aso2.a("mFlipVertically");
                aso2.h = true;
                return;
            }
        }
    }

    @Override
    public asw getSignature() {
        return new asw().a("scaleMode", 1, arx.a(String.class)).a("flip", 1, arx.a(Boolean.TYPE));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected RectF getTargetRect(Rect rect, Rect rect2) {
        RectF rectF = new RectF();
        if (rect2.width() <= 0 || rect2.height() <= 0) return rectF;
        float f2 = (float)rect.width() / (float)rect.height();
        float f3 = (float)rect2.width() / (float)rect2.height() / f2;
        switch (this.mScaleMode) {
            default: {
                return rectF;
            }
            case 1: {
                rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
                return rectF;
            }
            case 2: {
                if (f3 > 1.0f) break;
                float f4 = 0.5f - 0.5f * f3;
                rectF.set(0.0f, f4, 1.0f, f3 + f4);
                return rectF;
            }
            case 3: {
                if (f3 <= 1.0f) break;
                float f5 = 0.5f - 0.5f * f3;
                rectF.set(0.0f, f5, 1.0f, f3 + f5);
                return rectF;
            }
        }
        float f6 = 0.5f - 0.5f / f3;
        rectF.set(f6, 0.0f, f6 + 1.0f / f3, 1.0f);
        return rectF;
    }

    public abstract void onBindToView(View var1);

    public void setupShader(asl asl2, Rect rect, Rect rect2) {
        RectF rectF = this.getTargetRect(rect, rect2);
        float[] arrf = new float[]{rectF.left, rectF.top, rectF.right, rectF.top, rectF.left, rectF.bottom, rectF.right, rectF.bottom};
        asl2.b(arrf);
        asl2.a = true;
        asl2.b = this.mClearColor;
        if (this.mFlipVertically) {
            asl2.a(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        }
    }
}

