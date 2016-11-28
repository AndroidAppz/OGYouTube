/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class bcp
implements FilenameFilter {
    private /* synthetic */ Pattern a;

    bcp(Pattern pattern) {
        this.a = pattern;
    }

    public final boolean accept(File file, String string) {
        return this.a.matcher((CharSequence)string).matches();
    }
}

