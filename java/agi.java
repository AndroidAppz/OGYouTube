/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.res.Resources
 *  android.media.AudioManager
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.Collection;

final class agi
extends agb {
    private static final ArrayList k;
    final AudioManager i;
    int j = -1;
    private final agk l;

    static {
        ArrayList arrayList;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
        k = arrayList = new ArrayList();
        arrayList.add((Object)intentFilter);
    }

    public agi(Context context) {
        super(context);
        this.i = (AudioManager)context.getSystemService("audio");
        this.l = new agk((agi)this);
        context.registerReceiver((BroadcastReceiver)this.l, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        this.a();
    }

    @Override
    public final adz a(String string) {
        if (string.equals((Object)"DEFAULT_ROUTE")) {
            return new agj((agi)this);
        }
        return null;
    }

    final void a() {
        Resources resources = this.a.getResources();
        int n = this.i.getStreamMaxVolume(3);
        this.j = this.i.getStreamVolume(3);
        ads ads2 = new adt("DEFAULT_ROUTE", resources.getString(agu.k)).a((Collection)k).b(3).a(0).e(1).d(n).c(this.j).a();
        this.a(new aeb().a(ads2).a());
    }
}

