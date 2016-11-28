/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.Vector
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public final class aqy {
    final arx a;
    int[] b;
    public long c = -1;
    int d = 1;
    private final aro e;
    private Vector f = new Vector();
    private boolean g = false;
    private int h = 0;
    private ara i = null;
    private ara j = null;

    public aqy(arx arx2, int[] arrn, aro aro2) {
        this.a = arx2;
        Object object = null;
        if (arrn != null) {
            object = Arrays.copyOf((int[])arrn, (int)arrn.length);
        }
        this.b = object;
        this.e = aro2;
    }

    private final void a(ara ara2) {
        aro aro2 = this.e;
        if (!ara2.f() || !aro2.c.a(ara2)) {
            ara2.g();
            aro2.b.remove((Object)ara2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(ara ara2, int n) {
        if (n == 2) {
            if (this.h > 0) {
                String string = String.valueOf((Object)this);
                throw new RuntimeException(new StringBuilder(48 + String.valueOf((Object)string).length()).append("Attempting to write-lock the read-locked frame ").append(string).append("!").toString());
            }
            if (this.g) {
                String string = String.valueOf((Object)this);
                throw new RuntimeException(new StringBuilder(49 + String.valueOf((Object)string).length()).append("Attempting to write-lock the write-locked frame ").append(string).append("!").toString());
            }
            for (int i = 0; i < this.f.size(); ++i) {
                ara ara3 = (ara)this.f.get(i);
                if (ara3 == ara2) continue;
                ara3.d = true;
            }
            this.g = true;
            this.i = ara2;
        } else {
            if (this.g) {
                String string = String.valueOf((Object)this);
                throw new RuntimeException(new StringBuilder(38 + String.valueOf((Object)string).length()).append("Attempting to read-lock locked frame ").append(string).append("!").toString());
            }
            this.h = 1 + this.h;
        }
        this.j = ara2;
    }

    public final Object a(int n, int n2) {
        return this.b(n, n2).a(n2);
    }

    public final void a(int[] arrn) {
        Vector vector = new Vector();
        Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            super.a((ara)iterator.next());
        }
        this.f = vector;
        this.b = arrn;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a() {
        if (this.g) {
            this.g = false;
        } else {
            int n = this.h;
            boolean bl2 = false;
            if (n <= 0) return bl2;
            this.h = -1 + this.h;
        }
        this.j.d();
        this.j = null;
        return true;
    }

    /*
     * Exception decompiling
     */
    public final ara b(int var1, int var2_2) {
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

    final void b() {
        for (int i = 0; i < this.f.size(); ++i) {
            this.a((ara)this.f.get(i));
        }
        this.f.clear();
        this.i = null;
    }
}

