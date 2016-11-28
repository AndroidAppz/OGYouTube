/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.database.DataSetObserver
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.reflect.Method
 *  java.util.Locale
 *  oo
 *  op
 */
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.Locale;

public class ana {
    private static Method a;
    private static Method b;
    private Context c;
    private ListAdapter d;
    public PopupWindow e;
    public and f;
    int g;
    int h;
    int i;
    boolean j;
    public int k;
    int l;
    public View m;
    public AdapterView.OnItemClickListener n;
    final anl o;
    final Handler p;
    private int q;
    private int r;
    private DataSetObserver s;
    private final ank t;
    private final anj u;
    private final anh v;
    private Rect w;
    private boolean x;

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    static {
        try {
            var3 = new Class[]{Boolean.TYPE};
            ana.a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", var3);
        }
        catch (NoSuchMethodException var0_3) {
            ** continue;
        }
lbl6: // 2 sources:
        do {
            try {
                var2_1 = new Class[]{View.class, Integer.TYPE, Boolean.TYPE};
                ana.b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", var2_1);
                return;
            }
            catch (NoSuchMethodException var1_2) {
                return;
            }
            break;
        } while (true);
    }

    public ana(Context context) {
        super(context, null, acq.A);
    }

    public ana(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n, 0);
    }

    public ana(Context context, AttributeSet attributeSet, int n, int n2) {
        this.q = -2;
        this.g = -2;
        this.r = 1002;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.o = new anl((ana)this);
        this.t = new ank((ana)this);
        this.u = new anj((ana)this);
        this.v = new anh((ana)this);
        this.w = new Rect();
        this.c = context;
        this.p = new Handler(context.getMainLooper());
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, ada.ax, n, n2);
        this.h = typedArray.getDimensionPixelOffset(ada.ay, 0);
        this.i = typedArray.getDimensionPixelOffset(ada.az, 0);
        if (this.i != 0) {
            this.j = true;
        }
        typedArray.recycle();
        this.e = new akt(context, attributeSet, n);
        this.e.setInputMethodMode(1);
        Locale locale = this.c.getResources().getConfiguration().locale;
        oo.a.a(locale);
    }

    private final int a(View view, int n, boolean bl2) {
        if (b != null) {
            try {
                Method method = b;
                PopupWindow popupWindow = this.e;
                Object[] arrobject = new Object[]{view, n, bl2};
                int n2 = (Integer)method.invoke((Object)popupWindow, arrobject);
                return n2;
            }
            catch (Exception var4_8) {
                // empty catch block
            }
        }
        return this.e.getMaxAvailableHeight(view, n);
    }

    public final void a(int n) {
        Drawable drawable = this.e.getBackground();
        if (drawable != null) {
            drawable.getPadding(this.w);
            this.g = n + (this.w.left + this.w.right);
            return;
        }
        this.g = n;
    }

    public final void a(Drawable drawable) {
        this.e.setBackgroundDrawable(drawable);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(ListAdapter listAdapter) {
        if (this.s == null) {
            this.s = new ani((ana)this);
        } else if (this.d != null) {
            this.d.unregisterDataSetObserver(this.s);
        }
        this.d = listAdapter;
        if (this.d != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        if (this.f != null) {
            this.f.setAdapter(this.d);
        }
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.e.setOnDismissListener(onDismissListener);
    }

    /*
     * Exception decompiling
     */
    public void b() {
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

    public final void c() {
        this.x = true;
        this.e.setFocusable(true);
    }

    public final void d() {
        this.e.dismiss();
        this.e.setContentView(null);
        this.f = null;
        this.p.removeCallbacks((Runnable)this.o);
    }

    public final void e() {
        this.e.setInputMethodMode(2);
    }

    public final void f() {
        and and2 = this.f;
        if (and2 != null) {
            and2.a = true;
            and2.requestLayout();
        }
    }

    public final boolean g() {
        if (this.e.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }
}

