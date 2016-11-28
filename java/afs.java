/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class afs
extends BroadcastReceiver {
    private /* synthetic */ afr a;

    afs(afr afr2) {
        this.a = afr2;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a();
    }
}

