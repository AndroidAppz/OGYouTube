/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.database.DataSetObservable
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.Xml
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ajq
extends DataSetObservable {
    static final String a = ajq.class.getSimpleName();
    private static final Object j = new Object();
    private static final Map k = new HashMap();
    final Object b = new Object();
    final List c = new ArrayList();
    final List d = new ArrayList();
    final Context e;
    final String f;
    boolean g;
    boolean h;
    boolean i;
    private int l;

    private ajq(Context context, String string) {
        new ajs();
        this.l = 50;
        this.g = true;
        this.h = false;
        this.i = true;
        this.e = context.getApplicationContext();
        if (!TextUtils.isEmpty((CharSequence)string) && !string.endsWith(".xml")) {
            this.f = string + ".xml";
            return;
        }
        this.f = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ajq a(Context context, String string) {
        Object object;
        Object object2 = object = j;
        synchronized (object2) {
            ajq ajq2 = (ajq)((Object)k.get((Object)string));
            if (ajq2 == null) {
                ajq2 = new ajq(context, string);
                k.put((Object)string, (Object)ajq2);
            }
            return ajq2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private final void g() {
        var2_1 = this.e.openFileInput(this.f);
        var11_2 = Xml.newPullParser();
        var11_2.setInput((InputStream)var2_1, "UTF-8");
        var12_3 = 0;
        while (var12_3 != 1 && var12_3 != 2) {
            var12_3 = var11_2.next();
        }
        if (!"historical-records".equals((Object)var11_2.getName())) {
            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
        }
        var13_5 = this.d;
        var13_5.clear();
        catch (FileNotFoundException var1_13) {
            return;
        }
        catch (XmlPullParserException var8_4) {
            Log.e((String)ajq.a, (String)("Error reading historical recrod file: " + this.f), (Throwable)var8_4);
            if (var2_1 == null) return;
            try {
                var2_1.close();
                return;
            }
            catch (IOException var10_11) {
                return;
            }
        }
        while ((var14_6 = var11_2.next()) != 1) {
            if (var14_6 == 3 || var14_6 == 4) continue;
            if (!"historical-record".equals((Object)var11_2.getName())) {
                throw new XmlPullParserException("Share records file not well-formed.");
            }
            try {
                var13_5.add((Object)new ajt(var11_2.getAttributeValue(null, "activity"), Long.parseLong((String)var11_2.getAttributeValue(null, "time")), Float.parseFloat((String)var11_2.getAttributeValue(null, "weight"))));
                continue;
            }
            catch (IOException var5_7) {
                Log.e((String)ajq.a, (String)("Error reading historical recrod file: " + this.f), (Throwable)var5_7);
                if (var2_1 == null) return;
                try {
                    var2_1.close();
                    return;
                }
                catch (IOException var7_8) {
                    return;
                }
            }
        }
        ** GOTO lbl47
        {
            catch (Throwable var3_9) {
                if (var2_1 == null) throw var3_9;
                var2_1.close();
                throw var3_9;
lbl47: // 1 sources:
                if (var2_1 == null) return;
                try {
                    var2_1.close();
                    return;
                }
                catch (IOException var15_10) {
                    return;
                }
                catch (IOException var4_12) {
                    throw var3_9;
                    break;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a() {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            this.e();
            return this.c.size();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a(ResolveInfo resolveInfo) {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            this.e();
            List list = this.c;
            int n = list.size();
            int n2 = 0;
            while (n2 < n) {
                list.get(n2);
                if (resolveInfo == null) {
                    return n2;
                }
                ++n2;
            }
            return -1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ResolveInfo a(int n) {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            this.e();
            this.c.get(n);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Intent b() {
        Object object;
        Object object2 = object = this.b;
        // MONITORENTER : object2
        // MONITOREXIT : object2
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ResolveInfo c() {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            this.e();
            if (!this.c.isEmpty()) {
                this.c.get(0);
                return null;
            }
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int d() {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            this.e();
            return this.d.size();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    final void e() {
        boolean bl2 = true;
        if (this.g && this.i && !TextUtils.isEmpty((CharSequence)this.f)) {
            this.g = false;
            this.h = bl2;
            this.g();
        } else {
            bl2 = false;
        }
        boolean bl3 = bl2 | false;
        this.f();
        if (bl3) {
            this.notifyChanged();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void f() {
        int n = this.d.size() - this.l;
        if (n <= 0) {
            return;
        }
        this.i = true;
        int n2 = 0;
        while (n2 < n) {
            this.d.remove(0);
            ++n2;
        }
    }
}

