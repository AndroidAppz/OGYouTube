/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class aiq
extends ahs
implements Menu {
    aiq(Context context, kh kh2) {
        super(context, kh2);
    }

    public MenuItem add(int n) {
        return this.a(((kh)this.d).add(n));
    }

    public MenuItem add(int n, int n2, int n3, int n4) {
        return this.a(((kh)this.d).add(n, n2, n3, n4));
    }

    public MenuItem add(int n, int n2, int n3, CharSequence charSequence) {
        return this.a(((kh)this.d).add(n, n2, n3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return this.a(((kh)this.d).add(charSequence));
    }

    public int addIntentOptions(int n, int n2, int n3, ComponentName componentName, Intent[] arrintent, Intent intent, int n4, MenuItem[] arrmenuItem) {
        MenuItem[] arrmenuItem2 = null;
        if (arrmenuItem != null) {
            arrmenuItem2 = new MenuItem[arrmenuItem.length];
        }
        int n5 = ((kh)this.d).addIntentOptions(n, n2, n3, componentName, arrintent, intent, n4, arrmenuItem2);
        if (arrmenuItem2 != null) {
            int n6 = arrmenuItem2.length;
            for (int i = 0; i < n6; ++i) {
                arrmenuItem[i] = this.a(arrmenuItem2[i]);
            }
        }
        return n5;
    }

    public SubMenu addSubMenu(int n) {
        return this.a(((kh)this.d).addSubMenu(n));
    }

    public SubMenu addSubMenu(int n, int n2, int n3, int n4) {
        return this.a(((kh)this.d).addSubMenu(n, n2, n3, n4));
    }

    public SubMenu addSubMenu(int n, int n2, int n3, CharSequence charSequence) {
        return this.a(((kh)this.d).addSubMenu(n, n2, n3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.a(((kh)this.d).addSubMenu(charSequence));
    }

    public void clear() {
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
        ((kh)this.d).clear();
    }

    public void close() {
        ((kh)this.d).close();
    }

    public MenuItem findItem(int n) {
        return this.a(((kh)this.d).findItem(n));
    }

    public MenuItem getItem(int n) {
        return this.a(((kh)this.d).getItem(n));
    }

    public boolean hasVisibleItems() {
        return ((kh)this.d).hasVisibleItems();
    }

    public boolean isShortcutKey(int n, KeyEvent keyEvent) {
        return ((kh)this.d).isShortcutKey(n, keyEvent);
    }

    public boolean performIdentifierAction(int n, int n2) {
        return ((kh)this.d).performIdentifierAction(n, n2);
    }

    public boolean performShortcut(int n, KeyEvent keyEvent, int n2) {
        return ((kh)this.d).performShortcut(n, keyEvent, n2);
    }

    public void removeGroup(int n) {
        if (this.b != null) {
            Iterator iterator = this.b.keySet().iterator();
            while (iterator.hasNext()) {
                if (n != ((MenuItem)iterator.next()).getGroupId()) continue;
                iterator.remove();
            }
        }
        ((kh)this.d).removeGroup(n);
    }

    public void removeItem(int n) {
        if (this.b != null) {
            Iterator iterator = this.b.keySet().iterator();
            while (iterator.hasNext()) {
                if (n != ((MenuItem)iterator.next()).getItemId()) continue;
                iterator.remove();
                break;
            }
        }
        ((kh)this.d).removeItem(n);
    }

    public void setGroupCheckable(int n, boolean bl2, boolean bl3) {
        ((kh)this.d).setGroupCheckable(n, bl2, bl3);
    }

    public void setGroupEnabled(int n, boolean bl2) {
        ((kh)this.d).setGroupEnabled(n, bl2);
    }

    public void setGroupVisible(int n, boolean bl2) {
        ((kh)this.d).setGroupVisible(n, bl2);
    }

    public void setQwertyMode(boolean bl2) {
        ((kh)this.d).setQwertyMode(bl2);
    }

    public int size() {
        return ((kh)this.d).size();
    }
}

