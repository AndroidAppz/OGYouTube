/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Adapter
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  it
 *  java.lang.CharSequence
 *  java.lang.Math
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public final class ala
extends Spinner
implements rr {
    static final boolean a;
    private static final boolean e;
    private static final int[] f;
    ald b;
    int c;
    final Rect d;
    private akj g;
    private akf h;
    private Context i;
    private ane j;
    private SpinnerAdapter k;
    private boolean l;

    /*
     * Enabled aggressive block sorting
     */
    static {
        boolean bl2 = Build.VERSION.SDK_INT >= 23;
        a = bl2;
        boolean bl3 = Build.VERSION.SDK_INT >= 16;
        e = bl3;
        f = new int[]{16843505};
    }

    public ala(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, acq.H);
    }

    public ala(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n, 0);
    }

    private ala(Context context, AttributeSet attributeSet, int n, byte by2) {
        super(context, attributeSet, n, -1);
    }

    /*
     * Exception decompiling
     */
    private ala(Context var1_1, AttributeSet var2_4, int var3_3, int var4) {
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

    /*
     * Enabled aggressive block sorting
     */
    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null) {
            return 0;
        }
        int n = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0);
        int n2 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0);
        int n3 = Math.max((int)0, (int)this.getSelectedItemPosition());
        int n4 = Math.min((int)spinnerAdapter.getCount(), (int)(n3 + 15));
        View view = null;
        int n5 = 0;
        int n6 = 0;
        for (int i = Math.max((int)0, (int)(n3 - (15 - (n4 - n3)))); i < n4; ++i) {
            View view2;
            int n7 = spinnerAdapter.getItemViewType(i);
            if (n7 != n6) {
                view2 = null;
            } else {
                n7 = n6;
                view2 = view;
            }
            if ((view = spinnerAdapter.getView(i, view2, (ViewGroup)this)).getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(n, n2);
            n5 = Math.max((int)n5, (int)view.getMeasuredWidth());
            n6 = n7;
        }
        if (drawable != null) {
            drawable.getPadding(this.d);
            return n5 + (this.d.left + this.d.right);
        }
        return n5;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.h != null) {
            this.h.c();
        }
    }

    public final int getDropDownHorizontalOffset() {
        if (this.b != null) {
            return this.b.h;
        }
        if (e) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int getDropDownVerticalOffset() {
        if (this.b != null) {
            ald ald2 = this.b;
            if (!ald2.j) return 0;
            return ald2.i;
        }
        if (e) return super.getDropDownVerticalOffset();
        return 0;
    }

    public final int getDropDownWidth() {
        if (this.b != null) {
            return this.c;
        }
        if (e) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final Drawable getPopupBackground() {
        if (this.b != null) {
            return this.b.e.getBackground();
        }
        if (e) {
            return super.getPopupBackground();
        }
        return null;
    }

    public final Context getPopupContext() {
        if (this.b != null) {
            return this.i;
        }
        if (a) {
            return super.getPopupContext();
        }
        return null;
    }

    public final CharSequence getPrompt() {
        if (this.b != null) {
            return this.b.a;
        }
        return super.getPrompt();
    }

    @Override
    public final ColorStateList getSupportBackgroundTintList() {
        if (this.h != null) {
            return this.h.a();
        }
        return null;
    }

    @Override
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.h != null) {
            return this.h.b();
        }
        return null;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null && this.b.e.isShowing()) {
            this.b.d();
        }
    }

    protected final void onMeasure(int n, int n2) {
        super.onMeasure(n, n2);
        if (this.b != null && View.MeasureSpec.getMode((int)n) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min((int)Math.max((int)this.getMeasuredWidth(), (int)this.a(this.getAdapter(), this.getBackground())), (int)View.MeasureSpec.getSize((int)n)), this.getMeasuredHeight());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j != null && this.j.onTouch((View)this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean performClick() {
        if (this.b != null) {
            if (!this.b.e.isShowing()) {
                this.b.b();
            }
            return true;
        }
        return super.performClick();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        Context context;
        if (!this.l) {
            this.k = spinnerAdapter;
            return;
        } else {
            super.setAdapter(spinnerAdapter);
            if (this.b == null) return;
            {
                context = this.i == null ? this.getContext() : this.i;
            }
        }
        this.b.a(new alc(spinnerAdapter, context.getTheme()));
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.h != null) {
            this.h.b(null);
        }
    }

    public final void setBackgroundResource(int n) {
        super.setBackgroundResource(n);
        if (this.h != null) {
            this.h.a(n);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setDropDownHorizontalOffset(int n) {
        if (this.b != null) {
            this.b.h = n;
            return;
        } else {
            if (!e) return;
            {
                super.setDropDownHorizontalOffset(n);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setDropDownVerticalOffset(int n) {
        if (this.b != null) {
            ald ald2 = this.b;
            ald2.i = n;
            ald2.j = true;
            return;
        } else {
            if (!e) return;
            {
                super.setDropDownVerticalOffset(n);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setDropDownWidth(int n) {
        if (this.b != null) {
            this.c = n;
            return;
        } else {
            if (!e) return;
            {
                super.setDropDownWidth(n);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.b != null) {
            this.b.a(drawable);
            return;
        } else {
            if (!e) return;
            {
                super.setPopupBackgroundDrawable(drawable);
                return;
            }
        }
    }

    public final void setPopupBackgroundResource(int n) {
        this.setPopupBackgroundDrawable(it.a((Context)this.getPopupContext(), (int)n));
    }

    public final void setPrompt(CharSequence charSequence) {
        if (this.b != null) {
            this.b.a = charSequence;
            return;
        }
        super.setPrompt(charSequence);
    }

    @Override
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.h != null) {
            this.h.a(colorStateList);
        }
    }

    @Override
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.h != null) {
            this.h.a(mode);
        }
    }
}

