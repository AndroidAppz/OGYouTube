/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
import android.util.Log;
import java.io.File;
import java.io.IOException;

public final class bcb
implements bbs {
    private static bcb a = null;
    private final bcl b;
    private final File c;
    private final int d;
    private final bbw e = new bbw();
    private awo f;

    private bcb(File file, int n) {
        this.c = file;
        this.d = n;
        this.b = new bcl();
    }

    private final awo a() {
        bcb bcb2 = this;
        synchronized (bcb2) {
            if (this.f == null) {
                this.f = awo.a(this.c, this.d);
            }
            awo awo2 = this.f;
            return awo2;
        }
    }

    public static bbs a(File file, int n) {
        reference var4_2 = bcb.class;
        synchronized (bcb.class) {
            if (a == null) {
                a = new bcb(file, n);
            }
            bcb bcb2 = a;
            // ** MonitorExit[var4_2] (shouldn't be in output)
            return bcb2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final File a(axo axo2) {
        File file;
        String string = this.b.a(axo2);
        if (Log.isLoggable((String)"DiskLruCacheWrapper", (int)2)) {
            String string2 = String.valueOf((Object)axo2);
            new StringBuilder(29 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length()).append("Get: Obtained: ").append(string).append(" for for Key: ").append(string2);
        }
        try {
            awt awt2 = super.a().a(string);
            file = null;
            if (awt2 == null) return file;
        }
        catch (IOException var3_6) {
            boolean bl2 = Log.isLoggable((String)"DiskLruCacheWrapper", (int)5);
            file = null;
            if (!bl2) return file;
            Log.w((String)"DiskLruCacheWrapper", (String)"Unable to get from disk cache", (Throwable)var3_6);
            return null;
        }
        return awt2.a[0];
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void a(axo var1, bbu var2_2) {
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
}

