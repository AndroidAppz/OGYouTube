/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.SearchableInfo
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.database.Cursor
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.net.Uri
 *  android.os.Bundle
 *  android.support.v7.widget.SearchView
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.TextAppearanceSpan
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  it
 *  java.io.FileNotFoundException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.WeakHashMap
 *  wo
 *  xs
 */
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

public final class aqa
extends xs
implements View.OnClickListener {
    public int e = 1;
    private final SearchView f;
    private final SearchableInfo g;
    private final Context h;
    private final WeakHashMap i;
    private final int j;
    private ColorStateList k;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private int q = -1;

    public aqa(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.d.getSystemService("search");
        this.f = searchView;
        this.g = searchableInfo;
        this.j = searchView.getSuggestionCommitIconResId();
        this.h = context;
        this.i = weakHashMap;
    }

    private final Drawable a(ComponentName componentName) {
        ActivityInfo activityInfo;
        PackageManager packageManager = this.d.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
        }
        catch (PackageManager.NameNotFoundException var3_5) {
            Log.w((String)"SuggestionsAdapter", (String)var3_5.toString());
            return null;
        }
        int n = activityInfo.getIconResource();
        if (n == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), n, activityInfo.applicationInfo);
        if (drawable == null) {
            Log.w((String)"SuggestionsAdapter", (String)("Invalid icon resource " + n + " for " + componentName.flattenToShortString()));
            return null;
        }
        return drawable;
    }

    /*
     * Exception decompiling
     */
    private final Drawable a(Uri var1) {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Drawable a(String string) {
        if (string == null) return null;
        if (string.length() == 0) return null;
        if ("0".equals((Object)string)) {
            return null;
        }
        int n = Integer.parseInt((String)string);
        String string2 = "android.resource://" + this.h.getPackageName() + "/" + n;
        Drawable drawable = super.b(string2);
        if (drawable != null) return drawable;
        try {
            Drawable drawable2 = it.a((Context)this.h, (int)n);
            super.a(string2, drawable2);
            return drawable2;
        }
        catch (NumberFormatException var5_6) {
            drawable = super.b(string);
            if (drawable != null) return drawable;
            Drawable drawable3 = super.a(Uri.parse((String)string));
            super.a(string, drawable3);
            return drawable3;
        }
        catch (Resources.NotFoundException var3_8) {
            Log.w((String)"SuggestionsAdapter", (String)("Icon resource not found: " + string));
            return null;
        }
    }

    private static String a(Cursor cursor, int n) {
        if (n == -1) {
            return null;
        }
        try {
            String string = cursor.getString(n);
            return string;
        }
        catch (Exception var2_3) {
            Log.e((String)"SuggestionsAdapter", (String)"unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)var2_3);
            return null;
        }
    }

    public static String a(Cursor cursor, String string) {
        return aqa.a(cursor, cursor.getColumnIndex(string));
    }

    private static void a(ImageView imageView, Drawable drawable, int n) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(n);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private static void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
    }

    private final void a(String string, Drawable drawable) {
        if (drawable != null) {
            this.i.put((Object)string, (Object)drawable.getConstantState());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Drawable b(Uri uri) {
        int n;
        Resources resources;
        String string = uri.getAuthority();
        if (TextUtils.isEmpty((CharSequence)string)) {
            throw new FileNotFoundException("No authority: " + (Object)uri);
        }
        try {
            resources = this.d.getPackageManager().getResourcesForApplication(string);
        }
        catch (PackageManager.NameNotFoundException var3_5) {
            throw new FileNotFoundException("No package found for authority: " + (Object)uri);
        }
        List list = uri.getPathSegments();
        if (list == null) {
            throw new FileNotFoundException("No path: " + (Object)uri);
        }
        int n2 = list.size();
        if (n2 == 1) {
            try {
                int n3;
                n = n3 = Integer.parseInt((String)((String)list.get(0)));
            }
            catch (NumberFormatException var8_9) {
                throw new FileNotFoundException("Single path segment is not a resource ID: " + (Object)uri);
            }
        } else {
            if (n2 != 2) {
                throw new FileNotFoundException("More than two path segments: " + (Object)uri);
            }
            n = resources.getIdentifier((String)list.get(1), (String)list.get(0), string);
        }
        if (n == 0) {
            throw new FileNotFoundException("No resource found for: " + (Object)uri);
        }
        return resources.getDrawable(n);
    }

    private final Drawable b(String string) {
        Drawable.ConstantState constantState = (Drawable.ConstantState)this.i.get((Object)string);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void c(Cursor cursor) {
        if (cursor == null) return;
        Bundle bundle = cursor.getExtras();
        if (bundle != null && !bundle.getBoolean("in_progress")) return;
    }

    /*
     * Exception decompiling
     */
    public final Cursor a(CharSequence var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Backjump on non jumping statement [] lbl18 : TryStatement: try { 1[TRYBLOCK]

        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
        // org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.RemoveDeterministicJumps.apply(RemoveDeterministicJumps.java:35)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:507)
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

    public final View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = super.a(context, cursor, viewGroup);
        view.setTag((Object)new aqb(view));
        ((ImageView)view.findViewById(acv.s)).setImageResource(this.j);
        return view;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor == null) return;
        }
        catch (Exception var2_2) {
            Log.e((String)"SuggestionsAdapter", (String)"error changing cursor and caching columns", (Throwable)var2_2);
            return;
        }
        this.l = cursor.getColumnIndex("suggest_text_1");
        this.m = cursor.getColumnIndex("suggest_text_2");
        this.n = cursor.getColumnIndex("suggest_text_2_url");
        this.o = cursor.getColumnIndex("suggest_icon_1");
        this.p = cursor.getColumnIndex("suggest_icon_2");
        this.q = cursor.getColumnIndex("suggest_flags");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(View view, Cursor cursor) {
        aqb aqb2 = (aqb)view.getTag();
        int n = this.q != -1 ? cursor.getInt(this.q) : 0;
        if (aqb2.a != null) {
            String string = aqa.a(cursor, this.l);
            aqa.a(aqb2.a, (CharSequence)string);
        }
        if (aqb2.b != null) {
            String string;
            String string2 = aqa.a(cursor, this.n);
            if (string2 != null) {
                if (this.k == null) {
                    TypedValue typedValue = new TypedValue();
                    this.d.getTheme().resolveAttribute(acq.K, typedValue, true);
                    this.k = this.d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString((CharSequence)string2);
                spannableString.setSpan((Object)new TextAppearanceSpan(null, 0, 0, this.k, null), 0, string2.length(), 33);
                string = spannableString;
            } else {
                string = aqa.a(cursor, this.m);
            }
            if (TextUtils.isEmpty((CharSequence)string)) {
                if (aqb2.a != null) {
                    aqb2.a.setSingleLine(false);
                    aqb2.a.setMaxLines(2);
                }
            } else if (aqb2.a != null) {
                aqb2.a.setSingleLine(true);
                aqb2.a.setMaxLines(1);
            }
            aqa.a(aqb2.b, (CharSequence)string);
        }
        if (aqb2.c != null) {
            Drawable drawable;
            ImageView imageView = aqb2.c;
            if (this.o == -1) {
                drawable = null;
            } else {
                drawable = super.a(cursor.getString(this.o));
                if (drawable == null) {
                    ComponentName componentName = this.g.getSearchActivity();
                    String string = componentName.flattenToShortString();
                    if (this.i.containsKey((Object)string)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState)this.i.get((Object)string);
                        drawable = constantState == null ? null : constantState.newDrawable(this.h.getResources());
                    } else {
                        Drawable drawable2 = super.a(componentName);
                        Drawable.ConstantState constantState = drawable2 == null ? null : drawable2.getConstantState();
                        this.i.put((Object)string, (Object)constantState);
                        drawable = drawable2;
                    }
                    if (drawable == null) {
                        drawable = this.d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            aqa.a(imageView, drawable, 4);
        }
        if (aqb2.d != null) {
            ImageView imageView = aqb2.d;
            int n2 = this.p;
            Drawable drawable = null;
            if (n2 != -1) {
                drawable = super.a(cursor.getString(this.p));
            }
            aqa.a(imageView, drawable, 8);
        }
        if (this.e == 2 || this.e == 1 && (n & 1) != 0) {
            aqb2.e.setVisibility(0);
            aqb2.e.setTag((Object)aqb2.a.getText());
            aqb2.e.setOnClickListener((View.OnClickListener)this);
            return;
        }
        aqb2.e.setVisibility(8);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final CharSequence b(Cursor cursor) {
        String string;
        if (cursor == null) {
            return null;
        }
        String string2 = aqa.a(cursor, "suggest_intent_query");
        if (string2 != null) {
            return string2;
        }
        if (this.g.shouldRewriteQueryFromData() && (string = aqa.a(cursor, "suggest_intent_data")) != null) {
            return string;
        }
        if (!this.g.shouldRewriteQueryFromText()) return null;
        String string3 = aqa.a(cursor, "suggest_text_1");
        if (string3 == null) return null;
        return string3;
    }

    public final View getView(int n, View view, ViewGroup viewGroup) {
        try {
            View view2 = super.getView(n, view, viewGroup);
            return view2;
        }
        catch (RuntimeException var4_5) {
            Log.w((String)"SuggestionsAdapter", (String)"Search suggestions cursor threw exception.", (Throwable)var4_5);
            View view3 = this.a(this.d, this.c, viewGroup);
            if (view3 != null) {
                ((aqb)view3.getTag()).a.setText((CharSequence)var4_5.toString());
            }
            return view3;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        aqa.c(this.c);
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        aqa.c(this.c);
    }

    public final void onClick(View view) {
        Object object = view.getTag();
        if (object instanceof CharSequence) {
            this.f.onQueryRefine((CharSequence)object);
        }
    }
}

