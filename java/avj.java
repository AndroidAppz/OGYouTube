/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

final class avj {
    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map h;

    private avj() {
    }

    public avj(String string, aud aud2) {
        this.b = string;
        this.a = aud2.a.length;
        this.c = aud2.b;
        this.d = aud2.c;
        this.e = aud2.d;
        this.f = aud2.e;
        this.g = aud2.f;
        this.h = aud2.g;
    }

    public static avj a(InputStream inputStream) {
        avj avj2 = new avj();
        if (avi.a(inputStream) != 538247942) {
            throw new IOException();
        }
        avj2.b = avi.c(inputStream);
        avj2.c = avi.c(inputStream);
        if (avj2.c.equals((Object)"")) {
            avj2.c = null;
        }
        avj2.d = avi.b(inputStream);
        avj2.e = avi.b(inputStream);
        avj2.f = avi.b(inputStream);
        avj2.g = avi.b(inputStream);
        avj2.h = avi.d(inputStream);
        return avj2;
    }

    /*
     * Exception decompiling
     */
    public final boolean a(OutputStream var1) {
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
}

