/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  java.lang.Object
 *  pm
 *  po
 *  pp
 *  pr
 *  ut
 */
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class pl {
    static final po a = Build.VERSION.SDK_INT >= 16 ? new pp() : (Build.VERSION.SDK_INT >= 14 ? new pm() : new pr());
    static final Object b = a.a();
    final Object c;

    public pl() {
        this.c = a.a(this);
    }

    public static void a(View view, int n) {
        a.a(b, view, n);
    }

    public static void c(View view, AccessibilityEvent accessibilityEvent) {
        a.d(b, view, accessibilityEvent);
    }

    public static boolean d(View view, AccessibilityEvent accessibilityEvent) {
        return a.a(b, view, accessibilityEvent);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        a.b(b, view, accessibilityEvent);
    }

    public void a(View view, ut ut2) {
        a.a(b, view, ut2);
    }

    public boolean a(View view, int n, Bundle bundle) {
        return a.a(b, view, n, bundle);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return a.a(b, viewGroup, view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        a.c(b, view, accessibilityEvent);
    }
}

