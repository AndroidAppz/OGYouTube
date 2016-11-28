/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  le
 *  lo
 *  ne
 */
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

final class abf
implements View.OnClickListener {
    private /* synthetic */ aas a;

    abf(aas aas2) {
        this.a = aas2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        int n = 1;
        int n2 = view.getId();
        if (n2 == 16908313 || n2 == 16908314) {
            if (this.a.e.a()) {
                if (n2 == 16908313) {
                    n = 2;
                }
                aef.a(n);
            }
            this.a.dismiss();
            return;
        } else if (n2 == agq.h) {
            if (this.a.B == null || this.a.D == null) return;
            {
                if (this.a.D.a != 3) {
                    n = 0;
                }
                if (n != 0) {
                    this.a.B.a().b();
                } else {
                    this.a.B.a().a();
                }
                if (this.a.P == null || !this.a.P.isEnabled()) return;
                {
                    AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain((int)16384);
                    accessibilityEvent.setPackageName((CharSequence)this.a.f.getPackageName());
                    accessibilityEvent.setClassName((CharSequence)this.getClass().getName());
                    int n3 = n != 0 ? agu.h : agu.i;
                    accessibilityEvent.getText().add((Object)this.a.f.getString(n3));
                    this.a.P.sendAccessibilityEvent(accessibilityEvent);
                    return;
                }
            }
        } else {
            if (n2 != agq.f) return;
            {
                this.a.dismiss();
                return;
            }
        }
    }
}

