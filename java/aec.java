/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Messenger
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
import android.os.IBinder;
import android.os.Messenger;

final class aec {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Messenger messenger) {
        boolean bl2 = false;
        if (messenger == null) return bl2;
        try {
            IBinder iBinder = messenger.getBinder();
            bl2 = false;
            if (iBinder == null) return bl2;
            return true;
        }
        catch (NullPointerException var2_3) {
            return false;
        }
    }
}

