/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.IOException
 *  java.io.PrintStream
 *  java.io.PrintWriter
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class bak
extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private final List b;
    private axo c;
    private axj d;
    private Class e;

    public bak(String string) {
        super(string, Collections.emptyList());
    }

    public bak(String string, Exception exception) {
        super(string, Collections.singletonList((Object)exception));
    }

    public bak(String string, List list) {
        super(string);
        this.setStackTrace(a);
        this.b = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void a(Appendable appendable) {
        bak.a((Exception)this, appendable);
        List list = this.b;
        bal bal2 = new bal(appendable);
        int n = list.size();
        int n2 = 0;
        while (n2 < n) {
            try {
                bal2.append((CharSequence)"Cause (").append((CharSequence)String.valueOf((int)(n2 + 1))).append((CharSequence)" of ").append((CharSequence)String.valueOf((int)n)).append((CharSequence)"): ");
                Exception exception = (Exception)list.get(n2);
                if (exception instanceof bak) {
                    ((bak)exception).a(bal2);
                } else {
                    bak.a(exception, bal2);
                }
            }
            catch (IOException var4_7) {
                throw new RuntimeException((Throwable)var4_7);
            }
            ++n2;
        }
    }

    private static void a(Exception exception, Appendable appendable) {
        try {
            appendable.append((CharSequence)exception.getClass().toString()).append((CharSequence)": ").append((CharSequence)exception.getMessage()).append('\n');
            return;
        }
        catch (IOException var2_2) {
            throw new RuntimeException((Throwable)exception);
        }
    }

    private final void a(Exception exception, List list) {
        if (exception instanceof bak) {
            Iterator iterator = ((bak)exception).b.iterator();
            while (iterator.hasNext()) {
                super.a((Exception)iterator.next(), list);
            }
        } else {
            list.add((Object)exception);
        }
    }

    final void a(axo axo2, axj axj2, Class class_) {
        this.c = axo2;
        this.d = axj2;
        this.e = class_;
    }

    public final void a(String string) {
        String string2 = String.valueOf((Object)this.getClass());
        String string3 = String.valueOf((Object)this.getMessage());
        Log.e((String)string, (String)new StringBuilder(2 + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length()).append(string2).append(": ").append(string3).toString());
        ArrayList arrayList = new ArrayList();
        super.a((Exception)this, (List)arrayList);
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            int n2 = i + 1;
            new StringBuilder(39).append("Root cause (").append(n2).append(" of ").append(n).append(")");
            arrayList.get(i);
        }
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String getMessage() {
        String string;
        String string2;
        String string3;
        String string4 = String.valueOf((Object)super.getMessage());
        if (this.e != null) {
            String string5 = String.valueOf((Object)this.e);
            string2 = new StringBuilder(2 + String.valueOf((Object)string5).length()).append(", ").append(string5).toString();
        } else {
            string2 = "";
        }
        if (this.d != null) {
            String string6 = String.valueOf((Object)((Object)this.d));
            string = new StringBuilder(2 + String.valueOf((Object)string6).length()).append(", ").append(string6).toString();
        } else {
            string = "";
        }
        if (this.c != null) {
            String string7 = String.valueOf((Object)this.c);
            string3 = new StringBuilder(2 + String.valueOf((Object)string7).length()).append(", ").append(string7).toString();
            return new StringBuilder(0 + String.valueOf((Object)string4).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string).length() + String.valueOf((Object)string3).length()).append(string4).append(string2).append(string).append(string3).toString();
        }
        string3 = "";
        return new StringBuilder(0 + String.valueOf((Object)string4).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string).length() + String.valueOf((Object)string3).length()).append(string4).append(string2).append(string).append(string3).toString();
    }

    public final void printStackTrace() {
        this.printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        super.a((Appendable)printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        super.a((Appendable)printWriter);
    }
}

