/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 *  android.util.Log
 *  com.bumptech.glide.load.resource.bitmap.ImageHeaderParser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;

final class ayv {
    private static final ayp a = new ayp();
    private final ayu b;
    private final baw c;
    private final ContentResolver d;

    private ayv(ayp ayp2, ayu ayu2, baw baw2, ContentResolver contentResolver) {
        this.b = ayu2;
        this.c = baw2;
        this.d = contentResolver;
    }

    public ayv(ayu ayu2, baw baw2, ContentResolver contentResolver) {
        super(a, ayu2, baw2, contentResolver);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final int a(Uri uri) {
        int n;
        int n2 = -1;
        InputStream inputStream = null;
        inputStream = this.d.openInputStream(uri);
        n2 = n = new ImageHeaderParser(inputStream, this.c).b();
        if (inputStream == null) return n2;
        try {
            inputStream.close();
            return n2;
        }
        catch (IOException var11_9) {
            return n2;
        }
        catch (IOException iOException) {
            if (!Log.isLoggable((String)"ThumbStreamOpener", (int)3)) return n2;
            String string = String.valueOf((Object)uri);
            new StringBuilder(20 + String.valueOf((Object)string).length()).append("Failed to open uri: ").append(string);
            return n2;
        }
        finally {
            if (inputStream == null) return n2;
            inputStream.close();
        }
    }

    /*
     * Exception decompiling
     */
    public final InputStream b(Uri var1) {
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

