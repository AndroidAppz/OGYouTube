/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.File
 *  java.io.IOException
 *  java.io.PrintStream
 *  java.io.Writer
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Future
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class awo
implements Closeable {
    final File a;
    final int b;
    Writer c;
    int d;
    private final File e;
    private final File f;
    private final File g;
    private final int h;
    private long i;
    private long j = 0;
    private final LinkedHashMap k = new LinkedHashMap(0, 0.75f, true);
    private long l = 0;
    private ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), (ThreadFactory)new awq());
    private final Callable n;

    private awo(File file, int n, int n2, long l) {
        this.n = new awp((awo)this);
        this.a = file;
        this.h = 1;
        this.e = new File(file, "journal");
        this.f = new File(file, "journal.tmp");
        this.g = new File(file, "journal.bkp");
        this.b = 1;
        this.i = l;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static awo a(File file, long l) {
        if (l <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                awo.a(file2, file3, false);
            }
        }
        awo awo2 = new awo(file, 1, 1, l);
        if (awo2.e.exists()) {
            try {
                awo2.d();
                awo2.e();
                return awo2;
            }
            catch (IOException var8_5) {
                PrintStream printStream = System.out;
                String string = String.valueOf((Object)file);
                String string2 = String.valueOf((Object)var8_5.getMessage());
                printStream.println(new StringBuilder(36 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append("DiskLruCache ").append(string).append(" is corrupt: ").append(string2).append(", removing").toString());
                awo2.close();
                aww.a(awo2.a);
            }
        }
        file.mkdirs();
        awo awo3 = new awo(file, 1, 1, l);
        awo3.a();
        return awo3;
    }

    private static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean bl2) {
        if (bl2) {
            awo.a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /*
     * Exception decompiling
     */
    private final boolean c(String var1) {
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
     * Exception decompiling
     */
    private final void d() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:371)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:449)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2859)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:805)
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

    private final void e() {
        awo.a(this.f);
        Iterator iterator = this.k.values().iterator();
        while (iterator.hasNext()) {
            aws aws2 = (aws)iterator.next();
            if (aws2.f == null) {
                for (int i = 0; i < this.b; ++i) {
                    this.j += aws2.b[i];
                }
                continue;
            }
            aws2.f = null;
            for (int i = 0; i < this.b; ++i) {
                awo.a(aws2.c[i]);
                awo.a(aws2.d[i]);
            }
            iterator.remove();
        }
    }

    private final void f() {
        if (this.c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final awt a(String string) {
        void var14_2 = this;
        synchronized (var14_2) {
            super.f();
            aws aws2 = (aws)this.k.get((Object)string);
            if (aws2 == null) {
                return null;
            }
            if (!aws2.e) {
                return null;
            }
            File[] arrfile = aws2.c;
            int n = arrfile.length;
            int n2 = 0;
            do {
                if (n2 < n) {
                    if (!arrfile[n2].exists()) {
                        return null;
                    }
                } else {
                    awt awt2;
                    this.d = 1 + this.d;
                    this.c.append((CharSequence)"READ");
                    this.c.append(' ');
                    this.c.append((CharSequence)string);
                    this.c.append('\n');
                    if (!this.b()) return awt2;
                    this.m.submit(this.n);
                    awt2 = new awt(aws2.c);
                    return awt2;
                }
                ++n2;
            } while (true);
        }
    }

    /*
     * Exception decompiling
     */
    final void a() {
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
     * Exception decompiling
     */
    public final void a(awr var1, boolean var2_2) {
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final awr b(String string) {
        void var15_2 = this;
        synchronized (var15_2) {
            awr awr2;
            aws aws2;
            super.f();
            aws aws3 = (aws)this.k.get((Object)string);
            if (-1 != -1) {
                if (aws3 == null) return null;
                long l = aws3.g;
                if (l != -1) {
                    return null;
                }
            }
            if (aws3 == null) {
                aws aws4 = new aws((awo)this, string);
                this.k.put((Object)string, (Object)aws4);
                aws2 = aws4;
            } else {
                awr awr3 = aws3.f;
                if (awr3 != null) {
                    return null;
                }
                aws2 = aws3;
            }
            aws2.f = awr2 = new awr((awo)this, aws2);
            this.c.append((CharSequence)"DIRTY");
            this.c.append(' ');
            this.c.append((CharSequence)string);
            this.c.append('\n');
            this.c.flush();
            return awr2;
        }
    }

    final boolean b() {
        if (this.d >= 2000 && this.d >= this.k.size()) {
            return true;
        }
        return false;
    }

    final void c() {
        while (this.j > this.i) {
            this.c((String)((Map.Entry)this.k.entrySet().iterator().next()).getKey());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        awo awo2 = this;
        synchronized (awo2) {
            Writer writer = this.c;
            if (writer != null) {
                for (aws aws2 : new ArrayList(this.k.values())) {
                    if (aws2.f == null) continue;
                    aws2.f.b();
                }
                this.c();
                this.c.close();
                this.c = null;
            }
            return;
        }
    }
}

