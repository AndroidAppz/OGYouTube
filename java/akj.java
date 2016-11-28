/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.LayerDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.SparseArray
 *  android.util.TypedValue
 *  it
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.WeakHashMap
 *  jh
 *  ji
 *  or
 *  ot
 *  ow
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class akj {
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static akj b;
    private static final akl c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private WeakHashMap j;
    private or k;
    private SparseArray l;
    private final Object m = new Object();
    private final WeakHashMap n = new WeakHashMap(0);
    private TypedValue o;

    static {
        c = new akl();
        int[] arrn = new int[]{acu.N, acu.L, acu.a};
        d = arrn;
        int[] arrn2 = new int[]{acu.k, acu.n, acu.u, acu.m, acu.l, acu.t, acu.o, acu.p, acu.s, acu.r, acu.q, acu.v};
        e = arrn2;
        int[] arrn3 = new int[]{acu.K, acu.M, acu.i, acu.J};
        f = arrn3;
        int[] arrn4 = new int[]{acu.y, acu.g, acu.x};
        g = arrn4;
        int[] arrn5 = new int[]{acu.j, acu.I, acu.O, acu.E, acu.F, acu.z, acu.H, acu.G, acu.e, acu.b};
        h = arrn5;
        int[] arrn6 = new int[]{acu.c, acu.f};
        i = arrn6;
    }

    private static long a(TypedValue typedValue) {
        return (long)typedValue.assetCookie << 32 | (long)typedValue.data;
    }

    public static akj a() {
        if (b == null) {
            akj akj2;
            b = akj2 = new akj();
            int n = Build.VERSION.SDK_INT;
            if (n < 23) {
                akj2.a("vector", new akn());
                if (n >= 11) {
                    akj2.a("animated-vector", new akk());
                }
            }
        }
        return b;
    }

    public static PorterDuffColorFilter a(int n, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter)c.a((Object)akl.a(n, mode));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(n, mode);
            c.a((Object)akl.a(n, mode), (Object)porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Drawable a(Context context, long l) {
        Object object;
        Object object2 = object = this.m;
        synchronized (object2) {
            ow ow2 = (ow)this.n.get((Object)context);
            if (ow2 == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference)ow2.a(l);
            if (weakReference == null) return null;
            Drawable.ConstantState constantState = (Drawable.ConstantState)weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int n = ot.a((long[])ow2.c, (int)ow2.e, (long)l);
            if (n < 0) return null;
            if (ow2.d[n] == ow.a) return null;
            ow2.d[n] = ow.a;
            ow2.b = true;
            return null;
        }
    }

    private static void a(Drawable drawable, int n, PorterDuff.Mode mode) {
        if (amj.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = a;
        }
        drawable.setColorFilter((ColorFilter)akj.a(n, mode));
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(Drawable drawable, aqg aqg2, int[] arrn) {
        if (amj.c(drawable) && drawable.mutate() != drawable) {
            return;
        }
        if (aqg2.d || aqg2.c) {
            ColorStateList colorStateList = aqg2.d ? aqg2.a : null;
            PorterDuff.Mode mode = aqg2.c ? aqg2.b : a;
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (colorStateList != null) {
                porterDuffColorFilter = null;
                if (mode != null) {
                    porterDuffColorFilter = akj.a(colorStateList.getColorForState(arrn, 0), mode);
                }
            }
            drawable.setColorFilter((ColorFilter)porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT > 23) return;
        drawable.invalidateSelf();
    }

    private final void a(String string, akm akm2) {
        if (this.k == null) {
            this.k = new or();
        }
        this.k.put((Object)string, (Object)akm2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean a(Context context, int n, Drawable drawable) {
        int n2;
        int n3;
        boolean bl2;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = a;
        if (akj.a(d, n)) {
            n3 = acq.t;
            mode = mode2;
            bl2 = true;
            n2 = -1;
        } else if (akj.a(f, n)) {
            n3 = acq.r;
            mode = mode2;
            bl2 = true;
            n2 = -1;
        } else if (akj.a(g, n)) {
            PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
            bl2 = true;
            mode = mode3;
            n3 = 16842801;
            n2 = -1;
        } else if (n == acu.w) {
            n3 = 16842800;
            n2 = Math.round((float)40.8f);
            mode = mode2;
            bl2 = true;
        } else {
            n2 = -1;
            mode = mode2;
            n3 = 0;
            bl2 = false;
        }
        if (!bl2) return false;
        if (amj.c(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter((ColorFilter)akj.a(aqe.a(context, n3), mode));
        if (n2 != -1) {
            drawable.setAlpha(n2);
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean a(Context context, long l, Drawable drawable) {
        Object object;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        Object object2 = object = this.m;
        synchronized (object2) {
            ow ow2 = (ow)this.n.get((Object)context);
            if (ow2 == null) {
                ow2 = new ow();
                this.n.put((Object)context, (Object)ow2);
            }
            ow2.a(l, (Object)new WeakReference((Object)constantState));
            return true;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(int[] arrn, int n) {
        int n2 = arrn.length;
        int n3 = 0;
        do {
            boolean bl2 = false;
            if (n3 >= n2) return bl2;
            if (arrn[n3] == n) {
                return true;
            }
            ++n3;
        } while (true);
    }

    /*
     * Exception decompiling
     */
    private final Drawable b(Context var1, int var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.util.ConcurrentModificationException
        // java.util.LinkedList$ReverseLinkIterator.next(LinkedList.java:217)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.extractLabelledBlocks(Block.java:212)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:485)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.transform(Op04StructuredStatement.java:639)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.insertLabelledBlocks(Op04StructuredStatement.java:649)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:816)
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

    private static ColorStateList c(Context context, int n) {
        int[][] arrarrn = new int[4][];
        int[] arrn = new int[4];
        int n2 = aqe.a(context, acq.s);
        arrarrn[0] = aqe.a;
        arrn[0] = aqe.c(context, acq.q);
        arrarrn[1] = aqe.d;
        arrn[1] = jh.a((int)n2, (int)n);
        arrarrn[2] = aqe.b;
        arrn[2] = jh.a((int)n2, (int)n);
        arrarrn[3] = aqe.h;
        arrn[3] = n;
        return new ColorStateList((int[][])arrarrn, arrn);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final ColorStateList a(Context context, int n) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j != null ? ((sparseArray2 = (SparseArray)this.j.get((Object)context)) != null ? (ColorStateList)sparseArray2.get(n) : null) : null;
        if (colorStateList2 != null) return colorStateList2;
        if (n == acu.j) {
            int[][] arrarrn = new int[3][];
            int[] arrn = new int[3];
            arrarrn[0] = aqe.a;
            arrn[0] = aqe.c(context, acq.t);
            arrarrn[1] = aqe.g;
            arrn[1] = aqe.a(context, acq.t);
            arrarrn[2] = aqe.h;
            arrn[2] = aqe.a(context, acq.r);
            colorStateList = new ColorStateList((int[][])arrarrn, arrn);
        } else if (n == acu.H) {
            int[][] arrarrn = new int[3][];
            int[] arrn = new int[3];
            arrarrn[0] = aqe.a;
            arrn[0] = aqe.a(context, 16842800, 0.1f);
            arrarrn[1] = aqe.e;
            arrn[1] = aqe.a(context, acq.r, 0.3f);
            arrarrn[2] = aqe.h;
            arrn[2] = aqe.a(context, 16842800, 0.3f);
            colorStateList = new ColorStateList((int[][])arrarrn, arrn);
        } else if (n == acu.G) {
            int[][] arrarrn = new int[3][];
            int[] arrn = new int[3];
            ColorStateList colorStateList3 = aqe.b(context, acq.u);
            if (colorStateList3 != null && colorStateList3.isStateful()) {
                arrarrn[0] = aqe.a;
                arrn[0] = colorStateList3.getColorForState(arrarrn[0], 0);
                arrarrn[1] = aqe.e;
                arrn[1] = aqe.a(context, acq.r);
                arrarrn[2] = aqe.h;
                arrn[2] = colorStateList3.getDefaultColor();
            } else {
                arrarrn[0] = aqe.a;
                arrn[0] = aqe.c(context, acq.u);
                arrarrn[1] = aqe.e;
                arrn[1] = aqe.a(context, acq.r);
                arrarrn[2] = aqe.h;
                arrn[2] = aqe.a(context, acq.u);
            }
            colorStateList = new ColorStateList((int[][])arrarrn, arrn);
        } else if (n == acu.e) {
            colorStateList = akj.c(context, aqe.a(context, acq.q));
        } else if (n == acu.b) {
            colorStateList = akj.c(context, 0);
        } else if (n == acu.d) {
            colorStateList = akj.c(context, aqe.a(context, acq.p));
        } else if (n == acu.E || n == acu.F) {
            int[][] arrarrn = new int[3][];
            int[] arrn = new int[3];
            arrarrn[0] = aqe.a;
            arrn[0] = aqe.c(context, acq.t);
            arrarrn[1] = aqe.g;
            arrn[1] = aqe.a(context, acq.t);
            arrarrn[2] = aqe.h;
            arrn[2] = aqe.a(context, acq.r);
            colorStateList = new ColorStateList((int[][])arrarrn, arrn);
        } else if (akj.a(e, n)) {
            colorStateList = aqe.b(context, acq.t);
        } else if (akj.a(h, n)) {
            int n2 = aqe.a(context, acq.t);
            int n3 = aqe.a(context, acq.r);
            int[][] arrarrn = new int[7][];
            int[] arrn = new int[7];
            arrarrn[0] = aqe.a;
            arrn[0] = aqe.c(context, acq.t);
            arrarrn[1] = aqe.b;
            arrn[1] = n3;
            arrarrn[2] = aqe.c;
            arrn[2] = n3;
            arrarrn[3] = aqe.d;
            arrn[3] = n3;
            arrarrn[4] = aqe.e;
            arrn[4] = n3;
            arrarrn[5] = aqe.f;
            arrn[5] = n3;
            arrarrn[6] = aqe.h;
            arrn[6] = n2;
            colorStateList = new ColorStateList((int[][])arrarrn, arrn);
        } else if (akj.a(i, n)) {
            int[][] arrarrn = new int[3][];
            int[] arrn = new int[3];
            arrarrn[0] = aqe.a;
            arrn[0] = aqe.c(context, acq.t);
            arrarrn[1] = aqe.e;
            arrn[1] = aqe.a(context, acq.r);
            arrarrn[2] = aqe.h;
            arrn[2] = aqe.a(context, acq.t);
            colorStateList = new ColorStateList((int[][])arrarrn, arrn);
        } else if (n == acu.C) {
            int[][] arrarrn = new int[2][];
            int[] arrn = new int[2];
            arrarrn[0] = aqe.a;
            arrn[0] = aqe.c(context, acq.r);
            arrarrn[1] = aqe.h;
            arrn[1] = aqe.a(context, acq.r);
            colorStateList = new ColorStateList((int[][])arrarrn, arrn);
        } else {
            colorStateList = colorStateList2;
        }
        if (colorStateList == null) return colorStateList;
        if (this.j == null) {
            this.j = new WeakHashMap();
        }
        if ((sparseArray = (SparseArray)this.j.get((Object)context)) == null) {
            sparseArray = new SparseArray();
            this.j.put((Object)context, (Object)sparseArray);
        }
        sparseArray.append(n, (Object)colorStateList);
        return colorStateList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Drawable a(Context context, int n, boolean bl2) {
        Drawable drawable = super.b(context, n);
        if (drawable == null) {
            if (this.o == null) {
                this.o = new TypedValue();
            }
            TypedValue typedValue = this.o;
            context.getResources().getValue(n, typedValue, true);
            long l = akj.a(typedValue);
            Drawable drawable2 = super.a(context, l);
            if (drawable2 == null) {
                if (n == acu.h) {
                    Drawable[] arrdrawable = new Drawable[]{this.a(context, acu.g, false), this.a(context, acu.i, false)};
                    drawable2 = new LayerDrawable(arrdrawable);
                }
                if (drawable2 != null) {
                    drawable2.setChangingConfigurations(typedValue.changingConfigurations);
                    super.a(context, l, drawable2);
                }
            }
            drawable = drawable2;
        }
        if (drawable == null) {
            drawable = it.a((Context)context, (int)n);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.a(context, n);
            if (colorStateList != null) {
                if (amj.c(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable = ji.e((Drawable)drawable);
                ji.a((Drawable)drawable, (ColorStateList)colorStateList);
                int n2 = acu.G;
                PorterDuff.Mode mode = null;
                if (n == n2 && (mode = PorterDuff.Mode.MULTIPLY) != null) {
                    ji.a((Drawable)drawable, (PorterDuff.Mode)mode);
                }
            } else if (n == acu.D) {
                LayerDrawable layerDrawable = (LayerDrawable)drawable;
                akj.a(layerDrawable.findDrawableByLayerId(16908288), aqe.a(context, acq.t), a);
                akj.a(layerDrawable.findDrawableByLayerId(16908303), aqe.a(context, acq.t), a);
                akj.a(layerDrawable.findDrawableByLayerId(16908301), aqe.a(context, acq.r), a);
            } else if (n == acu.A || n == acu.B) {
                LayerDrawable layerDrawable = (LayerDrawable)drawable;
                akj.a(layerDrawable.findDrawableByLayerId(16908288), aqe.c(context, acq.t), a);
                akj.a(layerDrawable.findDrawableByLayerId(16908303), aqe.a(context, acq.r), a);
                akj.a(layerDrawable.findDrawableByLayerId(16908301), aqe.a(context, acq.r), a);
            } else if (!akj.a(context, n, drawable) && bl2) {
                return null;
            }
        }
        if (drawable == null) return drawable;
        amj.b(drawable);
        return drawable;
    }
}

