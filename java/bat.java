/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  java.lang.Object
 */
import android.os.Handler;
import android.os.Message;

final class bat
implements Handler.Callback {
    bat() {
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            ((bap)message.obj).d();
            return true;
        }
        return false;
    }
}

