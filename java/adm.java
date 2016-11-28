/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
import android.os.AsyncTask;
import android.util.Log;

final class adm
extends AsyncTask {
    private /* synthetic */ ado a;
    private /* synthetic */ adl b;

    adm(adl adl2, ado ado2) {
        this.b = adl2;
        this.a = ado2;
    }

    private final /* varargs */ adj a() {
        try {
            adj adj2 = this.b.a();
            return adj2;
        }
        catch (Exception var1_2) {
            Log.e((String)"Palette", (String)"Exception thrown during async generate", (Throwable)var1_2);
            return null;
        }
    }

    /*
     * Exception decompiling
     */
    protected final /* synthetic */ Object doInBackground(Object[] var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.ArrayIndexOutOfBoundsException: length=0; index=-1
        // java.util.ArrayList.get(ArrayList.java:310)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.VarArgsRewriter.rewriteVarArgsArg(VarArgsRewriter.java:86)
        // org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractMemberFunctionInvokation.rewriteVarArgs(AbstractMemberFunctionInvokation.java:142)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.VarArgsRewriter.rewriteExpression(VarArgsRewriter.java:55)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredReturn.rewriteExpressions(StructuredReturn.java:90)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.VarArgsRewriter.rewrite(VarArgsRewriter.java:41)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.removeUnnecessaryVarargArrays(Op04StructuredStatement.java:967)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:856)
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

    protected final /* synthetic */ void onPostExecute(Object object) {
        adj adj2 = (adj)object;
        this.a.a(adj2);
    }
}

