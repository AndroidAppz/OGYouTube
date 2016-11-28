/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.RecyclerView
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class any
implements akc {
    private /* synthetic */ RecyclerView a;

    public any(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    private final void c(akd akd2) {
        switch (akd2.a) {
            default: {
                return;
            }
            case 1: {
                this.a.i.x_();
                return;
            }
            case 2: {
                this.a.i.c();
                return;
            }
            case 4: {
                this.a.i.d();
                return;
            }
            case 8: 
        }
        this.a.i.e();
    }

    /*
     * Exception decompiling
     */
    @Override
    public final aow a(int var1) {
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

    @Override
    public final void a(int n, int n2) {
        this.a.a(n, n2, true);
        this.a.C = true;
        aou aou2 = this.a.z;
        aou2.e = n2 + aou2.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(int n, int n2, Object object) {
        RecyclerView recyclerView = this.a;
        int n3 = recyclerView.e.b();
        int n4 = n + n2;
        for (int i = 0; i < n3; ++i) {
            View view = recyclerView.e.c(i);
            aow aow2 = RecyclerView.a((View)view);
            if (aow2 == null || aow2.b() || aow2.b < n || aow2.b >= n4) continue;
            aow2.b(2);
            if (object == null) {
                aow2.b(1024);
            } else if ((1024 & aow2.h) == 0) {
                if (aow2.i == null) {
                    aow2.i = new ArrayList();
                    aow2.j = Collections.unmodifiableList((List)aow2.i);
                }
                aow2.i.add(object);
            }
            ((aoi)view.getLayoutParams()).e = true;
        }
        aom aom2 = recyclerView.c;
        int n5 = n + n2;
        int n6 = -1 + aom2.c.size();
        do {
            int n7;
            if (n6 < 0) {
                this.a.D = true;
                return;
            }
            aow aow3 = (aow)aom2.c.get(n6);
            if (aow3 != null && (n7 = aow3.c()) >= n && n7 < n5) {
                aow3.b(2);
                aom2.b(n6);
            }
            --n6;
        } while (true);
    }

    @Override
    public final void a(akd akd2) {
        super.c(akd2);
    }

    @Override
    public final void b(int n, int n2) {
        this.a.a(n, n2, false);
        this.a.C = true;
    }

    @Override
    public final void b(akd akd2) {
        super.c(akd2);
    }

    @Override
    public final void c(int n, int n2) {
        RecyclerView recyclerView = this.a;
        int n3 = recyclerView.e.b();
        for (int i = 0; i < n3; ++i) {
            aow aow2 = RecyclerView.a((View)recyclerView.e.c(i));
            if (aow2 == null || aow2.b() || aow2.b < n) continue;
            aow2.a(n2, false);
            recyclerView.z.f = true;
        }
        aom aom2 = recyclerView.c;
        int n4 = aom2.c.size();
        for (int j = 0; j < n4; ++j) {
            aow aow3 = (aow)aom2.c.get(j);
            if (aow3 == null || aow3.b < n) continue;
            aow3.a(n2, true);
        }
        recyclerView.requestLayout();
        this.a.C = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void d(int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = -1;
        RecyclerView recyclerView = this.a;
        int n9 = recyclerView.e.b();
        if (n < n2) {
            n5 = n8;
            n4 = n2;
            n6 = n;
        } else {
            n5 = 1;
            n4 = n;
            n6 = n2;
        }
        for (int i = 0; i < n9; ++i) {
            aow aow2 = RecyclerView.a((View)recyclerView.e.c(i));
            if (aow2 == null || aow2.b < n6 || aow2.b > n4) continue;
            if (aow2.b == n) {
                aow2.a(n2 - n, false);
            } else {
                aow2.a(n5, false);
            }
            recyclerView.z.f = true;
        }
        aom aom2 = recyclerView.c;
        if (n < n2) {
            n7 = n2;
            n3 = n;
        } else {
            n8 = 1;
            n7 = n;
            n3 = n2;
        }
        int n10 = aom2.c.size();
        int n11 = 0;
        do {
            if (n11 >= n10) {
                recyclerView.requestLayout();
                this.a.C = true;
                return;
            }
            aow aow3 = (aow)aom2.c.get(n11);
            if (aow3 != null && aow3.b >= n3 && aow3.b <= n7) {
                if (aow3.b == n) {
                    aow3.a(n2 - n, false);
                } else {
                    aow3.a(n8, false);
                }
            }
            ++n11;
        } while (true);
    }
}

