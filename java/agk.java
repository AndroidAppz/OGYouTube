/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class agk
extends BroadcastReceiver {
    private /* synthetic */ agi a;

    agk(agi agi2) {
        this.a = agi2;
    }

    public final void onReceive(Context context, Intent intent) {
        int n;
        if (intent.getAction().equals((Object)"android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (n = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1)) >= 0 && n != this.a.j) {
            this.a.a();
        }
    }
}

