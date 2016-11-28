/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.NavigableMap
 *  java.util.TreeMap
 */
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class bbh
implements baw {
    private final bbe a;
    private final bbj b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public bbh() {
        this.a = new bbe();
        this.b = new bbj();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    public bbh(int n) {
        this.a = new bbe();
        this.b = new bbj();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = n;
    }

    private final NavigableMap a(Class class_) {
        NavigableMap navigableMap = (NavigableMap)this.c.get((Object)class_);
        if (navigableMap == null) {
            navigableMap = new TreeMap();
            this.c.put((Object)class_, (Object)navigableMap);
        }
        return navigableMap;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final bav b(Class var1) {
        var2_2 = (bav)this.d.get((Object)var1);
        if (var2_2 != null) return var2_2;
        if (!var1.equals((Object)int[].class)) ** GOTO lbl6
        var2_2 = new bbg();
        ** GOTO lbl8
lbl6: // 1 sources:
        if (var1.equals((Object)byte[].class)) {
            var2_2 = new bbd();
lbl8: // 2 sources:
            this.d.put((Object)var1, (Object)var2_2);
            return var2_2;
        }
        var4_3 = String.valueOf((Object)var1.getSimpleName());
        if (var4_3.length() != 0) {
            var5_4 = "No array pool found for: ".concat(var4_3);
            throw new IllegalArgumentException(var5_4);
        }
        var5_4 = new String("No array pool found for: ");
        throw new IllegalArgumentException(var5_4);
    }

    private final void b(int n) {
        while (this.f > n) {
            Object object = this.a.a();
            blm.a(object, "Argument must not be null");
            bav bav2 = super.b(object.getClass());
            this.f -= bav2.a(object) * bav2.b();
            super.b(bav2.a(object), object.getClass());
            if (!Log.isLoggable((String)bav2.a(), (int)2)) continue;
            int n2 = bav2.a(object);
            new StringBuilder(20).append("evicted: ").append(n2);
        }
    }

    private final void b(int n, Class class_) {
        NavigableMap navigableMap = super.a(class_);
        Integer n2 = (Integer)navigableMap.get((Object)n);
        if (n2 == null) {
            String string = String.valueOf((Object)this);
            throw new NullPointerException(new StringBuilder(56 + String.valueOf((Object)string).length()).append("Tried to decrement empty size, size: ").append(n).append(", this: ").append(string).toString());
        }
        if (n2 == 1) {
            navigableMap.remove((Object)n);
            return;
        }
        navigableMap.put((Object)n, (Object)(-1 + n2));
    }

    /*
     * Exception decompiling
     */
    @Override
    public final Object a(int var1, Class var2_2) {
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
    public final void a() {
        bbh bbh2 = this;
        synchronized (bbh2) {
            this.b(0);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(int n) {
        void var3_2 = this;
        synchronized (var3_2) {
            if (n >= 40) {
                this.a();
            } else if (n >= 20) {
                super.b(this.e / 2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(Object object, Class class_) {
        void var15_3 = this;
        synchronized (var15_3) {
            bav bav2 = super.b(class_);
            int n = bav2.a(object);
            int n2 = this.e / 2;
            if (n > n2) {
                return;
            }
            boolean bl2 = true;
            if (bl2) {
                int n3;
                bbi bbi2 = this.b.a(n, class_);
                this.a.a(bbi2, object);
                NavigableMap navigableMap = super.a(class_);
                Integer n4 = (Integer)navigableMap.get((Object)bbi2.a);
                Integer n5 = bbi2.a;
                if (n4 == null) {
                    n3 = 1;
                } else {
                    int n6 = n4;
                    n3 = n6 + 1;
                }
                navigableMap.put((Object)n5, (Object)n3);
                this.f += n * bav2.b();
                super.b(this.e);
            }
            return;
        }
    }
}

