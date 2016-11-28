/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.SparseArray
 *  android.view.KeyCharacterMap
 *  android.view.KeyCharacterMap$KeyData
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.CopyOnWriteArrayList
 *  qy
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ahw
implements kh {
    private static final int[] k = new int[]{1, 4, 5, 3, 2, 0};
    final Context a;
    public ahx b;
    ArrayList c;
    public ArrayList d;
    public int e;
    CharSequence f;
    Drawable g;
    View h;
    aia i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private boolean n;
    private ArrayList o;
    private boolean p;
    private ArrayList q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private ArrayList v;
    private CopyOnWriteArrayList w;

    /*
     * Enabled aggressive block sorting
     */
    public ahw(Context context) {
        int n = 1;
        this.e = 0;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = new ArrayList();
        this.w = new CopyOnWriteArrayList();
        this.a = context;
        this.l = context.getResources();
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.p = n;
        this.d = new ArrayList();
        this.q = new ArrayList();
        this.r = n;
        if (this.l.getConfiguration().keyboard == n || !this.l.getBoolean(acr.d)) {
            n = 0;
        }
        this.n = n;
    }

    private static int a(ArrayList arrayList, int n) {
        for (int i = -1 + arrayList.size(); i >= 0; --i) {
            if (((aia)arrayList.get((int)i)).a > n) continue;
            return i + 1;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final aia a(int n, KeyEvent keyEvent) {
        ArrayList arrayList = this.v;
        arrayList.clear();
        super.a((List)arrayList, n, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int n2 = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int n3 = arrayList.size();
        if (n3 == 1) {
            return (aia)arrayList.get(0);
        }
        boolean bl2 = this.b();
        int n4 = 0;
        while (n4 < n3) {
            aia aia2 = (aia)arrayList.get(n4);
            char c2 = bl2 ? aia2.getAlphabeticShortcut() : aia2.getNumericShortcut();
            if (c2 == keyData.meta[0]) {
                if ((n2 & 2) == 0) return aia2;
            }
            if (c2 == keyData.meta[2]) {
                if ((n2 & 2) != 0) return aia2;
            }
            if (bl2 && c2 == '\b') {
                if (n == 67) return aia2;
            }
            ++n4;
        }
        return null;
    }

    private final MenuItem a(int n, int n2, int n3, CharSequence charSequence) {
        int n4 = n3 >> 16;
        if (n4 < 0 || n4 >= k.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int n5 = k[n4] << 16 | 65535 & n3;
        aia aia2 = new aia((ahw)this, n, n2, n3, n5, charSequence, this.e);
        this.c.add(ahw.a(this.c, n5), (Object)aia2);
        this.b(true);
        return aia2;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private final void a(int n, boolean bl2) {
        if (n < 0) return;
        if (n >= this.c.size()) {
            return;
        }
        this.c.remove(n);
        if (!bl2) return;
        this.b(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a(List list, int n, KeyEvent keyEvent) {
        boolean bl2 = this.b();
        int n2 = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && n != 67) {
            return;
        }
        int n3 = this.c.size();
        int n4 = 0;
        while (n4 < n3) {
            aia aia2 = (aia)this.c.get(n4);
            if (aia2.hasSubMenu()) {
                ((ahw)aia2.getSubMenu()).a(list, n, keyEvent);
            }
            char c2 = bl2 ? aia2.getAlphabeticShortcut() : aia2.getNumericShortcut();
            if ((n2 & 5) == 0 && c2 != '\u0000' && (c2 == keyData.meta[0] || c2 == keyData.meta[2] || bl2 && c2 == '\b' && n == 67) && aia2.isEnabled()) {
                list.add((Object)aia2);
            }
            ++n4;
        }
    }

    protected final ahw a(Drawable drawable) {
        this.a(null, drawable, null);
        return this;
    }

    protected final ahw a(CharSequence charSequence) {
        this.a(charSequence, null, null);
        return this;
    }

    protected String a() {
        return "android:menu:actionviewstates";
    }

    public void a(ahx ahx2) {
        this.b = ahx2;
    }

    public final void a(ail ail2) {
        this.a(ail2, this.a);
    }

    public final void a(ail ail2, Context context) {
        this.w.add((Object)new WeakReference((Object)ail2));
        ail2.a(context, (ahw)this);
        this.r = true;
    }

    public final void a(Bundle bundle) {
        int n = this.size();
        SparseArray sparseArray = null;
        for (int i = 0; i < n; ++i) {
            MenuItem menuItem = this.getItem(i);
            View view = qy.a((MenuItem)menuItem);
            if (view != null && view.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                view.saveHierarchyState(sparseArray);
                if (qy.d((MenuItem)menuItem)) {
                    bundle.putInt("android:menu:expandedactionview", menuItem.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (menuItem.hasSubMenu()) {
                ((air)menuItem.getSubMenu()).a(bundle);
            }
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.a(), sparseArray);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(CharSequence charSequence, Drawable drawable, View view) {
        if (view != null) {
            this.h = view;
            this.f = null;
            this.g = null;
        } else {
            if (charSequence != null) {
                this.f = charSequence;
            }
            if (drawable != null) {
                this.g = drawable;
            }
            this.h = null;
        }
        this.b(false);
    }

    public final void a(boolean bl2) {
        if (this.u) {
            return;
        }
        this.u = true;
        for (WeakReference weakReference : this.w) {
            ail ail2 = (ail)weakReference.get();
            if (ail2 == null) {
                this.w.remove((Object)weakReference);
                continue;
            }
            ail2.a((ahw)this, bl2);
        }
        this.u = false;
    }

    boolean a(ahw ahw2, MenuItem menuItem) {
        if (this.b != null && this.b.a(ahw2, menuItem)) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(aia var1) {
        var2_2 = this.w.isEmpty();
        var3_3 = false;
        if (var2_2) {
            do {
                return var3_3;
                break;
            } while (true);
        }
        this.d();
        var4_4 = this.w.iterator();
        var5_5 = false;
        while (var4_4.hasNext()) {
            var6_7 = (WeakReference)var4_4.next();
            var7_6 = (ail)var6_7.get();
            if (var7_6 == null) {
                this.w.remove((Object)var6_7);
                continue;
            }
            var3_3 = var7_6.b(var1);
            if (var3_3) lbl-1000: // 2 sources:
            {
                do {
                    this.e();
                    if (!var3_3) ** continue;
                    this.i = var1;
                    return var3_3;
                    break;
                } while (true);
            }
            var5_5 = var3_3;
        }
        var3_3 = var5_5;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(MenuItem menuItem, ail ail2, int n) {
        boolean bl2;
        aia aia2 = (aia)menuItem;
        if (aia2 == null) return false;
        if (!aia2.isEnabled()) {
            return false;
        }
        boolean bl3 = aia2.b();
        py py2 = aia2.d;
        boolean bl4 = py2 != null && py2.f();
        if (aia2.i()) {
            bl2 = bl3 | aia2.expandActionView();
            if (!bl2) return bl2;
            this.a(true);
            return bl2;
        }
        if (!aia2.hasSubMenu() && !bl4) {
            if ((n & 1) != 0) return bl3;
            this.a(true);
            return bl3;
        }
        this.a(false);
        if (!aia2.hasSubMenu()) {
            aia2.a(new air(this.a, (ahw)this, aia2));
        }
        air air2 = (air)aia2.getSubMenu();
        if (bl4) {
            py2.a(air2);
        }
        boolean bl5 = this.w.isEmpty();
        boolean bl6 = false;
        if (!bl5) {
            boolean bl7 = false;
            if (ail2 != null) {
                bl7 = ail2.a(air2);
            }
            Iterator iterator = this.w.iterator();
            boolean bl8 = bl7;
            while (iterator.hasNext()) {
                WeakReference weakReference = (WeakReference)iterator.next();
                ail ail3 = (ail)weakReference.get();
                if (ail3 == null) {
                    this.w.remove((Object)weakReference);
                    continue;
                }
                boolean bl9 = !bl8 ? ail3.a(air2) : bl8;
                bl8 = bl9;
            }
            bl6 = bl8;
        }
        if (bl2 = bl3 | bl6) return bl2;
        this.a(true);
        return bl2;
    }

    public MenuItem add(int n) {
        return super.a(0, 0, 0, this.l.getString(n));
    }

    public MenuItem add(int n, int n2, int n3, int n4) {
        return super.a(n, n2, n3, this.l.getString(n4));
    }

    public MenuItem add(int n, int n2, int n3, CharSequence charSequence) {
        return super.a(n, n2, n3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return super.a(0, 0, 0, charSequence);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int addIntentOptions(int n, int n2, int n3, ComponentName componentName, Intent[] arrintent, Intent intent, int n4, MenuItem[] arrmenuItem) {
        PackageManager packageManager = this.a.getPackageManager();
        List list = packageManager.queryIntentActivityOptions(componentName, arrintent, intent, 0);
        int n5 = list != null ? list.size() : 0;
        if ((n4 & 1) == 0) {
            this.removeGroup(n);
        }
        int n6 = 0;
        while (n6 < n5) {
            ResolveInfo resolveInfo = (ResolveInfo)list.get(n6);
            Intent intent2 = resolveInfo.specificIndex < 0 ? intent : arrintent[resolveInfo.specificIndex];
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem menuItem = this.add(n, n2, n3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (arrmenuItem != null && resolveInfo.specificIndex >= 0) {
                arrmenuItem[resolveInfo.specificIndex] = menuItem;
            }
            ++n6;
        }
        return n5;
    }

    public SubMenu addSubMenu(int n) {
        return this.addSubMenu(0, 0, 0, this.l.getString(n));
    }

    public SubMenu addSubMenu(int n, int n2, int n3, int n4) {
        return this.addSubMenu(n, n2, n3, this.l.getString(n4));
    }

    public SubMenu addSubMenu(int n, int n2, int n3, CharSequence charSequence) {
        aia aia2 = (aia)super.a(n, n2, n3, charSequence);
        air air2 = new air(this.a, (ahw)this, aia2);
        aia2.a(air2);
        return air2;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(ail ail2) {
        for (WeakReference weakReference : this.w) {
            ail ail3 = (ail)weakReference.get();
            if (ail3 != null && ail3 != ail2) continue;
            this.w.remove((Object)weakReference);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        SparseArray sparseArray = bundle.getSparseParcelableArray(this.a());
        int n = this.size();
        int n2 = 0;
        do {
            if (n2 >= n) {
                int n3 = bundle.getInt("android:menu:expandedactionview");
                if (n3 <= 0) return;
                MenuItem menuItem = this.findItem(n3);
                if (menuItem == null) return;
                qy.c((MenuItem)menuItem);
                return;
            }
            MenuItem menuItem = this.getItem(n2);
            View view = qy.a((MenuItem)menuItem);
            if (view != null && view.getId() != -1) {
                view.restoreHierarchyState(sparseArray);
            }
            if (menuItem.hasSubMenu()) {
                ((air)menuItem.getSubMenu()).b(bundle);
            }
            ++n2;
        } while (true);
    }

    public final void b(boolean bl2) {
        if (!this.s) {
            if (bl2) {
                this.p = true;
                this.r = true;
            }
            if (!this.w.isEmpty()) {
                this.d();
                for (WeakReference weakReference : this.w) {
                    ail ail2 = (ail)weakReference.get();
                    if (ail2 == null) {
                        this.w.remove((Object)weakReference);
                        continue;
                    }
                    ail2.b(bl2);
                }
                this.e();
            }
            return;
        }
        this.t = true;
    }

    boolean b() {
        return this.m;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(aia var1) {
        var2_2 = this.w.isEmpty();
        var3_3 = false;
        if (var2_2) ** GOTO lbl-1000
        var4_4 = this.i;
        var3_3 = false;
        if (var4_4 != var1) lbl-1000: // 3 sources:
        {
            do {
                return var3_3;
                break;
            } while (true);
        }
        this.d();
        var5_5 = this.w.iterator();
        var6_6 = false;
        while (var5_5.hasNext()) {
            var7_8 = (WeakReference)var5_5.next();
            var8_7 = (ail)var7_8.get();
            if (var8_7 == null) {
                this.w.remove((Object)var7_8);
                continue;
            }
            var3_3 = var8_7.c(var1);
            if (var3_3) lbl-1000: // 2 sources:
            {
                do {
                    this.e();
                    if (!var3_3) ** continue;
                    this.i = null;
                    return var3_3;
                    break;
                } while (true);
            }
            var6_6 = var3_3;
        }
        var3_3 = var6_6;
        ** while (true)
    }

    public boolean c() {
        return this.n;
    }

    public void clear() {
        if (this.i != null) {
            this.b(this.i);
        }
        this.c.clear();
        this.b(true);
    }

    public void clearHeader() {
        this.g = null;
        this.f = null;
        this.h = null;
        this.b(false);
    }

    public void close() {
        this.a(true);
    }

    public final void d() {
        if (!this.s) {
            this.s = true;
            this.t = false;
        }
    }

    public final void e() {
        this.s = false;
        if (this.t) {
            this.t = false;
            this.b(true);
        }
    }

    final void f() {
        this.p = true;
        this.b(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public MenuItem findItem(int n) {
        int n2 = this.size();
        int n3 = 0;
        while (n3 < n2) {
            aia aia2 = (aia)this.c.get(n3);
            if (aia2.getItemId() == n || aia2.hasSubMenu() && (aia2 = aia2.getSubMenu().findItem(n)) != null) {
                return aia2;
            }
            ++n3;
        }
        return null;
    }

    final void g() {
        this.r = true;
        this.b(true);
    }

    public MenuItem getItem(int n) {
        return (MenuItem)this.c.get(n);
    }

    public final ArrayList h() {
        if (!this.p) {
            return this.o;
        }
        this.o.clear();
        int n = this.c.size();
        for (int i = 0; i < n; ++i) {
            aia aia2 = (aia)this.c.get(i);
            if (!aia2.isVisible()) continue;
            this.o.add((Object)aia2);
        }
        this.p = false;
        this.r = true;
        return this.o;
    }

    public boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int n = this.size();
        for (int i = 0; i < n; ++i) {
            if (!((aia)this.c.get(i)).isVisible()) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void i() {
        ArrayList arrayList = this.h();
        if (!this.r) {
            return;
        }
        Iterator iterator = this.w.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            WeakReference weakReference = (WeakReference)iterator.next();
            ail ail2 = (ail)weakReference.get();
            if (ail2 == null) {
                this.w.remove((Object)weakReference);
                continue;
            }
            bl2 |= ail2.a();
        }
        this.d.clear();
        this.q.clear();
        this.q.addAll((Collection)this.h());
        this.r = false;
    }

    public boolean isShortcutKey(int n, KeyEvent keyEvent) {
        if (super.a(n, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        this.i();
        return this.q;
    }

    public ahw k() {
        return this;
    }

    public boolean performIdentifierAction(int n, int n2) {
        return this.a(this.findItem(n), null, n2);
    }

    public boolean performShortcut(int n, KeyEvent keyEvent, int n2) {
        aia aia2 = super.a(n, keyEvent);
        boolean bl2 = false;
        if (aia2 != null) {
            bl2 = this.a(aia2, null, n2);
        }
        if ((n2 & 2) != 0) {
            this.a(true);
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public void removeGroup(int var1) {
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
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void removeItem(int var1) {
        var2_2 = this.size();
        for (var3_3 = 0; var3_3 < var2_2; ++var3_3) {
            if (((aia)this.c.get(var3_3)).getItemId() != var1) continue;
            var4_4 = var3_3;
lbl5: // 2 sources:
            do {
                super.a(var4_4, true);
                return;
                break;
            } while (true);
        }
        var4_4 = -1;
        ** while (true)
    }

    public void setGroupCheckable(int n, boolean bl2, boolean bl3) {
        int n2 = this.c.size();
        for (int i = 0; i < n2; ++i) {
            aia aia2 = (aia)this.c.get(i);
            if (aia2.getGroupId() != n) continue;
            aia2.a(bl3);
            aia2.setCheckable(bl2);
        }
    }

    public void setGroupEnabled(int n, boolean bl2) {
        int n2 = this.c.size();
        for (int i = 0; i < n2; ++i) {
            aia aia2 = (aia)this.c.get(i);
            if (aia2.getGroupId() != n) continue;
            aia2.setEnabled(bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setGroupVisible(int n, boolean bl2) {
        int n2 = this.c.size();
        int n3 = 0;
        boolean bl3 = false;
        while (n3 < n2) {
            aia aia2 = (aia)this.c.get(n3);
            boolean bl4 = aia2.getGroupId() == n && aia2.b(bl2) ? true : bl3;
            ++n3;
            bl3 = bl4;
        }
    }

    public void setQwertyMode(boolean bl2) {
        this.m = bl2;
        this.b(false);
    }

    public int size() {
        return this.c.size();
    }
}

