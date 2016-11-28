/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.AsyncTask
 *  android.preference.PreferenceManager
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.List
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

final class aam
extends AsyncTask {
    private ArrayList a;
    private /* synthetic */ aal b;

    aam(aal aal2) {
        this.b = aal2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final /* varargs */ Void a() {
        aal aal2;
        aal aal3 = aal2 = this.b;
        synchronized (aal3) {
            if (!this.isCancelled()) {
                Context context = this.b.getContext();
                ArrayList arrayList = this.a;
                aaq.b.clear();
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)context);
                for (aeu aeu2 : arrayList) {
                    aaq.b.put((Object)aeu2.d, (Object)Float.valueOf((float)sharedPreferences.getFloat("android.support.v7.app.MediaRouteChooserDialog_route_usage_score_" + aeu2.d, 0.0f)));
                }
            }
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
        this.b.a.clear();
        this.b.a.addAll((Collection)this.a);
        Collections.sort((List)this.b.a, (Comparator)aaq.a);
        this.b.b.notifyDataSetChanged();
        this.b.c = null;
    }

    protected final void onPreExecute() {
        this.a = new ArrayList((Collection)aef.a());
        this.b.a((List)this.a);
    }
}

