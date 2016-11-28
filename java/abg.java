/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.widget.ImageView
 *  java.io.BufferedInputStream
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URL
 *  java.net.URLConnection
 *  kk
 */
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

final class abg
extends AsyncTask {
    private Bitmap a;
    private Uri b;
    private int c;
    private /* synthetic */ aas d;

    /*
     * Enabled aggressive block sorting
     */
    abg(aas aas2) {
        this.d = aas2;
        Bitmap bitmap = aas2.E == null ? null : aas2.E.c;
        this.a = bitmap;
        kk kk2 = aas2.E;
        Uri uri = null;
        if (kk2 != null) {
            uri = aas2.E.d;
        }
        this.b = uri;
    }

    /*
     * Exception decompiling
     */
    private final /* varargs */ Bitmap a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 4 blocks at once
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

    /*
     * Enabled aggressive block sorting
     */
    private final InputStream a(Uri uri) {
        InputStream inputStream;
        String string = uri.getScheme().toLowerCase();
        if ("android.resource".equals((Object)string) || "content".equals((Object)string) || "file".equals((Object)string)) {
            inputStream = this.d.f.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnection = new URL(uri.toString()).openConnection();
            uRLConnection.setConnectTimeout(aas.c);
            uRLConnection.setReadTimeout(aas.c);
            inputStream = uRLConnection.getInputStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStream);
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

    protected final void onCancelled() {
        this.d.F = null;
    }

    protected final /* synthetic */ void onPostExecute(Object object) {
        Bitmap bitmap = (Bitmap)object;
        this.d.F = null;
        if (this.d.G != this.a || this.d.H != this.b) {
            this.d.G = this.a;
            this.d.H = this.b;
            this.d.k.setImageBitmap(bitmap);
            this.d.k.setBackgroundColor(this.c);
            this.d.d(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void onPreExecute() {
        if (this.a != this.d.G) {
            return;
        }
        if (this.a == null && !aas.a(this.b, this.d.H)) {
            return;
        }
        boolean bl2 = false;
        if (!bl2) {
            this.cancel(true);
        }
    }
}

