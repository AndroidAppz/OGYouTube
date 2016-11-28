/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 *  java.util.Map
 *  java.util.TreeMap
 *  org.apache.http.Header
 *  org.apache.http.HttpEntity
 */
import java.io.InputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public class avf
implements auk {
    private static boolean a = avc.b;
    private static int b = 3000;
    private static int c = 4096;
    private avo d;
    private avg e;

    public avf(avo avo2) {
        super(avo2, new avg(c));
    }

    private avf(avo avo2, avg avg2) {
        this.d = avo2;
        this.e = avg2;
    }

    private static Map a(Header[] arrheader) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < arrheader.length; ++i) {
            treeMap.put((Object)arrheader[i].getName(), (Object)arrheader[i].getValue());
        }
        return treeMap;
    }

    private static void a(String string, auq auq2, avb avb2) {
        auy auy2 = auq2.t();
        int n = auq2.s();
        try {
            auy2.a(avb2);
        }
        catch (avb var5_6) {
            Object[] arrobject = new Object[]{string, n};
            auq2.a(String.format((String)"%s-timeout-giveup [timeout=%s]", (Object[])arrobject));
            throw var5_6;
        }
        Object[] arrobject = new Object[]{string, n};
        auq2.a(String.format((String)"%s-retry [timeout=%s]", (Object[])arrobject));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final byte[] a(HttpEntity httpEntity) {
        avs avs2 = new avs(this.e, (int)httpEntity.getContentLength());
        Object object = null;
        try {
            int n;
            InputStream inputStream = httpEntity.getContent();
            object = null;
            if (inputStream == null) {
                throw new auz();
            }
            object = this.e.a(1024);
            while ((n = inputStream.read((byte[])object)) != -1) {
                avs2.write((byte[])object, 0, n);
            }
            byte[] arrby = avs2.toByteArray();
            return arrby;
        }
        finally {
            httpEntity.consumeContent();
            this.e.a((byte[])object);
            avs2.close();
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public final aun a(auq var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.util.ConcurrentModificationException
        // java.util.LinkedList$ReverseLinkIterator.next(LinkedList.java:217)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.extractLabelledBlocks(Block.java:212)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:485)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.transform(Op04StructuredStatement.java:639)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredDo.transformStructuredChildren(StructuredDo.java:53)
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
}

