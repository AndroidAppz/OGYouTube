/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  rw
 */
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aom {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    final List d;
    final /* synthetic */ RecyclerView e;
    private int f;
    private aol g;

    public aom(RecyclerView recyclerView) {
        this.e = recyclerView;
        this.a = new ArrayList();
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList((List)this.a);
        this.f = 2;
    }

    private final void c(aow aow2) {
        rw.a((View)aow2.a, (pl)null);
        if (this.e.j != null) {
            this.e.j.a();
        }
        if (this.e.h != null) {
            this.e.h.a(aow2);
        }
        if (this.e.z != null) {
            this.e.f.d(aow2);
        }
        aow2.n = null;
        aol aol2 = this.c();
        int n = aow2.d;
        ArrayList arrayList = (ArrayList)aol2.a.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList();
            aol2.a.put(n, (Object)arrayList);
            if (aol2.b.indexOfKey(n) < 0) {
                aol2.b.put(n, 5);
            }
        }
        if (aol2.b.get(n) > arrayList.size()) {
            aow2.q();
            arrayList.add((Object)aow2);
        }
    }

    public final int a(int n) {
        if (n < 0 || n >= this.e.z.a()) {
            throw new IndexOutOfBoundsException("invalid position " + n + ". State item count is " + this.e.z.a());
        }
        if (!this.e.z.g) {
            return n;
        }
        return this.e.d.b(n);
    }

    /*
     * Exception decompiling
     */
    final aow a(int var1, boolean var2_2) {
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

    public final void a() {
        this.a.clear();
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(View view) {
        aow aow2 = RecyclerView.a((View)view);
        if (aow2.n()) {
            this.e.removeDetachedView(view, false);
        }
        if (aow2.e()) {
            aow2.f();
        } else if (aow2.g()) {
            aow2.h();
        }
        this.a(aow2);
    }

    final void a(ViewGroup viewGroup, boolean bl2) {
        for (int i = -1 + viewGroup.getChildCount(); i >= 0; --i) {
            View view = viewGroup.getChildAt(i);
            if (!(view instanceof ViewGroup)) continue;
            this.a((ViewGroup)view, true);
        }
        if (!bl2) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int n = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void a(aow var1) {
        var2_2 = true;
        if (var1.e() || var1.a.getParent() != null) {
            var3_3 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(var1.e()).append(" isAttached:");
            if (var1.a.getParent() != null) {
                throw new IllegalArgumentException(var3_3.append(var2_2).toString());
            }
            var2_2 = false;
            throw new IllegalArgumentException(var3_3.append(var2_2).toString());
        }
        if (var1.n()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + var1);
        }
        if (var1.b()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        var4_4 = (16 & var1.h) == 0 && rw.b((View)var1.a) != false ? var2_2 : false;
        if (this.e.h == null || var4_4) {
            // empty if block
        }
        if (!var1.r()) ** GOTO lbl33
        if (var1.a(14)) ** GOTO lbl-1000
        var8_5 = this.c.size();
        if (var8_5 == this.f && var8_5 > 0) {
            this.b(0);
        }
        if (var8_5 < this.f) {
            this.c.add((Object)var1);
            var7_6 = var2_2;
        } else lbl-1000: // 2 sources:
        {
            var7_6 = false;
        }
        if (!var7_6) {
            super.c(var1);
            var6_7 = var2_2;
            var5_8 = var7_6;
        } else {
            var5_8 = var7_6;
            var6_7 = false;
        }
        ** GOTO lbl35
lbl33: // 1 sources:
        var5_8 = false;
        var6_7 = false;
lbl35: // 3 sources:
        this.e.f.d(var1);
        if (var5_8 != false) return;
        if (var6_7 != false) return;
        if (var4_4 == false) return;
        var1.n = null;
    }

    public final void b() {
        for (int i = -1 + this.c.size(); i >= 0; --i) {
            this.b(i);
        }
        this.c.clear();
    }

    public final void b(int n) {
        super.c((aow)this.c.get(n));
        this.c.remove(n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void b(View var1) {
        var2_2 = RecyclerView.a((View)var1);
        if (var2_2.a(12) || !var2_2.s()) ** GOTO lbl-1000
        var5_3 = this.e;
        var6_4 = var5_3.w == null || var5_3.w.a(var2_2, var2_2.p()) != false;
        if (var6_4) lbl-1000: // 2 sources:
        {
            if (var2_2.j() && !var2_2.m()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            }
            var2_2.a((aom)this, false);
            this.a.add((Object)var2_2);
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        var2_2.a((aom)this, true);
        this.b.add((Object)var2_2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(aow aow2) {
        if (aow2.l) {
            this.b.remove((Object)aow2);
        } else {
            this.a.remove((Object)aow2);
        }
        aow2.k = null;
        aow2.l = false;
        aow2.h();
    }

    public final aol c() {
        if (this.g == null) {
            this.g = new aol();
        }
        return this.g;
    }

    final aow c(int n) {
        int n2;
        if (this.b == null || (n2 = this.b.size()) == 0) {
            return null;
        }
        for (int i = 0; i < n2; ++i) {
            aow aow2 = (aow)this.b.get(i);
            if (aow2.g() || aow2.c() != n) continue;
            aow2.b(32);
            return aow2;
        }
        return null;
    }
}

