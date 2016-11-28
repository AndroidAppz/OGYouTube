/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IBinder$DeathRecipient
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.RemoteException
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

final class afl
implements IBinder.DeathRecipient {
    final Messenger a;
    final afq b;
    int c;
    int d;
    int e;
    int f;
    final SparseArray g;
    final /* synthetic */ afk h;
    private final Messenger i;

    public afl(afk afk2, Messenger messenger) {
        this.h = afk2;
        this.c = 1;
        this.d = 1;
        this.g = new SparseArray();
        this.a = messenger;
        this.b = new afq((afl)this);
        this.i = new Messenger((Handler)this.b);
    }

    public final void a(int n) {
        int n2 = this.c;
        this.c = n2 + 1;
        this.a(5, n2, n, null, null);
    }

    public final void a(int n, int n2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", n2);
        int n3 = this.c;
        this.c = n3 + 1;
        this.a(7, n3, n, null, bundle);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(adu adu2) {
        int n = this.c;
        this.c = n + 1;
        Bundle bundle = adu2 != null ? adu2.a : null;
        this.a(10, n, 0, (Object)bundle, null);
    }

    public final boolean a() {
        int n = this.c;
        this.c = n + 1;
        this.f = n;
        if (!this.a(1, this.f, 1, null, null)) {
            return false;
        }
        try {
            this.a.getBinder().linkToDeath((IBinder.DeathRecipient)this, 0);
            return true;
        }
        catch (RemoteException var2_2) {
            this.binderDied();
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean a(int n, int n2, int n3, Object object, Bundle bundle) {
        Message message = Message.obtain();
        message.what = n;
        message.arg1 = n2;
        message.arg2 = n3;
        message.obj = object;
        message.setData(bundle);
        message.replyTo = this.i;
        try {
            this.a.send(message);
            return true;
        }
        catch (RemoteException var8_7) {
            if (n != 2) {
                Log.e((String)"MediaRouteProviderProxy", (String)"Could not send message to service.", (Throwable)var8_7);
            }
            do {
                return false;
                break;
            } while (true);
        }
        catch (DeadObjectException var7_8) {
            return false;
        }
    }

    public final void b(int n, int n2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", n2);
        int n3 = this.c;
        this.c = n3 + 1;
        this.a(8, n3, n, null, bundle);
    }

    public final void binderDied() {
        this.h.k.post((Runnable)new afn(this));
    }
}

