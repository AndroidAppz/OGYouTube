/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;

final class adx
extends Handler {
    private /* synthetic */ adv a;

    adx(adv adv2) {
        this.a = adv2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1: {
                adv adv2 = this.a;
                adv2.h = false;
                if (adv2.d != null) {
                    adv2.d.a(adv2, adv2.g);
                    return;
                }
            }
            default: {
                return;
            }
            case 2: 
        }
        adv adv3 = this.a;
        adv3.f = false;
        adv3.b(adv3.e);
    }
}

