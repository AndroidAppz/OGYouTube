/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.app.PendingIntent$CanceledException
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 *  java.lang.String
 *  le
 *  lj
 */
import android.app.PendingIntent;
import android.util.Log;
import android.view.View;

final class aaz
implements View.OnClickListener {
    private /* synthetic */ aas a;

    aaz(aas aas2) {
        this.a = aas2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onClick(View view) {
        PendingIntent pendingIntent;
        if (this.a.B == null || (pendingIntent = this.a.B.a.d()) == null) return;
        try {
            pendingIntent.send();
            this.a.dismiss();
            return;
        }
        catch (PendingIntent.CanceledException var3_3) {
            Log.e((String)"MediaRouteCtrlDialog", (String)((Object)pendingIntent + " was not sent, it had been canceled."));
            return;
        }
    }
}

