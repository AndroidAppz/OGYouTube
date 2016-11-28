/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.LinkedHashMap
 *  java.util.Map
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class avi
implements auc {
    private final Map a;
    private long b;
    private final File c;
    private final int d;

    public avi(File file) {
        super(file, 5242880);
    }

    public avi(File file, int n) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0;
        this.c = file;
        this.d = n;
    }

    static int a(InputStream inputStream) {
        return 0 | avi.e(inputStream) | avi.e(inputStream) << 8 | avi.e(inputStream) << 16 | avi.e(inputStream) << 24;
    }

    static void a(OutputStream outputStream, int n) {
        outputStream.write(n & 255);
        outputStream.write(255 & n >> 8);
        outputStream.write(255 & n >> 16);
        outputStream.write(n >>> 24);
    }

    static void a(OutputStream outputStream, long l) {
        outputStream.write((int)((byte)l));
        outputStream.write((int)((byte)(l >>> 8)));
        outputStream.write((int)((byte)(l >>> 16)));
        outputStream.write((int)((byte)(l >>> 24)));
        outputStream.write((int)((byte)(l >>> 32)));
        outputStream.write((int)((byte)(l >>> 40)));
        outputStream.write((int)((byte)(l >>> 48)));
        outputStream.write((int)((byte)(l >>> 56)));
    }

    static void a(OutputStream outputStream, String string) {
        byte[] arrby = string.getBytes("UTF-8");
        avi.a(outputStream, (long)arrby.length);
        outputStream.write(arrby, 0, arrby.length);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(String string, avj avj2) {
        if (!this.a.containsKey((Object)string)) {
            this.b += avj2.a;
        } else {
            avj avj3 = (avj)this.a.get((Object)string);
            this.b += avj2.a - avj3.a;
        }
        this.a.put((Object)string, (Object)avj2);
    }

    private static byte[] a(InputStream inputStream, int n) {
        int n2;
        int n3;
        byte[] arrby = new byte[n];
        for (n2 = 0; n2 < n && (n3 = inputStream.read(arrby, n2, n - n2)) != -1; n2 += n3) {
        }
        if (n2 != n) {
            throw new IOException("Expected " + n + " bytes, read " + n2 + " bytes");
        }
        return arrby;
    }

    static long b(InputStream inputStream) {
        return 0 | 255 & (long)avi.e(inputStream) | (255 & (long)avi.e(inputStream)) << 8 | (255 & (long)avi.e(inputStream)) << 16 | (255 & (long)avi.e(inputStream)) << 24 | (255 & (long)avi.e(inputStream)) << 32 | (255 & (long)avi.e(inputStream)) << 40 | (255 & (long)avi.e(inputStream)) << 48 | (255 & (long)avi.e(inputStream)) << 56;
    }

    static String c(InputStream inputStream) {
        return new String(avi.a(inputStream, (int)avi.b(inputStream)), "UTF-8");
    }

    private static String c(String string) {
        int n = string.length() / 2;
        String string2 = String.valueOf((int)string.substring(0, n).hashCode());
        return string2 + String.valueOf((int)string.substring(n).hashCode());
    }

    private final File d(String string) {
        return new File(this.c, avi.c(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    static Map d(InputStream inputStream) {
        int n = avi.a(inputStream);
        Map map = n == 0 ? Collections.emptyMap() : new HashMap(n);
        int n2 = 0;
        while (n2 < n) {
            map.put((Object)avi.c(inputStream).intern(), (Object)avi.c(inputStream).intern());
            ++n2;
        }
        return map;
    }

    private static int e(InputStream inputStream) {
        int n = inputStream.read();
        if (n == -1) {
            throw new EOFException();
        }
        return n;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final aud a(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CATCHBLOCK]], but top level block is 13[CATCHBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:394)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:446)
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

    /*
     * Exception decompiling
     */
    @Override
    public final void a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[UNCONDITIONALDOLOOP], 9[CATCHBLOCK]], but top level block is 18[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:394)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:446)
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

    /*
     * Exception decompiling
     */
    @Override
    public final void a(String var1, aud var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.util.ConcurrentModificationException
        // java.util.LinkedList$ReverseLinkIterator.next(LinkedList.java:217)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.extractLabelledBlocks(Block.java:212)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:485)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.transform(Op04StructuredStatement.java:639)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredIf.transformStructuredChildren(StructuredIf.java:82)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:487)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.transform(Op04StructuredStatement.java:639)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.transformStructuredChildren(Block.java:378)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:487)
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
    @Override
    public final void a(String string, boolean bl2) {
        void var5_3 = this;
        synchronized (var5_3) {
            aud aud2 = this.a(string);
            if (aud2 != null) {
                aud2.f = 0;
                if (bl2) {
                    aud2.e = 0;
                }
                this.a(string, aud2);
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
    public final void b() {
        avi avi2 = this;
        synchronized (avi2) {
            File[] arrfile = this.c.listFiles();
            if (arrfile != null) {
                int n = arrfile.length;
                for (int i = 0; i < n; ++i) {
                    arrfile[i].delete();
                }
            }
            this.a.clear();
            this.b = 0;
            avc.d("Cache cleared.", new Object[0]);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(String string) {
        void var8_2 = this;
        synchronized (var8_2) {
            boolean bl2 = super.d(string).delete();
            avj avj2 = (avj)this.a.get((Object)string);
            if (avj2 != null) {
                this.b -= avj2.a;
                this.a.remove((Object)string);
            }
            if (!bl2) {
                Object[] arrobject = new Object[]{string, avi.c(string)};
                avc.d("Could not delete cache entry for key=%s, filename=%s", arrobject);
            }
            return;
        }
    }
}

