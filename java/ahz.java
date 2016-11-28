/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.view.KeyEvent
 *  android.view.KeyEvent$DispatcherState
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.Window
 *  android.widget.ListAdapter
 *  java.lang.Object
 */
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

final class ahz
implements aim,
DialogInterface.OnClickListener,
DialogInterface.OnDismissListener,
DialogInterface.OnKeyListener {
    ahw a;
    zg b;
    ahu c;

    public ahz(ahw ahw2) {
        this.a = ahw2;
    }

    @Override
    public final void a(ahw ahw2, boolean bl2) {
        if ((bl2 || ahw2 == this.a) && this.b != null) {
            this.b.dismiss();
        }
    }

    @Override
    public final boolean a(ahw ahw2) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int n) {
        this.a.a((aia)this.c.b().getItem(n), null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int n, KeyEvent keyEvent) {
        if (n == 82 || n == 4) {
            Window window;
            KeyEvent.DispatcherState dispatcherState;
            View view;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState dispatcherState2;
                View view2;
                Window window2 = this.b.getWindow();
                if (window2 != null && (view2 = window2.getDecorView()) != null && (dispatcherState2 = view2.getKeyDispatcherState()) != null) {
                    dispatcherState2.startTracking(keyEvent, (Object)this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (view = window.getDecorView()) != null && (dispatcherState = view.getKeyDispatcherState()) != null && dispatcherState.isTracking(keyEvent)) {
                this.a.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(n, keyEvent, 0);
    }
}

