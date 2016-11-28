/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 *  pg
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class bam {
    private final pg a;
    private final List b;
    private final String c;

    public bam(Class class_, Class class_2, Class class_3, List list, pg pg2) {
        this.a = pg2;
        this.b = (List)blm.a((Collection)list);
        String string = String.valueOf((Object)class_.getSimpleName());
        String string2 = String.valueOf((Object)class_2.getSimpleName());
        String string3 = String.valueOf((Object)class_3.getSimpleName());
        this.c = new StringBuilder(21 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append("Failed LoadPath{").append(string).append("->").append(string2).append("->").append(string3).append("}").toString();
    }

    /*
     * Exception decompiling
     */
    private final bap a(axz var1_4, axs var2_6, int var3_2, int var4_3, azm var5_1, List var6_5) {
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

    public final bap a(axz axz2, axs axs2, int n, int n2, azm azm2) {
        List list = (List)this.a.a();
        try {
            bap bap2 = this.a(axz2, axs2, n, n2, azm2, list);
            return bap2;
        }
        finally {
            this.a.a((Object)list);
        }
    }

    public final String toString() {
        String string = String.valueOf((Object)Arrays.toString((Object[])this.b.toArray((Object[])new azl[this.b.size()])));
        return new StringBuilder(22 + String.valueOf((Object)string).length()).append("LoadPath{decodePaths=").append(string).append("}").toString();
    }
}

