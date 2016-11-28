/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.DrawableContainer
 *  android.graphics.drawable.DrawableContainer$DrawableContainerState
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.ScaleDrawable
 *  android.graphics.drawable.StateListDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.String
 *  js
 */
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;

public final class amj {
    public static final Rect a = new Rect();
    private static Class b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT < 18) return;
        try {
            b = Class.forName((String)"android.graphics.Insets");
            return;
        }
        catch (ClassNotFoundException var0) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static PorterDuff.Mode a(int n) {
        switch (n) {
            default: {
                return null;
            }
            case 3: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 9: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                if (Build.VERSION.SDK_INT < 11) return null;
                return PorterDuff.Mode.valueOf((String)"ADD");
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static Rect a(Drawable var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:486)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:422)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:220)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:165)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:91)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:354)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:751)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:683)
        // org.benf.cfr.reader.Main.doJar(Main.java:128)
        // com.njlabs.showjava.processor.JavaExtractor$1.run(JavaExtractor.java:100)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals((Object)drawable.getClass().getName())) {
            int[] arrn = drawable.getState();
            if (arrn == null || arrn.length == 0) {
                drawable.setState(aqe.e);
            } else {
                drawable.setState(aqe.h);
            }
            drawable.setState(arrn);
        }
    }

    public static boolean c(Drawable drawable) {
        Drawable drawable2 = drawable;
        do {
            if (drawable2 instanceof LayerDrawable) {
                if (Build.VERSION.SDK_INT >= 16) {
                    return true;
                }
                return false;
            }
            if (drawable2 instanceof InsetDrawable) {
                if (Build.VERSION.SDK_INT >= 14) {
                    return true;
                }
                return false;
            }
            if (drawable2 instanceof StateListDrawable) {
                if (Build.VERSION.SDK_INT >= 8) {
                    return true;
                }
                return false;
            }
            if (drawable2 instanceof GradientDrawable) {
                if (Build.VERSION.SDK_INT >= 14) {
                    return true;
                }
                return false;
            }
            if (drawable2 instanceof DrawableContainer) {
                Drawable.ConstantState constantState = drawable2.getConstantState();
                if (!(constantState instanceof DrawableContainer.DrawableContainerState)) break;
                Drawable[] arrdrawable = ((DrawableContainer.DrawableContainerState)constantState).getChildren();
                int n = arrdrawable.length;
                for (int i = 0; i < n; ++i) {
                    if (amj.c(arrdrawable[i])) continue;
                    return false;
                }
                break;
            }
            if (drawable2 instanceof js) {
                drawable2 = ((js)drawable2).a();
                continue;
            }
            if (drawable2 instanceof adr) {
                drawable2 = ((adr)drawable2).f;
                continue;
            }
            if (!(drawable2 instanceof ScaleDrawable)) break;
            drawable2 = ((ScaleDrawable)drawable2).getDrawable();
        } while (true);
        return true;
    }
}

